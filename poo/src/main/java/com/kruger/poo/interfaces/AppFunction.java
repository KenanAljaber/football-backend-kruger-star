package com.kruger.poo.interfaces;

import java.util.function.Function;

public class AppFunction {

	public static void main(String[] args) {
		// implementar la interfaz function
		Function<Integer, String> convertidor = x -> Integer.toString(x);
		
		//como seria normalmente con una clase anonima
		Function<Integer,String> convertidor2 = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				throw new UnsupportedOperationException("no soportada");
			}
		};
		
		//System.out.println(convertidor.apply(12));
		//System.out.println(convertidor2.apply(120));
		
		//2 ejemplo
		//calcular el cuadrado de un numero
		Function<Integer, Integer> cuadrado = x-> x * x;
		System.out.println("el cuadrado de 5 es: " + cuadrado.apply(5));
		
		//3 ejmplo\
		//contador de caracteres
		Function<String, Integer> contadorCaracteres = str-> str.length();
		String text="codigo jaime sayago";
		System.out.println("numero de caracteres es : " +
				contadorCaracteres.apply(text));
		
	}

}
