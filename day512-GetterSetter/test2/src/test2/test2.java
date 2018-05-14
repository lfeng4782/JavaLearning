package test2;

class Clock {
	String myTime;
	public void SetTime(String t) {
		myTime=t;
	}
	
	public String GetTime() {
		return myTime;
	}
	
}

public class test2{
	public static void main (String args) {
		Clock c=new Clock();
		c.SetTime("1234");
		String t=c.GetTime();
		
		System.out.println("The time is " + t);
	}
	
	
}