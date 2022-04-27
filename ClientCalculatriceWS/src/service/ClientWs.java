package service;

import java.util.Scanner;

public class ClientWs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculer stub = new ServiceCalculateService().getCalculerPort();
		int v1;
		int v2;
		String operation;

		Scanner sc1 = new Scanner(System.in);
		System.out.println("i:");
		v1=sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("j:");
		v2=sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Operation:");
		operation=sc3.nextLine();
		
			if(operation.equals("/")) {
				System.out.println("Division");
				double res = stub.division(v1, v2);
				System.out.println(res);
			}	
			if(operation.equals("-")) {
				System.out.println("Soustraction");
				double res = stub.soustraction(v1, v2);
				System.out.println(res);
			}	
			if(operation.equals("+")) {
				System.out.println("Addition");
				double res = stub.addition(v1, v2);
				System.out.println(res);
			}	
			if(operation.equals("*")) {
				System.out.println("Multiplication");
				double res = stub.multiplication(v1, v2);
				System.out.println(res);
			}	
		

	}

}
