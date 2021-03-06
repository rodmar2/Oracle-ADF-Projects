package com.globant.invoices.app.client;

import com.globant.invoices.app.common.AppModule;
import com.globant.invoices.model.AInvoicesImpl;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 28 17:19:51 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }

    public AInvoicesImpl findaInvoicesImplById(int aInvoicesImplId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"findaInvoicesImplById",new String [] {"int"},new Object[] {new Integer(aInvoicesImplId)});
        return (AInvoicesImpl)_ret;
    }

    public AInvoicesImpl updateInvoicesImplById(int aInvoicesImplId,
                                                int aInvoicesImplIdJdedwars) {
        Object _ret =
            this.riInvokeExportedMethod(this,"updateInvoicesImplById",new String [] {"int","int"},new Object[] {new Integer(aInvoicesImplId), new Integer(aInvoicesImplIdJdedwars)});
        return (AInvoicesImpl)_ret;
    }
}
