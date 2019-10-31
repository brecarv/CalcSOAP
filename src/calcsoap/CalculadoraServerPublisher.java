package calcsoap;

import javax.xml.ws.Endpoint;

public class CalculadoraServerPublisher {
 
  public static void main(String[] args)
  {
    Endpoint.publish("http://127.0.0.1:9000/calcsoap",
    new CalculadoraServerImpl());
    
    /*
     * http://127.0.0.1:9000/calcsoap?wsdl
     * */
  }
}