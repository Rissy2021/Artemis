/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:59:00 GMT 2017
 */

package uk.ac.sanger.artemis.components.filetree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sshtools.j2ssh.io.ByteArrayReader;
import com.sshtools.j2ssh.io.UnsignedInteger32;
import com.sshtools.j2ssh.sftp.FileAttributes;
import java.awt.HeadlessException;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.util.Date;
import javax.swing.JProgressBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.filetree.FileList;
import uk.ac.sanger.artemis.components.filetree.RemoteFileNode;
import uk.ac.sanger.artemis.j2ssh.FTProgress;
import uk.ac.sanger.artemis.j2ssh.SshFileManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteFileNode_ESTest extends RemoteFileNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      RemoteFileNode remoteFileNode1 = new RemoteFileNode(true);
      remoteFileNode0.setParentNode(remoteFileNode1);
      assertFalse(remoteFileNode1.isExplored());
      assertFalse(remoteFileNode1.isLeaf());
      assertFalse(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayReader byteArrayReader0 = new ByteArrayReader(byteArray0);
      FileAttributes fileAttributes0 = new FileAttributes(byteArrayReader0);
      UnsignedInteger32 unsignedInteger32_0 = new UnsignedInteger32(5);
      fileAttributes0.setTimes(unsignedInteger32_0, unsignedInteger32_0);
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("hp57FMx|", "{", (FileList) null, "hp57FMx|", fileAttributes0);
      assertEquals("hp57FMx|/{", remoteFileNode0.getFullName());
      assertEquals("hp57FMx|", remoteFileNode0.getRootDir());
      assertFalse(remoteFileNode0.isDirectory());
      assertEquals("hp57FMx|/hp57FMx|", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayReader byteArrayReader0 = new ByteArrayReader(byteArray0);
      FileAttributes fileAttributes0 = new FileAttributes(byteArrayReader0);
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, ">,<eW^B/!G~EW", (FileList) null, (String) null, fileAttributes0);
      remoteFileNode0.length();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayReader byteArrayReader0 = new ByteArrayReader(byteArray0);
      FileAttributes fileAttributes0 = new FileAttributes(byteArrayReader0);
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, ">,<eW^B/!G~EW", (FileList) null, (String) null, fileAttributes0);
      boolean boolean0 = remoteFileNode0.isLeaf();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "", true);
      boolean boolean0 = remoteFileNode0.isLeaf();
      assertFalse(boolean0);
      assertEquals("/", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      boolean boolean0 = remoteFileNode0.isDirectory();
      assertFalse(boolean0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.getRootDir();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("T", "", (FileList) null, "", true);
      String string0 = remoteFileNode0.getRootDir();
      assertEquals("/", remoteFileNode0.getFullName());
      assertEquals("T/", remoteFileNode0.getPathName());
      assertEquals("T", string0);
      assertFalse(remoteFileNode0.isLeaf());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      remoteFileNode0.getPathName();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      remoteFileNode0.getModifiedTime();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.getFullName();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, false);
      remoteFileNode0.getFile();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      boolean boolean0 = remoteFileNode0.getAllowsChildren();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      MockFile mockFile0 = new MockFile("aAZVZ=IP =", ">");
      JProgressBar jProgressBar0 = new JProgressBar();
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "");
      // Undeclared exception!
      try { 
        remoteFileNode0.put("aAZVZ=IP =", (File) mockFile0, fTProgress0, false);
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
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      DataFlavor dataFlavor0 = new DataFlavor();
      try { 
        remoteFileNode0.getTransferData(dataFlavor0);
        fail("Expecting exception: UnsupportedFlavorException");
      
      } catch(UnsupportedFlavorException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.RemoteFileNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      // Undeclared exception!
      try { 
        remoteFileNode0.getServerName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = null;
      try {
        remoteFileNode0 = new RemoteFileNode(">ninrW)|\"vyx", ">ninrW)|\"vyx", (FileList) null, "", (FileAttributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.RemoteFileNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "", true);
      RemoteFileNode remoteFileNode1 = (RemoteFileNode)remoteFileNode0.getTransferData(remoteFileNode0.REMOTEFILENODE);
      assertEquals("/", remoteFileNode1.getPathName());
      assertFalse(remoteFileNode1.isLeaf());
      assertFalse(remoteFileNode1.isExplored());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, "`7P}.Jw", (FileList) null, (String) null, true);
      DataFlavor dataFlavor0 = DataFlavor.stringFlavor;
      // Undeclared exception!
      try { 
        remoteFileNode0.getTransferData(dataFlavor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      DataFlavor dataFlavor0 = DataFlavor.getTextPlainUnicodeFlavor();
      boolean boolean0 = remoteFileNode0.isDataFlavorSupported(dataFlavor0);
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(boolean0);
      assertTrue(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      DataFlavor dataFlavor0 = DataFlavor.stringFlavor;
      boolean boolean0 = remoteFileNode0.isDataFlavorSupported(dataFlavor0);
      assertTrue(boolean0);
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      boolean boolean0 = remoteFileNode0.isDataFlavorSupported(remoteFileNode0.REMOTEFILENODE);
      assertTrue(boolean0);
      assertFalse(remoteFileNode0.isDirectory());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "~/", (FileList) null, (String) null, false);
      MockFile mockFile0 = new MockFile("~/");
      JProgressBar jProgressBar0 = new JProgressBar(870, 870);
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "lp");
      // Undeclared exception!
      try { 
        remoteFileNode0.put((File) mockFile0, fTProgress0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      MockFile mockFile0 = new MockFile("{F8`t^Rkcf/2", "{F8`t^Rkcf/2");
      // Undeclared exception!
      try { 
        remoteFileNode0.put((File) mockFile0, (FTProgress) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      Object[] objectArray0 = remoteFileNode0.getChildren();
      assertNotNull(objectArray0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      Object[] objectArray0 = remoteFileNode0.getChildren();
      assertNull(objectArray0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "", true);
      // Undeclared exception!
      try { 
        remoteFileNode0.getChildren();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "~/", (FileList) null, (String) null, false);
      String string0 = remoteFileNode0.getServerName();
      assertTrue(remoteFileNode0.isLeaf());
      assertEquals("", remoteFileNode0.getRootDir());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "~/", (FileList) null, "", false);
      String string0 = remoteFileNode0.getServerName();
      assertEquals("", remoteFileNode0.getRootDir());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("/", remoteFileNode0.getPathName());
      assertEquals("/~/", remoteFileNode0.getFullName());
      assertFalse(remoteFileNode0.isDirectory());
      assertEquals("/~/", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      RemoteFileNode remoteFileNode0 = null;
      try {
        remoteFileNode0 = new RemoteFileNode(".", "<vxG]9~}VeQ9^OgB", fileList0, ".", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      boolean boolean0 = remoteFileNode0.isExplored();
      assertFalse(boolean0);
      assertTrue(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      boolean boolean0 = remoteFileNode0.isDirectory();
      assertTrue(boolean0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "", true);
      remoteFileNode0.getRootDir();
      assertEquals("/", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isLeaf());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      JProgressBar jProgressBar0 = new JProgressBar((-3964), (-3964));
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "");
      // Undeclared exception!
      try { 
        remoteFileNode0.getFileContents(fTProgress0, "");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      // Undeclared exception!
      try { 
        remoteFileNode0.delete();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      // Undeclared exception!
      try { 
        remoteFileNode0.mkdir("r");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "~/", (FileList) null, "", false);
      String string0 = remoteFileNode0.getFullName();
      assertTrue(remoteFileNode0.isLeaf());
      assertEquals("", remoteFileNode0.getRootDir());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("/", remoteFileNode0.getPathName());
      assertEquals("/~/", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      boolean boolean0 = remoteFileNode0.getAllowsChildren();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "+nk", fileAttributes0);
      remoteFileNode0.getTransferDataFlavors();
      assertEquals("+nk/", remoteFileNode0.getFullName());
      assertEquals("/+nk", remoteFileNode0.getPathName());
      assertEquals("", remoteFileNode0.getRootDir());
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "", true);
      remoteFileNode0.reset();
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("/", remoteFileNode0.getPathName());
      assertTrue(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "~/", (FileList) null, (String) null, false);
      String string0 = remoteFileNode0.getPathName();
      assertEquals("", string0);
      assertFalse(remoteFileNode0.isExplored());
      assertNotNull(string0);
      assertEquals("", remoteFileNode0.getRootDir());
      assertTrue(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("~/", "~/", (FileList) null, "~/", true);
      remoteFileNode0.length();
      assertEquals("~//~/", remoteFileNode0.getFullName());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("~/~/", remoteFileNode0.getPathName());
      assertTrue(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      // Undeclared exception!
      try { 
        remoteFileNode0.getFileContents((FTProgress) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("5/.", "URL:", (FileList) null, "5/.", true);
      remoteFileNode0.getParentNode();
      assertFalse(remoteFileNode0.isLeaf());
      assertEquals("5//URL:", remoteFileNode0.getFullName());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("5/./5/", remoteFileNode0.getPathName());
      assertEquals("5/.", remoteFileNode0.getRootDir());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      // Undeclared exception!
      try { 
        remoteFileNode0.rename("/");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "+nk", fileAttributes0);
      Date date0 = remoteFileNode0.getModifiedTime();
      assertEquals("/+nk", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("+nk/", remoteFileNode0.getFullName());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertFalse(remoteFileNode0.isDirectory());
      assertEquals("", remoteFileNode0.getRootDir());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      // Undeclared exception!
      try { 
        remoteFileNode0.stat();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("", "", (FileList) null, "", true);
      remoteFileNode0.getFile();
      assertEquals("/", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(remoteFileNode0.getAllowsChildren());
  }
}
