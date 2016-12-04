package eu.pms.common.struct;

import eu.pms.common.constant.MsConstant;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Jun 19, 2011
 * Time: 8:44:02 AM
 */
public class LabelValue {

    private String  label;
    private String  value;
    private String  color;
    private String  classCss;
    private boolean valueIsUnicode;

    public LabelValue() {
    }

    public LabelValue(String label, String value) {
        this.label = label;
        this.value = value;
        this.valueIsUnicode=true;
    }
        public LabelValue(String label, Integer value) {
        this.label = label;
        this.value = value.toString();
        this.valueIsUnicode=true;
    }

    public LabelValue(String label, String value, String color) {
        this.label = label;
        this.value = value;
        this.color = color;
        this.valueIsUnicode=true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public boolean getValueIsUnicode() {
        return this.valueIsUnicode;
    }

    public void setValueIsUnicode(boolean valueIsUnicode) {
        this.valueIsUnicode = valueIsUnicode;
    }

    public String getClassCss() {
        if(color.equals(MsConstant.COLOR_SUCCESS))
        return "borderRoundedGreenColor";
        else
        return "borderRoundedRedColor";
    }

    public void setClassCss(String classCss) {
        this.classCss = classCss;
    }

}
