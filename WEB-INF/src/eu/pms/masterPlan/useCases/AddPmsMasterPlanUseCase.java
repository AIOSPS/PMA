package eu.pms.masterPlan.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.tools.DateTool;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import eu.pms.project.database.*;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class AddPmsMasterPlanUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String masId = (String) itr.next();
            String impId = (String) itr.next();
            String masMpNo = (String) itr.next();
            String masMpName = (String) itr.next();
            String masStatus = (String) itr.next();
            String masStatusIca = (String) itr.next();
            String masFirstSubmitDateToIca = (String) itr.next();//
            String masLastSubmitDateToIca = (String) itr.next();//
            Integer masNoSessionWithIca = (Integer) itr.next();
            String masSubmitToMod = (String) itr.next();
            String masApprovalDate = (String) itr.next();//
            String masPublicationDate = (String) itr.next();//
            String masLastDateForObjection = (String) itr.next();//
            String masDateOfFinalPublication = (String) itr.next();//
            Integer masApprovedPlanedArea = (Integer) itr.next();
            String masVillageAdminBoarder = (String) itr.next();
            String masNote = (String) itr.next();

            String[] donorMasterPlanArray = (String[]) itr.next();
            String[] communityMasterPlanArray = (String[]) itr.next();

            String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrName();
            Date timeStamp = new Date();

            PmsMasterPlan pmsMasterPlan = new PmsMasterPlan();
            pmsMasterPlan.setMasId(masId);
            pmsMasterPlan.setImpId(impId);
            pmsMasterPlan.setMasMpNo(masMpNo);
            pmsMasterPlan.setMasMpName(masMpName);
            pmsMasterPlan.setMasStatus(masStatus);
            pmsMasterPlan.setMasStatusIca(masStatusIca);
            pmsMasterPlan.setMasFirstSubmitDateToIca(DateTool.convertStringToDate(masFirstSubmitDateToIca,DateTool.DD_MM_YYYY));
            pmsMasterPlan.setMasLastSubmitDateToIca(DateTool.convertStringToDate(masLastSubmitDateToIca,DateTool.DD_MM_YYYY));
            pmsMasterPlan.setMasNoSessionWithIca(masNoSessionWithIca);
            pmsMasterPlan.setMasSubmitToMod(masSubmitToMod);
            pmsMasterPlan.setMasApprovalDate(DateTool.convertStringToDate(masApprovalDate,DateTool.DD_MM_YYYY));
            pmsMasterPlan.setMasPublicationDate(DateTool.convertStringToDate(masPublicationDate,DateTool.DD_MM_YYYY));
            pmsMasterPlan.setMasLastDateForObjection(DateTool.convertStringToDate(masLastDateForObjection,DateTool.DD_MM_YYYY));
            pmsMasterPlan.setMasDateOfFinalPublication(DateTool.convertStringToDate(masDateOfFinalPublication,DateTool.DD_MM_YYYY));
            pmsMasterPlan.setMasApprovedPlanedArea(masApprovedPlanedArea);
            pmsMasterPlan.setMasVillageAdminBoarder(masVillageAdminBoarder);
            pmsMasterPlan.setMasNote(masNote);
            pmsMasterPlan.setUsername(username);
            pmsMasterPlan.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsMasterPlan);
            if (donorMasterPlanArray != null && donorMasterPlanArray.length > 0) {
                PmsMasterPlanDonorPK pmsMasterPlanDonorPK = null;
                PmsMasterPlanDonor pmsMasterPlanDonor = null;
                for (String donor : donorMasterPlanArray) {
                    pmsMasterPlanDonorPK = new PmsMasterPlanDonorPK();
                    pmsMasterPlanDonor = new PmsMasterPlanDonor();
                    pmsMasterPlanDonorPK.setMasId(masId);
                    pmsMasterPlanDonorPK.setDonId(donor);
                    pmsMasterPlanDonor.setCompId(pmsMasterPlanDonorPK);
                    pmsMasterPlanDonor.setUsername(username);
                    pmsMasterPlanDonor.setTimeStamp(timeStamp);
                    insertList.add(pmsMasterPlanDonor);
                }
            }
            if (communityMasterPlanArray != null && communityMasterPlanArray.length > 0) {
                PmsMasterPlanCommunityPK pmsMasterPlanCommunityPK = null;
                PmsMasterPlanCommunity pmsMasterPlanCommunity = null;
                for (String community : communityMasterPlanArray) {
                    pmsMasterPlanCommunityPK = new PmsMasterPlanCommunityPK();
                    pmsMasterPlanCommunity = new PmsMasterPlanCommunity();
                    pmsMasterPlanCommunityPK.setMasId(masId);
                    pmsMasterPlanCommunityPK.setComId(community);
                    pmsMasterPlanCommunity.setCompId(pmsMasterPlanCommunityPK);
                    pmsMasterPlanCommunity.setUsername(username);
                    pmsMasterPlanCommunity.setTimeStamp(timeStamp);
                    insertList.add(pmsMasterPlanCommunity);
                }
            }
            new DataAccessObjectImpl().deleteAsSelect("from eu.pms.project.database.PmsMasterPlanDonor a where a.compId.masId='"+masId+"'");
            new DataAccessObjectImpl().deleteAsSelect("from eu.pms.project.database.PmsMasterPlanCommunity a where a.compId.masId='"+masId+"'");
            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS MasterPlan: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS MasterPlan :" + ce.getMessage()));
        }
        return retList;
    }
}
