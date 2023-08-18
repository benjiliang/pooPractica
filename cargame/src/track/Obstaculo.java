package track;

public class Obstaculo {
	private String tipo;
	private int damage;
	private int largo;

	public Obstaculo() { 
	    this.tipo = "";
	    this.damage = 0;
	    this.largo = 0;    
	}

	public Obstaculo(String pTipo, int pDamage, int pLargo) {
	    this.tipo = pTipo;
	    this.damage = pDamage;
	    this.largo = pLargo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
	
}

