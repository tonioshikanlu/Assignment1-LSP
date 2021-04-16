package org.howard.edu.assignment7.junit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.howard.edu.assignment7.tollbooth.*;

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
	void calculateTolltest() {
		TollBooth booth = new FloridaToll();

		Truck toyota = new ToyotaTruck(5, 12000); 	// 5 axles and 12000 kilograms
		booth.calculateToll(toyota);
		assertEquals("error in calculateToll()",  "Truck arrival - Axles: 5" + "Total weight: 12000kg" + "Toll due: 85\n", outContent.toString());
	}
	@Test
	void displayDatatest() {
		TollBooth booth = new FloridaToll();

		Truck toyota = new ToyotaTruck(5, 12000); 	// 5 axles and 12000 kilograms
		Truck kia = new KiaTruck(2, 5000); 	// 2 axles and 5000kg
		booth.calculateToll(toyota);
		booth.calculateToll(kia);
		booth.DisplayData();
		assertEquals("Truck arrival - Axles: 5Total weight: 12000kgToll due: 85\n"
				+ "Truck arrival - Axles: 2Total weight: 5000kgToll due: 30\n"
				+ "Totals since last collection -  Receipts: 115 Trucks: 2\n"
				, outContent.toString());

	}
	@Test
	void Resettest() {
		TollBooth booth = new FloridaToll();

		Truck toyota = new ToyotaTruck(5, 12000); 	// 5 axles and 12000 kilograms
		Truck kia = new KiaTruck(2, 5000); 	// 2 axles and 5000kg
		booth.calculateToll(toyota);
		booth.reset();
		booth.DisplayData();
		assertEquals("Truck arrival - Axles: 5Total weight: 12000kgToll due: 85\n"
				+ "Totals since last collection -  Receipts: 85 Trucks: 1\n"
				+ "Totals since last collection -  Receipts: 0 Trucks: 0\n"
				, outContent.toString());

	}
	@Test
	void gaeAxlestest() {
		TollBooth booth = new FloridaToll();

		Truck toyota = new ToyotaTruck(5, 12000); 	// 5 axles and 12000 kilograms
		Truck kia = new KiaTruck(2, 5000); 	// 2 axles and 5000kg
		assertEquals(kia.getAxles(), 2);
		assertEquals(toyota.getAxles(), 5);
	}
	@Test
	void getWeighttest() {
		TollBooth booth = new FloridaToll();

		Truck toyota = new ToyotaTruck(5, 12000); 	// 5 axles and 12000 kilograms
		Truck kia = new KiaTruck(2, 5000); 	// 2 axles and 5000kg
		assertEquals(kia.getWeight(),5000);
		assertEquals(toyota.getWeight(),12000);
	}
}