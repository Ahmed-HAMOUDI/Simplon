import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeHoraire extends Employee {
	
	private Double taux_horaire, heures_prestées;

	
	public Double getTaux_horaire() {
		return taux_horaire;
	}
	public void setTaux_horaire(Double taux_horaire) {
		this.taux_horaire = taux_horaire;
	}

	public Double getHeures_prestées() {
		return heures_prestées;
	}
	public void setHeures_prestées(Double heures_prestées) {
		this.heures_prestées = heures_prestées;
	}

	
	public EmployeeHoraire() {}
	public EmployeeHoraire(Double taux_horaire, Double heures_prestées) {
		this.taux_horaire = taux_horaire;
		this.heures_prestées = heures_prestées;
	}
	public EmployeeHoraire(String nom, String prenom, LocalDate date_de_naissance, Double taux_horaire, Double heures_prestées) {
		super(nom, prenom, date_de_naissance, null);
		this.taux_horaire = taux_horaire;
		this.heures_prestées = heures_prestées;
	}
	
	
	public void calculer_salaire() {
		super.setSalaire_Emp(taux_horaire * heures_prestées);
	
	}
	
	
	@Override
	public String toString() {
		calculer_salaire();
		return super.toString();
	}
	

}
