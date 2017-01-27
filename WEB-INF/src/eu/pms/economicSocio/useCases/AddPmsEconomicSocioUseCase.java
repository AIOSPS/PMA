package eu.pms.economicSocio.useCases;

import eu.pms.common.component.DataAccessObjectImpl;
import eu.pms.common.useCase.ComponentUseCase;
import eu.pms.login.database.SecUser;
import eu.pms.project.database.PmsEconomicSocio;
import eu.pms.project.database.PmsEconomicSocioPK;
import org.hibernate.HibernateException;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by orayyan on 1/27/2017.
 */
public class AddPmsEconomicSocioUseCase implements ComponentUseCase {

    public Collection execute(Collection input, HttpServletRequest request) throws HibernateException {
            ArrayList retList = null;
            try {
                Iterator itr = input.iterator();
                String ecoId = (String) itr.next();
                String comId = (String) itr.next();
                String menLivelihoodSource1 = (String) itr.next();
                String menLivelihoodSource2 = (String) itr.next();
                String menLivelihoodSource3 = (String) itr.next();
                String womenLivelihoodSource1 = (String) itr.next();
                String womenLivelihoodSource2 = (String) itr.next();
                String womenLivelihoodSource3 = (String) itr.next();
                String accessToLandsMilitary = (String) itr.next();
                String accessToLandsCheckpoints = (String) itr.next();
                Integer familyAvgSize = (Integer) itr.next();
                BigDecimal familyAvgIncome = (BigDecimal) itr.next();
                if (ecoId == null || ecoId.equals("")){
                    ecoId = eu.pms.common.tools.Randomizer.randomIntegers(10).toString();
                }
                String username = ((SecUser)request.getSession().getAttribute("userInfo")).getUsrId();
                Date timeStamp = new Date();

                PmsEconomicSocioPK pmsEconomicSocioPK = new PmsEconomicSocioPK();
                PmsEconomicSocio pmsEcomomicSocio = new PmsEconomicSocio();
                pmsEconomicSocioPK.setEcoId(ecoId);
                pmsEconomicSocioPK.setComId(comId);

                pmsEcomomicSocio.setCompId(pmsEconomicSocioPK);
                pmsEcomomicSocio.setMenLivelihoodSource1(menLivelihoodSource1);
                pmsEcomomicSocio.setMenLivelihoodSource2(menLivelihoodSource2);
                pmsEcomomicSocio.setMenLivelihoodSource3(menLivelihoodSource3);
                pmsEcomomicSocio.setWomenLivelihoodSource1(womenLivelihoodSource1);
                pmsEcomomicSocio.setWomenLivelihoodSource2(womenLivelihoodSource2);
                pmsEcomomicSocio.setWomenLivelihoodSource3(womenLivelihoodSource3);
                pmsEcomomicSocio.setAccessToLandsMilitary(accessToLandsMilitary);
                pmsEcomomicSocio.setAccessToLandsCheckpoints(accessToLandsCheckpoints);
                pmsEcomomicSocio.setFamilyAvgSize(familyAvgSize);
                pmsEcomomicSocio.setFamilyAvgIncome(familyAvgIncome);
                pmsEcomomicSocio.setUsername(username);
                pmsEcomomicSocio.setTimeStamp(timeStamp);

                List insertList = new ArrayList();
                insertList.add(pmsEcomomicSocio);
                new DataAccessObjectImpl().insertOrUpdate(insertList);

            } catch (Exception ce) {
                System.err.println("Error add a new PMS EcomomicSocio: " + ce);
                retList = new ArrayList();
                retList.add(new String("Error add a new PMS EcomomicSocio :" + ce.getMessage()));
            }
            return retList;
    }
}

