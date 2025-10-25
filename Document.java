package tp6;

public class Document {
	protected String titre;
	protected int id;
	protected int nbp;
	public Document() {}
	public Document(String titre,int id,int nbp) {
		this.titre=titre;
		this.id=id;
		this.nbp=nbp;
	}
	public void edution() {
		System.out.println("titre : "+titre+" identifiant : "+id+" nombre de page : "+nbp);
	}
	public String getType() {
		return "";
	}

}
