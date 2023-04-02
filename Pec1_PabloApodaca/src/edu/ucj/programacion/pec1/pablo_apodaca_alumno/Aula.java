package edu.ucj.programacion.pec1.pablo_apodaca_alumno;

public class Aula {
	  
	  private int numero;
	  private int planta;
	  private String profesor;
	  private Alumno[] asientos;
	  
	  public Aula(int numero, int planta, String profesor) {
	    this.numero = numero;
	    this.planta = planta;
	    this.profesor = profesor;
	    this.asientos = new Alumno[3];
	  }
	  
	  public int getNumero() {
	    return numero;
	  }
	  
	  public int getPlanta() {
	    return planta;
	  }
	  
	  public String getProfesor() {
	    return profesor;
	  }
	  
	  public Alumno[] getAsientos() {
	    return asientos;
	  }

	public boolean hayAsientosLibres() {
		// TODO Auto-generated method stub
		return false;
	}

	public int asignarAsiento(Alumno alumno) {
		// TODO Auto-generated method stub
		return 0;
	}

	  
	}