package com.udemy.Combinatoria;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VariacionTest {
  
  private CombinatoriaCalc cCalc;

  @Before
  public void setUp() throws Exception {
    cCalc = new CombinatoriaCalc();
  }

  // Variaciones sin repetición
  
  @Test(expected = RuntimeException.class)
  public void throwsRuntimeException_IfMIs9AndNIs11() {
    cCalc.variacionSinRepeticion(9, 11);
  }
  
  @Test
  public void returns336_IfMIs8AndNIs3() {
    Assert.assertEquals(336, cCalc.variacionSinRepeticion(8, 3));
  }
  
  @Test
  public void returns93024_IfMIs19AndNIs4() {
    Assert.assertEquals(93024, cCalc.variacionSinRepeticion(19, 4));
  }
  
  @Test
  public void returns12_IfMIs4AndNIs2() {
    Assert.assertEquals(12, cCalc.variacionSinRepeticion(4, 2));
  }
  
  @Test
  public void returns720_IfMAndNAre6() {
    Assert.assertEquals(720, cCalc.variacionSinRepeticion(6, 6));
  }

}
