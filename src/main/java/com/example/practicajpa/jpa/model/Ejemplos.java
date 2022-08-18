package com.example.practicajpa.jpa.model;

public class Ejemplos {
  
  public static void main(String[] args) {
    Mensaje msg = new Mensaje();
    String nombre = msg.solicitarDatos("Escriba tu nombre: ");
    msg.saludar(nombre);
  }
}
