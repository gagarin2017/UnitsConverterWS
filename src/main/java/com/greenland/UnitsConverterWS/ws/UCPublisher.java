package com.greenland.UnitsConverterWS.ws;

import javax.xml.ws.Endpoint;

/**
 * UCPublisher application 
 * 
 * Accomplishes task in the context of the default lightweight HTTP server
 * @author Jura
 *
 */
public class UCPublisher
{
   public static void main(String[] args)
   {
	   /**
	    * The publish() method creates and publishes an endpoint for the specified implementor object at the given address, 
	    * and uses the implementor's annotations to create Web Services Definition Language (WSDL) and XML Schema documents. 
	    * It causes the necessary server infrastructure to be created and configured by the JAX-WS implementation based on some default configuration. 
	    * Furthermore, this method causes the application to run indefinitely.
	    */
		
      Endpoint.publish("http://localhost:9901/UC", new UCImpl());
      
      /**
       * While the application runs, use a Web browser to verify that this Web service is running correctly and to access its WSDL document. 
       * Start your favorite Web browser and enter the following line in the address bar:
       * 
       * http://localhost:9901/UC
       * 
       * NB: the above url did not work. Use http://localhost:9901/UC?wsdl instead to examine the created wsdl.
       */
   }
}
