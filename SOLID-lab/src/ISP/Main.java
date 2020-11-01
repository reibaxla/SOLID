package ISP;

public class Main {

public static void main(String args[]) {
	
//Lehenik Covid19 a duen pazientea sortu:
Covid19Pacient xabier = new Covid19Pacient();
xabier.setName("Xabier");
xabier.setYears(80);

//Gaixotasunak sortu
DigestiveSymptom digestiboa = new DigestiveSymptom(60,800);
NeuroMuscularSymptom neuro = new NeuroMuscularSymptom(20,300);
RespiratorySymptom biriketakoa = new RespiratorySymptom(60,500);

//Gaixotasunak gehitu
xabier.addSymptom(digestiboa, 1);
xabier.addSymptom(neuro, 2);
xabier.addSymptom(biriketakoa, 3);

//Xabierren gain duen impaktua kalkulatu:

afection a = new afection();
Increment b = new Increment();


System.out.println(xabier.getName() + " -en gain duen efektua = " + xabier.calcCovid19Impact(a, b)); 


}
	
}
