package tp6;

public class Biblio {
	Document[]listdoc;
	private int nbdc;
	private int cap;
	public Biblio(int cap) {
		this.cap=cap;
		listdoc=new Document[cap];
	}
	public int getCap() {
	return cap;}
		public void ajoutDoc(Document d) {
		    if (nbdc >= cap) {
		        System.out.println("La bibliothèque est pleine");
		        return;
		    }

		    int pos = 0;

		   
		    while (pos < nbdc && listdoc[pos].id < d.id) {
		        pos++;
		    }

		  
		    for (int i = nbdc; i > pos; i--) {
		        listdoc[i] = listdoc[i - 1];
		    }

		    
		    listdoc[pos] = d;
		    nbdc++;
		}
	public void supprime(int num) {
		int i=0;
		boolean trouve =false;
		while (trouve==false && i<nbdc) {
			if(listdoc[i].id==num) {
				trouve=true;
				for(int j=i;j<nbdc;j++) {
					listdoc[j]=listdoc[j+1];
				}
				i++;
				listdoc[nbdc-1]=null;
				nbdc--;
			}
		}
	}
	public void inventaire() {
		for(int i=0;i<nbdc;i++) {
			listdoc[i].edution();
			System.out.println("--------");
		}
	}
	public int getNombredoc() {
		return nbdc;
	
	}
	public Biblio Bibliothequeliste_livre() {
		Biblio b=new Biblio(cap);
		for(int i=0;i<nbdc;i++) {
			if (listdoc[i] instanceof Livres) {
			b.ajoutDoc(listdoc[i]);
		}}
		return b;
		
	}
	public Biblio Bibliothequeliste_article() {
		Biblio b=new Biblio(cap);
		for(int i=0;i<nbdc;i++) {
			if (listdoc[i] instanceof Articles) {
			b.ajoutDoc(listdoc[i]);
		}}
		return b;
		
	}
	public Biblio Bibliothequeliste_docSimple() {
		Biblio b=new Biblio(cap);
		for(int i=0;i<nbdc;i++) {
			if (listdoc[i] instanceof Document) {
			b.ajoutDoc(listdoc[i]);
		}}
		return b;
		
	}
	public Biblio Bibliothequeliste_Periodique() {
		Biblio b=new Biblio(cap);
		for(int i=0;i<nbdc;i++) {
			if (listdoc[i] instanceof Periodique) {
			b.ajoutDoc(listdoc[i]);
		}}
		return b;
		
	}
	
	}
	


