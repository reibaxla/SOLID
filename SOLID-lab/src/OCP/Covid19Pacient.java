package OCP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	Map<Symptoms,Integer> sintomak = new HashMap<Symptoms,Integer>();
	
	public Covid19Pacient() {
		super();
	}
	
	public void addSymptom(Symptoms r, Integer w) {
		
		sintomak.put(r,w);
		
	}
	
	public int sanatedDays() {
		int maximoa = 0;
		for(Symptoms c:sintomak.keySet()) {
			if(maximoa < c.getAffectedDays()) {
				maximoa = c.getAffectedDays();
			}
		}
		return maximoa;
	}
	
	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		for(Symptoms c:sintomak.keySet()) {
			afection=afection+c.getSeverityIndex()*sintomak.get(c);
		}
		afection=afection/(sintomak.size());
		
		//calculate increment
		if(getYears()>65) 
			increment=afection*0.5;
		//calculate impact
		impact=afection+increment;
		return impact;
		}
	
		}

