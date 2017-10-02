/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 02:45:10 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class QualifierChoice_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.QualifierChoice"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(QualifierChoice_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.emboss.jemboss.JembossParams",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.emboss.jemboss.gui.Browser$3",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "org.emboss.jemboss.gui.Browser$6",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.gmod.schema.dao.SequenceDaoI",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.log4j.or.ObjectRenderer",
      "org.gmod.schema.dao.CvDaoI",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.io.BlastEntryInformation",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.components.LogViewer",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.Entry",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.io.MSPcrunchEntryInformation",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.Logger",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.apache.log4j.Priority",
      "org.biojava.bio.BioException",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(QualifierChoice_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "org.emboss.jemboss.gui.Browser",
      "org.emboss.jemboss.JembossParams",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.io.QualifierInfoException"
    );
  }
}
