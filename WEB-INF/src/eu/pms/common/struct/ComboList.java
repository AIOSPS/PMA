package eu.pms.common.struct;

import org.apache.batik.dom.util.HashTable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: Apr 25, 2012
 * Time: 9:15:38 AM
 */
public class ComboList
{

    private String label;
    private String value;


     public ComboList(String label, String value)
    {
        this.label = label;
        this.value = value;
    }

    public ComboList(String labelValue)
    {
        this.label = labelValue;
        this.value = labelValue;
    }

    public ComboList(String label ,Long value)
    {
        this.label = label;
        this.value = String.valueOf(value);
    }
      public ComboList(String label1,String label2, String value)
    {
        this.label = label1+" [ "+label2+" ]";
        this.value = value;
    }

    public ComboList(byte label, byte value)
    {
        this.label = label+"";
        this.value = value+"";
    }

    public ComboList(String label, Integer value)
    {
        this.label = label;
        this.value = value == null ? "" : value.toString();
    }

    public ComboList(String label, Double value)
    {
        this.label = label;
        this.value = value == null ? "" : value.toString();
    }

    public ComboList()
    {
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Collection createComboList(HashTable ht)
    {
        ComboList cl = null;
        ArrayList result = new ArrayList();
        for(int i = 0; i < ht.size(); i++)
        {
            cl = new ComboList(ht.key(i).toString(), ht.item(i).toString());
            result.add(cl);
        }

        return result;
    }

}
