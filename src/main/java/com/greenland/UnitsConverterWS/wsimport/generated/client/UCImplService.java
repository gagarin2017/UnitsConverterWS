
package com.greenland.UnitsConverterWS.wsimport.generated.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UCImplService", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", wsdlLocation = "http://localhost:9901/UC?wsdl")
public class UCImplService
    extends Service
{

    private final static URL UCIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException UCIMPLSERVICE_EXCEPTION;
    private final static QName UCIMPLSERVICE_QNAME = new QName("http://ws.UnitsConverterWS.greenland.com/", "UCImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9901/UC?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UCIMPLSERVICE_WSDL_LOCATION = url;
        UCIMPLSERVICE_EXCEPTION = e;
    }

    public UCImplService() {
        super(__getWsdlLocation(), UCIMPLSERVICE_QNAME);
    }

    public UCImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UCIMPLSERVICE_QNAME, features);
    }

    public UCImplService(URL wsdlLocation) {
        super(wsdlLocation, UCIMPLSERVICE_QNAME);
    }

    public UCImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UCIMPLSERVICE_QNAME, features);
    }

    public UCImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UCImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UC
     */
    @WebEndpoint(name = "UCImplPort")
    public UC getUCImplPort() {
        return super.getPort(new QName("http://ws.UnitsConverterWS.greenland.com/", "UCImplPort"), UC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UC
     */
    @WebEndpoint(name = "UCImplPort")
    public UC getUCImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.UnitsConverterWS.greenland.com/", "UCImplPort"), UC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UCIMPLSERVICE_EXCEPTION!= null) {
            throw UCIMPLSERVICE_EXCEPTION;
        }
        return UCIMPLSERVICE_WSDL_LOCATION;
    }

}
