package model;

public class Produit {
    private int id;
    private String typeProduit;
    private int prix;

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(String typeProduit) {
        this.typeProduit = typeProduit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Produit(int id, String typeProduit, int prix) {
        this.id = id;
        this.typeProduit = typeProduit;
        this.prix = prix;
    }


}
