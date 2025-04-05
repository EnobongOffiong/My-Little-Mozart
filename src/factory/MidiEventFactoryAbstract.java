package factory;

/**
 * Interface for creating factory instances that generate MIDI events.
 * 
 * Useful for abstracting different MIDI event styles 
 */
public interface MidiEventFactoryAbstract {
	
	/**
     * Creates and returns a specific MidiEventFactory implementation.
     *
     * @return a MidiEventFactory instance
     */
	MidiEventFactory createFactory();
}
