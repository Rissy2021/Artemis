/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:19:59 GMT 2017
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.samtools.SAMFileHeader;
import net.sf.samtools.SAMRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.BamViewRecord;
import uk.ac.sanger.artemis.components.alignment.SAMRecordComparator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SAMRecordComparator_ESTest extends SAMRecordComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SAMRecordComparator sAMRecordComparator0 = new SAMRecordComparator();
      SAMFileHeader sAMFileHeader0 = new SAMFileHeader();
      SAMRecord sAMRecord0 = new SAMRecord(sAMFileHeader0);
      BamViewRecord bamViewRecord0 = new BamViewRecord(sAMRecord0, (short)116);
      BamViewRecord bamViewRecord1 = new BamViewRecord(sAMRecord0, (short) (-3609));
      // Undeclared exception!
      try { 
        sAMRecordComparator0.compare(bamViewRecord0, bamViewRecord1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.SAMRecordComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SAMRecordComparator sAMRecordComparator0 = new SAMRecordComparator();
      Object object0 = new Object();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        sAMRecordComparator0.compare(object0, mockMinguoDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to uk.ac.sanger.artemis.components.alignment.BamViewRecord
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.SAMRecordComparator", e);
      }
  }
}
