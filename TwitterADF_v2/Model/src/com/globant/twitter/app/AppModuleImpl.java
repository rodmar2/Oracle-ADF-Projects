package com.globant.twitter.app;

import com.globant.twitter.model.VO_MentionsImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 12 12:52:43 CST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for VO_Mentions.
     * @return VO_Mentions
     */
    public VO_MentionsImpl getVO_Mentions() {
        return (VO_MentionsImpl)findViewObject("VO_Mentions");
    }

    /**
     * Container's getter for VO_TwitterAccount.
     * @return VO_TwitterAccount
     */
    public ViewObjectImpl getVO_TwitterAccount() {
        return (ViewObjectImpl)findViewObject("VO_TwitterAccount");
    }
}
