package com.kruger.poo.lambdas;

public class AppOperations {

	public static void main(String[] args) {
		
		Operations op = (x,y)->{
			System.out.println(x+y);
		};
		
		//op.imprimeSuma(4, 6);
		
		//metodo
		//clase de mismo tipo
		AppOperations obj = new AppOperations();
		obj.miMetodo(op, 3, 8);
		
	}
	public void miMetodo(Operations op, int x, int y) {
		op.imprimeSuma(x, y);
	}

}
