package factory;

/**
 * A factory generator for staccato-style MIDI events.
 *
 */
public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	/**
     * Creates and returns a new instance of StaccatoMidiEventFactory.
     *
     * @return a factory for generating staccato MIDI note events
     */
	public MidiEventFactory createFactory() {
        return new StaccatoMidiEventFactory();
    }
}
