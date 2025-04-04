package factory;

public class LegatoMidiEventFactoryAbstract  implements MidiEventFactoryAbstract{
	public MidiEventFactory createFactory() {
        return new LegatoMidiEventFactory();
    }
}
