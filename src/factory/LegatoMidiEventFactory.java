/**
 * 
 */
package factory;

import javax.sound.midi.*;
/**
 * create note events with longer durations and minimal gaps between the NoteOff and the next NoteOn event.
 */
public class LegatoMidiEventFactory implements MidiEventFactory{
	
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
        return new MidiEvent(msg, tick);
    }

    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
        return new MidiEvent(msg, tick + 80); // legato adds 80 ticks
    }
		
		
}

