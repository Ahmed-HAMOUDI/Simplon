import java.time.LocalDate;

public class EmployeeFixe extends Employee {
	
	private Double Saliare;
	
	
	public Double getSaliare() {
		return Saliare;
	}
	public void setSaliare(Double saliare) {
		this.Saliare = saliare;
	}
	
	
	public EmployeeFixe() {}
	public EmployeeFixe(Double Saliare) {
		this.Saliare = Saliare;
	}
	public EmployeeFixe(Double Saliare, String nom ,String prenom ,LocalDate date_de_naissance) {
		super(nom, prenom, date_de_naissance);
		this.Saliare = Saliare;
	}

	
	@Override
	public String toString() {
		calculer_salaire();
		return super.toString();
	}
	@Override
	public void calculer_salaire() {
		// TODO Auto-generated method stub
		super.setSalaire_Emp(Saliare);
	}

	
}
