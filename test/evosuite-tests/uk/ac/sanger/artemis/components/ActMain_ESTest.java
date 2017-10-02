/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:05:03 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ActMain;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActMain_ESTest extends ActMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActMain actMain0 = null;
      try {
        actMain0 = new ActMain();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = ActMain.makeMultiComparator((JFrame) null, (InputStreamProgressListener) null, (Object[]) null);
      assertTrue(boolean0);
  }
}
