package com.kruger.poo.collections;

public class AppCajaGenerica {

	public static void main(String[] args) {
	Caja c = new Caja();
	c.poner(46);
	
	//genericos
	//creasr metodos parametrizados 
	CajaGenerica<String> cagaG = new CajaGenerica<String>();
			cagaG.setDato("hola");

			ClaseGenericaParametros<Integer, String> claseGenericaP =
					new ClaseGenericaParametros<Integer, String>(28,"generico");
			
			System.out.println(claseGenericaP.toString());
			
			int t = claseGenericaP.getObj1();
			
			System.out.println("valor obj1 " + t);
			
	}
	
	

}
