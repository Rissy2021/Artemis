/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 05:57:19 GMT 2017
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.CacheHashMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheHashMap_ESTest extends CacheHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(0, (-1));
      Object object0 = new Object();
      cacheHashMap0.get(object0);
      cacheHashMap0.put((Object) null, (Object) null);
      Object object1 = cacheHashMap0.put((Object) null, (Object) null);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(0, (-1));
      cacheHashMap0.put((Object) null, (Object) null);
      Object object0 = cacheHashMap0.getLastKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(0, (-1));
      Object object0 = new Object();
      cacheHashMap0.get(object0);
      Object object1 = cacheHashMap0.getLastKey();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(1230, 1230);
      Object object0 = new Object();
      cacheHashMap0.put(object0, object0);
      Object object1 = cacheHashMap0.get(object0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CacheHashMap cacheHashMap0 = null;
      try {
        cacheHashMap0 = new CacheHashMap((-482), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -482
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(0, 1653);
      Integer integer0 = new Integer((-2));
      Object object0 = cacheHashMap0.put(integer0, integer0);
      cacheHashMap0.put(object0, object0);
      assertEquals(1, cacheHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(1, 0);
      Object object0 = new Object();
      cacheHashMap0.put(object0, object0);
      Integer integer0 = new Integer(239);
      cacheHashMap0.put(object0, integer0);
      assertEquals(1, cacheHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CacheHashMap cacheHashMap0 = new CacheHashMap(0, (-1));
      // Undeclared exception!
      try { 
        cacheHashMap0.getLastKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
