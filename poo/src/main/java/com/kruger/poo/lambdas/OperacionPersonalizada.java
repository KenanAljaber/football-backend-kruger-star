package com.kruger.poo.lambdas;

public class OperacionPersonalizada {

	public static void main(String[] args) {
		// generar expresion con devoluciones
		//operacion con parametros y mas generico para enviar el paramtro de operacion como un argumento
		engine((x,y)->x+y );
		engine((x,y)->x-y );
		engine((x,y)->x*y );
		engine((x,y)->x/y );
		
		
		

	}
	public static void engine(Calculadora calc) {
		int x=2, y=3;
		int resultado = calc.calcular(x, y);
		System.out.println(resultado);
	}

}
