/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 05:58:22 GMT 2017
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.DatabaseLocationParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatabaseLocationParser_ESTest extends DatabaseLocationParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      databaseLocationParser0.setHost("2F@(%/]m");
      databaseLocationParser0.getUnprefixedURL();
      assertEquals(0, databaseLocationParser0.getPort());
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser(";yS]yFsSlDKZ|");
      databaseLocationParser0.setDatabase("");
      String string0 = databaseLocationParser0.getUnprefixedURL();
      assertEquals("", string0);
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser(";yS]yFsSlDKZ|");
      databaseLocationParser0.setPort(3093);
      int int0 = databaseLocationParser0.getPort();
      assertEquals(3093, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      databaseLocationParser0.setHost("getContextClafsLoar");
      databaseLocationParser0.getHost();
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      assertEquals(0, databaseLocationParser0.getPort());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("");
      databaseLocationParser0.setHost("");
      databaseLocationParser0.getHost();
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      databaseLocationParser0.setDBEngine("postgresql://postgresql://getContextClassLoader:0/null?ssl=true");
      databaseLocationParser0.setFromURLString("");
      String string0 = databaseLocationParser0.getDatabase();
      assertEquals("/getContextClassLoader:0/null", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      databaseLocationParser0.setDatabase("");
      databaseLocationParser0.getDatabase();
      assertEquals(0, databaseLocationParser0.getPort());
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("");
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      
      databaseLocationParser0.setDBEngine("[fn:9)rE}d/2N41>=5?");
      databaseLocationParser0.getConnectionString();
      assertEquals(0, databaseLocationParser0.getPort());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("");
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      
      databaseLocationParser0.setDBEngine("[fn:9)rE}d/2N41>=5?");
      databaseLocationParser0.getCompleteURL();
      assertEquals(0, databaseLocationParser0.getPort());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      // Undeclared exception!
      try { 
        databaseLocationParser0.setUsername((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseLocationParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("~d!y7");
      // Undeclared exception!
      try { 
        databaseLocationParser0.setPort((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseLocationParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("io`U:p-");
      // Undeclared exception!
      try { 
        databaseLocationParser0.setFromURLString("chado");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      // Undeclared exception!
      try { 
        databaseLocationParser0.setFromURLString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      // Undeclared exception!
      try { 
        databaseLocationParser0.setDatabase((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseLocationParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      // Undeclared exception!
      try { 
        databaseLocationParser0.setDBEngine((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseLocationParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = null;
      try {
        databaseLocationParser0 = new DatabaseLocationParser("TRACE");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = null;
      try {
        databaseLocationParser0 = new DatabaseLocationParser((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      String string0 = databaseLocationParser0.getUnprefixedURL();
      assertEquals(0, databaseLocationParser0.getPort());
      assertEquals("ull?", string0);
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("io`U:p-");
      String string0 = databaseLocationParser0.getCompleteURL();
      assertEquals("jdbc:postgresql:/null?", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser(";yS]yFsSlDKZ|");
      databaseLocationParser0.setSSL(false);
      assertFalse(databaseLocationParser0.isSSLEnabled());
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("io`U:p-");
      databaseLocationParser0.setFromURLString("jdbc:postgresql:/null?");
      databaseLocationParser0.getUsername();
      assertEquals((-1), databaseLocationParser0.getPort());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("io`U:p-");
      String string0 = databaseLocationParser0.getUsername();
      assertEquals(0, databaseLocationParser0.getPort());
      assertNotNull(string0);
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      assertEquals("chado", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      databaseLocationParser0.setSSL(true);
      boolean boolean0 = databaseLocationParser0.isSSLEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      boolean boolean0 = databaseLocationParser0.isSSLEnabled();
      assertEquals(0, databaseLocationParser0.getPort());
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      databaseLocationParser0.setFromURLString("jdbc:postgresql://getContextClafsLoar:0/null?ssl=true");
      assertTrue(databaseLocationParser0.isSSLEnabled());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      // Undeclared exception!
      try { 
        databaseLocationParser0.setPort("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      databaseLocationParser0.setUsername("");
      assertEquals("", databaseLocationParser0.getUsername());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      String string0 = databaseLocationParser0.getConnectionString();
      assertNotNull(string0);
      assertEquals("jdbc:postgresql:/null?", string0);
      assertEquals(0, databaseLocationParser0.getPort());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      databaseLocationParser0.getHost();
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      int int0 = databaseLocationParser0.getPort();
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      
      databaseLocationParser0.setDBEngine("");
      databaseLocationParser0.getDBEngine();
      assertEquals(0, databaseLocationParser0.getPort());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      String string0 = databaseLocationParser0.getDBEngine();
      assertEquals(0, databaseLocationParser0.getPort());
      assertEquals("postgresql", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      databaseLocationParser0.setPort((-2752));
      int int0 = databaseLocationParser0.getPort();
      assertEquals((-2752), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser();
      // Undeclared exception!
      try { 
        databaseLocationParser0.setHost((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseLocationParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DatabaseLocationParser databaseLocationParser0 = new DatabaseLocationParser("Could not read configuration file from URL [");
      databaseLocationParser0.getDatabase();
      assertEquals("postgresql", databaseLocationParser0.getDBEngine());
      assertEquals(0, databaseLocationParser0.getPort());
  }
}
