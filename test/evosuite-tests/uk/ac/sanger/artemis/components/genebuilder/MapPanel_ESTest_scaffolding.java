/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Sep 29 02:22:03 GMT 2017
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MapPanel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.genebuilder.MapPanel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MapPanel_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "com.sshtools.j2ssh.authentication.SshMsgUserAuthRequest",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.log4j.Level",
      "org.apache.batik.dom.AbstractParentChildNode",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGRenderingHints",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "com.sshtools.j2ssh.sftp.SshFxpRmdir",
      "com.sshtools.j2ssh.authentication.PasswordAuthenticationClient",
      "com.sshtools.j2ssh.authentication.TerminatedStateException",
      "org.apache.batik.svggen.SVGAttribute",
      "org.apache.batik.dom.xbl.OriginalEvent",
      "com.sshtools.j2ssh.SshClient",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "org.apache.batik.svggen.SVGTexturePaint",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "uk.ac.sanger.artemis.Selectable",
      "org.apache.batik.dom.xbl.XBLManagerData",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "com.sshtools.j2ssh.sftp.SftpSubsystemClient",
      "com.sshtools.j2ssh.util.InvalidStateException",
      "org.apache.batik.dom.util.SAXDocumentFactory",
      "org.apache.batik.svggen.AbstractSVGConverter",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.batik.util.CleanerThread$ReferenceCleared",
      "org.apache.batik.svggen.SVGCustomPaint",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.dom.StyleSheetProcessingInstruction",
      "org.emboss.jemboss.JembossParams",
      "org.apache.batik.svggen.CachedImageHandler",
      "org.apache.batik.dom.AbstractNode$1",
      "org.apache.batik.dom.events.DOMUIEvent",
      "com.sshtools.j2ssh.sftp.SshFxpReadlink",
      "org.apache.batik.util.CleanerThread",
      "org.apache.batik.dom.AbstractAttr",
      "com.sshtools.j2ssh.transport.AsyncService",
      "uk.ac.sanger.artemis.LastSegmentException",
      "org.apache.batik.dom.AbstractElementNS",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.apache.batik.xml.XMLUtilities",
      "org.apache.batik.ext.awt.g2d.TransformStackElement",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.apache.batik.dom.AbstractParentNode$ElementsByTagName",
      "org.apache.log4j.Hierarchy",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.dom.AbstractNode",
      "org.emboss.jemboss.gui.Browser$3",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.apache.batik.svggen.SVGCompositeDescriptor",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "org.apache.batik.svggen.SVGIDGenerator",
      "org.emboss.jemboss.gui.Browser$6",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.ErrorHandler",
      "org.emboss.jemboss.gui.Browser",
      "org.apache.batik.dom.AbstractComment",
      "com.sshtools.j2ssh.connection.Channel",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.batik.dom.AbstractProcessingInstruction",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.batik.dom.events.DocumentEventSupport$EventFactory",
      "com.sshtools.j2ssh.sftp.SshFxpSymlink",
      "org.apache.batik.svggen.SVGConvolveOp",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.svggen.SVGFontDescriptor",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.apache.batik.svggen.SVGAlphaComposite",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$5",
      "org.apache.batik.svggen.SVGTransform$1",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$3",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$4",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$1",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$2",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "com.sshtools.j2ssh.connection.ChannelEventListener",
      "org.apache.batik.svggen.SVGEllipse",
      "org.apache.batik.svggen.SVGCustomComposite",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.batik.util.CleanerThread$SoftReferenceCleared",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "org.apache.batik.svggen.SVGGraphicObjectConverter",
      "com.sshtools.j2ssh.subsystem.SubsystemMessage",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "com.sshtools.j2ssh.transport.InvalidMessageException",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolClient",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.apache.batik.svggen.SVGDescriptor",
      "org.apache.batik.dom.events.AbstractEvent",
      "com.sshtools.j2ssh.sftp.SshFxpClose",
      "org.apache.batik.dom.xbl.XBLManager",
      "uk.ac.sanger.artemis.Feature",
      "com.sshtools.j2ssh.subsystem.SubsystemChannel",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "com.sshtools.j2ssh.transport.TransportProtocolEventHandler",
      "org.apache.batik.dom.GenericComment",
      "com.sshtools.j2ssh.FileTransferProgress",
      "org.apache.batik.util.SoftDoublyIndexedTable$Entry",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.batik.dom.events.DocumentEventSupport",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.apache.batik.svggen.SVGRescaleOp",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "org.apache.batik.svggen.StyleHandler",
      "com.sshtools.j2ssh.transport.TransportProtocolState",
      "org.apache.batik.svggen.ImageHandler",
      "org.apache.batik.svggen.SVGComposite",
      "org.apache.batik.dom.util.IntTable",
      "com.sshtools.j2ssh.io.UnsignedInteger32",
      "org.apache.batik.svggen.SVGPolygon",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.util.XMLConstants",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.sshtools.j2ssh.SshException",
      "com.sshtools.j2ssh.session.SessionChannelClient",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "com.sshtools.j2ssh.sftp.SshFxpRename",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "org.apache.log4j.Priority",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.svggen.SVGFilterDescriptor",
      "com.sshtools.j2ssh.connection.IOChannel",
      "org.apache.batik.svggen.AbstractSVGFilterConverter",
      "org.apache.batik.svggen.DOMTreeManager",
      "org.apache.log4j.LogManager",
      "org.apache.batik.dom.util.SAXIOException",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.batik.dom.ExtendedNode",
      "org.apache.log4j.or.RendererMap",
      "org.apache.batik.i18n.Localizable",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "org.apache.batik.svggen.DefaultImageHandler",
      "com.sshtools.j2ssh.transport.Service",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.DocumentFactory",
      "org.apache.batik.svggen.SVGRectangle",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.AbstractAttrNS",
      "org.apache.batik.svggen.SVGColor",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.apache.batik.util.SVGConstants",
      "uk.ac.sanger.artemis.io.Key",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "org.apache.batik.dom.GenericDOMImplementation",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "com.sshtools.j2ssh.connection.ConnectionProtocol",
      "org.apache.batik.dom.AbstractDocument$IdSoftRef",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.dom.GenericDocumentType",
      "uk.ac.sanger.artemis.io.Qualifier",
      "org.apache.batik.svggen.SVGAttributeMap",
      "com.sshtools.j2ssh.sftp.SshFxpRemove",
      "org.apache.batik.svggen.SVGGeneratorContext$GraphicContextDefaults",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.apache.batik.svggen.SVGBasicStroke",
      "com.sshtools.j2ssh.sftp.FileAttributes",
      "org.apache.batik.dom.AbstractCharacterData",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.apache.log4j.helpers.Loader",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.log4j.ProvisionNode",
      "com.sshtools.j2ssh.authentication.SshAuthenticationClient",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "com.sshtools.j2ssh.transport.MessageStoreEOFException",
      "org.apache.batik.svggen.SVGConverter",
      "org.apache.batik.svggen.SVGHintsDescriptor",
      "org.apache.batik.svggen.SVGLine",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "com.sshtools.j2ssh.sftp.MessageRequestId",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.svggen.ErrorConstants",
      "org.apache.batik.dom.events.EventSupport",
      "org.apache.batik.svggen.SVGPath",
      "org.apache.batik.dom.xbl.NodeXBL",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "com.sshtools.j2ssh.transport.HostKeyVerification",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.batik.dom.events.NodeEventTarget",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.xbl.GenericXBLManager",
      "org.apache.batik.util.CSSConstants",
      "org.apache.batik.svggen.SVGPaint",
      "org.apache.batik.svggen.GenericImageHandler",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "uk.ac.sanger.artemis.io.LineGroup",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.util.SoftDoublyIndexedTable",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.svggen.ExtensionHandler",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.batik.svggen.SVGBufferedImageOp",
      "org.apache.batik.dom.GenericElementNS",
      "org.apache.batik.dom.util.IntTable$Entry",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "org.apache.batik.svggen.SVGFilterConverter",
      "org.apache.batik.util.Base64EncoderStream",
      "uk.ac.sanger.artemis.io.Feature",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolListener",
      "org.apache.batik.svggen.SVGGraphics2DIOException",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "org.apache.batik.svggen.SVGPaintDescriptor",
      "org.apache.batik.dom.AbstractElement$ElementTypeInfo",
      "org.apache.batik.svggen.ImageCacher",
      "uk.ac.sanger.artemis.io.Entry",
      "com.sshtools.j2ssh.transport.SshMessage",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.batik.svggen.SVGStrokeDescriptor",
      "com.sshtools.j2ssh.util.State",
      "org.apache.batik.svggen.SVGArc",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "org.apache.batik.svggen.SVGLinearGradient",
      "org.apache.batik.dom.AbstractParentNode$ElementsByTagNameNS",
      "uk.ac.sanger.artemis.components.genebuilder.MapPanel",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "uk.ac.sanger.artemis.Selection",
      "com.sshtools.j2ssh.transport.SshMsgServiceAccept",
      "org.apache.batik.dom.util.DOMUtilities",
      "com.sshtools.j2ssh.authentication.AuthenticationProtocolException",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "org.apache.batik.dom.AbstractElement$Entry",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "org.apache.batik.dom.GenericElement",
      "org.apache.batik.svggen.SVGClipDescriptor",
      "org.apache.batik.svggen.SVGShape",
      "org.apache.log4j.spi.LoggerRepository",
      "com.sshtools.j2ssh.transport.TransportProtocolException",
      "org.apache.batik.svggen.SVGSyntax",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.dom.GenericDocument"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MapPanel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.genebuilder.MapPanel",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.GenericDOMImplementation",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.GenericDocument",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.AbstractElementNS",
      "org.apache.batik.dom.GenericElementNS",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.dom.util.DOMUtilities",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "org.apache.batik.dom.AbstractAttr",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.dom.AbstractCharacterData",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.dom.AbstractElement$Entry",
      "org.apache.batik.util.CleanerThread",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.batik.svggen.SVGTransform$1",
      "org.apache.batik.svggen.SVGAttributeMap",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "org.apache.batik.dom.GenericElement",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.apache.batik.util.SoftDoublyIndexedTable",
      "com.sshtools.j2ssh.io.UnsignedInteger64",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.batik.dom.util.IntTable",
      "org.apache.batik.dom.util.IntTable$Entry",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "org.apache.batik.dom.AbstractComment",
      "org.apache.batik.dom.GenericComment",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "org.apache.batik.dom.AbstractProcessingInstruction",
      "org.apache.batik.dom.StyleSheetProcessingInstruction",
      "org.apache.batik.dom.events.DocumentEventSupport",
      "uk.ac.sanger.artemis.components.filetree.FileList",
      "uk.ac.sanger.artemis.j2ssh.SshLogin",
      "uk.ac.sanger.artemis.FeatureSegment",
      "org.emboss.jemboss.JembossParams",
      "com.sshtools.j2ssh.sftp.FileAttributes"
    );
  }
}
