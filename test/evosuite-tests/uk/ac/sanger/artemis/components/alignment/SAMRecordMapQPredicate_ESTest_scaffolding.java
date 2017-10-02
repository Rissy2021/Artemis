/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 01:23:29 GMT 2017
 */

package uk.ac.sanger.artemis.components.alignment;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SAMRecordMapQPredicate_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.alignment.SAMRecordMapQPredicate"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SAMRecordMapQPredicate_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.samtools.SAMFileReader",
      "net.sf.samtools.SAMFileReader$ValidationStringency",
      "net.sf.samtools.util.StringUtil",
      "net.sf.samtools.SAMTagUtil",
      "net.sf.samtools.util.SortingCollection$Codec",
      "net.sf.samtools.SAMRecordIterator",
      "net.sf.samtools.SAMFileSource",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordMapQPredicate",
      "net.sf.samtools.SAMSequenceRecord",
      "net.sf.samtools.util.AsciiWriter",
      "net.sf.samtools.SAMBinaryTagAndValue",
      "net.sf.samtools.SAMValidationError$Type",
      "net.sf.samtools.util.LineReader",
      "net.sf.samtools.SAMBinaryTagAndUnsignedArrayValue",
      "net.sf.samtools.util.Iso8601Date$1",
      "net.sf.samtools.SAMFileReader$ReaderImplementation",
      "net.sf.samtools.SAMFileWriter",
      "net.sf.samtools.SAMUtils",
      "net.sf.samtools.util.DateParser$InvalidDateException",
      "net.sf.samtools.util.StringLineReader",
      "net.sf.samtools.SAMReadGroupRecord",
      "net.sf.samtools.util.CloseableIterator",
      "net.sf.samtools.SAMFileWriterImpl",
      "net.sf.samtools.SAMTextHeaderCodec$ParsedHeaderLine",
      "net.sf.samtools.seekablestream.SeekableBufferedStream",
      "net.sf.samtools.SAMRecordQueryNameComparator",
      "net.sf.samtools.SAMFileHeader$GroupOrder",
      "net.sf.samtools.SAMException",
      "net.sf.samtools.util.RuntimeEOFException",
      "net.sf.samtools.util.RuntimeIOException",
      "net.sf.samtools.seekablestream.SeekableHTTPStream",
      "net.sf.samtools.SAMFileHeader$SortOrder",
      "net.sf.samtools.SAMProgramRecord",
      "net.sf.samtools.TextTagCodec",
      "net.sf.samtools.SAMRecordCoordinateComparator",
      "net.sf.samtools.seekablestream.SeekableStream",
      "net.sf.samtools.SAMRecordComparator",
      "net.sf.samtools.SAMRecordFactory",
      "net.sf.samtools.Cigar",
      "net.sf.samtools.SAMTextHeaderCodec$HeaderRecordType",
      "net.sf.samtools.SAMFileReader$AssertableIterator",
      "net.sf.samtools.AbstractSAMHeaderRecord",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordPredicate",
      "net.sf.samtools.SAMTextWriter",
      "net.sf.samtools.TextCigarCodec",
      "net.sf.samtools.SAMFileHeader",
      "net.sf.samtools.util.Iso8601Date",
      "net.sf.samtools.BAMFileReader",
      "net.sf.samtools.SAMSequenceDictionary",
      "net.sf.samtools.SAMFormatException",
      "net.sf.samtools.SAMValidationError",
      "net.sf.samtools.SAMTextHeaderCodec$1",
      "net.sf.samtools.SAMTextHeaderCodec",
      "net.sf.samtools.SAMRecord",
      "net.sf.samtools.SAMValidationError$Severity",
      "net.sf.samtools.util.BinaryCodec"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SAMRecordMapQPredicate_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sf.samtools.SAMFileHeader",
      "net.sf.samtools.SAMTextHeaderCodec$HeaderRecordType",
      "net.sf.samtools.SAMTextHeaderCodec",
      "net.sf.samtools.TextTagCodec",
      "net.sf.samtools.util.StringUtil",
      "net.sf.samtools.util.StringLineReader",
      "net.sf.samtools.SAMUtils",
      "net.sf.samtools.SAMRecord",
      "net.sf.samtools.SAMProgramRecord",
      "net.sf.samtools.TextCigarCodec",
      "net.sf.samtools.SAMSequenceRecord",
      "net.sf.samtools.SAMTagUtil",
      "net.sf.samtools.SAMReadGroupRecord",
      "net.sf.samtools.SAMFileWriterImpl",
      "net.sf.samtools.SAMTextWriter",
      "net.sf.samtools.SAMException",
      "net.sf.samtools.SAMFileReader$ValidationStringency"
    );
  }
}
