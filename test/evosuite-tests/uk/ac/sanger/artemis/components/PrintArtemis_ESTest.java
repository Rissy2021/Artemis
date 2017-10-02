/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 02:43:13 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.GenericDocument;
import org.apache.batik.dom.GenericDocumentType;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementation;
import uk.ac.sanger.artemis.components.EntryEdit;
import uk.ac.sanger.artemis.components.PrintArtemis;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintArtemis_ESTest extends PrintArtemis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrintArtemis printArtemis0 = new PrintArtemis((EntryEdit) null);
      // Undeclared exception!
      try { 
        printArtemis0.printPreview();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = PrintArtemis.getImageFormats();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrintArtemis printArtemis0 = new PrintArtemis((EntryEdit) null);
      GenericDocumentType genericDocumentType0 = new GenericDocumentType("JL5", "JL5", "JL5");
      DOMImplementation dOMImplementation0 = GenericDOMImplementation.getDOMImplementation();
      GenericDocument genericDocument0 = new GenericDocument(genericDocumentType0, dOMImplementation0);
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(genericDocument0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, false);
      // Undeclared exception!
      try { 
        printArtemis0.paintComponent(sVGGraphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.PrintArtemis", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PrintArtemis printArtemis0 = new PrintArtemis((EntryEdit) null);
      // Undeclared exception!
      try { 
        printArtemis0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.PrintArtemis", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PrintArtemis printArtemis0 = new PrintArtemis((EntryEdit) null);
      PageFormat pageFormat0 = new PageFormat();
      // Undeclared exception!
      try { 
        printArtemis0.print((Graphics) null, pageFormat0, 2386);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.PrintArtemis", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PrintArtemis printArtemis0 = new PrintArtemis((EntryEdit) null);
          // Undeclared exception!
          try { 
            printArtemis0.doPrintActions();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"queuePrintJob\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkPrintJobAccess(SecurityManager.java:1378)
             // java.awt.print.PrinterJob.getPrinterJob(PrinterJob.java:75)
             // uk.ac.sanger.artemis.components.PrintArtemis.doPrintActions(PrintArtemis.java:635)
             // sun.reflect.GeneratedMethodAccessor80.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
