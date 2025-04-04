/**
 * 
 */
package factory;

import myLittleMozart.midi.MidiEventData;
//import javax.sound.midi.*;
/**
 * create note events with longer durations and minimal gaps between the NoteOff and the next NoteOn event.
 */
public class LegatoMidiEventFactory{
	
	public MidiEventData legato(MidiEventData e) {
		
		int originalTick = e.getStartEndTick();
	    
	    
	    int newTick = originalTick + 80; 
	    
	    
	    MidiEventData legatoEvent = new MidiEventData(
	        newTick,  // Adjusted duration
	        e.getNoteOnOff(),  // Note on/off status (same as original)
	        e.getChannel(),    // MIDI channel
	        e.getNote(),       // MIDI note
	        e.getVelocity(),   // Velocity (same as original)
	        e.getInstrument()  // Instrument (same as original)
	    );
	    
	    return legatoEvent;
	}
		
		
}

