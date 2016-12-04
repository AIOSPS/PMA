package eu.pms.common.utils;


/**
 * Auther: Mureed F.Al-Alem
 * Date: Nov 7, 2006
 * Time: 1:53:12 PM
 * QOU Portal Project (ICTC)  center
 * version 1.0
 */
public class ComboData implements java.io.Serializable {

    private String label;
    private String value;


    public ComboData(String part1, String part2, String part3, String withSeq)
    {
        if (withSeq != null && withSeq.equalsIgnoreCase("true"))
            this.label = "[" + part1 + "|" + part2 + "] " + part3;
        else
            this.label = "[" + part1 + "] " + part3;

        this.value = part1;
    }

    public ComboData(String part1, String part2, String part3)
    {
         this.label = "[" + part1 + "|" + part2 + "] " + part3;
        this.value = part2+"-"+part1;
    }

    public ComboData(String part1,  String part3)
    {
        this.label = "[" + part1 + "] " + part3;
        this.value = part1;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
