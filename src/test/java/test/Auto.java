//package Ejercicio2;
package test;
import java.util.ArrayList;
public class Auto {
	String modelo;
	int precio;
	//Asiento asientos[];
	ArrayList<Asiento> asientos = new ArrayList<Asiento>(); 
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		return asientos.size();
		
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
