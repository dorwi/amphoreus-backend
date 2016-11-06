package hello;

import javax.persistence.*;

/**
 * Created by dorwi on 06.11.16.
 */

@Entity
@Table(name = "bulletin")
public class Publication {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private final long id;
    private final String anneebull;
    private final String numbull;
    private final String auteur;
    private final String auteursimple;
    private final String annee;
    private final String titre;
    private final String inauteurs;
    private final String intitre;
    private final String collection;
    private final String ville;
    private final String pages;
    private final String cr;
    private final String resume;
    private final String prod;
    private final String cons;


    public Publication() {
        this.id = 0;
        this.anneebull ="";
        this.numbull = "";
        this.auteur = "Author";
        this.auteursimple = "";
        this.annee = "";
        this.titre = "Title";
        this.inauteurs = "";
        this.intitre = "";
        this.collection = "";
        this.ville = "";
        this.pages = "";
        this.cr = "";
        this.resume = "";
        this.prod = "";
        this.cons = "";

    }


    public Publication(long id, String anneebull, String numbull, String auteur, String auteursimple, String annee, String titre, String inauteurs, String intitre, String collection, String ville, String pages, String cr, String resume, String prod, String cons) {
        this.id = id;
        this.anneebull = anneebull;
        this.numbull = numbull;
        this.auteur = auteur;
        this.auteursimple = auteursimple;
        this.annee = annee;
        this.titre = titre;
        this.inauteurs = inauteurs;
        this.intitre = intitre;
        this.collection = collection;
        this.ville = ville;
        this.pages = pages;
        this.cr = cr;
        this.resume = resume;
        this.prod = prod;
        this.cons = cons;
    }


    public long getId() {
        return id;
    }

    public String getAnneebull() {
        return anneebull;
    }

    public String getNumbull() {
        return numbull;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getAuteursimple() {
        return auteursimple;
    }

    public String getAnnee() {
        return annee;
    }

    public String getTitre() {
        return titre;
    }

    public String getInauteurs() {
        return inauteurs;
    }

    public String getIntitre() {
        return intitre;
    }

    public String getCollection() {
        return collection;
    }

    public String getVille() {
        return ville;
    }

    public String getPages() {
        return pages;
    }

    public String getCr() {
        return cr;
    }

    public String getResume() {
        return resume;
    }

    public String getProd() {
        return prod;
    }

    public String getCons() {
        return cons;
    }
}
