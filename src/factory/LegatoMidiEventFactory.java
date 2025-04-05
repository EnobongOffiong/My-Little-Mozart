/**
 * 
 */
package factory;

import javax.sound.midi.*;
/**
 * create note events with longer durations and minimal gaps between the NoteOff and the next NoteOn event.
 */
public class LegatoMidiEventFactory implements MidiEventFactory{
	
	
	/**
     * Creates a NOTE_ON event at the specified tick.
     *
     * @param tick     the time in ticks the note should start
     * @param note     the MIDI note number 
     * @param velocity how hard the note is played 
     * @param channel  the MIDI channel 
     * @return a MidiEvent representing the note-on
     * @throws InvalidMidiDataException if message creation fails
     */
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
        return new MidiEvent(msg, tick);
    }

	
	/**
     * Creates a NOTE_OFF event slightly delayed (by 80 ticks) to simulate legato playing.
     *
     * @param tick    the base tick to calculate note duration from
     * @param note    the MIDI note number 
     * @param channel the MIDI channel 
     * @return a MidiEvent representing the note-off
     * @throws InvalidMidiDataException if message creation fails
     */
    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
        return new MidiEvent(msg, tick + 80); // legato adds 80 ticks
    }
		
		
}

