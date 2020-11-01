package LSK;

import java.util.HashMap;
import java.util.Map;

public class afection extends Covid19Pacient{

	private int afection=0;
	private int elems = 1;
	
	public int getAfection(Map<Symptoms,Integer> sintomak) {
		for(Symptoms s:sintomak.keySet())
			if(s.getCovidImpact()>50) {
				afection=afection+s.getSeverityIndex()*sintomak.get(s);
				elems++;
			}
	return afection=afection/elems;
	}
}
