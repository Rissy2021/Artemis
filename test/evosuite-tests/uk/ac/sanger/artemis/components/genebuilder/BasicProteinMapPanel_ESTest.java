/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 02:05:11 GMT 2017
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.Clipboard;
import org.apache.batik.dom.GenericDocument;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.genebuilder.BasicGeneBuilderFrame;
import uk.ac.sanger.artemis.components.genebuilder.BasicProteinMapPanel;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicProteinMapPanel_ESTest extends BasicProteinMapPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      BasicProteinMapPanel basicProteinMapPanel0 = new BasicProteinMapPanel(genbankStreamFeature0, chadoCanonicalGene0, selection0, (BasicGeneBuilderFrame) null);
      GenericDocument genericDocument0 = new GenericDocument((DocumentType) null, (DOMImplementation) null);
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(genericDocument0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, false);
      // Undeclared exception!
      try { 
        basicProteinMapPanel0.paintComponent(sVGGraphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.BasicProteinMapPanel", e);
      }
  }
}
