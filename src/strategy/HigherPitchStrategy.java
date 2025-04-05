package strategy;

/**
 * Strategy for raising the pitch of a note by 2 semitones
 */
public class HigherPitchStrategy implements PitchStrategy{
	
	/**
     * Raises the input MIDI note by 2 semitones.
     *
     * @param note the original MIDI note value
     * @return the modified note value 
     */
	@Override
	public int modifyPitch(int note) {
		return note + 2; 
	}
}