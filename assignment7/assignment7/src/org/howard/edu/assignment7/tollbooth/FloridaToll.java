package org.howard.edu.assignment7.tollbooth;

public class FloridaToll implements TollBooth {
	public FloridaToll()
   {
		truckcount = 0;
		receipts = 0;
	}

public void calculateToll(Truck T)
   {
		int axles = T.getAxles();
		int Weight = T.getWeight();
		int tollDue = 5*axles + 10*((Weight/1000)/2);
		System.out.println("Truck arrival - Axles: "+ axles + "Total weight: "+ Weight + "kg" + "Toll due: " + tollDue);
		truckcount = truckcount + 1;
		receipts = receipts + tollDue;

	}

public void DisplayData()
   {
		System.out.println("Totals since last collection -  Receipts: "+receipts + " Trucks: " + truckcount);
	}

public void reset()
{
		System.out.println("Totals since last collection -  Receipts: "+receipts + " Trucks: " + truckcount);
		truckcount = 0;
		receipts = 0;
}

int receipts;
int truckcount;
   }