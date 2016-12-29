package eu.pms.reporting.entity;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class QueryItemEntity {
    private String itemId;
    private String hdbFieldName;
    private String hdbTableName;
    private String displayName;
    private String whereCondition;
    private String hasLockup;
    private String lockupDisplayValue;
    private String lockupTable;
    private String lockupWhereCondition;
    private String hasJoin;
    private TreeMap<String,TableJoinInfoEntity> joinInfoList;

    public QueryItemEntity()
    {
    }

    public QueryItemEntity(String itemId, String hdbFieldName, String hdbTableName, String displayName, String whereCondition, String hasLockup, String hasJoin)
    {
        this.itemId = itemId;
        this.hdbFieldName = hdbFieldName;
        this.hdbTableName = hdbTableName;
        this.displayName = displayName;
        this.whereCondition = whereCondition;
        this.hasLockup = hasLockup;
        this.hasJoin = hasJoin;
    }

    public QueryItemEntity(String itemId, String hdbFieldName, String hdbTableName, String displayName, String whereCondition, String hasLockup, String lockupDisplayValue, String lockupTable, String lockupWhereCondition, String hasJoin, TreeMap<String, TableJoinInfoEntity> joinInfoList)
    {
        this.itemId = itemId;
        this.hdbFieldName = hdbFieldName;
        this.hdbTableName = hdbTableName;
        this.displayName = displayName;
        this.whereCondition = whereCondition;
        this.hasLockup = hasLockup;
        this.lockupDisplayValue = lockupDisplayValue;
        this.lockupTable = lockupTable;
        this.lockupWhereCondition = lockupWhereCondition;
        this.hasJoin = hasJoin;
        this.joinInfoList = joinInfoList;
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public String getHdbFieldName()
    {
        return hdbFieldName;
    }

    public void setHdbFieldName(String hdbFieldName)
    {
        this.hdbFieldName = hdbFieldName;
    }

    public String getHdbTableName()
    {
        return hdbTableName;
    }

    public void setHdbTableName(String hdbTableName)
    {
        this.hdbTableName = hdbTableName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getWhereCondition()
    {
        return whereCondition;
    }

    public void setWhereCondition(String whereCondition)
    {
        this.whereCondition = whereCondition;
    }

    public String isHasLockup()
    {
        return hasLockup;
    }

    public void setHasLockup(String hasLockup)
    {
        this.hasLockup = hasLockup;
    }

    public String getLockupDisplayValue()
    {
        return lockupDisplayValue;
    }

    public void setLockupDisplayValue(String lockupDisplayValue)
    {
        this.lockupDisplayValue = lockupDisplayValue;
    }

    public String getLockupTable()
    {
        return lockupTable;
    }

    public void setLockupTable(String lockupTable)
    {
        this.lockupTable = lockupTable;
    }

    public String getLockupWhereCondition()
    {
        return lockupWhereCondition;
    }

    public void setLockupWhereCondition(String lockupWhereCondition)
    {
        this.lockupWhereCondition = lockupWhereCondition;
    }

    public String isHasJoin()
    {
        return hasJoin;
    }

    public void setHasJoin(String hasJoin)
    {
        this.hasJoin = hasJoin;
    }

    public TreeMap<String, TableJoinInfoEntity> getJoinInfoList()
    {
        return joinInfoList;
    }

    public void setJoinInfoList(TreeMap<String, TableJoinInfoEntity> joinInfoList)
    {
        this.joinInfoList = joinInfoList;
    }

    public String toString()
    {
        Iterator keys = joinInfoList.keySet().iterator();

        while(keys.hasNext())
        {
            Object key = keys.next();
            System.out.println("Key: "+ key +", Val= "+joinInfoList.get(key));
        }
        return
                new StringBuffer().append("itemId = ").append(itemId).append("\n").
                        append("hdbFieldName = ").append(hdbFieldName).append("\n").
                        append("hdbTableName = ").append(hdbTableName).append("\n").
                        append("displayName = ").append(displayName).append("\n").
                        append("whereCondition = ").append(whereCondition).append("\n").
                        append("hasLockup = ").append(hasLockup).append("\n").
                        append("lockupDisplayValue = ").append(lockupDisplayValue).append("\n").
                        append("lockupTable = ").append(lockupTable).append("\n").
                        append("lockupWhereCondition = ").append(lockupWhereCondition).append("\n").
                        append("hasJoin = ").append(hasJoin).append("\n").
                        append("-----------------------------------------").toString();
    }
}