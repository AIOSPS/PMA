package eu.pms.reporting.entity;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class TableJoinInfoEntity {
    private String joinWithTable;
    private String joinWithCondition;

    public TableJoinInfoEntity()
    {
    }

    public TableJoinInfoEntity(String joinWithTable, String joinWithCondition)
    {
        this.joinWithTable = joinWithTable;
        this.joinWithCondition = joinWithCondition;
    }

    public String getJoinWithTable()
    {
        return joinWithTable;
    }

    public void setJoinWithTable(String joinWithTable)
    {
        this.joinWithTable = joinWithTable;
    }

    public String getJoinWithCondition()
    {
        return joinWithCondition;
    }

    public void setJoinWithCondition(String joinCondition)
    {
        this.joinWithCondition = joinCondition;
    }

    public String toString()
    {
        return new StringBuffer().append("JoinTable = ").append(joinWithTable).append(", JoinCond = ").append(joinWithCondition).toString();
    }
}
