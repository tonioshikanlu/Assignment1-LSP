package org.howard.edu.lsp.exam.question42;
import java.util.*;
import java.util.Map.Entry;

public class SongsDatabase {
	private Map<String, Set<String>> map = 
new HashMap<String, Set<String>>();

		/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		 	
		 	if (map.containsKey(genre) == false) {
		 		
		 		Set<String> itemSet = new HashSet<String>();
		 		itemSet.add(songTitle);
		 		map.put(genre, itemSet);
		 		
		 	} else {
		 		Set<String> itemSet = map.get(genre);
		 		itemSet.add(songTitle);
		 		map.put(genre, itemSet);
		 	}
		
		}


	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		return map.get(genre);
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		for (Entry<String, Set<String>> entry : map.entrySet()) {
			for (String song : entry.getValue()) {
				if (song == songTitle) {
					return entry.getKey();
				}
			}
		
		}
            
        
		return null;
	}
}
