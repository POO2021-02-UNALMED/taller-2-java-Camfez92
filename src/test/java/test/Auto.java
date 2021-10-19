//package Ejercicio2;
package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	 
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		int cantidad;
		for (int i=0;i<asientos.length;i++) {
			if(asientos[i] instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}
	String verificarIntegridad() {
		
		if (motor.registro==registro){
			for (Asiento a:asientos) {
				if (a.registro!=registro){
					return "Las piezas no son originales";
					
				}
			}
			
		}
		else {
			return "Las piezas no son originales";
		}
		return "Auto original";
		
	}
}
