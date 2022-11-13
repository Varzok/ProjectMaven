package com.nttdata.mvn;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Formación - Bootcamp - NTTData
 * 
 * Clase principal
 * 
 * @author Salva Castillo
 *
 */
public class App {

	/**
	 * Método main
	 * @param args String[]
	 */
	public static void main(String[] args) {
		/**
		 * Metodos para pruebas Commons Lang
		 */
		String[] user = new String[0];
		/**
		 * Método que detecta si el array está vacío
		 */
		if (ArrayUtils.isEmpty(user)) {
			System.out.println("No hay componentes en el array");
		}
		/**
		 * Método para añadir elementos a un array
		 */
		user = (String[]) ArrayUtils.add(user, "Salva");
		user = (String[]) ArrayUtils.add(user, "Leo");
		
		System.out.println(user[0] + "\n" + user[1]);
		/**
		 * Método para ver si un array contiene un elemento
		 */
		if (ArrayUtils.contains(user,"Jaime")) {
			System.out.println("Jaime está en el equipo.");
		}else {
			System.out.println("Jaime no está en el equipo.");
		}
		
		
		

	}

}
