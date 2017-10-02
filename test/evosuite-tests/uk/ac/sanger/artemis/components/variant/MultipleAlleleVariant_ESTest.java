/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 03:10:45 GMT 2017
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.variant.MultipleAlleleVariant;
import uk.ac.sanger.artemis.components.variant.VCFRecord;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultipleAlleleVariant_ESTest extends MultipleAlleleVariant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        MultipleAlleleVariant.getIUBCode((VCFRecord) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.MultipleAlleleVariant", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setAlt("c");
      String string0 = MultipleAlleleVariant.getIUBCode(vCFRecord0);
      assertEquals("n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setAlt("|CY,mTL#z_O[xz928Vp");
      String string0 = MultipleAlleleVariant.getIUBCode(vCFRecord0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultipleAlleleVariant multipleAlleleVariant0 = new MultipleAlleleVariant();
  }
}
