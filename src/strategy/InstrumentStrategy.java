package strategy;

import javax.sound.midi.*;

/**
 * Strategy interface for applying a specific instrument to a MIDI track.
 * 
 * Implementations define how and which instrument is set on a given channel.
 */
public interface InstrumentStrategy {
	
	/**
     * Applies an instrument change to the given MIDI track and channel.
     *
     * @param track   the MIDI track where the instrument will be applied
     * @param channel the MIDI channel to set the instrument on
     */
	void applyInstrument (Track track, int channel);
}

