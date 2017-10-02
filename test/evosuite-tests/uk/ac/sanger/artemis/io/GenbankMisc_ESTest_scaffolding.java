/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 04:16:25 GMT 2017
 */

package uk.ac.sanger.artemis.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class GenbankMisc_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.io.GenbankMisc"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GenbankMisc_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "com.ibatis.common.jdbc.SimpleDataSource$SimplePooledConnection",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "com.ibatis.sqlmap.client.extensions.ParameterSetter",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "net.sf.cglib.core.KeyFactory$Generator",
      "com.sshtools.j2ssh.SshClient",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "net.sf.cglib.core.CodeEmitter$State",
      "org.biojava.bio.seq.io.NameTokenization",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "net.sf.cglib.core.Constants",
      "uk.ac.sanger.artemis.util.StringVector",
      "net.sf.cglib.core.AbstractClassGenerator",
      "com.ibatis.common.beans.BaseProbe",
      "com.sshtools.j2ssh.transport.AsyncService",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "org.gmod.schema.sequence.Synonym",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.gmod.schema.sequence.FeatureCvTermProp",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.biojava.utils.Changeable",
      "net.sf.cglib.asm.MethodWriter",
      "com.ibatis.common.util.PaginatedList",
      "com.sshtools.j2ssh.connection.Channel",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "net.sf.cglib.core.ReflectUtils",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "org.gmod.schema.dao.GeneralDaoI",
      "com.ibatis.sqlmap.engine.exchange.DataExchangeFactory",
      "net.sf.cglib.core.LocalVariablesSorter",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "com.ibatis.sqlmap.client.SqlMapExecutor",
      "com.ibatis.sqlmap.client.SqlMapException",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterThanTagHandler",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEqualTagHandler",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
      "org.biojava.bio.Annotation",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolClient",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.bio.seq.io.StreamParser",
      "uk.ac.sanger.artemis.util.FastVector",
      "com.ibatis.common.beans.ComplexBeanProbe",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory$1",
      "com.sshtools.j2ssh.transport.TransportProtocolEventHandler",
      "org.gmod.schema.sequence.FeatureDbXRef",
      "net.sf.cglib.core.ClassInfo",
      "org.gmod.schema.pub.Pub",
      "net.sf.cglib.core.ClassEmitter$3",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.Predicate",
      "net.sf.cglib.core.ClassEmitter",
      "org.gmod.schema.sequence.FeatureCvTermDbXRef",
      "com.sshtools.j2ssh.transport.TransportProtocolState",
      "net.sf.cglib.core.ClassNameReader",
      "com.sshtools.j2ssh.connection.ChannelInputStream",
      "org.biojava.bio.seq.io.ProteinRefSeqFileFormer",
      "com.ibatis.sqlmap.engine.cache.CacheController",
      "net.sf.cglib.core.ClassNameReader$1",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.BaseTagHandler",
      "net.sf.cglib.core.Local",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.sshtools.j2ssh.SshException",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "net.sf.cglib.beans.BulkBean$Generator",
      "org.gmod.schema.cv.Cv",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "uk.ac.sanger.artemis.util.PushBackException",
      "com.ibatis.sqlmap.engine.exchange.DataExchange",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlChild",
      "org.biojava.utils.ParseErrorListener",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicTagHandler",
      "com.sshtools.j2ssh.connection.IOChannel",
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
      "com.sshtools.j2ssh.connection.SshMsgChannelData",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotPropertyAvailableTagHandler",
      "org.biojava.bio.seq.io.AbstractGenEmblFileFormer",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessThanTagHandler",
      "com.ibatis.sqlmap.client.SqlMapClient",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "org.biojava.bio.seq.io.GenbankXmlFormat",
      "uk.ac.sanger.artemis.io.Key",
      "org.biojava.bio.symbol.BasisSymbol",
      "com.ibatis.sqlmap.engine.transaction.Transaction",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "com.sshtools.j2ssh.connection.ChannelFactory",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "uk.ac.sanger.artemis.chado.Graph",
      "org.biojava.bio.seq.io.WordTokenization",
      "com.ibatis.common.beans.GenericProbe",
      "uk.ac.sanger.artemis.ChangeListener",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.GeneratorStrategy",
      "org.apache.log4j.helpers.Loader",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "org.apache.log4j.helpers.FileWatchdog",
      "net.sf.cglib.core.EmitUtils",
      "org.apache.log4j.MDC",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "com.sshtools.j2ssh.sftp.MessageRequestId",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "org.biojava.bio.symbol.Symbol",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotParameterPresentTagHandler",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "net.sf.cglib.beans.BulkBeanException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "org.gmod.schema.dao.CvDaoI",
      "com.ibatis.common.xml.NodeletException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandler",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "net.sf.cglib.core.Signature",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "net.sf.cglib.asm.ByteVector",
      "org.biojava.bio.seq.Sequence",
      "com.ibatis.sqlmap.engine.mapping.result.Discriminator",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "net.sf.cglib.beans.BulkBean$BulkBeanKey",
      "com.sshtools.j2ssh.transport.MessageNotAvailableException",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "uk.ac.sanger.artemis.io.Range",
      "net.sf.cglib.asm.Frame",
      "uk.ac.sanger.artemis.sequence.Bases",
      "com.sshtools.j2ssh.transport.SshMessage",
      "com.sshtools.j2ssh.util.State",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.biojava.bio.program.phred.PhredFormat",
      "org.biojava.bio.EmptyAnnotation",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessEqualTagHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "com.ibatis.sqlmap.client.event.RowHandler",
      "org.biojava.bio.seq.io.ParseException",
      "net.sf.cglib.core.ProcessArrayCallback",
      "org.biojava.bio.seq.io.SequenceFormat",
      "com.sshtools.j2ssh.connection.SshMsgGlobalRequest",
      "net.sf.cglib.asm.ClassReader",
      "org.apache.log4j.spi.LoggerRepository",
      "com.ibatis.common.beans.ProbeException",
      "com.sshtools.j2ssh.transport.TransportProtocolException",
      "com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "com.ibatis.common.beans.Probe",
      "net.sf.cglib.core.Transformer",
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "com.ibatis.sqlmap.engine.scope.StatementScope",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "org.biojava.bio.seq.io.GenbankXmlFormat$GenbankXmlHandler",
      "org.apache.log4j.Level",
      "com.sshtools.j2ssh.authentication.TerminatedStateException",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "org.biojava.bio.seq.io.SeqIOListener",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.utils.ChangeType",
      "net.sf.cglib.asm.FieldWriter",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "org.biojava.utils.ChangeListener",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotNullTagHandler",
      "org.biojava.utils.AbstractChangeable",
      "org.gmod.schema.sequence.FeaturePub",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "com.ibatis.sqlmap.client.SqlMapTransactionManager",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "com.sshtools.j2ssh.sftp.SshFxpReadlink",
      "org.gmod.schema.analysis.AnalysisFeature",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTag",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.gmod.schema.sequence.FeatureRelationship",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "org.postgresql.util.PSQLException",
      "net.sf.cglib.beans.BulkBean",
      "com.ibatis.common.logging.Log",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "net.sf.cglib.core.ClassGenerator",
      "net.sf.cglib.core.ReflectUtils$4",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "com.sshtools.j2ssh.connection.ChannelOutputStream",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils$3",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "org.biojava.utils.ChangeForwarder",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "com.ibatis.common.io.ReaderInputStream",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "com.ibatis.sqlmap.engine.accessplan.MapAccessPlan",
      "uk.ac.sanger.artemis.Feature",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "com.ibatis.sqlmap.client.extensions.ResultGetter",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEqualTagHandler",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "net.sf.cglib.core.CodeEmitter",
      "org.biojava.bio.seq.io.GenbankFileFormer",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "org.apache.log4j.PropertyWatchdog",
      "org.gmod.schema.sequence.FeatureProp",
      "org.gmod.schema.sequence.FeatureCvTermPub",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "com.ibatis.sqlmap.engine.mapping.sql.Sql",
      "org.biojava.utils.ParseErrorEvent",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.common.beans.ClassInfo",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "com.ibatis.sqlmap.engine.config.SqlSource",
      "org.biojava.bio.seq.FeatureHolder",
      "org.biojava.bio.seq.io.GenpeptFileFormer",
      "net.sf.cglib.asm.Edge",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.gmod.schema.dao.OrganismDaoI",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "net.sf.cglib.asm.ClassWriter",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "com.sshtools.j2ssh.session.SessionChannelClient",
      "com.ibatis.common.resources.Resources",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "com.ibatis.common.logging.jakarta.JakartaCommonsLoggingImpl",
      "org.biojava.bio.symbol.EmptySymbolList",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "org.postgresql.core.Logger",
      "org.apache.log4j.or.RendererMap",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "com.sshtools.j2ssh.transport.Service",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateContext",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.biojava.bio.seq.io.GenbankFormat",
      "org.gmod.schema.pub.PubDbXRef",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "org.biojava.bio.seq.io.GenbankXmlFormat$GenbankXmlSequence",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "org.biojava.utils.ClassTools",
      "net.sf.cglib.core.Customizer",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "com.ibatis.sqlmap.engine.type.TypeHandler",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "com.ibatis.sqlmap.engine.execution.BatchException",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "com.ibatis.sqlmap.engine.mapping.result.ResultObjectFactory",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.biojava.bio.symbol.AtomicSymbol",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterEqualTagHandler",
      "org.apache.log4j.spi.RootLogger",
      "org.biojava.bio.BioError",
      "com.ibatis.common.beans.Invoker",
      "net.sf.cglib.asm.Type",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "net.sf.cglib.core.MethodInfo",
      "org.apache.log4j.spi.RendererSupport",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "net.sf.cglib.core.Block",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlText",
      "net.sf.cglib.asm.Opcodes",
      "uk.ac.sanger.artemis.io.LineGroup",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagContext",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.mapping.statement.RowHandlerCallback",
      "org.postgresql.Driver",
      "org.biojava.utils.ChangeSupport",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicParent",
      "org.biojava.bio.seq.io.SeqFileFormer",
      "org.apache.log4j.Logger",
      "com.ibatis.sqlmap.engine.mapping.statement.ExecuteListener",
      "uk.ac.sanger.artemis.io.Feature",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "com.ibatis.sqlmap.engine.transaction.TransactionException",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolListener",
      "org.apache.log4j.helpers.LogLog",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "org.apache.log4j.spi.RepositorySelector",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "net.sf.cglib.core.NamingPolicy",
      "uk.ac.sanger.artemis.io.Entry",
      "net.sf.cglib.asm.Item",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.biojava.utils.ParseErrorSource",
      "org.apache.log4j.or.DefaultRenderer",
      "com.ibatis.common.jdbc.exception.NestedSQLException",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlan",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "net.sf.cglib.asm.MethodAdapter",
      "com.ibatis.sqlmap.client.extensions.TypeHandlerCallback",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.gmod.schema.organism.Organism",
      "org.gmod.schema.general.Db",
      "com.ibatis.sqlmap.engine.config.CacheModelConfig",
      "com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl",
      "org.apache.log4j.Appender",
      "org.biojava.bio.symbol.Alphabet",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "org.biojava.bio.seq.io.EmblFileFormer",
      "net.sf.cglib.core.CodeGenerationException",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "org.biojava.utils.AssertionFailure",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.client.SqlMapSession",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEmptyTagHandler",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "net.sf.cglib.asm.Label",
      "org.gmod.schema.dao.PubDaoI"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GenbankMisc_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.util.ByteBuffer",
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
      "org.apache.log4j.MDC",
      "org.gmod.schema.sequence.Feature",
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
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "com.ibatis.sqlmap.engine.config.ParameterMapConfig",
      "com.ibatis.common.beans.ProbeException",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "net.sf.cglib.beans.BulkBeanException",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.biojava.bio.program.phred.PhredFormat",
      "org.biojava.bio.seq.io.GenbankFormat",
      "org.biojava.bio.seq.io.GenbankXmlFormat",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "com.ibatis.common.xml.NodeletException",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand"
    );
  }
}
