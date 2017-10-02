/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:42:44 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryChangeEvent;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.EntryGroupChangeEvent;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.EntryGroupMenu;
import uk.ac.sanger.artemis.io.Key;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntryGroupMenu_ESTest extends EntryGroupMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Key key0 = new Key("rGOfQ't/]^hJGeZZ");
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "rGOfQ't/]^hJGeZZ", "", false, false);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, ")Y[QMXX?gSxE");
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, filteredEntryGroup0);
      Entry entry0 = simpleEntryGroup0.createEntry(")Y[QMXX?gSxE");
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(filteredEntryGroup0, entry0, (-407));
      entryGroupMenu0.entryChanged(entryChangeEvent0);
      assertFalse(entryGroupMenu0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, simpleEntryGroup0);
      // Undeclared exception!
      try { 
        entryGroupMenu0.entryGroupChanged((EntryGroupChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryGroupMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Key key0 = new Key("rGOfQ't/]^hJGeZZ");
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "rGOfQ't/]^hJGeZZ", "", false, false);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, ")Y[QMXX?gSxE");
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, filteredEntryGroup0);
      // Undeclared exception!
      try { 
        entryGroupMenu0.entryChanged((EntryChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryGroupMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EntryGroupMenu entryGroupMenu0 = null;
      try {
        entryGroupMenu0 = new EntryGroupMenu((JFrame) null, (EntryGroup) null, "grab failed - nothing is selected");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryGroupMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EntryGroupMenu entryGroupMenu0 = null;
      try {
        entryGroupMenu0 = new EntryGroupMenu((JFrame) null, (EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryGroupMenu", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, simpleEntryGroup0);
      FeatureVector featureVector0 = new FeatureVector();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, "");
      Entry entry0 = filteredEntryGroup0.createEntry("e@k2_");
      assertEquals(0, entry0.getFeatureCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, simpleEntryGroup0, "");
      Key key0 = Key.CDS;
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "", "", true, true, true);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, "%]");
      Entry entry0 = filteredEntryGroup0.createEntry((String) null);
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(entry0, (Feature) null, true, 3);
      entryGroupMenu0.entryChanged(entryChangeEvent0);
      assertEquals(3, entryChangeEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureVector featureVector0 = new FeatureVector();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, "kE94`T");
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, filteredEntryGroup0);
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(filteredEntryGroup0, (Entry) null, 3);
      entryGroupMenu0.entryGroupChanged(entryGroupChangeEvent0);
      assertEquals(2, EntryGroupChangeEvent.ENTRY_ADDED);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, simpleEntryGroup0);
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(simpleEntryGroup0, (Entry) null, 1);
      entryGroupMenu0.entryGroupChanged(entryGroupChangeEvent0);
      assertTrue(entryGroupMenu0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Key key0 = new Key("rGOfQ't/]^hJGeZZ");
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "rGOfQ't/]^hJGeZZ", "", false, false);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, ")Y[QMXX?gSxE");
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, filteredEntryGroup0);
      Entry entry0 = simpleEntryGroup0.createEntry(")Y[QMXX?gSxE");
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(entry0, (Feature) null, false, 44);
      entryGroupMenu0.entryChanged(entryChangeEvent0);
      assertEquals(4, EntryChangeEvent.HEADER_CHANGED);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryGroupMenu entryGroupMenu0 = new EntryGroupMenu((JFrame) null, simpleEntryGroup0, "");
      Key key0 = Key.CDS;
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "", "", true, true, true);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, "%]");
      Entry entry0 = filteredEntryGroup0.createEntry((String) null);
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(simpleEntryGroup0, entry0, 1816);
      entryGroupMenu0.entryGroupChanged(entryGroupChangeEvent0);
  }
}
