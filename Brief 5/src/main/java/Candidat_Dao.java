import java.sql.*;
public class Candidat_Dao implements DAO{
	public String sql;
	public Connect con;
	public void Create(Candidat candid) {
		try {
			con = new Connect();
			
			PreparedStatement ps = con.connect().prepareStatement("Insert into condidats values (?,?,?,?,?,?,?)");
			 
			ps.setInt(1, candid.getUserid());
			ps.setString(2, candid.getNom());
			ps.setString(3, candid.getPrenom());
			ps.setString(4, candid.getMail());
			ps.setString(5, candid.getAdresse());
			ps.setString(6, candid.getVille());
			ps.setString(7, candid.getPays());

			ps.execute();

			con.connect().commit();
			ps.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		

	public void Read(Candidat candid) {
		try {
			sql = "Select * from condidats";

			con = new Connect();

			Statement stat = (Statement) con.connect().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				
				candid.setUserid(ResSet.getInt("userid"));
				candid.setNom(ResSet.getString("nom"));
				candid.setPrenom(ResSet.getString("prenom"));
				candid.setMail(ResSet.getString("Mail"));
				candid.setAdresse(ResSet.getString("Adresse"));
				candid.setVille(ResSet.getString("Ville"));
				candid.setPays(ResSet.getString("Pays"));
				
				System.out.println(candid.toString());
				
			}
			ResSet.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	

	public void Update(Candidat candid) {
	
		try {
			con = new Connect();
			
			sql = "UPDATE condidats SET Nom = '"+ candid.getNom() +"',Prenom = '"+ candid.getPrenom() +"',Mail = '" + candid.getMail() + "',"
					+ "Adresse = '"+ candid.getAdresse() +"',Ville = '"+ candid.getVille() +"',Pays = '"+ candid.getPays() +"' "
							+ "WHERE userid = '" + candid.getUserid() + "'";
			
			
			PreparedStatement ps = con.connect().prepareStatement(sql);

			ps.execute();

			con.connect().commit();
			ps.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public void Delete(Candidat candid) {
		try {
			con = new Connect();
			
			sql = "DELETE FROM condidats WHERE userid = '" + candid.getUserid() + "'";

			PreparedStatement ps = con.connect().prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	}

