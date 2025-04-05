package data;

import java.util.*;
import javax.sound.midi.*;
import factory.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("/Users/enobongoffiong/Downloads/mystery_song.csv");
            Sequence sequence = new Sequence(Sequence.PPQ, 384);
            Track track = sequence.createTrack();

            MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract();
            MidiEventFactory factory = factoryAbstract.createFactory();

            InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
            instrumentStrategy.applyInstrument(track, 0);
            instrumentStrategy = new TrumpetStrategy();
            instrumentStrategy.applyInstrument(track, 1);

            PitchStrategy pitchStrategy = new HigherPitchStrategy();

            for (MidiEventData event : midiEvents) {
                int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
                if (event.getNoteOnOff() == ShortMessage.NOTE_ON) {
                    track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel()));
                } else {
                    track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
                }
            }

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();

            while (sequencer.isRunning()) {
                Thread.sleep(100);
            }
            Thread.sleep(500);
            sequencer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}