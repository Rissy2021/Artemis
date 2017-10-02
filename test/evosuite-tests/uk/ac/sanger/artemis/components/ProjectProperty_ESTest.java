/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 02:45:32 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Properties;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ProjectProperty;
import uk.ac.sanger.artemis.components.Splash;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProjectProperty_ESTest extends ProjectProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("getFeatureCvTermPubByFeature");
      HashMap<String, HashMap<String, String>> hashMap0 = new HashMap<String, HashMap<String, String>>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put("sequence", hashMap1);
      ProjectProperty.writeProperties(mockFile0, hashMap0);
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("tRNA", "tRNA");
      HashMap<String, HashMap<String, String>> hashMap0 = new HashMap<String, HashMap<String, String>>();
      hashMap0.put("tRNA", (HashMap<String, String>) null);
      // Undeclared exception!
      try { 
        ProjectProperty.writeProperties(mockFile0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ProjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        ProjectProperty.getProjectMap((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ProjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProjectProperty projectProperty0 = null;
      try {
        projectProperty0 = new ProjectProperty((Splash) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProjectProperty projectProperty0 = null;
      try {
        projectProperty0 = new ProjectProperty();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("getFeatureCvTermPubByFeature");
      HashMap<String, HashMap<String, String>> hashMap0 = new HashMap<String, HashMap<String, String>>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap1.put("", "sequence");
      hashMap0.put("sequence", hashMap1);
      ProjectProperty.writeProperties(mockFile0, hashMap0);
      assertTrue(mockFile0.canRead());
      assertEquals(1392409281320L, mockFile0.lastModified());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("getFeatureCvTermPubByFeature");
      HashMap<String, HashMap<String, String>> hashMap0 = new HashMap<String, HashMap<String, String>>();
      ProjectProperty.writeProperties(mockFile0, hashMap0);
      assertFalse(mockFile0.canExecute());
      assertEquals(0L, mockFile0.lastModified());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Frame> biFunction0 = (BiFunction<Object, Object, Frame>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.merge("project.}}", "ZjDg", biFunction0);
      HashMap<String, HashMap<String, String>> hashMap0 = ProjectProperty.getProjectMap(properties0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Properties properties0 = new Properties();
      BiFunction<Object, Object, Frame> biFunction0 = (BiFunction<Object, Object, Frame>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      properties0.merge("c}", "ZjDg", biFunction0);
      HashMap<String, HashMap<String, String>> hashMap0 = ProjectProperty.getProjectMap(properties0);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("T_)>3nZM");
      Properties properties0 = new Properties();
      properties0.put(mockFile0, mockFile0);
      // Undeclared exception!
      try { 
        ProjectProperty.getProjectMap(properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.io.MockFile cannot be cast to java.lang.String
         //
         verifyException("uk.ac.sanger.artemis.components.ProjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProjectProperty.writeProperties();
  }
}
