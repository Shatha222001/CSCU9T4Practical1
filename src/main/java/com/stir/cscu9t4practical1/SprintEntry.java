package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

	private int Repetitions ;
	private int Recovery ;
	

	
	public SprintEntry(String n, int d , int m , int y , int min , int h , int s , float dist, int Repetitions , int Recovery )
	 {
		super (n,d,m,y,h,min,s,dist);
		this.Repetitions= Repetitions;
		this.Recovery= Recovery;
		
	}
	
	public int getRepetitions()
	{
		return Repetitions;
	}
	public int getRecovery()
	{
		return Recovery;
	}
	
	public String getEntry()
	{
		String result = getName()+" ran " + getDistance() + "km in" +
	            getHour()+":"+ getMin()+":"+getSec()+"on"
				+getDay()+"/"+getMonth()+"/"+getYear()+""+getRepetitions()+""+getRecovery()+"";
		return result;
				
	}
}
