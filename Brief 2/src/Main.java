import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	public static String prenom, nom;
	public static LocalDate date_de_naissance;
	public static char type_employee, Mode_payement;
	public static Double Salaire, Commission, taux_horaire, heures_prestées;
	public static int Ventes;
	
	
	public static void EmployesFixe() {
		
		System.out.println("-------------------------------------------Fixe---------------------------------------------");
		
		//----------------------------------------_Salaire-------------------------------------------
		System.out.println("\saisir votre Salaire :");
		Salaire = scan.nextDouble();
		
		//----------------------------------------Declaration_de_Class-------------------------------
		EmployeeFixe EmFi = new EmployeeFixe(Salaire, prenom, nom, date_de_naissance);
		
		//----------------------------------------Afficher_Class-------------------------------------
		System.out.println(EmFi.toString());
		
		System.out.println("---------------------------------------M E R C I---------------------------------------------");
	}
	
	public static void EmployesCommission() {
		
		System.out.println("--------------------------------------------Commission--------------------------------------------");
		
		//----------------------------------------_Salaire-------------------------------------------
		System.out.println("\saisir votre Salaire :");
		Salaire = scan.nextDouble();
		//----------------------------------------_ventes-------------------------------------------
		System.out.println("\saisir combient de ventes avez vous fait :");
		Ventes = scan.nextInt();
		//----------------------------------------Commission-------------------------------------------
		System.out.println("\saisir commission il est la commission :");
		Commission = scan.nextDouble();
		
		//----------------------------------------Declaration_de_Class-------------------------------
		EmployeeCommission EmCo = new EmployeeCommission(prenom, nom, date_de_naissance, Salaire, Commission, Ventes);
		
		//----------------------------------------Afficher_Class-------------------------------------
		System.out.println(EmCo.toString());
		
		System.out.println("---------------------------------------M E R C I---------------------------------------------");
	}
	
	public static void EmployeeHoraire() {
		
		System.out.println("---------------------------------------------Horaire-------------------------------------------");
		
		//----------------------------------------Mode_de_payement---------------------------------------
		System.out.println("\saisir votre mode de payement");
		System.out.println("\tmensuel taper M \thebdomadaire taper H");
		do {
			Mode_payement = Character.toUpperCase(scan.next().charAt(0)); 
		}while(Mode_payement == 'M' && Mode_payement == 'H');
		
		
		//----------------------------------------taux_horaire-------------------------------------------
		System.out.println("\tsaisir votre taux horaire :");
		taux_horaire = scan.nextDouble();
		//----------------------------------------heures_prestées----------------------------------------
		System.out.println("\tsaisir votre heures prestées :");
		heures_prestées = scan.nextDouble();
		 if ( Mode_payement == 'M' && heures_prestées > 200) {
				System.out.println(" Max est 200h ");
				System.exit(0);
				 }
		 if (heures_prestées > 50 && Mode_payement == 'H' ) {
				System.out.println(" Max est 50 h ");
				System.exit(0);
				 }
		//----------------------------------------Declaration_de_Class-------------------------------
		EmployeeHoraire EmHo = new EmployeeHoraire(prenom, nom,date_de_naissance, taux_horaire, heures_prestées);
		
		//----------------------------------------Afficher_Class-------------------------------------
		System.out.println(EmHo.toString());
		
		System.out.println("---------------------------------------M E R C I---------------------------------------------");
	}
	
	public static void main(String[] args) {


		System.out.println("---------------------------------------HELLO ---------------------------------------");
		
		
		//----------------------------------------_Prenom-------------------------------------
		System.out.println("\tsaisir votre Prenom :");
		prenom = scan.nextLine();
		
		//----------------------------------------_nom----------------------------------------
		System.out.println("\tsaisir votre Nom :");
		nom = scan.nextLine();
		
		//----------------------------------------Date_de_naissance---------------------------
		System.out.println("\tsaisir votre Date de naissance :");
		date_de_naissance = LocalDate.of(scan.nextInt() , scan.nextInt() , scan.nextInt());
		
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		//----------------------------------------type_de_employés---------------------------
		System.out.println("\tQelle type de employés eter vous");
		System.out.println("\tFixe tapper F\tCommission tapper C\tHoraire tapper H");
		do {
			type_employee = Character.toUpperCase(scan.next().charAt(0));
		}while(type_employee != 'F' && type_employee != 'C' && type_employee != 'H');
		
		//----------------------------------------Switch_les_type---------------------------
		switch (type_employee) {
		case 'F' : 
			EmployesFixe();
			break;
		case 'C' : 
			EmployesCommission();
			break;
		case 'H' : 
			EmployeeHoraire();
			
			
			break;
	}
		
		 
		
	}

}
