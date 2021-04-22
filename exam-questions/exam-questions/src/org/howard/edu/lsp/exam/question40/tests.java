package org.howard.edu.lsp.exam.question40;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class tests {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	void flyingGoosetest() {
		Flying flyingGoose = new Goose();
		flyingGoose.fly();
		
		assertEquals("error in goosetest()",  "The Goose flies foward\n", outContent.toString());
	}
	
	@Test
	void animalGoosetest() {
		Animals whiteGoose = new Goose();	
		whiteGoose.move();
		whiteGoose.speak();
		
		assertEquals("error in goosetest()",  "The Goose moves foward\nThe Goose speaks\n", outContent.toString());
	}
	
	@Test
	void animalTigertest() {
		Animals whiteTiger = new Tiger();	
		whiteTiger.move();
		whiteTiger.speak();
		
		assertEquals("error in goosetest()",  "The Tiger moves foward\nThe Tiger speaks\n", outContent.toString());
	}
	
	@Test
	void flyingAirplanetest() {
		Flying boeingPlane = new Airplane();	
		boeingPlane.fly();
		
		assertEquals("error in goosetest()",  "The Airplane flies forward\n", outContent.toString());
	}
	
	@Test
	void mixedMovetest() {
		Animals whiteTiger = new Tiger();	
		Animals whiteGoose = new Goose();	
		whiteTiger.move();
		whiteGoose.move();
		
		assertEquals("error in goosetest()",  "The Tiger moves foward\nThe Goose moves foward\n", outContent.toString());
	}
	
	@Test
	void mixedSpeaktest() {
		Animals whiteTiger = new Tiger();	
		Animals whiteGoose = new Goose();	
		whiteTiger.speak();
		whiteGoose.speak();
		
		assertEquals("error in goosetest()",  "The Tiger speaks\nThe Goose speaks\n", outContent.toString());
	}
	

}
