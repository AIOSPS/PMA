package eu.pms.common.struct;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Nov 17, 2012
 * Time: 12:14:51 PM
 */
public class PdfHeaderInfo
{
    public final static String PDF_HEADER_INFO="pdfHeaderInfo";

    private String title;
    private String rightSubTitle;
    private String centerSubTitle;
    private String lefttSubTitle;

    public PdfHeaderInfo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRightSubTitle() {
        return rightSubTitle;
    }

    public void setRightSubTitle(String rightSubTitle) {
        this.rightSubTitle = rightSubTitle;
    }

    public String getLefttSubTitle() {
        return lefttSubTitle;
    }

    public void setLefttSubTitle(String lefttSubTitle) {
        this.lefttSubTitle = lefttSubTitle;
    }

    public String getCenterSubTitle() {
        return centerSubTitle;
    }

    public void setCenterSubTitle(String centerSubTitle) {
        this.centerSubTitle = centerSubTitle;
    }

    public void viewCurrentDate(HttpServletRequest request) {
         request.setAttribute("viewCurrentDate","true");
    }
}
