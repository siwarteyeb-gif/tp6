package tp6;

public class Test {
	public static void main(String[] args) {
	
	Biblio b=new Biblio(10);
	
	
	Document d=new Document("doc1",1,100);
	Articles art1 = new Articles("Art1", 2, 5, "Auteur1");
	Livres l1=new Livres("Livre1",2, 200, "Auteur2", "Editeur1");
	Periodique p=new Periodique("Per1", 4, 30, "pppp");
	b.ajoutDoc(l1);
	b.ajoutDoc(d);
	b.ajoutDoc(art1);
	b.ajoutDoc(p);
	System.out.println("la liste de tous le document est ----------");
	b.inventaire();
    b.supprime(1);
    System.out.println("apres supression ----------");
	b.inventaire();
	System.out.println("=== Liste des Livres ===");
    b.Bibliothequeliste_livre().inventaire();
    System.out.println("=== Liste des document ===");
    b.Bibliothequeliste_docSimple().inventaire();
    System.out.println("=== Liste des Periodique ===");
    b.Bibliothequeliste_Periodique().inventaire();
    System.out.println("=== Liste des Aticles ===");
    b.Bibliothequeliste_article().inventaire();
	

	

}}
