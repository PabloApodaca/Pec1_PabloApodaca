package edu.ucj.programacion.pec1.pablo_apodaca_alumno;

public class GestionColegios {
	  
	  public static void main(String[] args) {
	    
	   
	    String nombre = args[0];
	    String direccion = args[1];
	    int numAulas = Integer.parseInt(args[2]);
	    int numAlumnos = Integer.parseInt(args[3]);
	    
	    
	    Colegio miColegio = new Colegio(direccion, direccion, numAlumnos);
	    
	   
	    System.out.println("El colegio " + miColegio.getNombre() + " tiene " + miColegio.getNumAulas() + " aulas y " + miColegio.getNumAulas() + " alumnos.");
	   	  
	 
	}
}