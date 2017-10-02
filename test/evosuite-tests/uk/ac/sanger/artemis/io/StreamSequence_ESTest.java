/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:57:49 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.RawStreamSequence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StreamSequence_ESTest extends StreamSequence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("40vOa:\u0002q`@>0HZv");
      // Undeclared exception!
      try { 
        rawStreamSequence0.getSubSequence(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("kou?Z:8t|$HdKA", "k#WBr&");
      fastaStreamSequence0.length();
      assertEquals(1, fastaStreamSequence0.getTCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      emblStreamSequence0.getFormatType();
      assertEquals(0, emblStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("fBo");
      // Undeclared exception!
      try { 
        genbankStreamSequence0.setSequencePackingCapacity((-1996));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("");
      // Undeclared exception!
      try { 
        fastaStreamSequence0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      // Undeclared exception!
      try { 
        genbankStreamSequence0.charAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("~[tUW:oLo2%676(");
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(genbankStreamSequence0);
      // Undeclared exception!
      try { 
        emblStreamSequence0.appendChar((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      // Undeclared exception!
      try { 
        emblStreamSequence0.getCharSubSequence(1000, 1000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 499
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      char[] charArray0 = new char[3];
      emblStreamSequence0.setFromChar(charArray0);
      assertEquals(3, emblStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("{@PG2^ ");
      int int0 = genbankStreamSequence0.getTCount();
      assertEquals(7, genbankStreamSequence0.getOtherCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("", "");
      int int0 = fastaStreamSequence0.getCCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(")uqZZ~r\"o");
      int int0 = genbankStreamSequence0.getOtherCount();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      int int0 = genbankStreamSequence0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("kou?Z:8t|$HdKA", "k#WBr&");
      fastaStreamSequence0.setCounts();
      assertEquals(12, fastaStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      char[] charArray0 = new char[0];
      genbankStreamSequence0.appendChar(charArray0);
      assertEquals(0, genbankStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("{@PG2^ ");
      char[] charArray0 = new char[7];
      genbankStreamSequence0.appendChar(charArray0);
      assertEquals(14, genbankStreamSequence0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("distribution null model changed");
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(emblStreamSequence0);
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(genbankStreamSequence0);
      assertEquals(26, fastaStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      // Undeclared exception!
      try { 
        emblStreamSequence0.writeToStream((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.EmblStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      char[] charArray0 = new char[4];
      genbankStreamSequence0.appendChar(charArray0);
      assertEquals(4, genbankStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("hPmV>KouvGiuK");
      fastaStreamSequence0.forceReset();
      assertEquals(13, fastaStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      emblStreamSequence0.setSequencePackingCapacity(1057);
      assertEquals(0, emblStreamSequence0.getOtherCount());
  }
}
