package tp6;

public class CCc {
	public void ajoutDoc(Document d) {
		int j=0;
		Document aux;
		if(cap>nbdc) {
			for(int i=0;i<nbdc;i++) {
				if(listdoc[i].id>d.id) {
					aux=listdoc[i+1];
					listdoc[i+1]=listdoc[i];
					listdoc[i]=d;
					
					
					nbdc++;
					for(j=i+2;j<nbdc;j++) {
						listdoc[j]=aux;
						aux=listdoc[j+1];
					}
				}
				else {
					listdoc[nbdc]=d;
				}
			}
		}
		else {
			System.out.println("la biblio est pleine");
		}
	}
}
