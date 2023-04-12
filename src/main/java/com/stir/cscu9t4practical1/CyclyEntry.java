package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry{
	
	private String terrain;
	private String tempo; 
	
	public CycleEntry(String n, int d , int m , int y , int min , int h , int s , float dist, String terrain, String tempo )
	{
		super (n,d,m,y,h,min,s,dist);
		this.terrain= terrain;
		this.tempo= tempo;
	}
	
	public String getterrain()
	{
		return terrain;
	}
	
	public String gettempo()
	{
		return tempo;
	}
	
	public String getEntry()
	{
		String result = getName()+" ran " + getDistance() + "km in" +
	            getHour()+":"+ getMin()+":"+getSec()+"on"
				+getDay()+"/"+getMonth()+"/"+getYear()+""+getterrain()+""+gettempo()+"";
		return result;
				
	}

}
