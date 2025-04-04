package strategy;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	private final int ELECTRIC_BASS_INSTRUMENT = 33;
	@Override 
	public void applyInstument(Track track, int channel){
		try {
            ShortMessage instrumentChange = new ShortMessage();
            instrumentChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, ELECTRIC_BASS_INSTRUMENT, 0);
            track.add(new MidiEvent(instrumentChange, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}