package edu.ucj.programacion.pec1.pablo_apodaca_alumno;

import java.util.Scanner;

public class UtilsColegio {
  
  public static Alumno[] crearAlumnos(int numAlumnos) {
    Scanner scanner = new Scanner(System.in);
    Alumno[] alumnos = new Alumno[numAlumnos];
    for (int i = 0; i < numAlumnos; i++) {
      System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
      String nombre = scanner.nextLine();
      System.out.print("Ingrese el DNI del alumno " + (i + 1) + ": ");
      String dni = scanner.nextLine();
      alumnos[i] = new Alumno(nombre, dni, dni, i);
    }
    return alumnos;
  }
  
  public static Profesor[] crearProfesores(int numAulas) {
    Scanner scanner = new Scanner(System.in);
    Profesor[] profesores = new Profesor[numAulas];
    for (int i = 0; i < numAulas; i++) {
      System.out.print("Ingrese el nombre del profesor del aula " + (i + 1) + ": ");
      String nombre = scanner.nextLine();
      System.out.print("Ingrese la materia que imparte el profesor del aula " + (i + 1) + ": ");
      String materia = scanner.nextLine();
      profesores[i] = new Profesor(nombre, materia, materia, materia);
    }
    return profesores;
  }
  
}