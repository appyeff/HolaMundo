package com.example.practicajpa.jpa.model;

public class Ejemplos {
  
  public static void main(String[] args) {
    Mensaje msg = new Mensaje();
    String nombre = msg.solicitarDatos("Escriba tu nombre: ");
    String apellidos = msg.solicitarDatos("Escriba tu apellido: ");
    PersonaClase p1 = new PersonaClase(nombre, apellidos);
    msg.saludar(p1);
  }
}
