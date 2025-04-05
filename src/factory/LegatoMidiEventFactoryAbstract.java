package factory;

/**
 * An implementation of MidiEventFactoryAbstract that produces
 * a LegatoMidiEventFactory.
 * 
 * Used when you want to generate legato-style MIDI events.
 */
public class LegatoMidiEventFactoryAbstract  implements MidiEventFactoryAbstract{
	
	/**
     * Creates and returns a new instance of LegatoMidiEventFactory.
     *
     * @return a LegatoMidiEventFactory for generating legato MIDI events
     */
	public MidiEventFactory createFactory() {
        return new LegatoMidiEventFactory();
    }
}
