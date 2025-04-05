package factory;

/**
 * A concrete factory generator for standard MIDI events.
 * 
 * Returns a {@link StandardMidiEventFactory}, which creates note events
 * with no timing adjustments—just basic note-on and note-off.
 */
public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	/**
     * Creates and returns a new instance of StandardMidiEventFactory.
     *
     * @return a factory for generating standard MIDI note events
     */
	public MidiEventFactory createFactory() {
        return new StandardMidiEventFactory();
    }
}
