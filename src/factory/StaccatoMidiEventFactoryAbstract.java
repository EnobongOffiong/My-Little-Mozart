package factory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	public MidiEventFactory createFactory() {
        return new StaccatoMidiEventFactory();
    }
}
