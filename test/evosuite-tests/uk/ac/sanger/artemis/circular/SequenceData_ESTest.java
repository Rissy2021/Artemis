/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:56:27 GMT 2017
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.SequenceData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SequenceData_ESTest extends SequenceData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      SequenceData.flavors = null;
      DataFlavor[] dataFlavorArray0 = sequenceData0.getTransferDataFlavors();
      assertNull(dataFlavorArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      DataFlavor[] dataFlavorArray0 = new DataFlavor[0];
      SequenceData.flavors = dataFlavorArray0;
      DataFlavor[] dataFlavorArray1 = sequenceData0.getTransferDataFlavors();
      assertSame(dataFlavorArray1, dataFlavorArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      SequenceData sequenceData0 = new SequenceData((String) null, "", "", boolean0, boolean0, (Boolean) null);
      String string0 = sequenceData0.getSequenceName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SequenceData sequenceData0 = new SequenceData("PD&u|?L4;be$J0-", "PD&u|?L4;be$J0-", "PD&u|?L4;be$J0-", boolean0, boolean0, boolean0);
      String string0 = sequenceData0.getSequenceName();
      assertEquals("PD&u|?L4;be$J0-", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      SequenceData sequenceData0 = new SequenceData("", "", "", boolean0, boolean0, boolean0);
      // Undeclared exception!
      try { 
        sequenceData0.isDataFlavorSupported((DataFlavor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.SequenceData", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      Object object0 = sequenceData0.getTransferData(sequenceData0.SEQUENCEDATA);
      assertSame(sequenceData0, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      DataFlavor dataFlavor0 = DataFlavor.getTextPlainUnicodeFlavor();
      try { 
        sequenceData0.getTransferData(dataFlavor0);
        fail("Expecting exception: UnsupportedFlavorException");
      
      } catch(UnsupportedFlavorException e) {
         //
         // Plain Text
         //
         verifyException("uk.ac.sanger.artemis.circular.SequenceData", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      boolean boolean0 = sequenceData0.isDataFlavorSupported(sequenceData0.SEQUENCEDATA);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Boolean boolean0 = new Boolean("Seuencedaa");
      SequenceData sequenceData0 = new SequenceData("Seuencedaa", "Seuencedaa", "Seuencedaa", boolean0, boolean0, boolean0);
      DataFlavor dataFlavor0 = DataFlavor.stringFlavor;
      boolean boolean1 = sequenceData0.isDataFlavorSupported(dataFlavor0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      DataFlavor[] dataFlavorArray0 = sequenceData0.getTransferDataFlavors();
      assertNotNull(dataFlavorArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SequenceData sequenceData0 = new SequenceData();
      String string0 = sequenceData0.getSequenceName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      SequenceData sequenceData0 = new SequenceData("PD&u|?L4;be$J0-", "PD&u|?L4;be$J0-", "PD&u|?L4;be$J0-", boolean0, boolean0, boolean0);
      // Undeclared exception!
      try { 
        sequenceData0.getTransferData((DataFlavor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.SequenceData", e);
      }
  }
}
