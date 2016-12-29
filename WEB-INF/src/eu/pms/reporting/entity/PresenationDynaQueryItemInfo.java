package eu.pms.reporting.entity;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class PresenationDynaQueryItemInfo {
    public static final int ONE_VALUE_EQUAL_CONDITION = 0;
    public static final int ONE_VALUE_LESS_THAN_CONDITION = 1;
    public static final int ONE_VALUE_MORE_THAN_CONDITION = 2;
    public static final int ONE_VALUE_LESS_OR_EQUAL_CONDITION = 3;
    public static final int ONE_VALUE_MORE_OR_EQUAL_CONDITION = 4;
    public static final int ONE_VALUE_LIKE_CONDITION = 5;
    public static final int BETWEEN_2_VALUES_CONDITION = 6;
    public static final int ONE_VALUE_IN_CONDITION = 7;
    public static final int MULTI_VALUE_IN_CONDITION = 8; //multi value selected
    private String itemId;
    private int itemWhereType;
    private String itemVal1;
    private String itemVal2;
    private String[] itemList1;
    public PresenationDynaQueryItemInfo()
    {
    }

    public PresenationDynaQueryItemInfo(String itemId)
    {
        this.itemId = itemId;
    }

    public PresenationDynaQueryItemInfo(String itemId, int itemWhereType)
    {
        this.itemId = itemId;
        this.itemWhereType = itemWhereType;
    }

    public PresenationDynaQueryItemInfo(String itemId, int itemWhereType, String itemVal1)
    {
        this.itemId = itemId;
        this.itemWhereType = itemWhereType;
        this.itemVal1 = itemVal1;
    }

    public PresenationDynaQueryItemInfo(String itemId, int itemWhereType, String itemVal1, String itemVal2)
    {
        this.itemId = itemId;
        this.itemWhereType = itemWhereType;
        this.itemVal1 = itemVal1;
        this.itemVal2 = itemVal2;
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public int getItemWhereType()
    {
        return itemWhereType;
    }

    public void setItemWhereType(int itemWhereType)
    {
        this.itemWhereType = itemWhereType;
    }

    public String getItemVal1()
    {
        return itemVal1;
    }

    public void setItemVal1(String itemVal1)
    {
        this.itemVal1 = itemVal1;
    }

    public String getItemVal2()
    {
        return itemVal2;
    }

    public void setItemVal2(String itemVal2)
    {
        this.itemVal2 = itemVal2;
    }

    public String[] getItemList1() {
        return itemList1;
    }

    public void setItemList1(String[] itemList1) {
        this.itemList1 = itemList1;
    }
}