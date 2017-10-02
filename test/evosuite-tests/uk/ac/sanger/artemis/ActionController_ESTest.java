/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:22:23 GMT 2017
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ActionController;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryChangeEvent;
import uk.ac.sanger.artemis.EntryGroupChangeEvent;
import uk.ac.sanger.artemis.FeatureChangeEvent;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.sequence.SequenceChangeEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActionController_ESTest extends ActionController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      // Undeclared exception!
      try { 
        actionController0.entryGroupChanged((EntryGroupChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.ActionController", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      ActionController actionController0 = simpleEntryGroup0.getActionController();
      Entry entry0 = simpleEntryGroup0.createEntry();
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(simpleEntryGroup0, entry0, 733);
      actionController0.entryGroupChanged(entryGroupChangeEvent0);
      assertEquals(3, EntryGroupChangeEvent.ENTRY_ACTIVE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JMenu jMenu0 = new JMenu(styledEditorKit_BoldAction0);
      actionController0.addUndoMenu(jMenu0);
      // Undeclared exception!
      try { 
        actionController0.addUndoMenu((JMenuItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.ActionController", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      actionController0.startAction();
      // Undeclared exception!
      try { 
        actionController0.featureChanged((FeatureChangeEvent) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unknown event type: null
         //
         verifyException("uk.ac.sanger.artemis.Action", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      actionController0.featureChanged((FeatureChangeEvent) null);
      assertFalse(actionController0.canUndo());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      actionController0.startAction();
      // Undeclared exception!
      try { 
        actionController0.entryChanged((EntryChangeEvent) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unknown event type: null
         //
         verifyException("uk.ac.sanger.artemis.Action", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      actionController0.entryChanged((EntryChangeEvent) null);
      assertFalse(actionController0.canUndo());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeatureVector) null, "");
      ActionController actionController0 = filteredEntryGroup0.getActionController();
      Entry entry0 = simpleEntryGroup0.createEntry();
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(filteredEntryGroup0, entry0, 1);
      actionController0.entryGroupChanged(entryGroupChangeEvent0);
      assertEquals(6, EntryGroupChangeEvent.DONE_GONE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      JMenuItem jMenuItem0 = new JMenuItem("", 733);
      actionController0.addRedoMenu(jMenuItem0);
      actionController0.addRedoMenu(jMenuItem0);
      assertFalse(jMenuItem0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      // Undeclared exception!
      try { 
        actionController0.addRedoMenu((JMenuItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.ActionController", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      boolean boolean0 = actionController0.redo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      boolean boolean0 = actionController0.undo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      boolean boolean0 = actionController0.canUndo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      actionController0.endAction();
      assertFalse(actionController0.canUndo());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeatureVector) null, "");
      ActionController actionController0 = filteredEntryGroup0.getActionController();
      actionController0.startAction();
      // Undeclared exception!
      try { 
        actionController0.startAction();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - ActionController.startAction() called twice
         //
         verifyException("uk.ac.sanger.artemis.ActionController", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      actionController0.startAction();
      actionController0.endAction();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      ActionController actionController0 = simpleEntryGroup0.getActionController();
      Range range0 = new Range(0, 2506);
      SequenceChangeEvent sequenceChangeEvent0 = new SequenceChangeEvent(2506, 0, range0);
      actionController0.sequenceChanged(sequenceChangeEvent0);
      assertEquals(4, SequenceChangeEvent.CONTIG_REVERSE_COMPLEMENT);
  }
}
