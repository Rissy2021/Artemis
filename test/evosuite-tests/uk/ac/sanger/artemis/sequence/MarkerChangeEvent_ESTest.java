/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 29 05:44:50 GMT 2017
 */

package uk.ac.sanger.artemis.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.io.EmblDocumentEntry;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.PartialSequence;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Marker;
import uk.ac.sanger.artemis.sequence.MarkerChangeEvent;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MarkerChangeEvent_ESTest extends MarkerChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Short short0 = new Short((short)44);
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      PartialSequence partialSequence0 = new PartialSequence((char[]) null, 966, (-1), short0, integer0);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = new Strand(bases0, 5);
      Marker marker0 = strand0.makeMarkerFromRawPosition(1);
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0, strand0, 966);
      Strand strand1 = markerChangeEvent0.getStrand();
      assertEquals(2, strand1.getDirection());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[4];
      Integer integer0 = new Integer(509);
      PartialSequence partialSequence0 = new PartialSequence(charArray0, (-16000), (-16000), (Short) null, integer0);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Marker marker0 = new Marker(strand0, (-16000));
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0, strand0, (-16000));
      Marker marker1 = markerChangeEvent0.getMarker();
      assertSame(marker0, marker1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Strand strand0 = new Strand((Bases) null, 120);
      MarkerChangeEvent markerChangeEvent0 = null;
      try {
        markerChangeEvent0 = new MarkerChangeEvent((Marker) null, strand0, 120);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("dThWkb*");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(simpleEntryInformation0);
      Entry entry0 = new Entry(bases0, emblDocumentEntry0);
      Feature feature0 = entry0.createFeature();
      Marker marker0 = feature0.getFirstCodingBaseMarker();
      Strand strand0 = bases0.getReverseStrand();
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0, strand0, (-1068));
      markerChangeEvent0.getMarker();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("\"8C|/$s{Z*G]wu@&H");
      Bases bases0 = new Bases(emblStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      Marker marker0 = new Marker(strand0, 1);
      MarkerChangeEvent markerChangeEvent0 = new MarkerChangeEvent(marker0, strand0, 5);
      Strand strand1 = markerChangeEvent0.getStrand();
      assertEquals(1, strand1.getDirection());
  }
}
