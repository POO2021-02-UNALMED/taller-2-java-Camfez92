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
		int cantidad=0;
		for (int i=0;i<asientos.length;i++) {
			if(asientos[i] instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}
	String verificarIntegridad() {
		boolean original=true;
		if(motor.registro!=registro) {
			original=false;
		}
		else {
			for(int i=0;i<asientos.length;i++) {
				if(asientos[i] instanceof Asiento) {
					if (asientos[i].registro!=registro) {
						original=false;
					}
				}
			}
		}
		
		if(original==true) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
