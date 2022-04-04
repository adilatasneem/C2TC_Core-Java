package Day1;

class Demo {
private int gear, speed;
boolean clutch,Break, accelerate;
public void start ()
{
setGear(1);
speed=10;
}
public void stop()
{
speed = 0; 
}
public int getSpeed()
{
return speed;
}
public void setSpeed(int k)
{
if (k >= 0)
speed = k;
}
public int getGear() {
	return gear;
}
public void setGear(int gear) {
	this.gear = gear;
}

public static void main (String[] agrs) {
	}
}