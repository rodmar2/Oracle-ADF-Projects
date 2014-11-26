package com.globant.invoices.webservices.proxy;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://localhost:7101/Invoices_v1-JDEdwards_v1-context-root/InvoicesServerSoap12HttpPort?WSDL",
  targetNamespace="http://invoices.globant.com/", name="InvoicesServerService")
public class InvoicesServerService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.globant.invoices.webservices.proxy.InvoicesServerService");
      URL baseUrl = InvoicesServerService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            InvoicesServerService.class.getResource("http://localhost:7101/Invoices_v1-JDEdwards_v1-context-root/InvoicesServerSoap12HttpPort?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://localhost:7101/Invoices_v1-JDEdwards_v1-context-root/InvoicesServerSoap12HttpPort?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://localhost:7101/Invoices_v1-JDEdwards_v1-context-root/InvoicesServerSoap12HttpPort?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://localhost:7101/Invoices_v1-JDEdwards_v1-context-root/InvoicesServerSoap12HttpPort?WSDL",
          e);
    }
  }

  public InvoicesServerService()
  {
    super(wsdlLocationURL,
          new QName("http://invoices.globant.com/", "InvoicesServerService"));
  }

  public InvoicesServerService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="InvoicesServerSoap12HttpPort")
  public com.globant.invoices.webservices.proxy.InvoicesServer getInvoicesServerSoap12HttpPort()
  {
    return (com.globant.invoices.webservices.proxy.InvoicesServer) super.getPort(new QName("http://invoices.globant.com/",
                                                                                           "InvoicesServerSoap12HttpPort"),
                                                                                 com.globant.invoices.webservices.proxy.InvoicesServer.class);
  }

  @WebEndpoint(name="InvoicesServerSoap12HttpPort")
  public com.globant.invoices.webservices.proxy.InvoicesServer getInvoicesServerSoap12HttpPort(WebServiceFeature... features)
  {
    return (com.globant.invoices.webservices.proxy.InvoicesServer) super.getPort(new QName("http://invoices.globant.com/",
                                                                                           "InvoicesServerSoap12HttpPort"),
                                                                                 com.globant.invoices.webservices.proxy.InvoicesServer.class,
                                                                                 features);
  }
}
