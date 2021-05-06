package unibe.edu.ec;

public class Prueba {
	private String p1;
	
	public Prueba(String frase) {
		this.p1 = frase;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}
	
	public int tamanoFrase() {
		return this.p1.length();
	}
	
}
