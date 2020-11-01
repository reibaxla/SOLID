package SRP;

import java.util.HashMap;
import java.util.Map;

public class CardioVascularSymptom extends Symptoms {
	
	private int severityIndex;
	private int covidImpact;
	
	public CardioVascularSymptom(int index, int impact) {
		super(index, impact);
	}
	
	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	
}
