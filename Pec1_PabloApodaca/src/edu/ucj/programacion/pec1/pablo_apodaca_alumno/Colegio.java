package edu.ucj.programacion.pec1.pablo_apodaca_alumno;

public class Colegio {
	  
	  private String nombre;
	  private String direccion;
	  private Aula[] aulas;
	  
	  public Colegio(String nombre, String direccion, int numAulas) {
	    this.nombre = nombre;
	    this.direccion = direccion;
	    this.aulas = new Aula[numAulas];
	    for (int i = 0; i < numAulas; i++) {
	      this.aulas[i] = new Aula(i+1, 0, direccion);
	    }
	  }
	  
	  public void asignarAsiento(Alumno alumno) {
	    boolean asientoAsignado = false;
	    for (Aula aula : aulas) {
	      if (aula.hayAsientosLibres()) {
	        int numAsiento = aula.asignarAsiento(alumno);
	        System.out.println("El alumno " + alumno.getNombre() + " con DNI " + alumno.getDni() + " se ha asignado al asiento " + numAsiento + " del aula " + aula.getNumero());
	        asientoAsignado = true;
	        break;
	      }
	    }
	    if (!asientoAsignado) {
	      System.out.println("No hay asientos libres en ninguna aula.");
	    }
	  }

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumAulas() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	}

	