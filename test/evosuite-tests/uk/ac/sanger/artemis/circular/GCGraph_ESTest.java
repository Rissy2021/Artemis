/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:51:02 GMT 2017
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import org.emboss.jemboss.JembossParams;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.GCGraph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GCGraph_ESTest extends GCGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JembossParams jembossParams0 = new JembossParams();
      Vector vector0 = jembossParams0.getPrivateServers();
      DNADraw dNADraw0 = new DNADraw(vector0, vector0, vector0, vector0);
      GCGraph gCGraph0 = new GCGraph(dNADraw0);
      // Undeclared exception!
      try { 
        gCGraph0.calculateValue(99, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.GCGraph", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GCGraph gCGraph0 = null;
      try {
        gCGraph0 = new GCGraph((DNADraw) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DNADraw dNADraw0 = new DNADraw();
      GCGraph gCGraph0 = new GCGraph(dNADraw0);
      // Undeclared exception!
      try { 
        gCGraph0.calculateValue(2247, 2247);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.GCGraph", e);
      }
  }
}
