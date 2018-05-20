package com.greenland.UnitsConverterWS.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * The UC Web service's Service Endpoint Interface
 * 
 * The units-conversion Web service, which I've named UC, 
 * consists of four functions for converting between centimeters and inches
 * and between degrees Fahrenheit and degrees Celsius.
 * @author Jura
 *
 */
@WebService
public interface UC
{
//	@WebMethod isn't essential in this example
   @WebMethod double c2f(double degrees);
   @WebMethod double cm2in(double cm);
   @WebMethod double f2c(double degrees);
   @WebMethod double in2cm(double in);
}