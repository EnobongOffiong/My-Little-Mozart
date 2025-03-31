package myLittleMozart.midi;

public class MidiEventData {
	
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, 
			int noteOnOff ) {
			this.startEndTick = startEndTick;
			this.velocity = velocity;
			this.note = note;
			this.channel = channel;
			this.instrument = instrument;
			this.noteOnOff = noteOnOff;
			}
	
	public void setStartEndTick(int newStartEndTick) {
		startEndTick = newStartEndTick;
		
	}
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getNoteOnOff() {
		return noteOnOff;
	}

	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}

	public int getInstrument() {
		return instrument;
	}

	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}

	public int getStartEndTick(){
		return startEndTick;
	}
	
	public void setVelocity(int newVelocity) {
		velocity = newVelocity;
	}
	
	public int getVelocity() {
		return velocity;
	}
	
	public void setNote(int newNote) {
		note = newNote;
		
	}
	
	public int getNote() {
		return note;
	}
}
