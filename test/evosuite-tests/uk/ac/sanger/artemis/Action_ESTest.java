/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:22:15 GMT 2017
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Action;
import uk.ac.sanger.artemis.ChangeEventVector;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryChangeEvent;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.DisplayAdjustmentEvent;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.SequenceChangeEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Action_ESTest extends Action_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Action action0 = new Action();
      action0.addEntryChangeEvent((EntryChangeEvent) null);
      ChangeEventVector changeEventVector0 = action0.getChangeEvents();
      assertEquals(1, changeEventVector0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Action action0 = new Action();
      // Undeclared exception!
      try { 
        action0.addFeatureChangeEvent((FeatureChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.Action", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Action action0 = new Action();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Bdxn8!56Bp`:6k@z)\"");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("internal error - unknown event type: ");
      Feature feature0 = entry0.createFeature();
      Key key0 = new Key("internal error - unknown event type: ");
      QualifierVector qualifierVector0 = new QualifierVector();
      FeatureChangeEvent featureChangeEvent0 = new FeatureChangeEvent(feature0, feature0, key0, (Location) null, qualifierVector0, 369);
      action0.addFeatureChangeEvent(featureChangeEvent0);
      assertFalse(action0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Action action0 = new Action();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Bdxn8!56Bp`:6k@z)\"");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("Bdxn8!56Bp`:6k@z)\"");
      Feature feature0 = entry0.createFeature();
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      QualifierVector qualifierVector0 = new QualifierVector();
      FeatureChangeEvent featureChangeEvent0 = new FeatureChangeEvent(feature0, feature0, key0, (Location) null, qualifierVector0, 369);
      action0.addFeatureChangeEvent(featureChangeEvent0);
      assertTrue(action0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Action action0 = new Action();
      Bases bases0 = new Bases((Sequence) null);
      SequenceChangeEvent sequenceChangeEvent0 = new SequenceChangeEvent(bases0, 1);
      // Undeclared exception!
      try { 
        action0.addChangeEvent(sequenceChangeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.Bases", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Action action0 = new Action();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Bdxn8!56Bp`:6k@z)\"");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("internal error - unknown event type: ");
      Feature feature0 = entry0.createFeature();
      Key key0 = new Key("internal error - unknown event type: ");
      QualifierVector qualifierVector0 = new QualifierVector();
      FeatureChangeEvent featureChangeEvent0 = new FeatureChangeEvent(feature0, feature0, key0, (Location) null, qualifierVector0, 369);
      action0.addChangeEvent(featureChangeEvent0);
      assertFalse(action0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Action action0 = new Action();
      boolean boolean0 = action0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Action action0 = new Action();
      assertTrue(action0.isEmpty());
      
      action0.addEntryChangeEvent((EntryChangeEvent) null);
      boolean boolean0 = action0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Action action0 = new Action();
      ChangeEventVector changeEventVector0 = action0.getChangeEvents();
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent(changeEventVector0, (-3136), (-3136), (-3136), (-3136));
      // Undeclared exception!
      try { 
        action0.addChangeEvent(displayAdjustmentEvent0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unknown event type: uk.ac.sanger.artemis.components.DisplayAdjustmentEvent[source=uk.ac.sanger.artemis.ChangeEventVector@1]
         //
         verifyException("uk.ac.sanger.artemis.Action", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Action action0 = new Action();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("Bdxn8!56Bp`:6k@z)\"");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry("internal error - unknown event type: ");
      Feature feature0 = entry0.createFeature();
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(entry0, feature0, true, 5);
      action0.addChangeEvent(entryChangeEvent0);
  }
}
