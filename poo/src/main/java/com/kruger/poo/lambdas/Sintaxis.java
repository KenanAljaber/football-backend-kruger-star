package com.kruger.poo.lambdas;

public interface Sintaxis {
	public void aceptar(int valor, int valor1); //metodo abstracto
	
	//otro metod
	default String m(String m) {
		return m;
	}
	//estatico
	
}
