/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 02:56:17 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ShortCut;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShortCut_ESTest extends ShortCut_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JMenu jMenu0 = new JMenu("r", false);
      ShortCut shortCut0 = new ShortCut("r", "r", (KeyStroke) null);
      ShortCut.applyShortCutFromCache("r", jMenu0);
      assertFalse(jMenu0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StyledEditorKit.FontSizeAction styledEditorKit_FontSizeAction0 = new StyledEditorKit.FontSizeAction("Failed to read file ", 0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(styledEditorKit_FontSizeAction0);
      ShortCut shortCut0 = new ShortCut("u.8'-", "Failed to read file ", (KeyStroke) null);
      ShortCut.applyShortCutFromCache("CHARACTER", jRadioButtonMenuItem0);
      assertTrue(jRadioButtonMenuItem0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StyledEditorKit.FontSizeAction styledEditorKit_FontSizeAction0 = new StyledEditorKit.FontSizeAction("Failed to read file ", 0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(styledEditorKit_FontSizeAction0);
      ShortCut.applyShortCutFromCache("Failed to read file ", jRadioButtonMenuItem0);
      assertFalse(jRadioButtonMenuItem0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ShortCut shortCut0 = new ShortCut("u.8'-", "Failed to read file ", (KeyStroke) null);
      ShortCut shortCut1 = new ShortCut("CHARACTER", "u.8'-", (KeyStroke) null);
      assertFalse(shortCut1.equals((Object)shortCut0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke(0, 0, false);
      ShortCut shortCut0 = new ShortCut("_", "_", keyStroke0);
      // Undeclared exception!
      try { 
        ShortCut.applyShortCutFromCache((String) null, (JMenuItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ShortCut", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean boolean0 = ShortCut.usingCache();
      assertTrue(boolean0);
  }
}
