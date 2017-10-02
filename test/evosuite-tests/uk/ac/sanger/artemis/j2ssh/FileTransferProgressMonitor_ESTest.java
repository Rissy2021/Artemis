/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:59:30 GMT 2017
 */

package uk.ac.sanger.artemis.j2ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JSlider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.j2ssh.FileTransferProgressMonitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileTransferProgressMonitor_ESTest extends FileTransferProgressMonitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSlider jSlider0 = new JSlider();
      FileTransferProgressMonitor fileTransferProgressMonitor0 = null;
      try {
        fileTransferProgressMonitor0 = new FileTransferProgressMonitor(jSlider0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
