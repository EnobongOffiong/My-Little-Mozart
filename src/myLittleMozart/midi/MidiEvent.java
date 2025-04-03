package myLittleMozart.midi;

public interface MidiEvent {
	int getStartEndTick();
	int getNoteOnOff();
	int getNote();
	int getChannel();
	int getVelocity();
	int getInstrument();
	
}

