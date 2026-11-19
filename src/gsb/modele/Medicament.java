package gsb.modele;

public class Medicament {
	protected String depotLegal ;
	protected String nomCommercial ;
	protected String compo ;
	protected String effets ;
	protected String contreIndic ;
	protected float prixEchantillon;
	protected String code ;
	protected String libelle ;
	
	
	public Medicament(String depotLegal, String nomCommercial, String compo,
			String effets, String contreIndic, float prixEchantillon,
			String code, String libelle) {
		this.depotLegal = depotLegal;
		this.nomCommercial = nomCommercial;
		this.compo = compo;
		this.effets = effets;
		this.contreIndic = contreIndic;
		this.code = code;
		this.libelle = libelle;
	}


	public String getDepotLegal() {
		return depotLegal;
	}


	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal;
	}


	public String getNomCommercial() {
		return nomCommercial;
	}


	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}


	public String getCompo() {
		return compo;
	}


	public void setCompo(String compo) {
		this.compo = compo;
	}


	public String getEffets() {
		return effets;
	}


	public void setEffets(String effets) {
		this.effets = effets;
	}


	public String getContreIndic() {
		return contreIndic;
	}


	public void setContreIndic(String contreIndic) {
		this.contreIndic = contreIndic;
	}


	public float getPrixEchantillon() {
		return prixEchantillon;
	}


	public void setPrixEchantillon(float prixEchantillon) {
		this.prixEchantillon = prixEchantillon;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
