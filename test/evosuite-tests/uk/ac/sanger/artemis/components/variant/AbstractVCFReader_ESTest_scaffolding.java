/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 03:05:26 GMT 2017
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
public class AbstractVCFReader_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.variant.AbstractVCFReader"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractVCFReader_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "com.ibatis.common.jdbc.SimpleDataSource$SimplePooledConnection",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.ConditionalTagHandler",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.apache.log4j.AppenderSkeleton",
      "com.ibatis.sqlmap.client.extensions.ParameterSetter",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "com.sshtools.j2ssh.connection.SshMsgRequestFailure",
      "uk.ac.sanger.artemis.components.variant.VCFview$27",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "com.sshtools.j2ssh.sftp.SshFxpRmdir",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "com.sshtools.j2ssh.sftp.SshFxpOpenDir",
      "net.sf.cglib.core.KeyFactory$Generator",
      "uk.ac.sanger.artemis.components.variant.VCFview",
      "com.sshtools.j2ssh.SshClient",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.Selectable",
      "net.sf.cglib.core.CodeEmitter$State",
      "org.biojava.bio.seq.io.NameTokenization",
      "net.sf.samtools.FileTruncatedException",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateTagHandler",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "net.sf.cglib.core.Constants",
      "uk.ac.sanger.artemis.util.StringVector",
      "net.sf.samtools.SAMException",
      "net.sf.cglib.core.AbstractClassGenerator",
      "com.ibatis.common.beans.BaseProbe",
      "com.sshtools.j2ssh.transport.AsyncService",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectKeyStatement",
      "org.gmod.schema.sequence.Synonym",
      "org.gmod.schema.sequence.FeatureCvTermProp",
      "org.apache.log4j.Hierarchy",
      "net.sf.samtools.seekablestream.SeekableStream",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.biojava.utils.Changeable",
      "net.sf.cglib.asm.MethodWriter",
      "com.ibatis.common.util.PaginatedList",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "com.sshtools.j2ssh.connection.Channel",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "com.ibatis.sqlmap.engine.cache.CacheModel",
      "org.apache.log4j.spi.OptionHandler",
      "net.sf.cglib.core.ReflectUtils",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "uk.ac.sanger.artemis.components.variant.VCFRecord",
      "com.sshtools.j2ssh.connection.SshMsgChannelRequest",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "net.sf.samtools.util.ftp.FTPReply",
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
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "uk.ac.sanger.artemis.components.variant.VCFFilter",
      "com.ibatis.sqlmap.engine.type.SqlTimeTypeHandler",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterThanTagHandler",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEqualTagHandler",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
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
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
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
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "net.sf.cglib.core.ClassNameReader",
      "com.sshtools.j2ssh.connection.ChannelInputStream",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "com.ibatis.sqlmap.engine.cache.CacheController",
      "net.sf.cglib.core.ClassNameReader$1",
      "com.ibatis.sqlmap.engine.accessplan.BaseAccessPlan",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.BaseTagHandler",
      "net.sf.cglib.core.Local",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate",
      "com.sshtools.j2ssh.SshException",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "net.sf.cglib.beans.BulkBean$Generator",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "org.gmod.schema.cv.Cv",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "com.sshtools.j2ssh.sftp.SshFxpRename",
      "net.sf.samtools.seekablestream.SeekableFileStream",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "com.ibatis.sqlmap.engine.exchange.DataExchange",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlChild",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicTagHandler",
      "com.sshtools.j2ssh.connection.IOChannel",
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
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "com.sshtools.j2ssh.connection.SshMsgChannelData",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "com.ibatis.sqlmap.engine.mapping.statement.MappedStatement",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotPropertyAvailableTagHandler",
      "com.sshtools.j2ssh.connection.SshMsgRequestSuccess",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessThanTagHandler",
      "com.ibatis.sqlmap.client.SqlMapClient",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "org.biojava.bio.symbol.BasisSymbol",
      "com.ibatis.sqlmap.engine.transaction.Transaction",
      "com.ibatis.sqlmap.engine.accessplan.PropertyAccessPlan",
      "com.sshtools.j2ssh.connection.ChannelFactory",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "net.sf.cglib.beans.BulkBeanEmitter",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "com.sshtools.j2ssh.connection.SshMsgChannelOpenConfirmation",
      "uk.ac.sanger.artemis.chado.Graph",
      "net.sf.samtools.seekablestream.SeekableFTPStream",
      "org.biojava.bio.seq.io.WordTokenization",
      "com.ibatis.common.beans.GenericProbe",
      "uk.ac.sanger.artemis.ChangeListener",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.GeneratorStrategy",
      "org.apache.log4j.helpers.Loader",
      "net.sf.samtools.util.ftp.FTPUtils",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "com.ibatis.sqlmap.engine.type.TypeHandlerFactory",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.components.variant.FilteredPanel",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "net.sf.cglib.core.EmitUtils",
      "org.apache.log4j.MDC",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "com.sshtools.j2ssh.sftp.MessageRequestId",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMapping",
      "com.sshtools.j2ssh.sftp.SshFxpReadDir",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "org.biojava.bio.symbol.Symbol",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotParameterPresentTagHandler",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "net.sf.cglib.beans.BulkBeanException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsParameterPresentTagHandler",
      "com.ibatis.sqlmap.engine.config.MappedStatementConfig",
      "net.sf.samtools.util.BlockGunzipper",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsEmptyTagHandler",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.components.variant.HeaderLine",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.util.FTPSeekableStream",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandler",
      "uk.ac.sanger.artemis.circular.TextFieldSink",
      "net.sf.samtools.util.ftp.FTPClient$SocketInputStream",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "com.ibatis.sqlmap.engine.exchange.ComplexDataExchange",
      "net.sf.cglib.core.Signature",
      "com.ibatis.sqlmap.engine.type.SqlTimestampTypeHandler",
      "net.sf.cglib.asm.ByteVector",
      "com.ibatis.sqlmap.engine.mapping.result.Discriminator",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNullTagHandler",
      "com.sshtools.j2ssh.connection.InvalidChannelException",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "net.sf.cglib.beans.BulkBean$BulkBeanKey",
      "com.sshtools.j2ssh.transport.MessageNotAvailableException",
      "com.ibatis.sqlmap.engine.config.SqlMapConfiguration",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "net.sf.cglib.asm.Frame",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "com.sshtools.j2ssh.transport.SshMessage",
      "com.sshtools.j2ssh.util.State",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsLessEqualTagHandler",
      "com.ibatis.sqlmap.engine.type.DateOnlyTypeHandler",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.circular.TextFieldFloat",
      "uk.ac.sanger.artemis.util.Document",
      "com.ibatis.sqlmap.client.event.RowHandler",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "net.sf.cglib.core.ProcessArrayCallback",
      "net.sf.samtools.util.BlockCompressedInputStream",
      "net.sf.cglib.asm.ClassReader",
      "org.apache.log4j.spi.LoggerRepository",
      "com.ibatis.common.beans.ProbeException",
      "com.sshtools.j2ssh.transport.TransportProtocolException",
      "uk.ac.sanger.artemis.components.Splash",
      "com.ibatis.sqlmap.engine.impl.ExtendedSqlMapClient",
      "com.ibatis.common.beans.Probe",
      "net.sf.cglib.core.Transformer",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "com.ibatis.sqlmap.engine.scope.StatementScope",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.DynamicSql",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "com.ibatis.sqlmap.engine.mapping.result.AutoResultMap",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.apache.log4j.Level",
      "net.sf.samtools.seekablestream.UserPasswordInput",
      "com.sshtools.j2ssh.sftp.SshFxpOpen",
      "com.sshtools.j2ssh.authentication.TerminatedStateException",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "com.ibatis.sqlmap.engine.type.UnknownTypeHandler",
      "uk.ac.sanger.artemis.components.variant.TabixReader$TIntv",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.utils.ChangeType",
      "net.sf.cglib.asm.FieldWriter",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotNullTagHandler",
      "com.sshtools.j2ssh.connection.SshMsgChannelEOF",
      "net.sf.samtools.seekablestream.SeekableBufferedStream",
      "org.biojava.utils.AbstractChangeable",
      "org.gmod.schema.sequence.FeaturePub",
      "com.sshtools.j2ssh.io.ByteArrayReader",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "net.sf.cglib.core.LocalVariablesSorter$State",
      "com.ibatis.sqlmap.client.SqlMapTransactionManager",
      "com.ibatis.sqlmap.engine.config.ResultMapConfig",
      "uk.ac.sanger.artemis.components.variant.BCFReader$BCFReaderIterator",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "com.sshtools.j2ssh.sftp.SshFxpReadlink",
      "org.gmod.schema.analysis.AnalysisFeature",
      "com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTag",
      "net.sf.samtools.util.BlockCompressedInputStream$FileTermination",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.gmod.schema.sequence.FeatureRelationship",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "com.ibatis.sqlmap.engine.scope.SessionScope",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.postgresql.util.PSQLException",
      "net.sf.cglib.beans.BulkBean",
      "com.ibatis.common.logging.Log",
      "com.ibatis.sqlmap.engine.mapping.result.ResultMap",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "net.sf.cglib.core.ClassGenerator",
      "net.sf.cglib.core.ReflectUtils$4",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "com.sshtools.j2ssh.connection.ChannelOutputStream",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "com.sshtools.j2ssh.sftp.SshFxpSymlink",
      "net.sf.cglib.core.ReflectUtils$3",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "net.sf.samtools.SAMFormatException",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "com.ibatis.sqlmap.engine.cache.CacheKey",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "com.ibatis.sqlmap.engine.type.DateTypeHandler",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "com.ibatis.common.io.ReaderInputStream",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "net.sf.samtools.util.IOUtil",
      "com.ibatis.sqlmap.engine.accessplan.MapAccessPlan",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "com.sshtools.j2ssh.sftp.SshFxpClose",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "com.ibatis.sqlmap.client.extensions.ResultGetter",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "com.sshtools.j2ssh.FileTransferProgress",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEqualTagHandler",
      "com.ibatis.sqlmap.engine.transaction.TransactionManager",
      "com.ibatis.common.jdbc.SimpleDataSource",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "net.sf.cglib.core.CodeEmitter",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.gmod.schema.sequence.FeatureProp",
      "org.gmod.schema.sequence.FeatureCvTermPub",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "com.ibatis.sqlmap.engine.accessplan.ComplexAccessPlan",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "com.ibatis.sqlmap.engine.mapping.sql.Sql",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "com.ibatis.common.beans.ProbeFactory",
      "com.ibatis.common.beans.ClassInfo",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "com.ibatis.sqlmap.engine.scope.ErrorContext",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "com.ibatis.sqlmap.engine.config.SqlSource",
      "net.sf.cglib.asm.Edge",
      "org.gmod.schema.dao.OrganismDaoI",
      "com.ibatis.sqlmap.engine.mapping.sql.stat.StaticSql",
      "net.sf.cglib.asm.ClassWriter",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "com.sshtools.j2ssh.session.SessionChannelClient",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "com.ibatis.common.resources.Resources",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.components.IndexReferenceListener",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "net.sf.samtools.util.ftp.FTPClient",
      "com.sshtools.j2ssh.connection.SshMsgChannelFailure",
      "com.ibatis.common.logging.jakarta.JakartaCommonsLoggingImpl",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagHandlerFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.postgresql.core.Logger",
      "org.apache.log4j.or.RendererMap",
      "com.ibatis.sqlmap.engine.mapping.sql.simple.SimpleDynamicSql",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "com.sshtools.j2ssh.transport.Service",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IterateContext",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.gmod.schema.pub.PubDbXRef",
      "com.ibatis.sqlmap.engine.type.SqlDateTypeHandler",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsPropertyAvailableTagHandler",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.chado.SqlMapClientWrapper",
      "uk.ac.sanger.artemis.Entry",
      "net.sf.cglib.core.Customizer",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "com.ibatis.sqlmap.engine.type.TypeHandler",
      "com.ibatis.sqlmap.engine.mapping.parameter.InlineParameterMapParser",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "com.sshtools.j2ssh.sftp.SshFxpRemove",
      "com.sshtools.j2ssh.connection.SshMsgChannelExtendedData",
      "com.ibatis.sqlmap.engine.type.JdbcTypeRegistry",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "com.ibatis.sqlmap.engine.execution.BatchException",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "com.ibatis.sqlmap.engine.mapping.result.ResultObjectFactory",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.biojava.bio.symbol.AtomicSymbol",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsGreaterEqualTagHandler",
      "org.apache.log4j.spi.RootLogger",
      "com.ibatis.common.beans.Invoker",
      "net.sf.cglib.asm.Type",
      "org.apache.log4j.spi.ErrorHandler",
      "com.ibatis.sqlmap.engine.accessplan.EnhancedPropertyAccessPlan",
      "net.sf.cglib.core.MethodInfo",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.components.variant.TabixReader$Iterator",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "com.ibatis.sqlmap.engine.execution.SqlExecutor",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "uk.ac.sanger.artemis.util.FileDocument",
      "net.sf.cglib.core.Block",
      "com.ibatis.sqlmap.engine.mapping.sql.SqlText",
      "net.sf.cglib.asm.Opcodes",
      "uk.ac.sanger.artemis.io.LineGroup",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.SqlTagContext",
      "com.ibatis.sqlmap.engine.type.TimeOnlyTypeHandler",
      "com.ibatis.sqlmap.engine.mapping.statement.RowHandlerCallback",
      "org.postgresql.Driver",
      "org.apache.commons.net.ftp.FTPConnectionClosedException",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlanFactory",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.DynamicParent",
      "uk.ac.sanger.artemis.components.SequenceComboBox",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "com.ibatis.sqlmap.engine.mapping.statement.ExecuteListener",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "com.ibatis.sqlmap.engine.mapping.statement.SelectStatement",
      "com.ibatis.sqlmap.engine.transaction.TransactionException",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolListener",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "com.ibatis.common.logging.LogFactory",
      "com.ibatis.sqlmap.engine.type.BaseTypeHandler",
      "org.apache.log4j.spi.RepositorySelector",
      "com.ibatis.common.beans.DomProbe",
      "com.ibatis.sqlmap.engine.type.CustomTypeHandler",
      "net.sf.cglib.core.NamingPolicy",
      "uk.ac.sanger.artemis.components.variant.GraphPanel",
      "net.sf.cglib.asm.Item",
      "uk.ac.sanger.artemis.io.Entry",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "com.ibatis.common.jdbc.exception.NestedSQLException",
      "com.ibatis.sqlmap.engine.builder.xml.SqlMapClasspathEntityResolver",
      "com.ibatis.sqlmap.engine.accessplan.AccessPlan",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "net.sf.cglib.asm.MethodAdapter",
      "net.sf.samtools.seekablestream.SeekableHTTPStream",
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
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "org.biojava.utils.AssertionFailure",
      "net.sf.samtools.Defaults",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "uk.ac.sanger.artemis.Logger",
      "com.ibatis.sqlmap.engine.impl.SqlMapClientImpl",
      "com.ibatis.sqlmap.client.SqlMapSession",
      "com.ibatis.sqlmap.engine.mapping.sql.dynamic.elements.IsNotEmptyTagHandler",
      "org.gmod.schema.sequence.FeatureSynonym",
      "org.apache.log4j.spi.LoggingEvent",
      "com.ibatis.sqlmap.engine.mapping.statement.CachingStatement",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "net.sf.cglib.asm.Label",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractVCFReader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.variant.FilteredPanel",
      "uk.ac.sanger.artemis.components.variant.VCFFilter",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "net.sf.samtools.util.BlockCompressedInputStream",
      "net.sf.samtools.seekablestream.SeekableFileStream",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "net.sf.samtools.seekablestream.SeekableBufferedStream",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "net.sf.samtools.seekablestream.SeekableFTPStream",
      "net.sf.samtools.util.ftp.FTPUtils",
      "net.sf.samtools.util.ftp.FTPClient",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
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
      "org.biojava.bio.symbol.AbstractAlphabet",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.chado.ChadoTransactionManager",
      "net.sf.samtools.Defaults",
      "net.sf.samtools.util.IOUtil",
      "net.sf.samtools.SAMException",
      "net.sf.samtools.FileTruncatedException",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "uk.ac.sanger.artemis.FeatureSegment",
      "com.sshtools.j2ssh.sftp.FileAttributes"
    );
  }
}
