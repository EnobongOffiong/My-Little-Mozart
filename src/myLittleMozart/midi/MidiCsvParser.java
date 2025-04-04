package myLittleMozart.midi;

import java.util.*;
import java.io.*;
import javax.sound.midi.*;

public class MidiCsvParser {
    public static List<MidiEventData> parseCsv(String filePath) {
        String line;
        String csvSplitBy = ",";
        List<MidiEventData> events = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(csvSplitBy);
                int OnOff = data[1].trim().equals("Note_off_c") ? ShortMessage.NOTE_OFF : ShortMessage.NOTE_ON;
                int tick = Integer.parseInt(data[0].trim());
                int channel = Integer.parseInt(data[2].trim());
                int note = Integer.parseInt(data[3].trim());
                int velocity = Integer.parseInt(data[4].trim());
                int instrument = Integer.parseInt(data[5].trim());
                MidiEventData myObj = new MidiEventData(tick, velocity, note, channel, instrument, OnOff);
                events.add(myObj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return events;
    }
}
	



 	
	 
 
