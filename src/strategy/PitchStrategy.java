package strategy;

/**
 * Strategy interface for modifying the pitch of a MIDI note.
 * Implementations can shift the pitch up, down, or apply any custom transformation.
 */
public interface PitchStrategy {
	
	/**
     * Modifies the given MIDI note value.
     *
     * @param note the original MIDI note 
     * @return the modified note value
     */
	int modifyPitch ( int note);
}



