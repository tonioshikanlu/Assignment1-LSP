package org.howard.edu.lsp.exam.question42;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class tests {

	@Test
	void testAddNew() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		
		assertEquals("error in testAddNew()","Rap" ,db.getGenreOfSong("Savage"));
	}
	
	@Test
	void testAddMultiple() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Beast");
		assertEquals("error in testAddMultiple()","Rap" ,db.getGenreOfSong("Beast"));
	}
	
	@Test
	void testGetSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Beast");
		Set<String> expected = new HashSet<>(Arrays.asList("Savage", "Beast"));
		assertEquals("error in testGetSongs()",expected ,db.getSongs("Rap"));
	}
	
	@Test
	void testgetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Beast");
		assertEquals("error in testgetGenreOfSong()","Rap" ,db.getGenreOfSong("Beast"));
	}
	

}
