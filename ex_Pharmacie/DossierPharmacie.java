import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class DossierPharmacie {
		private String nom ;
		private HashMap <String , Patient > patients ;
		public DossierPharmacie ( String n){
		nom =n;
		patients = new HashMap <String ,Patient>();
		}

		void nouveauPatient ( String nom , String [] ord ){
			String nomP = nom.toLowerCase();
			 if (!patients.containsKey(nomP)) {
				 Patient patient = new Patient(nom);
				 for (String medicament : ord) {
		                patient.ajoutMedicament(medicament);
		            }
				 patients.put(nomP, patient);
			 }
			 else {
				 System.out.println("Patient déjà existant! ");
			 }
		}
		public boolean ajoutMedicament (String nom, String m){
			String nomP = nom.toLowerCase();
			if (patients.containsKey(nomP)) {
				Patient patient = patients.get(nomP);
				patient.ajoutMedicament(m);
				return true;
			}
			else
				return false;
		}
		public void affichePatient (String nom){
			String nomP = nom.toLowerCase();
			if (patients.containsKey(nomP)) {
				Patient patient = patients.get(nomP);
				 patient.affiche();
			}
			else {
				System.out.println("Patient non existant!");
			}
		}
		public void affiche() {
			System.out.println("Pharmacie de " + nom);
			for (Patient patient : patients.values()) {
				patient.affiche();
			}
		}
		public Collection<String> affichePatientAvecMedicament(String m) {
			Collection<String> patientsM = new ArrayList<>();
			for (Patient patient : patients.values()) {
				if (patient.contientMedicament(m)) {
					 patientsM.add(patient.getNom());
				}
			}
			return patientsM;
		}
		public void trieOrdonnanceDePatient(String nom) {
			 String nomP = nom.toLowerCase();
			    Patient patient = patients.get(nomP);
			    if (patient!= null) {
			        patient.trieOrdonnance();
			    } else {
			        System.out.println("Patient non existant!");
			    }
		}
}
