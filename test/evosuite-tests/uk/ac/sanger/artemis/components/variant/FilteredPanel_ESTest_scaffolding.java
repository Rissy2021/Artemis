/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 03:08:16 GMT 2017
 */

package uk.ac.sanger.artemis.components.variant;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FilteredPanel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.variant.FilteredPanel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FilteredPanel_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel",
      "com.ibatis.common.jdbc.SimpleDataSource$SimplePooledConnection",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.apache.log4j.AppenderSkeleton",
      "com.ibatis.sqlmap.client.extensions.ParameterSetter",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.components.EntryEdit$CommitButton",
      "uk.ac.sanger.artemis.components.variant.VCFview$27",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "net.sf.cglib.core.KeyFactory$Generator",
      "uk.ac.sanger.artemis.components.variant.VCFview",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "net.sf.cglib.core.CodeEmitter$State",
      "org.apache.log4j.spi.Filter",
      "net.sf.samtools.FileTruncatedException",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$EmptyPairwiseAlignment",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "net.sf.cglib.core.Constants",
      "org.emboss.jemboss.JembossParams",
      "net.sf.samtools.SAMException",
      "net.sf.cglib.core.AbstractClassGenerator",
      "com.ibatis.common.beans.BaseProbe",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "org.gmod.schema.sequence.Synonym",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.gmod.schema.sequence.FeatureCvTermProp",
      "uk.ac.sanger.artemis.components.genebuilder.gff.RemoveButton",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.log4j.Hierarchy",
      "net.sf.samtools.seekablestream.SeekableStream",
      "org.emboss.jemboss.gui.Browser$3",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.emboss.jemboss.gui.Browser$4",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "org.emboss.jemboss.gui.Browser$6",
      "net.sf.cglib.asm.MethodWriter",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "com.ibatis.common.util.PaginatedList",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "org.apache.log4j.spi.OptionHandler",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.biojava.bio.seq.StrandedFeature",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "net.sf.cglib.core.ReflectUtils",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "uk.ac.sanger.artemis.components.variant.VCFRecord",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "net.sf.cglib.core.LocalVariablesSorter",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "com.ibatis.sqlmap.client.SqlMapExecutor",
      "com.ibatis.sqlmap.client.SqlMapException",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.circular.TextFieldInt",
      "uk.ac.sanger.artemis.editor.MultiLineToolTipUI",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.util.FastVector",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory$1",
      "org.gmod.schema.sequence.FeatureDbXRef",
      "net.sf.cglib.core.ClassInfo",
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
      "uk.ac.sanger.artemis.util.URLDocument",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "net.sf.cglib.core.ClassEmitter$3",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$7",
      "org.biojava.bio.molbio.RestrictionMapper",
      "net.sf.cglib.core.Predicate",
      "uk.ac.sanger.artemis.components.alignment.BamView$41",
      "net.sf.cglib.core.ClassEmitter",
      "uk.ac.sanger.artemis.components.Plot",
      "org.gmod.schema.sequence.FeatureCvTermDbXRef",
      "org.apache.log4j.varia.StringMatchFilter",
      "uk.ac.sanger.artemis.EntrySource",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "net.sf.cglib.core.ClassNameReader",
      "uk.ac.sanger.artemis.components.alignment.BamView$47",
      "com.ibatis.sqlmap.engine.cache.CacheController",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "org.biojava.bio.molbio.RestrictionEnzyme",
      "net.sf.cglib.core.ClassNameReader$1",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "org.apache.log4j.HTMLLayout",
      "net.sf.cglib.core.Local",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "org.gmod.schema.cv.Cv",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "net.sf.samtools.seekablestream.SeekableFileStream",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "com.ibatis.sqlmap.engine.exchange.DataExchange",
      "uk.ac.sanger.artemis.util.PushBackException",
      "org.biojava.utils.ParseErrorListener",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "net.sf.cglib.asm.AnnotationVisitor",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "net.sf.cglib.asm.FieldVisitor",
      "com.ibatis.sqlmap.engine.exchange.BaseDataExchange",
      "net.sf.cglib.asm.MethodVisitor",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "net.sf.cglib.asm.ClassVisitor",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.components.EditMenu",
      "com.ibatis.sqlmap.client.SqlMapClient",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "com.ibatis.sqlmap.engine.transaction.Transaction",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "uk.ac.sanger.artemis.chado.Graph",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "com.ibatis.common.beans.GenericProbe",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.biojava.bio.taxa.Taxon",
      "uk.ac.sanger.artemis.components.MarkerRangeRequesterListener",
      "net.sf.cglib.core.KeyFactory",
      "uk.ac.sanger.artemis.components.alignment.BamFrame",
      "net.sf.cglib.core.GeneratorStrategy",
      "org.apache.log4j.helpers.Loader",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.SelectionMenu",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.components.variant.FilteredPanel",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "net.sf.cglib.core.EmitUtils",
      "org.biojava.bio.symbol.Alignment",
      "net.sf.cglib.core.CollectionUtils",
      "uk.ac.sanger.artemis.components.alignment.SAMRecordPredicate",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "net.sf.cglib.core.TypeUtils",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.components.alignment.CoveragePanel",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "uk.ac.sanger.artemis.components.genebuilder.gff.AddButton",
      "uk.ac.sanger.artemis.components.alignment.LookSeqPanel$13",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.components.variant.HeaderLine",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.util.FTPSeekableStream",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.circular.TextFieldSink",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "net.sf.cglib.core.Signature",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "net.sf.cglib.asm.ByteVector",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.seq.Sequence",
      "com.ibatis.sqlmap.engine.mapping.result.Discriminator",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "net.sf.cglib.beans.BulkBean$BulkBeanKey",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "uk.ac.sanger.artemis.io.Range",
      "net.sf.cglib.asm.Frame",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "org.biojava.bio.program.phred.PhredFormat",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "org.biojava.bio.seq.io.ParseException",
      "com.ibatis.sqlmap.client.event.RowHandler",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "org.biojava.bio.seq.io.SequenceFormat",
      "net.sf.cglib.core.ProcessArrayCallback",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.components.SelectionInfoDisplay",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "net.sf.samtools.util.BlockCompressedInputStream",
      "net.sf.cglib.asm.ClassReader",
      "org.apache.log4j.spi.LoggerRepository",
      "com.ibatis.common.beans.ProbeException",
      "uk.ac.sanger.artemis.components.Splash",
      "com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient",
      "uk.ac.sanger.artemis.components.TextRequesterListener",
      "org.biojava.bio.taxa.EbiFormat",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "com.ibatis.common.beans.Probe",
      "net.sf.cglib.core.Transformer",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "com.ibatis.sqlmap.engine.scope.StatementScope",
      "uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton",
      "uk.ac.sanger.artemis.components.AddMenu",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.components.RunMenu",
      "uk.ac.sanger.artemis.components.EntryGroupDisplay$3",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "net.sf.samtools.util.CloseableIterator",
      "net.sf.cglib.asm.FieldWriter",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "net.sf.samtools.seekablestream.SeekableBufferedStream",
      "uk.ac.sanger.artemis.components.BasePlot",
      "org.gmod.schema.sequence.FeaturePub",
      "org.apache.log4j.Layout",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "com.ibatis.sqlmap.client.SqlMapTransactionManager",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "uk.ac.sanger.artemis.components.variant.BCFReader$BCFReaderIterator",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "net.sf.samtools.util.RuntimeIOException",
      "uk.ac.sanger.artemis.components.ViewMenu",
      "org.gmod.schema.analysis.AnalysisFeature",
      "uk.ac.sanger.artemis.components.StickyFileChooser",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "org.gmod.schema.dao.SchemaDaoI",
      "net.sf.samtools.util.BlockCompressedInputStream$FileTermination",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.gmod.schema.sequence.FeatureRelationship",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "org.postgresql.util.PSQLException",
      "net.sf.cglib.beans.BulkBean",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "com.ibatis.common.logging.Log",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "net.sf.cglib.core.ClassGenerator",
      "org.emboss.jemboss.gui.Browser",
      "net.sf.cglib.core.ReflectUtils$4",
      "uk.ac.sanger.artemis.components.GotoMenu",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils$3",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.components.EntryGroupDisplay",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.biojava.bio.seq.SequenceAnnotator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "com.ibatis.common.io.ReaderInputStream",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "uk.ac.sanger.artemis.components.GraphMenu",
      "com.ibatis.sqlmap.engine.accessplan.MapAccessPlan",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.components.SelectMenu",
      "com.ibatis.sqlmap.client.extensions.ResultGetter",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.plot.UserDataAlgorithm",
      "org.biojava.bio.taxa.TaxonParser",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "net.sf.cglib.core.CodeEmitter",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "uk.ac.sanger.artemis.components.SelectionSubMenu",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.apache.log4j.PropertyWatchdog",
      "org.gmod.schema.sequence.FeatureProp",
      "org.gmod.schema.sequence.FeatureCvTermPub",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "org.biojava.utils.ParseErrorEvent",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "com.ibatis.sqlmap.engine.mapping.sql.Sql",
      "uk.ac.sanger.artemis.components.EntryGroupMenu",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.common.beans.ClassInfo",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "com.ibatis.sqlmap.engine.config.SqlSource",
      "org.biojava.bio.seq.FeatureHolder",
      "net.sf.cglib.asm.Edge",
      "org.gmod.schema.dao.OrganismDaoI",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "net.sf.cglib.asm.ClassWriter",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "com.ibatis.common.resources.Resources",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.components.WriteMenu",
      "uk.ac.sanger.artemis.components.IndexReferenceListener",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "uk.ac.sanger.artemis.components.alignment.SnpPanel",
      "com.ibatis.common.logging.jakarta.JakartaCommonsLoggingImpl",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.biojava.bio.symbol.EmptySymbolList",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.postgresql.core.Logger",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.components.variant.RecordFilter",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.gmod.schema.pub.PubDbXRef",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.Entry",
      "net.sf.cglib.core.Customizer",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "com.ibatis.sqlmap.engine.type.TypeHandler",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "com.ibatis.sqlmap.engine.execution.BatchException",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "com.ibatis.sqlmap.engine.mapping.result.ResultObjectFactory",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.biojava.bio.BioError",
      "com.ibatis.common.beans.Invoker",
      "net.sf.cglib.asm.Type",
      "org.apache.log4j.spi.ErrorHandler",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "net.sf.cglib.core.MethodInfo",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.components.alignment.BamView$Ruler",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "net.sf.cglib.core.Block",
      "net.sf.cglib.asm.Opcodes",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.mapping.statement.RowHandlerCallback",
      "org.postgresql.Driver",
      "org.biojava.bio.taxa.TaxonFactory",
      "uk.ac.sanger.artemis.GotoEventSource",
      "org.apache.commons.net.ftp.FTPConnectionClosedException",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "org.biojava.bio.seq.StrandedFeature$Strand",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "uk.ac.sanger.artemis.components.SequenceComboBox",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "com.ibatis.sqlmap.engine.mapping.statement.ExecuteListener",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "com.ibatis.sqlmap.engine.transaction.TransactionException",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder$1",
      "uk.ac.sanger.artemis.components.EntryEdit$8",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.components.EntryEdit$7",
      "uk.ac.sanger.artemis.components.alignment.LookSeqPanel",
      "net.sf.cglib.core.NamingPolicy",
      "uk.ac.sanger.artemis.components.variant.GraphPanel",
      "uk.ac.sanger.artemis.io.Entry",
      "net.sf.cglib.asm.Item",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.biojava.utils.ParseErrorSource",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "com.ibatis.common.jdbc.exception.NestedSQLException",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlan",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "uk.ac.sanger.artemis.components.alignment.BamView",
      "net.sf.cglib.asm.MethodAdapter",
      "net.sf.samtools.seekablestream.SeekableHTTPStream",
      "org.biojava.bio.taxa.CircularReferenceException",
      "com.ibatis.sqlmap.client.extensions.TypeHandlerCallback",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.gmod.schema.organism.Organism",
      "org.gmod.schema.general.Db",
      "com.ibatis.sqlmap.engine.config.CacheModelConfig",
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "org.apache.log4j.Appender",
      "org.biojava.bio.symbol.Alphabet",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "net.sf.cglib.core.CodeGenerationException",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.Logger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.client.SqlMapSession",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.components.EntryEdit",
      "uk.ac.sanger.artemis.components.FeatureList",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "net.sf.cglib.asm.Label",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FilteredPanel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.variant.FilteredPanel",
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
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "net.sf.samtools.util.BlockCompressedInputStream",
      "net.sf.samtools.seekablestream.SeekableFileStream",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.emboss.jemboss.JembossParams",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.LineGroup",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.components.variant.HeaderLine",
      "org.biojava.bio.taxa.EbiFormat",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.apache.log4j.Layout",
      "org.apache.log4j.HTMLLayout",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "org.biojava.bio.molbio.RestrictionMapper",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "uk.ac.sanger.artemis.components.EntryEdit",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.bio.program.phred.PhredFormat",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "com.ibatis.common.resources.Resources",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "com.ibatis.common.beans.GenericProbe",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "com.ibatis.common.logging.LogFactory",
      "org.apache.commons.logging.impl.Log4JLogger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.common.beans.ClassInfo",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.postgresql.Driver",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "net.sf.cglib.core.TypeUtils",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.asm.Frame",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.beans.BulkBean",
      "org.apache.log4j.spi.Filter",
      "org.apache.log4j.varia.StringMatchFilter"
    );
  }
}
