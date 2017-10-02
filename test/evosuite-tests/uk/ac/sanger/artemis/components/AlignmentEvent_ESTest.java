/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:26:47 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatch;
import uk.ac.sanger.artemis.components.AlignmentEvent;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlignmentEvent_ESTest extends AlignmentEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlignmentEvent alignmentEvent0 = new AlignmentEvent((AlignMatch) null);
      AlignMatch alignMatch0 = alignmentEvent0.getMatch();
      assertNull(alignMatch0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Range range0 = new Range(5, 5);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 2201, 2201);
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertSame(alignMatch0, alignMatch1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Range range0 = new Range(0);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, 0, 0);
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertTrue(alignMatch1.isSelfMatch());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Range range0 = new Range((-876), 2177);
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, true, 2177, 2177);
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertTrue(alignMatch1.isRevMatch());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Range range0 = new Range((-1487), (-1487));
      AlignMatch alignMatch0 = new AlignMatch(range0, range0, false, (-563), (-563));
      AlignmentEvent alignmentEvent0 = new AlignmentEvent(alignMatch0);
      AlignMatch alignMatch1 = alignmentEvent0.getMatch();
      assertEquals((-563), alignMatch1.getScore());
  }
}
