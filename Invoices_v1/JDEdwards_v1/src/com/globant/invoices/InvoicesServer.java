package com.globant.invoices;

import com.globant.invoices.entities.Invoice;

import com.globant.invoices.services.InvoiceRequest;

import com.globant.invoices.services.InvoiceResult;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(portName = "InvoicesServerSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class InvoicesServer {
    
    public InvoicesServer() {
        super();
    }

    public int getInvoiceServerID(int localID) {
        System.out.println(String.format("Serving : getInvoiceServerID for %d", localID));
        return  localID + 1;    
    }
    
    public String getInvoiceServerID_v2(int localID, String localName) {
        System.out.println(String.format("Serving : getInvoiceServerID_v2 for %d %s", localID, localName));
        return  localID + 1 + localName;    
    }
    
    /**
     * Producing invoice id.
     * 
     * @param invoice
     * @return
     */
     public Invoice getInvoiceServerID_v3(Invoice invoice) {
        System.out.println(String.format("Serving : getInvoiceServerID_v3 for %s ", invoice));
        invoice.setIdJdedwards(1000+invoice.getId()+invoice.getDate().getYear()+invoice.getDate().getMonth()+invoice.getDate().getDay());
        return  invoice;    
    }
    
    /**
     * Providing more complexity to structures used by WS.
     * 
     */
    public InvoiceResult getInvoiceServerID_v4(InvoiceRequest invoiceRequest) {
        System.out.println(String.format("Serving : getInvoiceServerID_v4 for %s ", invoiceRequest));
        
        Invoice invoice = new Invoice();
        InvoiceResult invoiceResult = new InvoiceResult();
                        
        invoice.setId(invoiceRequest.getId());
        invoice.setDate(invoiceRequest.getDate());
        invoice.setStatus(invoiceRequest.getStatus());        
        invoice.setIdJdedwards(1000+invoice.getId()+(int)Math.floor(Math.random()*1000));
        
        invoiceResult.setId(invoice.getId());
        invoiceResult.setIdJdedwards(invoice.getIdJdedwards());
        
        System.out.println(String.format("Ending : getInvoiceServerID_v4 is %s ", invoiceResult));
        return  invoiceResult;    
    }

    @WebMethod(exclude = true)
    public static void main(String[] args) {
        InvoicesServer invoicesServer = new InvoicesServer();
    }
}
