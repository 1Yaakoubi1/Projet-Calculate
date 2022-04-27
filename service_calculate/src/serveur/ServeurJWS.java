package serveur;

import javax.xml.ws.Endpoint;

import serviceCalculate.ServiceCalculate;



public class ServeurJWS {
	
	public static void main(String[] args) {
		
		{String url="http://localhost:8584/";
		Endpoint.publish(url, new ServiceCalculate());
		System.out.print(url);
		}
	}

}
