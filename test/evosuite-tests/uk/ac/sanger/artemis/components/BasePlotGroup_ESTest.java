/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 01:30:11 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.Clipboard;
import javax.swing.JPopupMenu;
import org.biojava.bio.symbol.SymbolList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.SimpleGotoEventSource;
import uk.ac.sanger.artemis.components.BasePlotGroup;
import uk.ac.sanger.artemis.io.BioJavaSequence;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePlotGroup_ESTest extends BasePlotGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPopupMenu jPopupMenu0 = new JPopupMenu();
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Selection selection0 = new Selection((Clipboard) null);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      BasePlotGroup basePlotGroup0 = null;
      try {
        basePlotGroup0 = new BasePlotGroup(simpleEntryGroup0, jPopupMenu0, selection0, simpleGotoEventSource0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.BasePlotGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BioJavaSequence bioJavaSequence0 = new BioJavaSequence((SymbolList) null);
      Bases bases0 = new Bases(bioJavaSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      JPopupMenu jPopupMenu0 = new JPopupMenu();
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      BasePlotGroup basePlotGroup0 = null;
      try {
        basePlotGroup0 = new BasePlotGroup(simpleEntryGroup0, jPopupMenu0, (Selection) null, simpleGotoEventSource0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class uk.ac.sanger.artemis.components.BasePlot
         //
         verifyException("uk.ac.sanger.artemis.components.BasePlotGroup", e);
      }
  }
}
