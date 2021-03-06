
package com.greenland.UnitsConverterWS.wsimport.generated.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UC", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UC {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "f2c")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "f2c", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.F2C")
    @ResponseWrapper(localName = "f2cResponse", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.F2CResponse")
    @Action(input = "http://ws.UnitsConverterWS.greenland.com/UC/f2cRequest", output = "http://ws.UnitsConverterWS.greenland.com/UC/f2cResponse")
    public double f2C(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "in2cm")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "in2cm", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.In2Cm")
    @ResponseWrapper(localName = "in2cmResponse", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.In2CmResponse")
    @Action(input = "http://ws.UnitsConverterWS.greenland.com/UC/in2cmRequest", output = "http://ws.UnitsConverterWS.greenland.com/UC/in2cmResponse")
    public double in2Cm(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "cm2in")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cm2in", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.Cm2In")
    @ResponseWrapper(localName = "cm2inResponse", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.Cm2InResponse")
    @Action(input = "http://ws.UnitsConverterWS.greenland.com/UC/cm2inRequest", output = "http://ws.UnitsConverterWS.greenland.com/UC/cm2inResponse")
    public double cm2In(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "c2f")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "c2f", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.C2F")
    @ResponseWrapper(localName = "c2fResponse", targetNamespace = "http://ws.UnitsConverterWS.greenland.com/", className = "com.greenland.UnitsConverterWS.wsimport.generated.client.C2FResponse")
    @Action(input = "http://ws.UnitsConverterWS.greenland.com/UC/c2fRequest", output = "http://ws.UnitsConverterWS.greenland.com/UC/c2fResponse")
    public double c2F(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
