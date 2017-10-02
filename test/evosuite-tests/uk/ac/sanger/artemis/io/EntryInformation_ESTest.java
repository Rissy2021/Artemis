/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:07:29 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.EntryInformationException;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.QualifierInfo;
import uk.ac.sanger.artemis.io.QualifierInfoHash;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntryInformation_ESTest extends EntryInformation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("^@3Z-Tt#", 0, (KeyVector) null, (KeyVector) null, true);
      simpleEntryInformation0.addQualifierInfo(qualifierInfo0);
      assertEquals(5, QualifierInfo.ANY);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      Key key0 = Key.CDS;
      entryInformation0.addKey(key0);
      assertEquals("CDS", key0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      boolean boolean0 = entryInformation0.useEMBLFormat();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      blastEntryInformation0.setEMBLFormat(false);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("");
      boolean boolean0 = blastEntryInformation0.isValidQualifier(key0, "4`d&w@pdW1iEOs`'iw");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      boolean boolean0 = mSPcrunchEntryInformation0.isValidQualifier("+@]6b$M");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      Key key0 = Key.CDS;
      boolean boolean0 = entryInformation0.isValidKey(key0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      Key key0 = Key.CDS;
      boolean boolean0 = entryInformation0.isRequiredQualifier(key0, ">rl5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      Key key0 = Key.CDS;
      StringVector stringVector0 = simpleEntryInformation0.getValidQualifierNames(key0);
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      KeyVector keyVector0 = simpleEntryInformation0.getValidKeys();
      assertNull(keyVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      KeyVector keyVector0 = entryInformation0.getUserKeys();
      assertNull(keyVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      KeyVector keyVector0 = blastEntryInformation0.getSortedValidKeys();
      assertNull(keyVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      Key key0 = new Key("JEzN}$],ERiMWP/");
      StringVector stringVector0 = entryInformation0.getRequiredQualifiers(key0);
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfo qualifierInfo0 = blastEntryInformation0.getQualifierInfo("");
      assertNull(qualifierInfo0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      assertEquals("misc_feature", key0.getKeyString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfoHash qualifierInfoHash0 = blastEntryInformation0.getAllQualifierInfo();
      assertNull(qualifierInfoHash0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      EntryInformationException entryInformationException0 = new EntryInformationException("PRSWfg");
      blastEntryInformation0.fixException(entryInformationException0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      // Undeclared exception!
      try { 
        blastEntryInformation0.addQualifierInfo((QualifierInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleEntryInformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      simpleEntryInformation0.addKey(key0);
      Key key1 = new Key((String) null, false);
      // Undeclared exception!
      try { 
        simpleEntryInformation0.addKey(key1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      // Undeclared exception!
      try { 
        entryInformation0.addKey((Key) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - adding a null object
         //
         verifyException("uk.ac.sanger.artemis.util.FastVector", e);
      }
  }
}
