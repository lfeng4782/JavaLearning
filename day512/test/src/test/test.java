package test;

/*class test {
	public static void main(String [] args) {
		int orig = 42;
		test x = new test();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
		}

int go(int arg) {
arg = arg * 2;
return arg;
}
}*/

class Clock {
String time;
public void setTime(String t) {
time = t;
}
public String getTime() {
return time;
}
}

class test {
public static void main(String [] args) {
	Clock c = new Clock();
c.setTime("1245");
String tod = c.getTime();
System.out.println("time: " + tod);
}
}
