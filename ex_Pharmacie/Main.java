import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		DossierPharmacie pharmacie = new DossierPharmacie("Bargaoui");
		pharmacie.nouveauPatient("Yasmine", new String[]{"Aspégic", "Algesic"});
        pharmacie.nouveauPatient("Nesrine", new String[]{"Efferalgant", "Algesic"});
        pharmacie.nouveauPatient("Aziz", new String[]{"Doliprane"});
        pharmacie.affiche();
        System.out.println();
        System.out.println("affichage du Patiente Yasmine");
        pharmacie.affichePatient ("yasmine");
        System.out.println();
        System.out.println("Ordonnace triée du Yasmine :");
        pharmacie.trieOrdonnanceDePatient("Yasmine");       
        System.out.println();
        System.out.println("affichage du Patient Ahmed");
        pharmacie.affichePatient ("ahmed");
        pharmacie.ajoutMedicament("yaSmine", "Humex");
        System.out.println();
        pharmacie.affiche();
        System.out.println();
        Collection<String> patientsAlgesic = pharmacie.affichePatientAvecMedicament("Algesic");
        System.out.print("Patients ayant pris de Algesic : ");
        for(String p:patientsAlgesic)
        System.out.print(p +" /");
        
	}

}
