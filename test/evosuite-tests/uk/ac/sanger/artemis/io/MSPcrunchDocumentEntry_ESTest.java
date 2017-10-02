/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 04:36:41 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sshtools.j2ssh.io.ByteArrayReader;
import com.sshtools.j2ssh.sftp.FileAttributes;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.LogReadListener;
import uk.ac.sanger.artemis.components.filetree.FileList;
import uk.ac.sanger.artemis.components.filetree.RemoteFileNode;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.EmblDocumentEntry;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.Entry;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.MSPcrunchStreamFeature;
import uk.ac.sanger.artemis.io.ReadListener;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.io.StreamSequence;
import uk.ac.sanger.artemis.util.ByteBuffer;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.FileDocument;
import uk.ac.sanger.artemis.util.RemoteFileDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MSPcrunchDocumentEntry_ESTest extends MSPcrunchDocumentEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(entryInformation0);
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      StreamSequence streamSequence0 = mSPcrunchDocumentEntry0.makeNativeSequence(genbankStreamSequence0);
      assertEquals(0, streamSequence0.getGCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(mSPcrunchEntryInformation0);
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("");
      // Undeclared exception!
      try { 
        mSPcrunchDocumentEntry0.makeNativeSequence(fastaStreamSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(1794);
      ByteBuffer byteBuffer0 = new ByteBuffer();
      byte[] byteArray0 = new byte[5];
      byteBuffer0.append(byteArray0);
      DatabaseDocument databaseDocument0 = new DatabaseDocument(" - ", jPasswordField0, " - ", " - ", byteBuffer0, (String) null);
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = null;
      try {
        mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(databaseDocument0, (ReadListener) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // cannot recognise format of binary file
         //
         verifyException("uk.ac.sanger.artemis.io.LineGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("17aI");
      FileDocument fileDocument0 = new FileDocument(mockFile0);
      LogReadListener logReadListener0 = new LogReadListener("17aI");
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = null;
      try {
        mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(fileDocument0, logReadListener0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayReader byteArrayReader0 = new ByteArrayReader(byteArray0);
      FileAttributes fileAttributes0 = new FileAttributes(byteArrayReader0);
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, "hw\"*[cgDjD]P>", (FileList) null, (String) null, fileAttributes0);
      RemoteFileDocument remoteFileDocument0 = new RemoteFileDocument(remoteFileNode0);
      LogReadListener logReadListener0 = new LogReadListener(">c(]Z%");
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = null;
      try {
        mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(remoteFileDocument0, logReadListener0);
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
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = null;
      try {
        mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry((Entry) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleDocumentEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(0);
      ByteBuffer byteBuffer0 = new ByteBuffer();
      DatabaseDocument databaseDocument0 = new DatabaseDocument("/$D|&/;M)", jPasswordField0, "/$D|&/;M)", "/$D|&/;M)", byteBuffer0, "Complement");
      byteBuffer0.append(">,bJ)NK");
      LogReadListener logReadListener0 = new LogReadListener(">EPX-c");
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(databaseDocument0, logReadListener0);
      assertTrue(mSPcrunchDocumentEntry0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(entryInformation0);
      // Undeclared exception!
      try { 
        mSPcrunchDocumentEntry0.makeNativeFeature((Feature) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.MSPcrunchStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(blastEntryInformation0);
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = (MSPcrunchStreamFeature)mSPcrunchDocumentEntry0.makeNativeFeature(genbankStreamFeature0, true);
      MSPcrunchStreamFeature mSPcrunchStreamFeature1 = (MSPcrunchStreamFeature)mSPcrunchDocumentEntry0.makeNativeFeature(mSPcrunchStreamFeature0, false);
      assertSame(mSPcrunchStreamFeature1, mSPcrunchStreamFeature0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(mSPcrunchEntryInformation0);
      boolean boolean0 = mSPcrunchDocumentEntry0.isReadOnly();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(1794);
      ByteBuffer byteBuffer0 = new ByteBuffer();
      DatabaseDocument databaseDocument0 = new DatabaseDocument(" - ", jPasswordField0, " - ", " - ", byteBuffer0, (String) null);
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = null;
      try {
        mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(databaseDocument0, (ReadListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(entryInformation0);
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("' failed: ");
      StreamSequence streamSequence0 = mSPcrunchDocumentEntry0.makeNativeSequence(emblStreamSequence0);
      assertEquals(0, streamSequence0.getTCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(blastEntryInformation0);
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(blastEntryInformation0, mSPcrunchDocumentEntry0, false);
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry1 = new MSPcrunchDocumentEntry(emblDocumentEntry0, false);
      assertFalse(mSPcrunchDocumentEntry1.equals((Object)mSPcrunchDocumentEntry0));
  }
}
