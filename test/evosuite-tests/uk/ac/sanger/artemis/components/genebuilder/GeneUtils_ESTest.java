/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 02:15:42 GMT 2017
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.datatransfer.Clipboard;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JFrame;
import org.biojava.bio.seq.SequenceAnnotator;
import org.biojava.bio.seq.db.AnnotatedSequenceDB;
import org.biojava.bio.seq.db.BioIndex;
import org.biojava.bio.seq.db.CachingSequenceDB;
import org.biojava.bio.seq.db.DummySequenceDB;
import org.biojava.bio.seq.db.HashSequenceDB;
import org.biojava.bio.seq.db.IDMaker;
import org.biojava.bio.seq.db.ViewingSequenceDB;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.FeatureKeyPredicate;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.SimpleGotoEventSource;
import uk.ac.sanger.artemis.components.genebuilder.GeneUtils;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.DatabaseStreamFeature;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry;
import uk.ac.sanger.artemis.io.MSPcrunchStreamFeature;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.io.ReadOnlyEmblStreamFeature;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.sequence.Bases;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneUtils_ESTest extends GeneUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = GeneUtils.isHiddenFeature(".7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = GeneUtils.isFeatureToUpdateResidues("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Key key0 = new Key("\"^<<I,rS!");
      Range range0 = new Range(7);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ReadOnlyEmblStreamFeature readOnlyEmblStreamFeature0 = new ReadOnlyEmblStreamFeature(key0, location0, qualifierVector0);
      DatabaseStreamFeature databaseStreamFeature0 = new DatabaseStreamFeature(readOnlyEmblStreamFeature0);
      String string0 = GeneUtils.getUniqueName(databaseStreamFeature0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.showHideGeneFeatures((FeatureVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IDMaker.ByURN iDMaker_ByURN0 = new IDMaker.ByURN();
      HashSequenceDB hashSequenceDB0 = new HashSequenceDB(iDMaker_ByURN0, "*");
      AnnotatedSequenceDB annotatedSequenceDB0 = new AnnotatedSequenceDB(hashSequenceDB0, (SequenceAnnotator) null);
      Set set0 = annotatedSequenceDB0.ids();
      // Undeclared exception!
      try { 
        GeneUtils.propagateId((GFFStreamFeature) null, "*", set0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        GeneUtils.promptForUniquename((EntryGroup) simpleEntryGroup0, true, (Range) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        GeneUtils.promptForUniquename((EntryGroup) simpleEntryGroup0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.lazyLoadAll((Entry) null, (JFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.isStrandOK(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isObsolete((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isNonCodingTranscripts((Key) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isGFFEntry((EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isDatabaseEntry((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.isDatabaseEntry((EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.isBoundaryOK(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.getFeatureForUpdatingResidues((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("$]B4@'&yo", "O<Ai8gT2@K|ncM");
      BioIndex bioIndex0 = new BioIndex(mockFile0, ">{qGICcBE|(4H~9A", (-1));
      Set set0 = bioIndex0.getFiles();
      // Undeclared exception!
      try { 
        GeneUtils.fixParentQualifier("$]B4@'&yo", "$]B4@'&yo", set0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.deriveResidues((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.deleteAllFeature((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.defineShowHideGeneFeatures((FeatureVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FeatureVector featureVector0 = new FeatureVector();
      // Undeclared exception!
      try { 
        GeneUtils.defineShowHideGeneFeatures(featureVector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("");
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(rawStreamSequence0);
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      // Undeclared exception!
      try { 
        GeneUtils.createGeneModel((JFrame) null, selection0, simpleEntryGroup0, simpleGotoEventSource0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.convertPseudo(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      uk.ac.sanger.artemis.Feature feature0 = new uk.ac.sanger.artemis.Feature(emblStreamFeature0);
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary(feature0, chadoCanonicalGene0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.checkGeneBoundary((ChadoCanonicalGene) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.checkGeneBoundary((ChadoCanonicalGene) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RangeVector rangeVector0 = new RangeVector();
      // Undeclared exception!
      try { 
        GeneUtils.addSegment((GFFStreamFeature) null, rangeVector0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneUtils.addLazyQualifiers((GFFStreamFeature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GeneUtils.checkGeneBoundary(chadoCanonicalGene0, false);
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = GeneUtils.isFeatureToUpdateResidues("polypeptide");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Key key0 = new Key("snoRNA");
      boolean boolean0 = GeneUtils.isNonCodingTranscripts(key0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Key key0 = new Key("gQ,|b#");
      boolean boolean0 = GeneUtils.isNonCodingTranscripts(key0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DummySequenceDB dummySequenceDB0 = new DummySequenceDB("polypeptide");
      Set set0 = dummySequenceDB0.ids();
      // Undeclared exception!
      try { 
        GeneUtils.fixParentQualifier("polypeptide", "polypeptide", set0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.io.Feature
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IDMaker.ByName iDMaker_ByName0 = new IDMaker.ByName();
      HashSequenceDB hashSequenceDB0 = new HashSequenceDB(iDMaker_ByName0, ";jDQu;");
      CachingSequenceDB cachingSequenceDB0 = new CachingSequenceDB(hashSequenceDB0);
      ViewingSequenceDB viewingSequenceDB0 = new ViewingSequenceDB(cachingSequenceDB0);
      Set set0 = viewingSequenceDB0.ids();
      GeneUtils.fixParentQualifier("f@n", "}*:J", set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Key key0 = new Key("\"^<<I,rS!");
      Range range0 = new Range(7);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ReadOnlyEmblStreamFeature readOnlyEmblStreamFeature0 = new ReadOnlyEmblStreamFeature(key0, location0, qualifierVector0);
      DatabaseStreamFeature databaseStreamFeature0 = new DatabaseStreamFeature(readOnlyEmblStreamFeature0);
      TreeSet<GFFStreamFeature> treeSet0 = new TreeSet<GFFStreamFeature>();
      GeneUtils.propagateId(databaseStreamFeature0, "5w.O|D|^5:*Aa_", treeSet0);
      assertNull(databaseStreamFeature0.getGffSource());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      Key key0 = new Key("ncRNA");
      QualifierVector qualifierVector0 = new QualifierVector();
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature(key0, (Location) null, qualifierVector0);
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature(mSPcrunchStreamFeature0);
      uk.ac.sanger.artemis.Feature feature0 = new uk.ac.sanger.artemis.Feature(genbankStreamFeature0);
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary(feature0, chadoCanonicalGene0, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Key key0 = new Key("\"^<<I,rS!");
      Range range0 = new Range(7);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ReadOnlyEmblStreamFeature readOnlyEmblStreamFeature0 = new ReadOnlyEmblStreamFeature(key0, location0, qualifierVector0);
      boolean boolean0 = GeneUtils.isDatabaseEntry((Feature) readOnlyEmblStreamFeature0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureKeyPredicate featureKeyPredicate0 = new FeatureKeyPredicate((Key) null);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyPredicate0, "Y~,R:&7UDHR!Gb4~Xg");
      simpleEntryGroup0.createEntry();
      boolean boolean0 = GeneUtils.isGFFEntry(filteredEntryGroup0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      boolean boolean0 = GeneUtils.isDatabaseEntry((EntryGroup) simpleEntryGroup0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Key key0 = new Key((String) null);
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, (String) null, (String) null);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, "gQ,|b#");
      simpleEntryGroup0.createEntry();
      String string0 = GeneUtils.promptForUniquename((EntryGroup) filteredEntryGroup0, true);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      DatabaseStreamFeature databaseStreamFeature0 = new DatabaseStreamFeature(emblStreamFeature0);
      boolean boolean0 = GeneUtils.isObsolete(databaseStreamFeature0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("50[1=)|~^cW*KW");
      Bases bases0 = new Bases(genbankStreamSequence0);
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(simpleEntryInformation0);
      Entry entry0 = new Entry(bases0, mSPcrunchDocumentEntry0);
      FeatureVector featureVector0 = entry0.checkForEMBLDuplicates();
      GeneUtils.showHideGeneFeatures(featureVector0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Key key0 = new Key("\"^<<I,rS!");
      Range range0 = new Range(7);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ReadOnlyEmblStreamFeature readOnlyEmblStreamFeature0 = new ReadOnlyEmblStreamFeature(key0, location0, qualifierVector0);
      DatabaseStreamFeature databaseStreamFeature0 = new DatabaseStreamFeature(readOnlyEmblStreamFeature0);
      RangeVector rangeVector0 = new RangeVector();
      GeneUtils.addSegment(databaseStreamFeature0, rangeVector0, "sequence_update_features");
      assertFalse(databaseStreamFeature0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GeneUtils.complementGeneModel((ChadoCanonicalGene) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.complementGeneModel(chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = GeneUtils.isHiddenFeature("polypeptide");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      uk.ac.sanger.artemis.Feature feature0 = new uk.ac.sanger.artemis.Feature(emblStreamFeature0);
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.deleteAllFeature(feature0, chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.ChadoCanonicalGene", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      GeneUtils.checkGeneBoundary(chadoCanonicalGene0);
      assertEquals(0, chadoCanonicalGene0.getSrcfeature_id());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = GeneUtils.getNonCodingTranscripts();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        GeneUtils.checkTranscriptBoundary((uk.ac.sanger.artemis.Feature) null, chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      // Undeclared exception!
      try { 
        GeneUtils.getUniqueName(emblStreamFeature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.GeneUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GeneUtils geneUtils0 = new GeneUtils();
  }
}
