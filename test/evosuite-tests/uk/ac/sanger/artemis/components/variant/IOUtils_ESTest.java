/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 03:08:31 GMT 2017
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.datatransfer.Clipboard;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.variant.IOUtils;
import uk.ac.sanger.artemis.components.variant.VCFview;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/kp11/workspace/applications/Artemis/test/!|");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      try { 
        IOUtils.isBCF("!|");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Premature end of file
         //
         verifyException("net.sf.samtools.util.BlockCompressedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        IOUtils.isBCF("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.exportVariantFasta((VCFview) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.export((Map<String, Boolean>) null, (List<String>) null, (VCFview) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureVector featureVector0 = simpleEntryGroup0.getAllFeatures();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, ":inb^U%4#*");
      // Undeclared exception!
      try { 
        IOUtils.createFeatures((VCFview) null, filteredEntryGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleEntryGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.countVariants((VCFview) null, (FeatureVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.isBCF("ftp:pseudo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        IOUtils.isBCF("http:SEQUENCE DELETE AT ");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: 
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      IOUtils.wrapString("INFO FIELDS:", stringBuffer0);
      assertEquals(13, stringBuffer0.length());
      assertEquals("INFO FIELDS:\n", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.wrapString("^[AGCTNMRWSYKBDHVagctnmrwsykbdhv]+,[AGCTNMRWSYKBDHVagctnmrwsykbdhv,]+$", (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      IOUtils.wrapString("", stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("synonym_id");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getAllFeatures();
      // Undeclared exception!
      try { 
        IOUtils.countVariants((VCFview) null, featureVector0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("PASS");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getAllFeatures();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(0);
      // Undeclared exception!
      try { 
        IOUtils.exportFasta((VCFview) null, featureVector0, false, charArrayWriter0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("dNjqkSNsunhfEn1WN");
      Selection selection0 = new Selection(clipboard0);
      // Undeclared exception!
      try { 
        IOUtils.exportFastaByRange((VCFview) null, selection0, false, (Writer) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = IOUtils.writeVCF((Map<String, Boolean>) null, "", 71, (VCFview) null, (FeatureVector) null, 71);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }
}
