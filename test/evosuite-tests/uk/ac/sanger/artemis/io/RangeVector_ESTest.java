/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:46:34 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RangeVector_ESTest extends RangeVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      assertEquals(0, rangeVector0.size());
      
      rangeVector0.removeAllElements();
      rangeVector0.reverse();
      rangeVector0.reverse();
      LinkedList<Range> linkedList0 = new LinkedList<Range>();
      Range range0 = new Range(1951, 1951);
      linkedList0.parallelStream();
      linkedList0.add(range0);
      rangeVector0.addAll((Collection<? extends Range>) linkedList0);
      rangeVector0.parallelStream();
      Range range1 = new Range(1951, 1951);
      range0.truncate(range1);
      rangeVector0.reverse();
      rangeVector0.setSize(1931);
      Range range2 = new Range(0);
      range2.toString();
      rangeVector0.containsRange(range2);
      rangeVector0.containsRange(range2);
      rangeVector0.ensureCapacity(1940);
      rangeVector0.reverse();
      rangeVector0.reverse();
      range2.truncate(range0);
      rangeVector0.containsRange(range2);
      range2.copy();
      rangeVector0.containsRange(range2);
      rangeVector0.containsRange(range2);
      rangeVector0.containsRange(range0);
      rangeVector0.reverse();
      rangeVector0.reverse();
      // Undeclared exception!
      rangeVector0.containsRange(range2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      rangeVector0.removeAllElements();
      rangeVector0.setSize(3655);
      Integer integer0 = new Integer(3655);
      Range range0 = new Range(932, 1195);
      range0.copy();
      rangeVector0.addElement(range0);
      rangeVector0.removeElement(integer0);
      rangeVector0.reverse();
      rangeVector0.reverse();
      rangeVector0.reverse();
      rangeVector0.reverse();
      rangeVector0.reverse();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      rangeVector0.sort(comparator0);
      // Undeclared exception!
      rangeVector0.reverse();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      rangeVector0.setSize(1955);
      rangeVector0.reverse();
      assertFalse(rangeVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector((Range) null);
      // Undeclared exception!
      try { 
        rangeVector0.containsRange((Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Range range0 = new Range(20, 20);
      RangeVector rangeVector0 = new RangeVector(range0);
      Range range1 = range0.truncate(range0);
      rangeVector0.add(range0);
      boolean boolean0 = rangeVector0.containsRange(range0);
      rangeVector0.reverse();
      boolean boolean1 = rangeVector0.containsRange(range1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }
}
