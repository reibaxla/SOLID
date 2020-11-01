package DIP;

import java.util.Map;

public class Increment extends Covid19Pacient implements CalcIncrement{

	public double getIncrement(int adina) {
		if(adina> 65)
			return 0.5;
		else if(adina<65 && adina>45)
			return 0.3;
		else return 0;
	}
}
