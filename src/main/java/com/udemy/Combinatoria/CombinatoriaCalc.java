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

  /**
   * Número de variaciones de un conjunto de m elementos tomados
   * en tuplas de n elementos, con elementos repetidos.
   * @param m - cantidad de elementos del universo.
   * @param n - cantidad de elementos de las tuplas
   * @return cantidad de tuplas
   */
  public int variacionConRepeticion(int m, int n) {
    return (int) Math.pow(m, n);
  }

  /**
   * Número de n-tuplas ordenadas posibles.
   * @param n - cantidad de elementos
   * @return cantidad de tuplas
   */
  public int permutacionSinRepeticion(int n) {
    int res = n;
    while (n > 1) res *= --n;
    return res;
  }

  /**
   * Permutaciones con repetición.
   * @param n - cantidad de elementos
   * @param vec - vector con las repeticiones de los elementos
   * @return cantidad de tuplas
   */
  public int permutacionConRepetición(int n, int[] vec) {
    if (vec == null || vec.length == 0) {
      return permutacionSinRepeticion(n);
    }

    int finIteracion = n - vec[0];
    int res = n;
    for (int i = 1; i < finIteracion; i++) {
      res *= --n;
    }
    for (int i = 1; i < vec.length; i++) {
      res /= permutacionSinRepeticion(vec[i]);
    }
    return res;
  }

  /**
   * Número de agrupaciones de elementos de una colección
   * sin importar el orden de selección.
   * @param m - cantidad de elementos
   * @param n - cantidad en la que están tomados
   * @return cantidad de tuplas
   */
  public int combinacionSinRepeticion(int m, int n) {
    return variacionSinRepeticion(m, n) / permutacionSinRepeticion(n);
  }

  /**
   * Combinaciones con repetición.
   * @param m - cantidad de elementos
   * @param n - cantidad en la que están tomados
   * @return cantidad de tuplas
   */
  public int combinacionConRepeticion(int m, int n) {
    throw new RuntimeException("Método no implementado");
  }
}
