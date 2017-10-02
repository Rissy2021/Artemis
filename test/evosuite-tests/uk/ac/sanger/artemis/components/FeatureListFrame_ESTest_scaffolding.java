/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 01:50:39 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FeatureListFrame_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.FeatureListFrame"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FeatureListFrame_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "uk.ac.sanger.artemis.components.EditMenu",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.components.RunMenu",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.RangeVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "uk.ac.sanger.artemis.GotoEvent",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "uk.ac.sanger.artemis.components.ViewMenu",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.MarkerRangeRequesterListener",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.components.SelectionMenu",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "uk.ac.sanger.artemis.components.FeatureListFrame",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.components.GotoMenu",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.apache.log4j.spi.RootLogger",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "uk.ac.sanger.artemis.GotoEventSource",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "org.gmod.schema.dao.CvDaoI",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.Feature",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.components.SelectMenu",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.components.SelectionSubMenu",
      "org.gmod.schema.sequence.Feature",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.util.Document",
      "org.gmod.schema.utils.Rankable",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.SimpleGotoEventSource",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.Logger",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.components.FeatureList",
      "uk.ac.sanger.artemis.components.WriteMenu",
      "org.apache.log4j.Priority",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.components.TextRequesterListener",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FeatureListFrame_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.FeatureListFrame",
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
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.GotoEvent",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "org.emboss.jemboss.JembossParams",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "org.biojava.bio.EmptyAnnotation",
      "org.biojava.bio.Annotation",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.Annotatable",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.symbol.AlphabetManager",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "org.biojava.utils.ListTools$Triplet",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.NameTokenization",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.BioError",
      "org.biojava.bio.seq.RNATools",
      "org.biojava.bio.seq.DNATools",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.MDC",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.components.FeatureList",
      "org.biojava.bio.seq.Feature"
    );
  }
}
