package n2exercici1;


public class Restaurant {
    public String nom;
    public int punt;

    public Restaurant(String nom, int punt){
        this.nom = nom;
        this.punt = punt;
    }

    public String getNom() {
        return nom;
    }
    public String getNomLowerCase(){
        return getNom().toLowerCase();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }
    @Override
    public boolean equals(Object rest){
        if(rest == this){
            return true;
        }
        if(rest==null){
            return false;
        }
        if(rest instanceof Restaurant){
            Restaurant r = (Restaurant) rest;
            return this.getNom().equalsIgnoreCase(r.getNom()) && this.punt == r.punt;
        }
        return false;
    }

    public String toString(){
        return ("Nom : " + this.nom + ". Puntuació: " + this.punt);
    }
    public int hashCode(){
        int valor;
        valor = this.punt + this.getNomLowerCase().hashCode();
        return valor;
    }
}
