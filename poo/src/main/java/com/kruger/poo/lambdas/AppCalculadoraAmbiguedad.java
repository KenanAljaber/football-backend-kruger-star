package com.kruger.poo.lambdas;

public class AppCalculadoraAmbiguedad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//agisnacion por refencia
		engine((CalculadoraInt)(x,y)->x+y );
		
		//otra forma
		CalculadoraInt calI=(x,y)->x-y;
		engine(calI);
		
		//enviar la expresion como un objeto
		System.out.println(create().calcular(5L,3L));
	
	}
	public static void engine(CalculadoraInt calc) {
		int x=2, y=3;
		int resultado = calc.calcular(x, y);
		System.out.println(resultado);
	}
	public static void engine(CalculadoraLong calc) {
		Long x=2L, y=3L;
		Long resultado = calc.calcular(x, y);
		System.out.println(resultado);
	}
	
	public static CalculadoraLong create() {
		return (x,y)->x/y;
	}
	
}
