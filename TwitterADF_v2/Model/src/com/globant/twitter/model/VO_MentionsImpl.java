package com.globant.twitter.model;

import com.globant.twitter.model.common.VO_Mentions;

import java.sql.ResultSet;

import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 11 16:24:42 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_MentionsImpl extends ViewObjectImpl implements VO_Mentions {
    /**
     * This is the default constructor (do not remove).
     */
    public VO_MentionsImpl() {
        System.out.println(String.format("Constructing VO_MentionsImpl !!!"));
    }

    /**
     * Returns the bind variable value for StartDate.
     * @return bind variable value for StartDate
     */
    public Date getStartDate() {
        return (Date)getNamedWhereClauseParam("StartDate");
    }

    /**
     * Sets <code>value</code> for bind variable StartDate.
     * @param value value to bind as StartDate
     */
    public void setStartDate(Date value) {
        setNamedWhereClauseParam("StartDate", value);
    }

    /**
     * Returns the bind variable value for EndDate.
     * @return bind variable value for EndDate
     */
    public Date getEndDate() {
        return (Date)getNamedWhereClauseParam("EndDate");
    }

    /**
     * Sets <code>value</code> for bind variable EndDate.
     * @param value value to bind as EndDate
     */
    public void setEndDate(Date value) {
        setNamedWhereClauseParam("EndDate", value);
    }

    /**
     * executeQueryForCollection - overridden for custom java data source support.
     */
    protected void executeQueryForCollection(Object qc, Object[] params,
                                             int noUserParams) {
        super.executeQueryForCollection(qc, params, noUserParams);
    }

    /**
     * hasNextForCollection - overridden for custom java data source support.
     */
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
    protected ViewRowImpl createRowFromResultSet(Object qc,
                                                 ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        return value;
    }

    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }
    
    public void testMethod_v1() { 
        System.out.println(String.format("wh0g3 !!!"));
    }
    
    public String testMethod_v2(String values) { 
        String result;
        
        System.out.println(String.format("testMethod_v2 !!!"));
        result = "Hello " + values;
        System.out.println(String.format("testMethod_v2 end: %s", result));
        
        return result;
    }
}
