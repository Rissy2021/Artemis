/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:13:35 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.FeatureEnumeration;
import uk.ac.sanger.artemis.io.FeatureTree;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureEnumeration_ESTest extends FeatureEnumeration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      org.biojava.bio.seq.Feature.ByLocationComparator feature_ByLocationComparator0 = org.biojava.bio.seq.Feature.byLocationOrder;
      FeatureTree featureTree0 = new FeatureTree(feature_ByLocationComparator0);
      FeatureEnumeration featureEnumeration0 = featureTree0.features();
      boolean boolean0 = featureEnumeration0.hasMoreFeatures();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      org.biojava.bio.seq.Feature.ByLocationComparator feature_ByLocationComparator0 = org.biojava.bio.seq.Feature.byLocationOrder;
      FeatureTree featureTree0 = new FeatureTree(feature_ByLocationComparator0);
      FeatureTree.FeatureEnumerator featureTree_FeatureEnumerator0 = featureTree0.new FeatureEnumerator();
      try { 
        featureTree_FeatureEnumerator0.nextFeature();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap$PrivateEntryIterator", e);
      }
  }
}
