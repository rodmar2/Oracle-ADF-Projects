
package com.globant.invoices.webservices.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.globant.invoices.webservices.proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInvoiceServerIDV4Response_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID_v4Response");
    private final static QName _GetInvoiceServerIDV2_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID_v2");
    private final static QName _GetInvoiceServerIDV2Response_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID_v2Response");
    private final static QName _GetInvoiceServerIDV3_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID_v3");
    private final static QName _GetInvoiceServerIDResponse_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerIDResponse");
    private final static QName _GetInvoiceServerIDV4_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID_v4");
    private final static QName _GetInvoiceServerIDV3Response_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID_v3Response");
    private final static QName _GetInvoiceServerID_QNAME = new QName("http://invoices.globant.com/", "getInvoiceServerID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.globant.invoices.webservices.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDV4Response }
     * 
     */
    public GetInvoiceServerIDV4Response createGetInvoiceServerIDV4Response() {
        return new GetInvoiceServerIDV4Response();
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDV2 }
     * 
     */
    public GetInvoiceServerIDV2 createGetInvoiceServerIDV2() {
        return new GetInvoiceServerIDV2();
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDV3 }
     * 
     */
    public GetInvoiceServerIDV3 createGetInvoiceServerIDV3() {
        return new GetInvoiceServerIDV3();
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDV2Response }
     * 
     */
    public GetInvoiceServerIDV2Response createGetInvoiceServerIDV2Response() {
        return new GetInvoiceServerIDV2Response();
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDResponse }
     * 
     */
    public GetInvoiceServerIDResponse createGetInvoiceServerIDResponse() {
        return new GetInvoiceServerIDResponse();
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDV4 }
     * 
     */
    public GetInvoiceServerIDV4 createGetInvoiceServerIDV4() {
        return new GetInvoiceServerIDV4();
    }

    /**
     * Create an instance of {@link GetInvoiceServerIDV3Response }
     * 
     */
    public GetInvoiceServerIDV3Response createGetInvoiceServerIDV3Response() {
        return new GetInvoiceServerIDV3Response();
    }

    /**
     * Create an instance of {@link GetInvoiceServerID }
     * 
     */
    public GetInvoiceServerID createGetInvoiceServerID() {
        return new GetInvoiceServerID();
    }

    /**
     * Create an instance of {@link InvoiceRequest }
     * 
     */
    public InvoiceRequest createInvoiceRequest() {
        return new InvoiceRequest();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link InvoiceResult }
     * 
     */
    public InvoiceResult createInvoiceResult() {
        return new InvoiceResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDV4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID_v4Response")
    public JAXBElement<GetInvoiceServerIDV4Response> createGetInvoiceServerIDV4Response(GetInvoiceServerIDV4Response value) {
        return new JAXBElement<GetInvoiceServerIDV4Response>(_GetInvoiceServerIDV4Response_QNAME, GetInvoiceServerIDV4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID_v2")
    public JAXBElement<GetInvoiceServerIDV2> createGetInvoiceServerIDV2(GetInvoiceServerIDV2 value) {
        return new JAXBElement<GetInvoiceServerIDV2>(_GetInvoiceServerIDV2_QNAME, GetInvoiceServerIDV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID_v2Response")
    public JAXBElement<GetInvoiceServerIDV2Response> createGetInvoiceServerIDV2Response(GetInvoiceServerIDV2Response value) {
        return new JAXBElement<GetInvoiceServerIDV2Response>(_GetInvoiceServerIDV2Response_QNAME, GetInvoiceServerIDV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDV3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID_v3")
    public JAXBElement<GetInvoiceServerIDV3> createGetInvoiceServerIDV3(GetInvoiceServerIDV3 value) {
        return new JAXBElement<GetInvoiceServerIDV3>(_GetInvoiceServerIDV3_QNAME, GetInvoiceServerIDV3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerIDResponse")
    public JAXBElement<GetInvoiceServerIDResponse> createGetInvoiceServerIDResponse(GetInvoiceServerIDResponse value) {
        return new JAXBElement<GetInvoiceServerIDResponse>(_GetInvoiceServerIDResponse_QNAME, GetInvoiceServerIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDV4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID_v4")
    public JAXBElement<GetInvoiceServerIDV4> createGetInvoiceServerIDV4(GetInvoiceServerIDV4 value) {
        return new JAXBElement<GetInvoiceServerIDV4>(_GetInvoiceServerIDV4_QNAME, GetInvoiceServerIDV4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerIDV3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID_v3Response")
    public JAXBElement<GetInvoiceServerIDV3Response> createGetInvoiceServerIDV3Response(GetInvoiceServerIDV3Response value) {
        return new JAXBElement<GetInvoiceServerIDV3Response>(_GetInvoiceServerIDV3Response_QNAME, GetInvoiceServerIDV3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvoiceServerID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invoices.globant.com/", name = "getInvoiceServerID")
    public JAXBElement<GetInvoiceServerID> createGetInvoiceServerID(GetInvoiceServerID value) {
        return new JAXBElement<GetInvoiceServerID>(_GetInvoiceServerID_QNAME, GetInvoiceServerID.class, null, value);
    }

}
