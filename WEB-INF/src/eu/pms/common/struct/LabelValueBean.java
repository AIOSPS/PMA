package eu.pms.common.struct;




public class LabelValueBean
{
    protected String value = null;
    protected String label = null;


    public LabelValueBean(String label, String value)
    {
        this.label = label;
        this.value = value;
    }
   public LabelValueBean(Integer value, String label)
    {
        this.label = label;
        this.value = (value!=null?value.toString():"");
    }

     public LabelValueBean(Double value, String label)
    {
        this.label = label;
        this.value = (value!=null?value.toString():"");
    }
    public String getLabel()
    {
        return(this.label);
    }

    public String getValue()
    {
        return(this.value);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("LabelValueBean[");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.value);
        sb.append("]");
        return(sb.toString());
    }
}
