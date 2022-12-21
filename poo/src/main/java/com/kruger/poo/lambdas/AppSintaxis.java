package com.kruger.poo.lambdas;

public class AppSintaxis {

	public static void main(String[] args) {
		// implementacion normal
		
		//crear un nuevo objeto 
		//ClassSintaxis interfaceNormal = new ClassSintaxis();
		//interfaceNormal.aceptar();
		
		Sintaxis f=(valor, valor1) -> {
			System.out.println("hola mundo f lambda " + valor1+valor);
		};
		
		//utilizacion de la expresion lambda
		f.aceptar(12,3);
		
		//clase anonima
		StringProcessor nSP = new StringProcessor() {
			
			@Override
			public String process(String x) {
					return x.toUpperCase();
			}
		};
		//imprimir
		System.out.println(nSP.process("hola"));
		
		//inferencia de tipo de expresion
		InferenciaTipo f1 = ()->{
			System.out.println("hola mundo");
		};
		
		//creando un objeto del misto de la clase
		AppSintaxis test = new AppSintaxis();
		test.metodo(f1);
		

	}
	
	public void metodo(InferenciaTipo parametro ) {
		parametro.accept();
	}

}
