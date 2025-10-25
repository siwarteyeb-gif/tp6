package tp6;

public class Periodique extends Document {
	private String frq;
	public Periodique(String titre,int id,int nbp,String frq) {
		super(titre,id,nbp);
		this.frq=frq;
	}
	public String getFrq() {
		return frq;
	}
	public void setFrq(String frq) {
		this.frq = frq;
	}
	public String getType() {
		return "Periodiques";
	}
	public void edution() {
		System.out.println("le type : "+getType());
		super.edution();
	}

}
