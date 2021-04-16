package org.howard.edu.assignment7.tollbooth;

public class KiaTruck extends FloridaToll implements Truck {
	public KiaTruck(int axles, int Weight)
   {
		this.axles = axles;
		this.Weight = Weight;
	}

public int getAxles()
   {
       return axles;
   }

public int getWeight()
   {
       return Weight;
   }

int axles;
int Weight;

}