/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:25:46 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.InvalidQualifierException;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidQualifierException_ESTest extends InvalidQualifierException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("M)T;&$,jY24");
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException("_xU(MS+.`4fuG", qualifier0);
      Qualifier qualifier1 = invalidQualifierException0.getQualifier();
      assertSame(qualifier1, qualifier0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException("H\"i::1ykO", (Qualifier) null);
      Qualifier qualifier0 = invalidQualifierException0.getQualifier();
      assertNull(qualifier0);
  }
}
