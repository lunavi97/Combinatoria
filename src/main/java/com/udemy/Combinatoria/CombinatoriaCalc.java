package com.udemy.Combinatoria;

public class CombinatoriaCalc {

  /**
   * Número de variaciones de un conjunto de m elementos tomados
   * en tuplas de n elementos, sin elementos repetidos.
   * @param m - cantidad de elementos del universo
   * @param n - cantidad de elementos de las tuplas
   * @return cantidad de tuplas
   */
  public int variacionSinRepeticion(int m, int n) {
    if (n > m) {
      throw new RuntimeException("Cantidad de elementos de tuplas mayor que las del universo");
    }

    int res = m;
    for (int i = 1; i < n; i++) {
      res *= --m;
    }
    return res;
  }
  
  public int variacionConRepeticion(int m, int n) {
    throw new RuntimeException("Método no implementado");
  }
}
