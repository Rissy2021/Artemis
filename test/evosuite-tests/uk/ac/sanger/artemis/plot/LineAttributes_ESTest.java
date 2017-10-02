/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 05:30:13 GMT 2017
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.SystemColor;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.Plot;
import uk.ac.sanger.artemis.plot.LineAttributes;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LineAttributes_ESTest extends LineAttributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = new LineAttributes[5];
      // Undeclared exception!
      try { 
        LineAttributes.configurePlots(0, lineAttributesArray0, (Plot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineAttributes.parse("C{wNK<");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"c{wnk<\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.window;
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getGreen());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertNotNull(systemColor0);
      
      LineAttributes lineAttributes0 = new LineAttributes(systemColor0);
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getGreen());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNotNull(lineAttributes0);
      
      lineAttributes0.setStroke((BasicStroke) null);
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getGreen());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      
      BasicStroke basicStroke0 = lineAttributes0.getStroke();
      assertEquals(1, systemColor0.getTransparency());
      assertEquals(255, systemColor0.getGreen());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNull(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineAttributes lineAttributes0 = new LineAttributes((Color) null);
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNull(lineAttributes0.getLabel());
      assertNotNull(lineAttributes0);
      
      Color color0 = lineAttributes0.getLineColour();
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNull(lineAttributes0.getLabel());
      assertNull(color0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Color color0 = Color.green;
      assertEquals(255, color0.getGreen());
      assertEquals((-16711936), color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(1, color0.getTransparency());
      assertEquals(0, color0.getRed());
      assertEquals(0, color0.getBlue());
      assertNotNull(color0);
      
      LineAttributes lineAttributes0 = new LineAttributes(color0);
      assertEquals(255, color0.getGreen());
      assertEquals((-16711936), color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(1, color0.getTransparency());
      assertEquals(0, color0.getRed());
      assertEquals(0, color0.getBlue());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNotNull(lineAttributes0);
      
      Color color1 = lineAttributes0.getLineColour();
      assertEquals(255, color0.getGreen());
      assertEquals((-16711936), color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertEquals(1, color0.getTransparency());
      assertEquals(0, color0.getRed());
      assertEquals(0, color0.getBlue());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertEquals(255, color1.getGreen());
      assertEquals(0, color1.getBlue());
      assertEquals(0, color1.getRed());
      assertEquals((-16711936), color1.getRGB());
      assertEquals(1, color1.getTransparency());
      assertEquals(255, color1.getAlpha());
      assertNotNull(color1);
      assertSame(color0, color1);
      assertSame(color1, color0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.controlHighlight;
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-1), systemColor0.getRGB());
      assertNotNull(systemColor0);
      
      LineAttributes lineAttributes0 = new LineAttributes(systemColor0);
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNull(lineAttributes0.getLabel());
      assertNotNull(lineAttributes0);
      
      Color color0 = lineAttributes0.getLineColour();
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(255, systemColor0.getGreen());
      assertEquals(255, systemColor0.getRed());
      assertEquals(255, systemColor0.getBlue());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-1), systemColor0.getRGB());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNull(lineAttributes0.getLabel());
      assertEquals(255, color0.getRed());
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getGreen());
      assertEquals(255, color0.getBlue());
      assertEquals((-1), color0.getRGB());
      assertEquals(255, color0.getAlpha());
      assertNotNull(color0);
      assertSame(systemColor0, color0);
      assertSame(color0, systemColor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineAttributes.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineAttributes.init((-1671));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Color color0 = Color.gray;
      assertEquals(128, color0.getRed());
      assertEquals(128, color0.getGreen());
      assertEquals((-8355712), color0.getRGB());
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getAlpha());
      assertEquals(128, color0.getBlue());
      assertNotNull(color0);
      
      LineAttributes lineAttributes0 = new LineAttributes(color0);
      assertEquals(128, color0.getRed());
      assertEquals(128, color0.getGreen());
      assertEquals((-8355712), color0.getRGB());
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getAlpha());
      assertEquals(128, color0.getBlue());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNotNull(lineAttributes0);
      
      // Undeclared exception!
      try { 
        lineAttributes0.getLabelWidth((FontMetrics) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.controlText;
      assertEquals(0, systemColor0.getBlue());
      assertEquals(0, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-16777216), systemColor0.getRGB());
      assertEquals(0, systemColor0.getRed());
      assertNotNull(systemColor0);
      
      LineAttributes lineAttributes0 = new LineAttributes(systemColor0);
      assertEquals(0, systemColor0.getBlue());
      assertEquals(0, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-16777216), systemColor0.getRGB());
      assertEquals(0, systemColor0.getRed());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertNotNull(lineAttributes0);
      
      StyleContext styleContext0 = new StyleContext();
      assertNotNull(styleContext0);
      
      Font font0 = styleContext0.getFont("", (-871), 2);
      assertEquals(2.0F, font0.getSize2D(), 0.01F);
      assertEquals("", font0.getName());
      assertEquals(0, font0.getStyle());
      assertTrue(font0.isPlain());
      assertFalse(font0.isItalic());
      assertFalse(font0.hasLayoutAttributes());
      assertEquals(2, font0.getSize());
      assertFalse(font0.isBold());
      assertFalse(font0.isTransformed());
      assertFalse(font0.hasUniformLineMetrics());
      assertNotNull(font0);
      
      FontMetrics fontMetrics0 = styleContext0.getFontMetrics(font0);
      assertEquals(2.0F, font0.getSize2D(), 0.01F);
      assertEquals("", font0.getName());
      assertEquals(0, font0.getStyle());
      assertTrue(font0.isPlain());
      assertFalse(font0.isItalic());
      assertFalse(font0.hasLayoutAttributes());
      assertEquals(2, font0.getSize());
      assertFalse(font0.isBold());
      assertFalse(font0.isTransformed());
      assertFalse(font0.hasUniformLineMetrics());
      assertFalse(fontMetrics0.hasUniformLineMetrics());
      assertEquals(1, fontMetrics0.getMaxDescent());
      assertEquals(2, fontMetrics0.getMaxAscent());
      assertEquals(1, fontMetrics0.getMaxDecent());
      assertNotNull(fontMetrics0);
      
      int int0 = lineAttributes0.getLabelWidth(fontMetrics0);
      assertEquals(0, systemColor0.getBlue());
      assertEquals(0, systemColor0.getGreen());
      assertEquals(255, systemColor0.getAlpha());
      assertEquals(1, systemColor0.getTransparency());
      assertEquals((-16777216), systemColor0.getRGB());
      assertEquals(0, systemColor0.getRed());
      assertNull(lineAttributes0.getLabel());
      assertEquals("Open", lineAttributes0.getPlotType());
      assertEquals(2.0F, font0.getSize2D(), 0.01F);
      assertEquals("", font0.getName());
      assertEquals(0, font0.getStyle());
      assertTrue(font0.isPlain());
      assertFalse(font0.isItalic());
      assertFalse(font0.hasLayoutAttributes());
      assertEquals(2, font0.getSize());
      assertFalse(font0.isBold());
      assertFalse(font0.isTransformed());
      assertFalse(font0.hasUniformLineMetrics());
      assertFalse(fontMetrics0.hasUniformLineMetrics());
      assertEquals(1, fontMetrics0.getMaxDescent());
      assertEquals(2, fontMetrics0.getMaxAscent());
      assertEquals(1, fontMetrics0.getMaxDecent());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = new LineAttributes[0];
      // Undeclared exception!
      try { 
        LineAttributes.configurePlots(107, lineAttributesArray0, (Plot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = new LineAttributes[0];
      // Undeclared exception!
      try { 
        LineAttributes.configurePlots(0, lineAttributesArray0, (Plot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineAttributes.parse("# is immutable");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is immutable not a 24 bit representation of the color
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineAttributes.parse("E+A,Vld|MtCi<B?3ai%");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E+A\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LineAttributes.parse(":");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("uk.ac.sanger.artemis.plot.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = LineAttributes.init(3452);
      assertNotNull(lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = LineAttributes.init(0);
      assertNotNull(lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.window;
      LineAttributes lineAttributes0 = new LineAttributes(systemColor0);
      BasicStroke basicStroke0 = lineAttributes0.getStroke();
      assertEquals("Open", lineAttributes0.getPlotType());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Color color0 = Color.RED;
      LineAttributes lineAttributes0 = new LineAttributes(color0);
      lineAttributes0.setLineColour(color0);
      assertEquals("Open", lineAttributes0.getPlotType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LineAttributes lineAttributes0 = new LineAttributes((Color) null);
      lineAttributes0.setLabel(":");
      lineAttributes0.getLabel();
      assertEquals("Open", lineAttributes0.getPlotType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Color color0 = Color.RED;
      LineAttributes lineAttributes0 = new LineAttributes(color0);
      lineAttributes0.getLineColour();
      assertEquals("Open", lineAttributes0.getPlotType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicStroke[] basicStrokeArray0 = LineAttributes.getStrokes();
      assertNotNull(basicStrokeArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Color color0 = LineAttributes.parse("C3");
      LineAttributes lineAttributes0 = new LineAttributes(color0);
      lineAttributes0.getLabel();
      assertEquals("Open", lineAttributes0.getPlotType());
      assertEquals((-16777021), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Color color0 = LineAttributes.parse("C3");
      LineAttributes lineAttributes0 = new LineAttributes(color0);
      String string0 = lineAttributes0.getPlotType();
      assertEquals("Open", string0);
      assertEquals(195, color0.getBlue());
  }
}
