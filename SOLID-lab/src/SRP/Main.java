package SRP;

public class Main {

public static void main(String args[]) {
	
//Lehenik Covid19 a duen pazientea sortu:
Covid19Pacient xabier = new Covid19Pacient();
xabier.setName("Xabier");
xabier.setYears(80);

//Gaixotasunak sortu
DigestiveSymptom digestiboa = new DigestiveSymptom(1,1);
NeuroMuscularSymptom neuro = new NeuroMuscularSymptom(2,3);
RespiratorySymptom biriketakoa = new RespiratorySymptom(3,2);
CardioVascularSymptom cardio = new CardioVascularSymptom(4,3);

//Gaixotasunak gehitu
xabier.addSymptom(digestiboa, 1);
xabier.addSymptom(neuro, 2);
xabier.addSymptom(biriketakoa, 3);
xabier.addSymptom(cardio, 4);

//Xabierren gain duen impaktua kalkulatu:

System.out.println(xabier.getName() + " -en gain duen efektua = " + xabier.calcCovid19Impact()); 

//4. Zatia, gaixotasunek affectedDays atributua badute.

digestiboa.setAffectedDays(10);
neuro.setAffectedDays(8);
biriketakoa.setAffectedDays(4);
cardio.setAffectedDays(9);

System.out.println(xabier.getName() + " -ri " + xabier.sanatedDays() + " egun iraun dio gaixotasunak");

}
	
}
