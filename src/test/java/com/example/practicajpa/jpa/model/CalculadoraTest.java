package com.example.practicajpa.jpa.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

  @Test
  void sumar() {
    Calculadora cal = new Calculadora();

    int a = 10;
    int b = 20;

    int resultadoEsperado = 30;

    assertEquals(resultadoEsperado, cal.sumar(a, b));
  }
}