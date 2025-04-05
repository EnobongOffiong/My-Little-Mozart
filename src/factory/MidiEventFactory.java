package factory;

import javax.sound.midi.*;

/**
 * Interface for creating MIDI note events.
 * 
 * Implementations define how note-on and note-off events are generated
 * 
 */
public interface MidiEventFactory {
	/**
     * Creates a NOTE_ON event.
     *
     * @param tick     the time when the note starts
     * @param note     the MIDI note number 
     * @param velocity how hard the note is played 
     * @param channel  the MIDI channel 
     * @return a MidiEvent representing the note-on
     * @throws InvalidMidiDataException if the message can't be created
     */
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	
	/**
     * Creates a NOTE_OFF event.
     *
     * @param tick    the time  when the note ends
     * @param note    the MIDI note number 
     * @param channel the MIDI channel 
     * @return a MidiEvent representing the note-off
     * @throws InvalidMidiDataException if the message can't be created
     */
    MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}


