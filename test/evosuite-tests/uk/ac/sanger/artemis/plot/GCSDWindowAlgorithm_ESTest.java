/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 05:26:41 GMT 2017
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.PartialSequence;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GCSDWindowAlgorithm_ESTest extends GCSDWindowAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = null;
      try {
        gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm((Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getForwardStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      Integer integer0 = gCSDWindowAlgorithm0.getDefaultMaxWindowSize();
      assertEquals(5000, (int)integer0);
      assertFalse(gCSDWindowAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getForwardStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      Integer integer0 = gCSDWindowAlgorithm0.getDefaultMinWindowSize();
      assertEquals(100, (int)integer0);
      assertNotNull(integer0);
      assertFalse(gCSDWindowAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(",S\"nQia");
      Bases bases0 = new Bases(rawStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      Integer integer0 = gCSDWindowAlgorithm0.getDefaultWindowSize();
      assertEquals(1000, (int)integer0);
      assertNotNull(integer0);
      assertFalse(gCSDWindowAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[0];
      Short short0 = new Short((short)239);
      PartialSequence partialSequence0 = new PartialSequence(charArray0, (-1), (-1), short0, (Integer) null);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = bases0.getForwardStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      // Undeclared exception!
      try { 
        gCSDWindowAlgorithm0.getValues((-4245), 0, (float[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.PartialSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getForwardStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      // Undeclared exception!
      try { 
        gCSDWindowAlgorithm0.getAverage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.Bases", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("gfe");
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(emblStreamSequence0);
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      Float float0 = gCSDWindowAlgorithm0.getMinimumInternal();
      assertEquals(0.0F, (float)float0, 0.01F);
      assertFalse(gCSDWindowAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getForwardStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      Float float0 = gCSDWindowAlgorithm0.getMaximumInternal();
      assertEquals(100.0F, (float)float0, 0.01F);
      assertFalse(gCSDWindowAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("", "_");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      GCSDWindowAlgorithm gCSDWindowAlgorithm0 = new GCSDWindowAlgorithm(strand0);
      gCSDWindowAlgorithm0.getDefaultStepSize(1007);
  }
}
