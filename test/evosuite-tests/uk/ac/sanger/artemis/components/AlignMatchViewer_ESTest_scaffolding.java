/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 01:07:37 GMT 2017
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
public class AlignMatchViewer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.AlignMatchViewer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AlignMatchViewer_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "com.sshtools.j2ssh.SshClient",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.GotoEvent",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.emboss.jemboss.JembossParams",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.seq.Feature$Template",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.io.DocumentEntryFactory",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.emboss.jemboss.gui.Browser$3",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.components.AlignmentListener",
      "org.emboss.jemboss.gui.Browser$6",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.biojava.bio.Annotation",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.AlignmentSelectionChangeListener",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "com.sshtools.j2ssh.FileTransferProgress",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "uk.ac.sanger.artemis.components.Plot",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.AlignMatchVector",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "uk.ac.sanger.artemis.ComparisonDataParseException",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "uk.ac.sanger.artemis.FeatureVector",
      "org.biojava.bio.seq.io.SequenceBuilderBase",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "org.biojava.bio.seq.FeatureHolder",
      "uk.ac.sanger.artemis.components.AlignmentViewer$ColorChooserShades",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.components.AlignMatchViewer",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.sshtools.j2ssh.SshException",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.bio.symbol.SymbolList",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "org.biojava.bio.BioException",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.biojava.bio.symbol.EmptySymbolList",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.apache.log4j.helpers.Loader",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.biojava.bio.BioError",
      "org.apache.log4j.spi.ErrorHandler",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "org.biojava.bio.symbol.Symbol",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.GotoEventSource",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "org.gmod.schema.dao.CvDaoI",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.ReadListener",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.seq.Sequence",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.biojava.bio.seq.io.SequenceBuilder",
      "uk.ac.sanger.artemis.AlignMatch",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.biojava.bio.EmptyAnnotation",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.biojava.bio.seq.io.ParseException",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.ComparisonData",
      "org.biojava.bio.symbol.Alphabet",
      "uk.ac.sanger.artemis.components.AlignmentViewer",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.Logger",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.components.FeatureList",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.apache.log4j.spi.LoggerRepository",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AlignMatchViewer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.AlignMatchViewer",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.util.FastVector",
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
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.components.AlignmentViewer",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.ComparisonDataParseException",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.GotoEvent",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.io.DocumentEntryFactory",
      "org.emboss.jemboss.JembossParams",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.components.FeatureList",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.biojava.bio.seq.io.SequenceBuilderBase"
    );
  }
}
