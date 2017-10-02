/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:32:44 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.LocationParseNode;
import uk.ac.sanger.artemis.io.LocationParseNodeVector;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocationParseNodeVector_ESTest extends LocationParseNodeVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocationParseNodeVector locationParseNodeVector0 = new LocationParseNodeVector();
      Range range0 = new Range(0, 0);
      LocationParseNode locationParseNode0 = new LocationParseNode(range0);
      locationParseNodeVector0.addElementAtEnd(locationParseNode0);
      assertEquals(4, locationParseNode0.getType());
  }
}
