package com.udemy.Combinatoria;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PermutacionTest {

  private CombinatoriaCalc cCalc;

  @Before
  public void setUp() throws Exception {
    cCalc = new CombinatoriaCalc();
  }

  // Permutaciones sin repetición

  @Test
  public void returns6_IfNIs3() {
    Assert.assertEquals(6, cCalc.permutacionSinRepeticion(3));
  }
  
  @Test
  public void returns3628800_IfNIs10() {
    Assert.assertEquals(3628800, cCalc.permutacionSinRepeticion(10));
  }
  
  // Permutaciones con repetición
  
  @Test
  public void returns453600_IfNIs10AndVecIs2_2_2() {
    Assert.assertEquals(453600, cCalc.permutacionConRepetición(10, new int[] {2, 2, 2}));
  }
  
  @Test
  public void returns2162160_IfNIs13AndVecIs5_2_3_2() {
    Assert.assertEquals(2162160, cCalc.permutacionConRepetición(13, new int[] {5, 2, 3, 2}));
  }

}
