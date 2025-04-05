package data;

/**
 * Represents a single MIDI event with all the necessary data
 * tick, note, velocity, channel, instrument, and whether it's a note-on or note-off event.
 */
public class MidiEventData {
	
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	
	/**
     * Parameterized constructor that creates a new MidiEventData object.
     *
     * @param startEndTick the tick the event occurs on
     * @param velocity     how strong the note is played 
     * @param note         MIDI note number 
     * @param channel      MIDI channel (usually 0–15)
     * @param instrument   instrument number for the event
     * @param noteOnOff    If it's a NOTE_ON or NOTE_OFF event
     */
	public MidiEventData (int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff){
			this.startEndTick = startEndTick;
			this.velocity = velocity;
			this.note = note;
			this.channel = channel;
			this.instrument = instrument;
			this.noteOnOff = noteOnOff;
			}
	
	/**
     * @return the MIDI channel
     */
	public int getChannel() {
		return channel;
	}

	/**
     * @return NOTE_ON or NOTE_OFF (from ShortMessage)
     */
	public int getNoteOnOff() {
		return noteOnOff;
	}


	/**
     * @return Instrument number
     */
	public int getInstrument() {
		return instrument;
	}

	/**
     * @return the tick when the note starts or ends
     */
	public int getStartEndTick(){
		return startEndTick;
	}
	

	/**
     * @return the velocity (how hard the note is hit)
     */
	public int getVelocity() {
		return velocity;
	}

	/**
     * @return the MIDI note number
     */
	public int getNote() {
		return note;
	}

}


