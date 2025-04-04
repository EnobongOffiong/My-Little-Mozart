package strategy;

public class TrumpetStrategy implements InstrumentStrategy {
	private final int TRUMPET_INSTRUMENT = 56;
	
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

