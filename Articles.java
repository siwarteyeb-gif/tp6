package tp6;

public class Articles extends Document{
	private String nom;
	public Articles(String titre,int id,int nbp,String nom) {
		super(titre,id,nbp);
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return "article";
	}
	public void edution() {
		System.out.println("le type : "+getType());
		super.edution();
	}
	

}
