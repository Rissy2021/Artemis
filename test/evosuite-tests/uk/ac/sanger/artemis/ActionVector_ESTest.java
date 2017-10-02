/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 00:22:16 GMT 2017
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Action;
import uk.ac.sanger.artemis.ActionVector;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActionVector_ESTest extends ActionVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      Action action0 = new Action();
      actionVector0.add(action0);
      int int0 = actionVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      actionVector0.add((Action) null);
      Action action0 = actionVector0.removeAndReturnLast();
      assertNull(action0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      Action action0 = new Action();
      actionVector0.add(action0);
      Action action1 = actionVector0.removeAndReturnLast();
      assertTrue(action1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      Action action0 = new Action();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry();
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(action0, entry0, 0);
      action0.addChangeEvent(entryChangeEvent0);
      actionVector0.add(action0);
      Action action1 = actionVector0.removeAndReturnLast();
      assertSame(action1, action0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      Action action0 = new Action();
      actionVector0.add(action0);
      Action action1 = actionVector0.elementAt(0);
      assertTrue(action1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      Action action0 = new Action();
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Entry entry0 = simpleEntryGroup0.createEntry();
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(action0, entry0, 0);
      action0.addChangeEvent(entryChangeEvent0);
      actionVector0.add(action0);
      Action action1 = actionVector0.elementAt(0);
      assertSame(action1, action0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      Action action0 = new Action();
      actionVector0.add(action0);
      actionVector0.add(action0);
      actionVector0.removeAndReturnLast();
      assertEquals(1, actionVector0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      actionVector0.add((Action) null);
      Action action0 = actionVector0.elementAt(0);
      assertNull(action0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      // Undeclared exception!
      try { 
        actionVector0.removeAndReturnLast();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      int int0 = actionVector0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ActionVector actionVector0 = new ActionVector();
      // Undeclared exception!
      try { 
        actionVector0.elementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }
}
