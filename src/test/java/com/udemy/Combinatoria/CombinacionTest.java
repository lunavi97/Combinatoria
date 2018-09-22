package com.udemy.Combinatoria;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CombinacionTest {

  private CombinatoriaCalc cCalc;

  @Before
  public void setUp() throws Exception {
    cCalc = new CombinatoriaCalc();
  }

  // Combinación sin repetición

  @Test
  public void returns252_IfMIs10AndNIs5() {
    Assert.assertEquals(252, cCalc.combinacionSinRepeticion(10, 5));
  }

  @Test
  public void returns6435_IfMIs15AndNIs7() {
    Assert.assertEquals(6435, cCalc.combinacionSinRepeticion(15, 7));
  }

  @Test
  public void returns12650_IfMIs25AndNIs4() {
    Assert.assertEquals(12650, cCalc.combinacionSinRepeticion(25, 4));
  }

  // Combinación con repetición

  @Test
  public void returns84_IfMIs7AndNIs3() {
    Assert.assertEquals(84, cCalc.combinacionConRepeticion(7, 3));
  }

  @Test
  public void returns20475_IfMIs25AndNIs4() {
    Assert.assertEquals(20475, cCalc.combinacionConRepeticion(25, 4));
  }

}
