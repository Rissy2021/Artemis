/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:16:25 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.GenbankMisc;
import uk.ac.sanger.artemis.util.ByteBuffer;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenbankMisc_ESTest extends GenbankMisc_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenbankMisc genbankMisc0 = null;
      try {
        genbankMisc0 = new GenbankMisc((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankMisc", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Charset charset0 = Charset.defaultCharset();
      InputStreamReader inputStreamReader0 = new InputStreamReader(mockFileInputStream0, charset0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(inputStreamReader0);
      GenbankMisc genbankMisc0 = null;
      try {
        genbankMisc0 = new GenbankMisc(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      ByteBuffer byteBuffer0 = new ByteBuffer();
      byte[] byteArray0 = new byte[9];
      byteBuffer0.append(byteArray0);
      DatabaseDocument databaseDocument0 = new DatabaseDocument(" ", jPasswordField0, "$Oje(Oa\"{9FYk>CZwgH", "Min correlation score of the selected features: ", byteBuffer0, "FEATURES ");
      LinePushBackReader linePushBackReader0 = databaseDocument0.getLinePushBackReader();
      GenbankMisc genbankMisc0 = new GenbankMisc(linePushBackReader0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", genbankMisc0.getLine());
  }
}
