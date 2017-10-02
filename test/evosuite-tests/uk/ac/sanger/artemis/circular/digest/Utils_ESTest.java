/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:46:33 GMT 2017
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.circular.digest.FragmentBand;
import uk.ac.sanger.artemis.circular.digest.ReportDetails;
import uk.ac.sanger.artemis.circular.digest.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      ReportDetails reportDetails0 = Utils.findCutSitesFromEmbossReport(bufferedReader0);
      assertNotNull(reportDetails0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromExperiment((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromEmbossReport((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReportDetails reportDetails0 = new ReportDetails();
      // Undeclared exception!
      Utils.createDNADrawFromReportDetails(reportDetails0, (EntryGroup) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromExperiment(charArrayReader0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      List<FragmentBand> list0 = Utils.findCutSitesFromExperiment(stringReader0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      BufferedReader bufferedReader0 = new BufferedReader(pipedReader0, 9999);
      // Undeclared exception!
      try { 
        Utils.findCutSitesFromEmbossReport(bufferedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't read, or parse results
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Utils utils0 = new Utils();
  }
}
