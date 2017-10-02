/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:58:51 GMT 2017
 */

package uk.ac.sanger.artemis.components.filetree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Panel;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Array;
import javax.swing.JFrame;
import org.apache.batik.ext.awt.ColorSpaceHintKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.filetree.FileNode;
import uk.ac.sanger.artemis.components.filetree.FileSystemModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileSystemModel_ESTest extends FileSystemModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      FileSystemModel fileSystemModel0 = null;
      try {
        fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\"y";
      stringArray0[1] = "\"y";
      stringArray0[2] = "Modified";
      stringArray0[3] = "SKO1G$S:+T";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "8";
      stringArray0[7] = "?X<4LnE";
      stringArray0[8] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      FileFilter fileFilter0 = mock(FileFilter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileFilter0).toString();
      fileSystemModel0.setFilter(fileFilter0);
      FileFilter fileFilter1 = fileSystemModel0.getFilter();
      assertSame(fileFilter1, fileFilter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      Class<Panel>[] classArray0 = (Class<Panel>[]) Array.newInstance(Class.class, 7);
      Class<Panel> class0 = Panel.class;
      classArray0[0] = class0;
      FileSystemModel.cTypes = classArray0;
      Class class1 = fileSystemModel0.getColumnClass(0);
      assertEquals("class java.awt.Panel", class1.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "b:b";
      stringArray0[1] = "e'N\"vOCl4P";
      stringArray0[2] = "@],8]zu{w_47AH[._K&";
      stringArray0[3] = "Q*pEdDI7<K=";
      stringArray0[4] = "78!H?4wr.Dkh";
      stringArray0[5] = "proxyHost";
      stringArray0[6] = "";
      stringArray0[7] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.isLeaf((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "The SFTP subsystem failed to start";
      stringArray0[1] = "j]|Eq*rV^";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getColumnName(3839);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3839
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getColumnClass((-4213));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4213
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getChildren((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "The SFTP subsystem failed to start";
      stringArray0[1] = "j]|Eq*rV^";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getChildren("j]|Eq*rV^");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.components.filetree.RemoteFileNode
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\"y";
      stringArray0[1] = "$vYE){@gaAqvt&)";
      stringArray0[2] = "Modified";
      stringArray0[3] = "SKO1G$S:+T";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "8";
      stringArray0[7] = "?X<4LnE";
      stringArray0[8] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getChildCount("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.components.filetree.RemoteFileNode
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File[] fileArray0 = new File[2];
      FileFilter fileFilter0 = mock(FileFilter.class, new ViolatedAssumptionAnswer());
      FileSystemModel fileSystemModel0 = null;
      try {
        fileSystemModel0 = new FileSystemModel(fileArray0, fileFilter0, (JFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\"y";
      stringArray0[1] = "\"y";
      stringArray0[2] = "Modified";
      stringArray0[3] = "SKO1G$S:+T";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "8";
      stringArray0[7] = "?X<4LnE";
      stringArray0[8] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      Object object0 = fileSystemModel0.getValueAt("SKO1G$S:+T", 120);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = ColorSpaceHintKey.VALUE_COLORSPACE_AGREY;
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "Modified";
      stringArray0[2] = "?X<4LnE";
      stringArray0[3] = "\"y";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "\"y";
      stringArray0[7] = "SKO1G$S:+T";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getValueAt(object0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to uk.ac.sanger.artemis.components.filetree.RemoteFileNode
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getValueAt((Object) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getValueAt("", 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.components.filetree.RemoteFileNode
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\"y";
      stringArray0[1] = "\"y";
      stringArray0[2] = "Modified";
      stringArray0[3] = "SKO1G$S:+T";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "8";
      stringArray0[7] = "?X<4LnE";
      stringArray0[8] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getChildCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\"y";
      stringArray0[1] = "$vYE){@gaAqvt&)";
      stringArray0[2] = "Modified";
      stringArray0[3] = "SKO1G$S:+T";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "8";
      stringArray0[7] = "?X<4LnE";
      stringArray0[8] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      MockFile mockFile0 = new MockFile("SKO1G$S:+T");
      FileNode fileNode0 = new FileNode(mockFile0);
      // Undeclared exception!
      try { 
        fileSystemModel0.getChild(fileNode0, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      String string0 = fileSystemModel0.getColumnName(0);
      assertEquals("Name", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MockFile mockFile0 = new MockFile((String) null, "4])3P[[|4~w.ZpM({*O");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      FileFilter fileFilter0 = mock(FileFilter.class, new ViolatedAssumptionAnswer());
      FileSystemModel fileSystemModel0 = new FileSystemModel(fileArray0, fileFilter0, (JFrame) null);
      // Undeclared exception!
      try { 
        fileSystemModel0.getChild(fileArray0[1], 1914);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.io.MockFile cannot be cast to uk.ac.sanger.artemis.components.filetree.RemoteFileNode
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MockFile mockFile0 = new MockFile((String) null, "4])3P[[|4~w.ZpM({*O");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      FileFilter fileFilter0 = mock(FileFilter.class, new ViolatedAssumptionAnswer());
      FileSystemModel fileSystemModel0 = new FileSystemModel(fileArray0, fileFilter0, (JFrame) null);
      int int0 = fileSystemModel0.getColumnCount();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      Class class0 = fileSystemModel0.getColumnClass(0);
      assertEquals("interface uk.ac.sanger.artemis.components.filetree.TreeTableModel", class0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "\"y";
      stringArray0[1] = "\"y";
      stringArray0[2] = "Modified";
      stringArray0[3] = "SKO1G$S:+T";
      stringArray0[4] = "";
      stringArray0[5] = "k.Um.0zvJK$KXe";
      stringArray0[6] = "8";
      stringArray0[7] = "?X<4LnE";
      stringArray0[8] = "";
      FileSystemModel fileSystemModel0 = new FileSystemModel(stringArray0, (JFrame) null);
      FileFilter fileFilter0 = fileSystemModel0.getFilter();
      assertNull(fileFilter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemModel fileSystemModel0 = new FileSystemModel((JFrame) null);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      // Undeclared exception!
      try { 
        fileSystemModel0.isLeaf(mockHijrahDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate cannot be cast to javax.swing.tree.TreeNode
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileSystemModel", e);
      }
  }
}
