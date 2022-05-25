import java.time.LocalDate;

public class EmployeeCommission extends Employee{
	
	private double Salaire, Commission;
	private int Ventes;
	
	
	public double getSalaire() {
		return Salaire;
	}
	public void setSalaire(double Salaire) {
		this.Salaire = Salaire;
	}
	
	public double getCommission() {
		return Commission;
	}
	public void setCommission(double Commission) {
		this.Commission = Commission;
	}
	
	public int getVentes() {
		return Ventes;
	}
	public void setVentes(int Ventes) {
		this.Ventes = Ventes;
	}
	
	
	public EmployeeCommission() {}
	public EmployeeCommission(double salaire, double commission, int ventes) {
		Salaire = salaire;
		Commission = commission;
		Ventes = ventes;
	}
	public EmployeeCommission(String nom, String prenom, LocalDate date_de_naissance , double salaire, double commission, int ventes) {
		super(nom, prenom, date_de_naissance, commission);
		Salaire = salaire;
		Commission = commission;
		Ventes = ventes;
	}
	
	public void calculer_salaire() {
		super.setSalaire_Emp(Salaire + (Ventes * Commission));
	}
	
	@Override
	public String toString() {
		calculer_salaire();
		return super.toString();
	}
	
	
	
	
	
}
