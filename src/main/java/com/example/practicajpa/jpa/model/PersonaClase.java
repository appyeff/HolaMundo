package com.example.practicajpa.jpa.model;

public class PersonaClase {

  private String nombre, apellidos;

  public PersonaClase(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public PersonaClase() {
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  @Override
  public String toString() {
    return nombre + " " + apellidos;
  }
}
