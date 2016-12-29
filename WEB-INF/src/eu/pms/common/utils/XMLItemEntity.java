package eu.pms.common.utils;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class XMLItemEntity{
    private String itemName;
    private String itemValue;
    private String attribute;

    public XMLItemEntity()
    {
    }

    public XMLItemEntity(String itemName, String itemValue)
    {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public XMLItemEntity(String itemName, String itemValue, String attribute)
    {
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.attribute = attribute;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public String getItemValue()
    {
        return itemValue;
    }

    public void setItemValue(String itemValue)
    {
        this.itemValue = itemValue;
    }

    public String getAttribute()
    {
        return attribute;
    }

    public void setAttribute(String attribute)
    {
        this.attribute = attribute;
    }

    public String toString()
    {
        return itemName +" = "+ itemValue;
    }
}