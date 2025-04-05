package strategy;

import javax.sound.midi.*;

/**
 * Strategy for setting the instrument to Acoustic Grand Piano.
 * 
 * This applies a MIDI program change on the given track and channel
 * to switch to instrument 0 (Acoustic Grand Piano).
 */
public class AcousticGrandPianoStrategy implements InstrumentStrategy {
	private final int PIANO_INSTRUMENT = 0;
	
	/**
     * Applies the Acoustic Grand Piano instrument to the specified channel on the track.
     *
     * @param track   the MIDI track to apply the instrument change to
     * @param channel the MIDI channel to set the instrument on
     */
	@Override
	public void applyInstrument (Track track, int channel) {
		
		try {
            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, PIANO_INSTRUMENT, 0);
            track.add(new MidiEvent(instrumentChange, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}