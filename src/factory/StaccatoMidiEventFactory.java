package factory;
import javax.sound.midi.*;

/**
 * A factory for creating staccato-style MIDI note events.
 * 
 * Staccato shortens the note duration by subtracting time from the NoteOff tick,
 * making the notes sound more detached.
 */
public class StaccatoMidiEventFactory implements MidiEventFactory {
    public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
        return new MidiEvent(msg, tick);
    }

    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
        return new MidiEvent(msg, tick - 120); //staccato subtracts 120 ticks
    }
}