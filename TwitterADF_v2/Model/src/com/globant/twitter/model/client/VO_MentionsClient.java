package com.globant.twitter.model.client;

import com.globant.twitter.model.common.VO_Mentions;

import java.util.List;

import oracle.jbo.client.remote.ViewUsageImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 11 16:27:53 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_MentionsClient extends ViewUsageImpl implements VO_Mentions {
    /**
     * This is the default constructor (do not remove).
     */
    public VO_MentionsClient() {
    }


    public void testMethod_v1() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"testMethod_v1",null,null);
        return;
    }

    public String testMethod_v2(String values) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"testMethod_v2",new String [] {"java.lang.String"},new Object[] {values});
        return (String)_ret;
    }

    public String testMethod_v3(List<String> values) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"testMethod_v3",new String [] {"java.util.List<java.lang.String>"},new Object[] {values});
        return (String)_ret;
    }
}
