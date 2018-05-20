package com.greenland.UnitsConverterWS.ws;

import javax.jws.WebService;

/**
 * UCImpl describes a Service Implementation Bean (SIB)
 * 
 * which provides an implementation of the SEI. 
 * This class is declared to be a SIB via the @WebService(endpointInterface = "ca.javajeff.uc.UC") annotation. 
 * The endpointInterface element connects this SIB to its SEI, and is necessary to avoid undefined port type errors 
 * when running the client application presented later.
 * 
 * The implements UC clause isn't absolutely necessary. 
 * If this clause isn't present, the UC interface is ignored (and is redundant). 
 * However, it's a good idea to keep implements UC so the compiler can verify 
 * that the SEI's methods have been implemented in the SIB.
 * @author Jura
 *
 */
@WebService(endpointInterface = "com.greenland.UnitsConverterWS.ws.UC")
public class UCImpl implements UC // implements UC isn't absolutely necessary
{
   public double c2f(double degrees)
   {
      return degrees * 9.0 / 5.0 + 32;
   }

   public double cm2in(double cm)
   {
      return cm / 2.54;
   }

   public double f2c(double degrees)
   {
      return (degrees - 32) * 5.0 / 9.0;
   }

   public double in2cm(double in)
   {
      return in * 2.54;
   }
}
