# UnitsConverterWS
Very Basic SOAP-based WS

Following the tutorial at https://www.javaworld.com/article/3215966/java-language/web-services-in-java-se-part-2-creating-soap-web-services.html

By Jeff Friesen, JavaWorld | Aug 14, 2017 1:27 PM PT

Because the WSDL document contains enough information to let clients communicate with the Web service, you can alternatively use the wsimport tool to generate client-support code from this document, to facilitate creating the client. In the context of UC, you would use this tool as follows:

<local path to project>\UnitsConverterWS\src\main\java>wsimport -keep -p com.greenland.UnitsConverterWS.wsimport.generated.client http://localhost:9901/UC?wsdl

