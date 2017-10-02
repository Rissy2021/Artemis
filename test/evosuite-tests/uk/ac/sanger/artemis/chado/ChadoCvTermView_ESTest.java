/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:25:47 GMT 2017
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.ChadoCvTermView;
import uk.ac.sanger.artemis.chado.GmodDAO;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChadoCvTermView_ESTest extends ChadoCvTermView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChadoCvTermView chadoCvTermView0 = null;
      try {
        chadoCvTermView0 = new ChadoCvTermView((GmodDAO) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
