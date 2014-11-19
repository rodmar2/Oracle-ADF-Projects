package com.globant.invoices;

import com.globant.invoices.entities.Invoice;

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
        invoice.setIdJdedwards(invoice.getId()+1000+invoice.getIdEmployee());
        return  invoice;    
    }

    @WebMethod(exclude = true)
    public static void main(String[] args) {
        InvoicesServer invoicesServer = new InvoicesServer();
    }
}
