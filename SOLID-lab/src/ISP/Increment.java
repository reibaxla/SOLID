package ISP;

import java.util.Map;

public class Increment extends Covid19Pacient implements CalcIncrement{

	public double getIncrement(Adina years, int afection) {
		if(years.getYears()> 65)
			return 0.5;
		else if(years.getYears()<65 && years.getYears()>45)
			return 0.3;
		else return 0;
	}
}
