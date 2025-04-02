package myLittleMozart.midi;

import java.util.*;
import java.io.*;

public class MidiCsvParser {
	
	public List<MidiEventData> parseCsv(){
		String csvFile = "/Users/enobongoffiong/Downloads/mystery_song.csv";
        String line;
        String csvSplitBy = ",";
      List<MidiEventData> events = new ArrayList<MidiEventData>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                	int OnOff=0;
                	if(data[1] == "Note_off_c") {
                		OnOff = 0 ;
                	}
                	else {
                		OnOff = 1;
                	}
                    MidiEventData myObj = new MidiEventData(Integer.parseInt(data[0]), OnOff, Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                    events.add(myObj);
            }
                //System.out.println();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(events);
        return events;
    
	}
	
	}



 	
	 
 
