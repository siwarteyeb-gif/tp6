package tp6;

public class Livres extends Articles {
	private String nomedt;
	public Livres(String titre,int id,int nbp,String nom,String nomedt) {
		super(titre,id,nbp,nom);
		this.nomedt=nomedt;
	}
	public String getNomedt() {
		return nomedt;
	}
	public void setNom(String nomedt) {
		this.nomedt = nomedt;
	}
	public String getType() {
		return "Livre";
	}
	public void edution() {
		System.out.println("le type : "+getType());
		super.edution();
	}

}
