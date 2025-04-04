package strategy;

public class AcousticGrandPianoStrategy implements InstrumentStrategy {
	private final int PIANO_INSTRUMENT = 0;
	
	@Override
	public void applyInstrument (track track, int channel) {
		
		try {
            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, PIANO_INSTRUMENT, 0);
            track.add(new MidiEvent(instrumentChange, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}