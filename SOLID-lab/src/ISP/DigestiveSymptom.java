package ISP;

import java.util.HashMap;
import java.util.Map;

public class DigestiveSymptom extends Symptoms implements Curable{
	
	private int severityIndex;
	private int covidImpact;
	
	public DigestiveSymptom(int index, int impact) {
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

	public void cure() {
		System.out.println("treatment applied to: " + name );
	}
	
}
