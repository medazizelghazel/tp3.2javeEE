package test;

public class Personne {
    private String nom;
    private String prenom;
    private String sex;
    private int cpost;
    
    public Personne(String nom, String prenom, String sex, int cpost) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sex = sex;
		this.cpost = cpost;
	}
    
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getCpost() {
		return cpost;
	}
	public void setCpost(int cpost) {
		this.cpost = cpost;
	}
	

    
}