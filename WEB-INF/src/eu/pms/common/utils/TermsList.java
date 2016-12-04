package eu.pms.common.utils;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Al-Quds Open University</p>
 * @author unascribed
 * @version 1.0
 */

public class TermsList implements java.io.Serializable
{

  private String termNo;
  private String termName;
  private boolean selected;

  public TermsList()
  {
  }

  public TermsList(String termNo, String termName)
  {
    this.termNo = termNo;
    this.termName = termName;
  }

  public String getTermNo()
  {
    return termNo;
  }
  public void setTermNo(String termNo)
  {
    this.termNo = termNo;
  }
  public void setTermName(String termName)
  {
    this.termName = termName;
  }
  public String getTermName()
  {
    return termName;
  }
  public void setSelected(boolean selected)
  {
    this.selected = selected;
  }
  public boolean isSelected()
  {
    return selected;
  }
}