package Day3; 
class car {
	public int gear,speed;
	boolean clutch,accelerator;
	public void start()
	{
}
	public void stop()
	{
	}
	public void setSpeed(int i) {
	 speed = i;
	}
	public int getSpeed() {
		return speed;
	}
}
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1,c2;
		c1 = new car();
		c2 = new car();
		c1.setSpeed(100);
		c2.setSpeed(200);
	}

}
