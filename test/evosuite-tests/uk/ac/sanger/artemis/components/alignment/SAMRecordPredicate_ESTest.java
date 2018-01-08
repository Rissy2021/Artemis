/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:23:29 GMT 2017
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import htsjdk.samtools.SAMFileHeader;
import htsjdk.samtools.SAMRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.SAMRecordFlagConjunctionPredicate;
import uk.ac.sanger.artemis.components.alignment.SAMRecordFlagPredicate;
import uk.ac.sanger.artemis.components.alignment.SAMRecordPredicate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SAMRecordPredicate_ESTest extends SAMRecordPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector<SAMRecordPredicate> vector0 = new Vector<SAMRecordPredicate>();
      SAMRecordFlagConjunctionPredicate sAMRecordFlagConjunctionPredicate0 = new SAMRecordFlagConjunctionPredicate(vector0, 2254);
      SAMFileHeader sAMFileHeader0 = new SAMFileHeader();
      SAMRecord sAMRecord0 = new SAMRecord(sAMFileHeader0);
      boolean boolean0 = sAMRecordFlagConjunctionPredicate0.testPredicate(sAMRecord0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<SAMRecordPredicate> vector0 = new Vector<SAMRecordPredicate>();
      SAMRecordFlagConjunctionPredicate sAMRecordFlagConjunctionPredicate0 = new SAMRecordFlagConjunctionPredicate(vector0, 1);
      SAMFileHeader sAMFileHeader0 = new SAMFileHeader();
      vector0.add((SAMRecordPredicate) sAMRecordFlagConjunctionPredicate0);
      SAMRecord sAMRecord0 = new SAMRecord(sAMFileHeader0);
      // Undeclared exception!
      try { 
        sAMRecordFlagConjunctionPredicate0.testPredicate(sAMRecord0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate(0);
      SAMRecordFlagPredicate.FLAGS = null;
      SAMFileHeader sAMFileHeader0 = new SAMFileHeader();
      SAMRecord sAMRecord0 = new SAMRecord(sAMFileHeader0);
      // Undeclared exception!
      try { 
        sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.SAMRecordFlagPredicate", e);
      }
  }
}
