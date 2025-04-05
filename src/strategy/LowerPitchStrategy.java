package strategy;

/**
 * Strategy for lowering the pitch of a note by 2 semitones.
 */
public class LowerPitchStrategy implements PitchStrategy{
	
	/**
     * Lowers the input MIDI note by 2 semitones.
     *
     * @param note the original MIDI note value
     * @return the modified note value
     */
	@Override 
	public int modifyPitch(int note) {
		return note -2; 
	}
}
