package factory;

import javax.sound.midi.*;

public class StandardMidiEventFactory implements MidiEventFactory{
	
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
        return new MidiEvent(msg, tick);
    }
    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
        return new MidiEvent(msg, tick);
    }
		
	
}
