package LSK;

import java.util.Map;

public class Increment extends Covid19Pacient {

	public double getIncrement(int adina) {
		if(adina> 65)
			return 0.5;
		else if(adina<65 && adina>45)
			return 0.3;
		else return 0;
	}
}
