import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeHoraire extends Employee {
	
	private Double taux_horaire, heures_prest�es;

	
	public Double getTaux_horaire() {
		return taux_horaire;
	}
	public void setTaux_horaire(Double taux_horaire) {
		this.taux_horaire = taux_horaire;
	}

	public Double getHeures_prest�es() {
		return heures_prest�es;
	}
	public void setHeures_prest�es(Double heures_prest�es) {
		this.heures_prest�es = heures_prest�es;
	}

	
	public EmployeeHoraire() {}
	public EmployeeHoraire(Double taux_horaire, Double heures_prest�es) {
		this.taux_horaire = taux_horaire;
		this.heures_prest�es = heures_prest�es;
	}
	public EmployeeHoraire(String nom, String prenom, LocalDate date_de_naissance, Double taux_horaire, Double heures_prest�es) {
		super(nom, prenom, date_de_naissance, null);
		this.taux_horaire = taux_horaire;
		this.heures_prest�es = heures_prest�es;
	}
	
	
	public void calculer_salaire() {
		super.setSalaire_Emp(taux_horaire * heures_prest�es);
	
	}
	
	
	@Override
	public String toString() {
		calculer_salaire();
		return super.toString();
	}
	

}
