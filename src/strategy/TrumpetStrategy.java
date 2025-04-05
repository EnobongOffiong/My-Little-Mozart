package strategy;
import javax.sound.midi.*;

/**
 * Strategy for setting the instrument to Trumpet.
 * 
 * Applies a MIDI program change to switch the channel to instrument 56,
 * which is the Trumpet in the General MIDI sound set.
 */
public class TrumpetStrategy implements InstrumentStrategy {
	private final int TRUMPET_INSTRUMENT = 56;
	
	/**
     * Applies the Trumpet instrument to the specified channel on the track.
     *
     * @param track   the MIDI track to apply the instrument change to
     * @param channel the MIDI channel to set the instrument on
     */
	@Override
	 public void applyInstrument(Track track, int channel) {
        try {
            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, TRUMPET_INSTRUMENT, 0);
            track.add(new MidiEvent(instrumentChange, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}

