package OCP;

import java.util.HashMap;
import java.util.Map;

public class NeuroMuscularSymptom extends Symptoms {
	
	private int severityIndex;
	private int covidImpact;
	
	public NeuroMuscularSymptom(int index, int impact) {
		super(index, impact);
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}

	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

}
