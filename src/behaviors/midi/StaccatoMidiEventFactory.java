package behaviors.midi;
import myLittleMozart.midi.MidiEventData;
import myLittleMozart.midi.MidiEvent;

public class StaccatoMidiEventFactory {
    public MidiEventData Staccato(MidiEventData e) {
        // If this is a NoteOff event
        if (e.getNoteOnOff() == 0) {
            int oldTick = e.getStartEndTick();
            int newTick = oldTick - 120; // Make it end earlier
            
            // Prevent negative tick values differently
            if (newTick < 0) {
                newTick = 0;
            }
            
            // Create a new NoteOff event that ends earlier
            MidiEventData staccatoEvent = new MidiEventData(
                newTick,
                e.getNoteOnOff(), // Keep it as NoteOff (0)
                e.getChannel(),
                e.getNote(),
                e.getVelocity(),
                e.getInstrument()
            );
            
            return staccatoEvent;
        }
        
        // If it's a NoteOn event, return it unchanged
        return e;
    }
}