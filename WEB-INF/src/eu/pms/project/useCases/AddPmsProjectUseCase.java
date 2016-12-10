package eu.pms.project.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.project.database.*;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by alisa_000 on 12/5/2016.
 */
public class AddPmsProjectUseCase implements ComponentUseCase {
    public Collection execute(Collection input, HttpServletRequest request)
            throws HibernateException {
        ArrayList retList = null;
        try {
            Iterator itr = input.iterator();
            String proId = (String) itr.next();
            String proTitle = (String) itr.next();
            String proDescription = (String) itr.next();
            String proStatus = (String) itr.next();
            BigDecimal proBudget = (BigDecimal) itr.next();
            String proStartDate = (String) itr.next();
            String proEndDate = (String) itr.next();
            String proNeedPermit = (String) itr.next();
            String proHasCluster = (String) itr.next();
            String proNotes = (String) itr.next();
            String proArea = (String) itr.next();
            String prgId = (String) itr.next();
            String devId = (String) itr.next();
            String cluId = (String) itr.next();
            String proType = (String) itr.next();
            String preId = (String) itr.next();
            String[] donorProjectArray = (String[]) itr.next();
            String[] implementerProjectArray = (String[]) itr.next();
            String[] locationProjectArray = (String[]) itr.next();
            String[] communityProjectArray = (String[]) itr.next();
            String[] benificiaryProjectArray = (String[]) itr.next();
            String[] indicatorProjectArray = (String[]) itr.next();

            String username = "";
            Date timeStamp = new Date();

            PmsProject pmsProject = new PmsProject();
            pmsProject.setProId(proId);
            pmsProject.setProTitle(proTitle);
            pmsProject.setProDescription(proDescription);
            pmsProject.setProStatus(proStatus);
            pmsProject.setProBudget(proBudget);
            pmsProject.setProStartDate(timeStamp);
            pmsProject.setProEndDate(timeStamp);
            pmsProject.setProNeedPermit(proNeedPermit);
            pmsProject.setProHasCluster(proHasCluster);
            pmsProject.setProNotes(proNotes);
            pmsProject.setProArea(proArea);
            pmsProject.setPrgId(prgId);
            pmsProject.setDevId(devId);
            pmsProject.setCluId(cluId);
            pmsProject.setProType(proType);
            pmsProject.setPreId(preId);
            pmsProject.setUsername(username);
            pmsProject.setTimeStamp(timeStamp);

            List insertList = new ArrayList();
            insertList.add(pmsProject);
            if (donorProjectArray != null && donorProjectArray.length > 0) {
                PmsProjectDonorPK pmsProjectDonorPK = null;
                PmsProjectDonor pmsProjectDonor = null;
                for (String donor : donorProjectArray) {
                    pmsProjectDonorPK = new PmsProjectDonorPK();
                    pmsProjectDonor = new PmsProjectDonor();
                    pmsProjectDonorPK.setProId(proId);
                    pmsProjectDonorPK.setDonId(donor);
                    pmsProjectDonor.setCompId(pmsProjectDonorPK);
                    pmsProjectDonor.setUsername(username);
                    pmsProjectDonor.setTimeStamp(timeStamp);
                    insertList.add(pmsProjectDonor);
                }
            }

            if (implementerProjectArray != null && implementerProjectArray.length > 0) {
                PmsProjectsImplementerPK pmsProjectsImplementerPK = null;
                PmsProjectsImplementer pmsProjectsImplementer = null;
                for (String implementer : implementerProjectArray) {
                    pmsProjectsImplementerPK = new PmsProjectsImplementerPK();
                    pmsProjectsImplementer = new PmsProjectsImplementer();
                    pmsProjectsImplementerPK.setProId(proId);
                    pmsProjectsImplementerPK.setImpId(implementer);
                    pmsProjectsImplementer.setCompId(pmsProjectsImplementerPK);
                    pmsProjectsImplementer.setUsername(username);
                    pmsProjectsImplementer.setTimeStamp(timeStamp);
                    insertList.add(pmsProjectsImplementer);
                }
            }

            if (locationProjectArray != null && locationProjectArray.length > 0) {
                PmsProjectsLocationPK pmsProjectsLocationPK = null;
                PmsProjectsLocation pmsProjectsLocation = null;
                for (String location : locationProjectArray) {
                    pmsProjectsLocationPK = new PmsProjectsLocationPK();
                    pmsProjectsLocation = new PmsProjectsLocation();
                    pmsProjectsLocationPK.setProId(proId);
                    pmsProjectsLocationPK.setLocId(location);
                    pmsProjectsLocation.setCompId(pmsProjectsLocationPK);
                    pmsProjectsLocation.setUsername(username);
                    pmsProjectsLocation.setTimeStamp(timeStamp);
                    insertList.add(pmsProjectsLocation);
                }
            }

            if (communityProjectArray != null && communityProjectArray.length > 0) {
                PmsProjectsCommunityPK pmsProjectsCommunityPK = null;
                PmsProjectsCommunity pmsProjectsCommunity = null;
                for (String community : communityProjectArray) {
                    pmsProjectsCommunityPK = new PmsProjectsCommunityPK();
                    pmsProjectsCommunity = new PmsProjectsCommunity();
                    pmsProjectsCommunityPK.setProId(proId);
                    pmsProjectsCommunityPK.setComId(community);
                    pmsProjectsCommunity.setCompId(pmsProjectsCommunityPK);
                    pmsProjectsCommunity.setUsername(username);
                    pmsProjectsCommunity.setTimeStamp(timeStamp);
                    insertList.add(pmsProjectsCommunity);
                }
            }

            if (benificiaryProjectArray != null && benificiaryProjectArray.length > 0) {
                PmsProjectsBenificiaryPK pmsProjectsBenificiaryPK = null;
                PmsProjectsBenificiary pmsProjectsBenificiary = null;
                for (String benificiary : benificiaryProjectArray) {
                    pmsProjectsBenificiaryPK = new PmsProjectsBenificiaryPK();
                    pmsProjectsBenificiary = new PmsProjectsBenificiary();
                    pmsProjectsBenificiaryPK.setProId(proId);
                    pmsProjectsBenificiaryPK.setBenId(benificiary);
                    pmsProjectsBenificiary.setCompId(pmsProjectsBenificiaryPK);
                    pmsProjectsBenificiary.setUsername(username);
                    pmsProjectsBenificiary.setTimeStamp(timeStamp);
                    insertList.add(pmsProjectsBenificiary);
                }
            }

            if (indicatorProjectArray != null && indicatorProjectArray.length > 0) {
                PmsProjectsIndicatorPK pmsProjectsIndicatorPK = null;
                PmsProjectsIndicator pmsProjectsIndicator = null;
                for (String indicator : indicatorProjectArray) {
                    pmsProjectsIndicatorPK = new PmsProjectsIndicatorPK();
                    pmsProjectsIndicator = new PmsProjectsIndicator();
                    pmsProjectsIndicatorPK.setProId(proId);
                    pmsProjectsIndicatorPK.setIndId(indicator);
                    pmsProjectsIndicator.setCompId(pmsProjectsIndicatorPK);
                    insertList.add(pmsProjectsIndicator);
                }
            }

            new DataAccessObjectImpl().insertOrUpdate(insertList);

        } catch (Exception ce) {
            System.err.println("Error add a new PMS Project: " + ce);
            retList = new ArrayList();
            retList.add(new String("Error add a new PMS Project :" + ce.getMessage()));
        }
        return retList;
    }
}
