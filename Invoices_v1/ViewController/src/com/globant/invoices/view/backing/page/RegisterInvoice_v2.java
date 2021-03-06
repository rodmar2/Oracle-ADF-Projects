package com.globant.invoices.view.backing.page;

import com.globant.invoices.app.AppModuleImpl;
import com.globant.invoices.model.AInvoicesImpl;
import com.globant.invoices.webservices.proxy.GetInvoiceServerIDV4Response;
import com.globant.invoices.webservices.proxy.InvoiceRequest;
import com.globant.invoices.webservices.proxy.InvoiceResult;
import com.globant.invoices.webservices.proxy.InvoicesServer;
import com.globant.invoices.webservices.proxy.InvoicesServerService;

import java.util.Date;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.ws.Response;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.binding.OperationBinding;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Key;
import oracle.jbo.client.Configuration;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityDefImpl;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class RegisterInvoice_v2 {
    
    /* Used in code */
    private RichInputText invoiceID;
    private RichInputDate invoiceDate;
    private RichInputText invoiceStatus;
        
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichOutputText ot1;
    private RichMessages m1;
    private RichPanelFormLayout pfl1;    
    private RichCommandButton cb1;
    private UIXGroup g1;
    private RichCommandButton cb2;
    private RichPanelGroupLayout pgl2;
    private RichInputText it1;
    private RichPanelFormLayout pfl2;
    private RichInputDate id2;    
    private RichInputText it4;
    private RichCommandButton cb6;
    private RichTable t1;
    private RichPanelGroupLayout pgl3;
    private RichCommandButton cb4;
    private RichSpacer s1;
    private RichCommandButton cb5;
    private RichSpacer s2;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setInvoiceDate(RichInputDate id1) {
        this.invoiceDate = id1;
    }

    public RichInputDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceStatus(RichInputText it2) {
        this.invoiceStatus = it2;
    }

    public RichInputText getInvoiceStatus() {
        return invoiceStatus;
    }


    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }
    
    /**
     * To test usage in buttons.
     */
    public void sayHello() {
        System.out.println(String.format("Hello people !"));
    }
    
    /**
     * Starting transaction for adding new invoice to database.
     */
    public void createInvoice() {
        System.out.println(String.format("Trying to insert new invoice..."));
        
        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();        
        System.out.println(String.format("bindings: %s", bindings));
        
        OperationBinding operation = bindings.getOperationBinding("CreateInsert");
        System.out.println(String.format("operation: %s", operation));
        
        Object o = null;
        try {
            o = operation.execute();
        }
        catch (Exception e) {
            System.out.println(String.format("Exception: %s", e.getMessage()));
        }
        finally {
            System.out.println(String.format("execution: %s", o));
        }
    }
    
    /**
     * Saving into DB.
     */
    public void saveInvoice() {
        System.out.println(String.format("Trying to saveInvoice..."));
        
        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();                
        System.out.println(String.format("bindings: %s", bindings));
        
        OperationBinding operation = bindings.getOperationBinding("Commit");
        System.out.println(String.format("operation: %s", operation));
        
        Object o = null;
        try {
            o = operation.execute();                                   
        }
        catch (Exception e) {
            System.out.println(String.format("first Exception: %s", e.getMessage()));
        }
        finally {
            System.out.println(String.format("first execution: %s", o));
        }
        try { 
            // Calling WS
            InvoicesServerService invoicesServerService = new InvoicesServerService();
            InvoicesServer invoicesServer = invoicesServerService.getInvoicesServerSoap12HttpPort();
                    
            InvoiceRequest invoiceRequest = new InvoiceRequest();          
            Response<GetInvoiceServerIDV4Response> invoiceCaller;
            
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(new Date());
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
                        
            int id2 = Integer.parseInt(invoiceID.getValue().toString());
            String s2 = invoiceDate.getValue().toString();
            int status2 = Integer.parseInt(invoiceStatus.getValue().toString());
            
            invoiceRequest.setId(id2);                
            invoiceRequest.setDate(date2);
            invoiceRequest.setStatus(status2);
            
            // WS invocation...
            invoiceCaller = invoicesServer.getInvoiceServerIDV4Async(invoiceRequest);            
            GetInvoiceServerIDV4Response invoiceResultWrapper = invoiceCaller.get();
            InvoiceResult invoiceResult = invoiceResultWrapper.getReturn();
                        
            System.out.println(String.format("WS Request: %s, %s, %s. Result: %d, %d.", invoiceRequest, s2, status2, invoiceResult.getId(), invoiceResult.getIdJdedwards()));                
                        
            // Calling java client service from Application to set the idJdedwards:
            String amDef = "com.globant.invoices.app.Model";   
            String config = "AppModuleLocal";
            /*
            * This is the correct way to use application custom methods
            * from the client, by using the application module's automatically-
            * maintained custom service interface.
            */
            // 1. Acquire instance of application module, cast to client interface        
            ApplicationModule am = Configuration.createRootApplicationModule(amDef,config);
            AppModuleImpl appModuleImpl = (AppModuleImpl) am;        
            
            
            // Adding it to DB.
            //AInvoicesImpl ainvoiceImpl = appModuleImpl.findaInvoicesImplById(invoiceRequest.getId());
            
            AInvoicesImpl ainvoiceImpl = appModuleImpl.updateInvoicesImplById(invoiceRequest.getId(), invoiceResult.getIdJdedwards());                        
            
            System.out.println(String.format("Ending saveInvoice: %s.", ainvoiceImpl));
        }
        catch (Exception e) {
            System.out.println(String.format("second Exception: %s", e.getMessage()));
        }
        finally {
            System.out.println(String.format("second execution: %s", o));
        }
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }


    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setInvoiceID(RichInputText it3) {
        this.invoiceID = it3;
    }

    public RichInputText getInvoiceID() {
        return invoiceID;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setCb6(RichCommandButton cb6) {
        this.cb6 = cb6;
    }

    public RichCommandButton getCb6() {
        return cb6;
    }


    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setCb4(RichCommandButton cb4) {
        this.cb4 = cb4;
    }

    public RichCommandButton getCb4() {
        return cb4;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }


    public void setCb5(RichCommandButton cb5) {
        this.cb5 = cb5;
    }

    public RichCommandButton getCb5() {
        return cb5;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }


}
