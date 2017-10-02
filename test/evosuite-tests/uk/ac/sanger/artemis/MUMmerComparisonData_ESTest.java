/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 05:04:20 GMT 2017
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatch;
import uk.ac.sanger.artemis.MUMmerComparisonData;
import uk.ac.sanger.artemis.SimpleComparisonData;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MUMmerComparisonData_ESTest extends MUMmerComparisonData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      try { 
        mUMmerComparisonData0.makeMatchFromString("=Hf)iqDO");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // unable to understand this line: =Hf)iqDO
         //
         verifyException("uk.ac.sanger.artemis.MUMmerComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pipedReader0);
      MUMmerComparisonData mUMmerComparisonData0 = null;
      try {
        mUMmerComparisonData0 = new MUMmerComparisonData(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(charArrayReader0);
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData(linePushBackReader0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      AlignMatch alignMatch0 = mUMmerComparisonData0.makeMatchFromString("unableto understandZM1is line: ");
      assertNull(alignMatch0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      AlignMatch alignMatch0 = mUMmerComparisonData0.makeMatchFromString("match goes off end of query sequence: ");
      assertNull(alignMatch0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      AlignMatch alignMatch0 = mUMmerComparisonData0.makeMatchFromString(">tt^Q*2N<sM0d.B");
      assertNull(alignMatch0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_\";j+]kDg>AeU{+ ");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      MUMmerComparisonData mUMmerComparisonData0 = null;
      try {
        mUMmerComparisonData0 = new MUMmerComparisonData(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // unable to understand this line: _\";j+]kDg>AeU{+ 
         //
         verifyException("uk.ac.sanger.artemis.MUMmerComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      AlignMatch alignMatch0 = mUMmerComparisonData0.makeMatchFromString((String) null);
      assertNull(alignMatch0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = null;
      try {
        mUMmerComparisonData0 = new MUMmerComparisonData((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleComparisonData", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MUMmerComparisonData mUMmerComparisonData0 = new MUMmerComparisonData();
      SimpleComparisonData simpleComparisonData0 = mUMmerComparisonData0.getNewSimpleComparisonData();
      assertNotSame(mUMmerComparisonData0, simpleComparisonData0);
  }
}
