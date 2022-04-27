package serviceCalculate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="Calculer")
public class ServiceCalculate {
	
	
	@WebMethod(operationName="Addition")
	public int addition(@WebParam(name="i") int i, @WebParam(name="j") int j) {
		int somme = 0;
		somme = i + j;
		return somme;
		
	}
	
	@WebMethod(operationName = "Soustraction")
	public int soustraction(@WebParam(name="i") int i, @WebParam(name="j") int j) {
		int somme = 0;
		somme = i - j;
		return somme;
		
	}
	@WebMethod(operationName = "Multiplication")
	public int multiplication(@WebParam(name="i") int i, @WebParam(name="j") int j) {
		int somme = 0;
		somme = i * j;
		return somme;
		
	}
	@WebMethod(operationName = "division")
	public int division(@WebParam(name="i") int i, @WebParam(name="j") int j) {
		int somme = 0;
		somme = i / j;
		return somme;
		
	}

}
