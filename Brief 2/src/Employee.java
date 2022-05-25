import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

	private  String nom;
	private String prenom;
	private LocalDate date_de_naissance;
	private Double Salaire_Emp;
	
	
	
	public  void setNom (String newNom) {
		nom = newNom;}
	public void setPrenom (String newPrenom) {
		prenom = newPrenom;}
	public void setDate_de_naissance (LocalDate newDate_de_naissance) {
		date_de_naissance = newDate_de_naissance ;}
	
	
	public String getNom () {
	 return  nom;}
	
	public String getPrenom () {
		return prenom;}
	public LocalDate getDate_de_naissance() {
		return date_de_naissance ;}
	
	public Double getSalaire_Emp() {
		return Salaire_Emp;
	}
	public void setSalaire_Emp(Double salaire_Emp) {
		Salaire_Emp = salaire_Emp;
	}
	
	
	 
	public Employee() {}
	public Employee(String nom, String prenom, LocalDate date_de_naissance, Double salaire_Emp) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
		this.Salaire_Emp = salaire_Emp;
	}
	
	
	public Employee(String nom, String prenom, LocalDate date_de_naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
	}
	public void calculer_salaire() {
		
	}
	
	
	public int Age() {
		return LocalDateTime.now().getYear() - date_de_naissance.getYear();
	}
	
	
	@Override
	public String toString() {
		return "Employee [Nom=" + nom + ", Prenom=" + prenom + ", Date_de_naissance=" + date_de_naissance + ", Votre Salaire est =" + Salaire_Emp + "]";
	}
	
	

}

