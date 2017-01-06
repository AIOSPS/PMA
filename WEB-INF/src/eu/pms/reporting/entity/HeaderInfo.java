package eu.pms.reporting.entity;

import net.sf.dynamicreports.report.constant.PageOrientation;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class HeaderInfo {
    private PageOrientation layoutPage;
    private  String   centerTitle;
    private  String   rightTitle;
    private  String   leftTitle ;
    private  String[] ListLeftText ;




    public HeaderInfo()
    {
        layoutPage=PageOrientation.PORTRAIT;
        centerTitle="";
        rightTitle="";
        leftTitle ="";
        ListLeftText=null ;

    }

    public HeaderInfo(PageOrientation layoutPage, boolean viewCurentDate,
                      String centerTitle, String rightTitle, String leftTitle, String[] listLeftText)
    {
        this.layoutPage = layoutPage;
        this.centerTitle = centerTitle;
        this.rightTitle = rightTitle;
        this.leftTitle = leftTitle;
        ListLeftText = listLeftText;
    }


    public PageOrientation getLayoutPage() {
        return layoutPage;
    }

    public void setLayoutPage(PageOrientation layoutPage) {
        this.layoutPage = layoutPage;
    }

    public String getCenterTitle() {
        return centerTitle;
    }

    public void setCenterTitle(String centerTitle) {
        this.centerTitle = centerTitle;
    }

    public String getRightTitle() {
        return rightTitle;
    }

    public void setRightTitle(String rightTitle) {
        this.rightTitle = rightTitle;
    }

    public String getLeftTitle() {
        return leftTitle;
    }

    public void setLeftTitle(String leftTitle) {
        this.leftTitle = leftTitle;
    }

    public String[] getListLeftText() {
        return ListLeftText;
    }

    public void setListLeftText(String[] listLeftText) {
        ListLeftText = listLeftText;
    }

    public String getCurrentDateAr() {

        String currentDate="By Date: ";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        currentDate+=formatter.format(new Date());


        return currentDate;
    }

}
