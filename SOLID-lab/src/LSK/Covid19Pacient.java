package LSK;

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
	
	public void showSymptoms(){
		for(Symptoms s: sintomak.keySet())
			s.show();
	}
	public void cure(){
		for(Symptoms s: sintomak.keySet())
			if(s instanceof Curable)
				((Curable) s).cure();
	}
	
	public int sanatedDays() {
		int maximoa = 0;
		for(Symptoms c:sintomak.keySet()) {
			if(maximoa < c.getAffectedDays());
				maximoa = c.getAffectedDays();
		}
		return maximoa;
	}			
	
	double calcCovid19Impact() {
		double afekzioa=0;
		double increment=0;
		double impact;
		//calculate afection
		afection a = new afection();
		afekzioa = a.getAfection(sintomak);
		
		//calculate increment
		Increment b = new Increment();
		increment = b.getIncrement(getYears());
		//calculate impact
		impact=afekzioa+increment;
		return impact;
		}
	
}

