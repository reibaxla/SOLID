package OCP;

public abstract class Symptoms extends Pacient {

	int severityIndex;
	int covidImpact;
	int affectedDays;

	public Symptoms(int severityIndex, int covidImpact) {
		this.severityIndex = severityIndex;
		this.covidImpact = covidImpact;
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
	public int getAffectedDays() {
		return affectedDays;
	}
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}
	
}
