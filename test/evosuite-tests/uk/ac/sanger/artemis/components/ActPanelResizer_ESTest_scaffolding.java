/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 01:07:36 GMT 2017
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ActPanelResizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.ActPanelResizer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActPanelResizer_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "com.ibatis.common.jdbc.SimpleDataSource$SimplePooledConnection",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "net.sf.cglib.core.KeyFactory$Generator",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "org.biojava.utils.ListTools$Triplet",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "org.biojava.bio.symbol.DoubleAlphabet$SubDoubleAlphabet",
      "uk.ac.sanger.artemis.Selectable",
      "net.sf.cglib.core.CodeEmitter$State",
      "org.biojava.bio.seq.io.NameTokenization",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.core.AbstractClassGenerator",
      "org.biojava.bio.seq.Feature$Template",
      "com.ibatis.common.beans.BaseProbe",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.gmod.schema.sequence.Synonym",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.gmod.schema.sequence.FeatureCvTermProp",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "com.ibatis.common.util.PaginatedList",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "net.sf.cglib.core.ReflectUtils",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "org.biojava.bio.symbol.DoubleAlphabet$DoubleRange",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.biojava.bio.symbol.AbstractTranslationTable",
      "org.gmod.schema.dao.GeneralDaoI",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "net.sf.cglib.core.LocalVariablesSorter",
      "org.apache.log4j.helpers.OptionConverter",
      "org.gmod.schema.dao.BaseDaoI",
      "com.ibatis.sqlmap.client.SqlMapExecutor",
      "org.biojava.bio.symbol.Edit",
      "com.ibatis.sqlmap.client.SqlMapException",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "org.biojava.bio.symbol.AbstractSymbol",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.symbol.IntegerAlphabet$IntegerSymbol",
      "org.biojava.utils.lsid.LifeScienceIdentifierParseException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.utils.ListTools$Mapper",
      "org.biojava.bio.seq.io.StreamParser",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.biojava.bio.symbol.SimpleSymbol",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.gmod.schema.sequence.FeatureDbXRef",
      "net.sf.cglib.core.ClassInfo",
      "org.biojava.utils.ChangeEvent",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "net.sf.cglib.core.ClassEmitter$3",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.Predicate",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "net.sf.cglib.core.ClassEmitter",
      "uk.ac.sanger.artemis.components.Plot",
      "org.biojava.bio.seq.DNATools",
      "org.gmod.schema.sequence.FeatureCvTermDbXRef",
      "org.biojava.bio.symbol.AbstractManyToOneTranslationTable",
      "uk.ac.sanger.artemis.components.MultiComparator$4",
      "uk.ac.sanger.artemis.EntrySource",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "net.sf.cglib.core.ClassNameReader",
      "com.ibatis.sqlmap.engine.cache.CacheController",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "org.biojava.bio.BioRuntimeException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.BaseTagHandler",
      "net.sf.cglib.core.Local",
      "org.biojava.bio.symbol.IntegerAlphabet$SubIntegerAlphabet",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "net.sf.cglib.beans.BulkBean$Generator",
      "org.gmod.schema.cv.Cv",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "com.ibatis.sqlmap.engine.exchange.DataExchange",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlChild",
      "org.biojava.utils.SingletonList",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "net.sf.cglib.asm.AnnotationVisitor",
      "com.ibatis.sqlmap.engine.exchange.JavaBeanDataExchange",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory$1",
      "com.ibatis.sqlmap.engine.builder.xml.XMLSqlSource",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "net.sf.cglib.asm.FieldVisitor",
      "com.ibatis.sqlmap.engine.exchange.BaseDataExchange",
      "net.sf.cglib.asm.MethodVisitor",
      "net.sf.cglib.asm.ClassVisitor",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "uk.ac.sanger.artemis.components.EditMenu",
      "com.ibatis.sqlmap.client.SqlMapClient",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "org.biojava.bio.symbol.BasisSymbol",
      "com.ibatis.sqlmap.engine.transaction.Transaction",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "org.biojava.bio.seq.RNATools",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "uk.ac.sanger.artemis.chado.Graph",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "org.biojava.bio.seq.io.WordTokenization",
      "com.ibatis.common.beans.GenericProbe",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.GeneratorStrategy",
      "org.apache.log4j.helpers.Loader",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.components.SelectionMenu",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "net.sf.cglib.core.EmitUtils",
      "org.biojava.bio.seq.GappedSequence",
      "org.apache.log4j.MDC",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "net.sf.cglib.core.TypeUtils",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.Symbol",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "net.sf.cglib.beans.BulkBeanException",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "org.biojava.utils.ListTools",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "org.gmod.schema.dao.CvDaoI",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandler",
      "uk.ac.sanger.artemis.circular.TextFieldSink",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "net.sf.cglib.core.Signature",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.seq.Sequence",
      "com.ibatis.sqlmap.engine.mapping.result.Discriminator",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "net.sf.cglib.beans.BulkBean$BulkBeanKey",
      "uk.ac.sanger.artemis.components.MultiComparator",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "uk.ac.sanger.artemis.io.Range",
      "net.sf.cglib.asm.Frame",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "org.biojava.bio.EmptyAnnotation",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "uk.ac.sanger.artemis.circular.TextFieldFloat",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "com.ibatis.sqlmap.client.event.RowHandler",
      "org.biojava.bio.symbol.AlphabetManager",
      "uk.ac.sanger.artemis.Selection",
      "org.biojava.bio.seq.FeatureRealizer",
      "net.sf.cglib.core.ProcessArrayCallback",
      "org.biojava.bio.symbol.SparseCrossProductAlphabet",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "uk.ac.sanger.artemis.components.ActPanelResizer",
      "net.sf.cglib.asm.ClassReader",
      "org.apache.log4j.spi.LoggerRepository",
      "com.ibatis.common.beans.ProbeException",
      "uk.ac.sanger.artemis.components.Splash",
      "com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "com.ibatis.common.beans.Probe",
      "net.sf.cglib.core.Transformer",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "com.ibatis.sqlmap.engine.scope.StatementScope",
      "uk.ac.sanger.artemis.components.AddMenu",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.components.RunMenu",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.AbstractReversibleTranslationTable",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "org.biojava.utils.ChangeListener",
      "uk.ac.sanger.artemis.components.BasePlot",
      "org.biojava.utils.AbstractChangeable",
      "org.gmod.schema.sequence.FeaturePub",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "com.ibatis.sqlmap.client.SqlMapTransactionManager",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "uk.ac.sanger.artemis.components.ViewMenu",
      "org.gmod.schema.analysis.AnalysisFeature",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTag",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.gmod.schema.sequence.FeatureRelationship",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "org.postgresql.util.PSQLException",
      "net.sf.cglib.beans.BulkBean",
      "com.ibatis.common.logging.Log",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.utils.lsid.Identifiable",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "net.sf.cglib.core.ClassGenerator",
      "net.sf.cglib.core.ReflectUtils$4",
      "uk.ac.sanger.artemis.components.GotoMenu",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "net.sf.cglib.core.ReflectUtils$3",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "uk.ac.sanger.artemis.io.Location",
      "org.biojava.utils.stax.StAXContentHandler",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "org.biojava.utils.ChangeForwarder",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.biojava.bio.symbol.GappedSymbolList",
      "uk.ac.sanger.artemis.components.GraphMenu",
      "com.ibatis.sqlmap.engine.accessplan.MapAccessPlan",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.components.SelectMenu",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.apache.log4j.spi.LoggerFactory",
      "org.biojava.bio.symbol.DoubleAlphabet$DoubleSymbol",
      "org.apache.log4j.spi.Configurator",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "net.sf.cglib.core.CodeEmitter",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.gmod.schema.sequence.FeatureCvTermPub",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "com.ibatis.sqlmap.engine.mapping.sql.Sql",
      "uk.ac.sanger.artemis.components.EntryGroupMenu",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.common.beans.ClassInfo",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "com.ibatis.sqlmap.engine.config.SqlSource",
      "org.biojava.bio.seq.FeatureHolder",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.gmod.schema.dao.OrganismDaoI",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "net.sf.cglib.asm.ClassWriter",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "com.ibatis.common.resources.Resources",
      "org.biojava.utils.Unchangeable",
      "uk.ac.sanger.artemis.components.WriteMenu",
      "org.apache.log4j.Priority",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.biojava.bio.symbol.AlphabetIndex",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "org.apache.log4j.or.RendererMap",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "uk.ac.sanger.artemis.ExternalProgram",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateContext",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.gmod.schema.pub.PubDbXRef",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.Entry",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.HashedAlphabetIndex",
      "net.sf.cglib.core.Customizer",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "com.ibatis.sqlmap.engine.type.TypeHandler",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "org.biojava.bio.symbol.TranslationTable",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "org.biojava.bio.symbol.CrossProductAlphabetIndex",
      "com.ibatis.sqlmap.engine.execution.BatchException",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.apache.log4j.ProvisionNode",
      "org.biojava.bio.symbol.AbstractSymbolList$EditTranslater",
      "com.ibatis.sqlmap.engine.mapping.result.ResultObjectFactory",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.biojava.bio.symbol.AtomicSymbol",
      "org.biojava.bio.dist.Distribution",
      "org.apache.log4j.spi.RootLogger",
      "org.biojava.bio.BioError",
      "com.ibatis.common.beans.Invoker",
      "net.sf.cglib.asm.Type",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "net.sf.cglib.core.MethodInfo",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "net.sf.cglib.core.Block",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlText",
      "net.sf.cglib.asm.Opcodes",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagContext",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.mapping.statement.RowHandlerCallback",
      "org.postgresql.Driver",
      "uk.ac.sanger.artemis.GotoEventSource",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicParent",
      "org.biojava.bio.seq.StrandedFeature$Strand",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.biojava.bio.symbol.AlphabetManager$1",
      "org.apache.log4j.Logger",
      "com.ibatis.sqlmap.engine.mapping.statement.ExecuteListener",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.symbol.ManyToOneTranslationTable",
      "com.ibatis.sqlmap.engine.transaction.TransactionException",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "org.apache.log4j.spi.RepositorySelector",
      "org.biojava.utils.ListTools$SeriesList",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "net.sf.cglib.core.NamingPolicy",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.bio.symbol.ReversibleTranslationTable",
      "uk.ac.sanger.artemis.io.Entry",
      "net.sf.cglib.asm.Item",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "com.ibatis.common.jdbc.exception.NestedSQLException",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlan",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "net.sf.cglib.asm.MethodAdapter",
      "org.biojava.bio.symbol.LinearAlphabetIndex",
      "com.ibatis.sqlmap.client.extensions.TypeHandlerCallback",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.gmod.schema.organism.Organism",
      "org.gmod.schema.general.Db",
      "com.ibatis.sqlmap.engine.config.CacheModelConfig",
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "org.apache.log4j.Appender",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "uk.ac.sanger.artemis.ComparisonData",
      "org.biojava.bio.symbol.Alphabet",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "org.biojava.bio.symbol.AbstractSymbolList$EditScreener",
      "uk.ac.sanger.artemis.components.AlignmentViewer",
      "net.sf.cglib.core.CodeGenerationException",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.Logger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.client.SqlMapSession",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "net.sf.cglib.asm.Label",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActPanelResizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.ActPanelResizer",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
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
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "org.apache.log4j.MDC",
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
      "net.sf.cglib.beans.BulkBean$Generator",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.components.MultiComparator",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.EntryChangeEvent",
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
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeListener",
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
      "org.biojava.bio.symbol.SimpleSymbolList",
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
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "com.ibatis.sqlmap.engine.builder.xml.XMLSqlSource",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMapping",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "com.ibatis.common.beans.ProbeException",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "net.sf.cglib.beans.BulkBeanException",
      "com.ibatis.common.xml.NodeletException",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.sequence.Marker",
      "uk.ac.sanger.artemis.ComparisonDataParseException",
      "org.gmod.schema.sequence.Feature",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.FeatureSegment"
    );
  }
}
