/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 02:54:30 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SequenceViewer_ESTest extends SequenceViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "uk.ac.sanger.artemis.components.SequenceViewer";
      Thread thread0 = Thread.currentThread();
      ClassLoader classLoader0 = thread0.getContextClassLoader();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        Class.forName(string0, boolean0, classLoader0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.SequenceViewer
         //
         verifyException("java.lang.Class", e);
      }
  }
}
