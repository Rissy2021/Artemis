/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 03:36:39 GMT 2017
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryVector;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.PublicDBDocumentEntry;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntryVector_ESTest extends EntryVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EntryVector entryVector0 = new EntryVector();
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Entry entry0 = simpleEntryGroup0.createEntry("");
      entryVector0.add(entry0);
      int int0 = entryVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EntryVector entryVector0 = new EntryVector();
      entryVector0.addElement((Entry) null);
      boolean boolean0 = entryVector0.removeElement((Entry) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      PublicDBDocumentEntry publicDBDocumentEntry0 = new PublicDBDocumentEntry(entryInformation0);
      Entry entry0 = new Entry((Bases) null, publicDBDocumentEntry0);
      simpleEntryGroup0.addElement(entry0);
      int int0 = simpleEntryGroup0.indexOf(entry0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      PublicDBDocumentEntry publicDBDocumentEntry0 = new PublicDBDocumentEntry(entryInformation0);
      Entry entry0 = new Entry((Bases) null, publicDBDocumentEntry0);
      simpleEntryGroup0.addElement(entry0);
      Entry entry1 = simpleEntryGroup0.elementAt(0);
      assertFalse(entry1.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        simpleEntryGroup0.removeElement((Entry) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        simpleEntryGroup0.addElement((Entry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleEntryGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        simpleEntryGroup0.add((Entry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleEntryGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      int int0 = simpleEntryGroup0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      int int0 = simpleEntryGroup0.indexOf((Entry) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryVector entryVector0 = (EntryVector)simpleEntryGroup0.clone();
      assertEquals(0, entryVector0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EntryVector entryVector0 = new EntryVector();
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("", "");
      Bases bases0 = new Bases(fastaStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("");
      entryVector0.contains(entry0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EntryVector entryVector0 = new EntryVector();
      entryVector0.addElement((Entry) null);
      boolean boolean0 = entryVector0.contains((Entry) null);
      assertEquals(1, entryVector0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EntryVector entryVector0 = new EntryVector();
      entryVector0.addElement((Entry) null);
      entryVector0.addElement((Entry) null);
      assertEquals(1, entryVector0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      simpleEntryGroup0.removeAllElements();
      assertEquals(0, simpleEntryGroup0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        simpleEntryGroup0.elementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EntryVector entryVector0 = new EntryVector();
      boolean boolean0 = entryVector0.removeElement((Entry) null);
      assertFalse(boolean0);
  }
}
