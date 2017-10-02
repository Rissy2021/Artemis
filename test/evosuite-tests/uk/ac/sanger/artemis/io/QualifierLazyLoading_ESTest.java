/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:43:26 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.List;
import org.biojava.bio.MergeAnnotation;
import org.biojava.bio.symbol.DoubleAlphabet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.ClusterLazyQualifierValue;
import uk.ac.sanger.artemis.chado.FeatureLocLazyQualifierValue;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.LazyQualifierValue;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierLazyLoading;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QualifierLazyLoading_ESTest extends QualifierLazyLoading_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("zciMfy]Jb\"\"", (LazyQualifierValue) null);
      String string0 = qualifierLazyLoading0.getName();
      assertEquals("zciMfy]Jb\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("Signal ", (List) null);
      List list0 = qualifierLazyLoading0.getLazyValues();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", (List) null);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.removeValue(mockHijrahDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleAlphabet doubleAlphabet0 = DoubleAlphabet.getInstance();
      List list0 = doubleAlphabet0.getAlphabets();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", list0);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValues();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.biojava.bio.symbol.DoubleAlphabet cannot be cast to uk.ac.sanger.artemis.io.LazyQualifierValue
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Key key0 = new Key("G2)kdz& Z:et/<");
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("Cannot get the gene name of ", keyVector0);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValue(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // uk.ac.sanger.artemis.io.Key cannot be cast to uk.ac.sanger.artemis.io.LazyQualifierValue
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      org.gmod.schema.sequence.Feature feature0 = new org.gmod.schema.sequence.Feature();
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue(feature0, 160);
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("vJ|lD]*OrOs1E2`<", featureLocLazyQualifierValue0);
      qualifierLazyLoading0.removeValue((Object) null);
      assertEquals("vJ|lD]*OrOs1E2`<", qualifierLazyLoading0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("Signal ", (List) null);
      qualifierLazyLoading0.addValue((Object) null);
      assertEquals("Signal ", qualifierLazyLoading0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("zciMfy]Jb\"\"", (LazyQualifierValue) null);
      qualifierLazyLoading0.addValue((Object) null);
      assertEquals("zciMfy]Jb\"\"", qualifierLazyLoading0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClusterLazyQualifierValue clusterLazyQualifierValue0 = new ClusterLazyQualifierValue("", "9(=zj|nhkxR^G)/>", (GFFStreamFeature) null);
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", clusterLazyQualifierValue0);
      boolean boolean0 = qualifierLazyLoading0.isAllLazyValuesLoaded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("S&\"{u>[n1=1^L/y{", (LazyQualifierValue) null);
      qualifierLazyLoading0.setForceLoad(true);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValues();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClusterLazyQualifierValue clusterLazyQualifierValue0 = new ClusterLazyQualifierValue("", "9(=zj|nhkxR^G)/>", (GFFStreamFeature) null);
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", clusterLazyQualifierValue0);
      StringVector stringVector0 = qualifierLazyLoading0.getValues();
      assertFalse(stringVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MergeAnnotation mergeAnnotation0 = new MergeAnnotation();
      List list0 = mergeAnnotation0.getAnnotations();
      QualifierLazyLoading qualifierLazyLoading0 = null;
      try {
        qualifierLazyLoading0 = new QualifierLazyLoading(")<", list0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - zero length values vector
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", (List) null);
      StringVector stringVector0 = qualifierLazyLoading0.getValues();
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("zciMfy]Jb\"\"", (LazyQualifierValue) null);
      Qualifier qualifier0 = qualifierLazyLoading0.copy();
      assertNotSame(qualifierLazyLoading0, qualifier0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("zciMfy]Jb\"\"", (LazyQualifierValue) null);
      List list0 = qualifierLazyLoading0.getLazyValues();
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.addValues(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FeatureLocLazyQualifierValue featureLocLazyQualifierValue0 = new FeatureLocLazyQualifierValue((org.gmod.schema.sequence.Feature) null, 30000);
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading((String) null, featureLocLazyQualifierValue0);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValue(30000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 30000
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading((String) null, (LazyQualifierValue) null);
      String string0 = qualifierLazyLoading0.getName();
      assertNull(string0);
  }
}
