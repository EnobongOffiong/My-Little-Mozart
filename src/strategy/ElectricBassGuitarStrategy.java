package strategy;

import javax.sound.midi.*;

/**
 * Strategy for setting the instrument to Electric Bass (finger).
 * 
 * Applies a MIDI program change to switch the channel to instrument 33,
 * which corresponds to Electric Bass in General MIDI.
 */
public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	private final int ELECTRIC_BASS_INSTRUMENT = 33;
	
	/**
     * Applies the Electric Bass instrument to the specified channel on the track.
     *
     * @param track   the MIDI track to apply the instrument change to
     * @param channel the MIDI channel to set the instrument on
     */
	@Override 
	public void applyInstrument(Track track, int channel){
		try {
            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ELECTRIC_BASS_INSTRUMENT, 0);
            track.add(new MidiEvent(instrumentChange, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}