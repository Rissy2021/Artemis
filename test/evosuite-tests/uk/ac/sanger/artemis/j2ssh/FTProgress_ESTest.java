/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:59:36 GMT 2017
 */

package uk.ac.sanger.artemis.j2ssh;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JProgressBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.j2ssh.FTProgress;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FTProgress_ESTest extends FTProgress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JProgressBar jProgressBar0 = new JProgressBar(3, 3);
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "");
      long long0 = fTProgress0.getProgress();
      assertEquals(3L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JProgressBar jProgressBar0 = new JProgressBar((-3), (-3));
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "]mg/ne]$[h-B\rWDTlN");
      long long0 = fTProgress0.getProgress();
      assertEquals((-3L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FTProgress fTProgress0 = new FTProgress((JProgressBar) null, "Ig&,^h/x6{<d!");
      // Undeclared exception!
      try { 
        fTProgress0.started(591L, "Ig&,^h/x6{<d!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.j2ssh.FTProgress", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FTProgress fTProgress0 = new FTProgress((JProgressBar) null, "");
      // Undeclared exception!
      try { 
        fTProgress0.progressed(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.j2ssh.FTProgress", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FTProgress fTProgress0 = new FTProgress((JProgressBar) null, "tfm.use");
      // Undeclared exception!
      try { 
        fTProgress0.getProgress();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.j2ssh.FTProgress", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JProgressBar jProgressBar0 = new JProgressBar((-3), (-3));
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "]mg/ne]$[h-B\rWDTlN");
      // Undeclared exception!
      try { 
        fTProgress0.progressed((-3));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("uk.ac.sanger.artemis.j2ssh.FTProgress", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JProgressBar jProgressBar0 = new JProgressBar((-3), (-3));
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "]mg/ne]$[h-B\rWDTlN");
      fTProgress0.completed();
      assertFalse(fTProgress0.isCancelled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JProgressBar jProgressBar0 = new JProgressBar((-3), (-3));
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "]mg/ne]$[h-B\rWDTlN");
      fTProgress0.started((-3), "]mg/ne]$[h-B\rWDTlN");
      fTProgress0.progressed((-3));
      assertFalse(fTProgress0.isCancelled());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultBoundedRangeModel defaultBoundedRangeModel0 = new DefaultBoundedRangeModel();
      JProgressBar jProgressBar0 = new JProgressBar(defaultBoundedRangeModel0);
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "");
      long long0 = fTProgress0.getProgress();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JProgressBar jProgressBar0 = new JProgressBar(3, 3);
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "");
      boolean boolean0 = fTProgress0.isCancelled();
      assertFalse(boolean0);
  }
}
