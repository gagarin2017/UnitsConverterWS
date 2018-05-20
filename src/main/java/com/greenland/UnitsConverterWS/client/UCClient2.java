package com.greenland.UnitsConverterWS.client;

import com.greenland.UnitsConverterWS.wsimport.generated.client.UC;
import com.greenland.UnitsConverterWS.wsimport.generated.client.UCImplService;

/**
 * A simplified client for accessing the UC Web service
 * 
 * Because the WSDL document contains enough information to let clients communicate with the Web service, 
 * you can alternatively use the <b>wsimport</b> tool to generate client-support code from this document, 
 * to facilitate creating the client. In the context of UC, you would use this tool as follows:
 * 
 * wsimport -keep –p client http://localhost:9901/UC?wsdl
 * 
 * @author Jura
 *
 */
public class UCClient2
{
   public static void main(String[] args) throws Exception
   {
      UCImplService ucis = new UCImplService();
      UC uc = ucis.getUCImplPort();
      System.out.printf("DC to DF: 37 DC = %f DF%n", uc.c2F(37.0));
      System.out.printf("CM to IN: 10 CM = %f IN%n", uc.cm2In(10));
      System.out.printf("DF to DC: 212 DF = %f DC%n", uc.f2C(212.0));
      System.out.printf("IN to CM: 10 IN = %f CM%n", uc.in2Cm(10));
   }
}