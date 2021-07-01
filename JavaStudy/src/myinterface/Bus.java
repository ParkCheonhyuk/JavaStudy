package myinterface;

public class Bus implements Vehicle{
	
	int speed=0;
	int passenger=0;
	
	@Override
	public int acceleration() {
		
		return ++speed;
	}

	@Override
	public int deceleration() {

		return speed == 0 ? 0:--speed;
	}

	@Override
	public boolean ride() {
		if(passenger < 10) {
			passenger++;
			return true;
		}
		return false;
	}
}
