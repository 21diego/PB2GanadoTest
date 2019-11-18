package unlam.edu.ar.source;

public class CuentaGanado {
	private Integer contador;
	private Integer limite;
	
	public CuentaGanado(Integer limite) {
		this.contador = 0;
		this.limite = limite;
	}

	public Integer getLimite() {
		return limite;
	}

	public void setLimite(Integer limite) {
		this.limite = limite;
	}

	public Integer getContador() {
		return contador;
	}
	
	public void contar() {
		if(this.contador < this.limite) {
			this.contador++;
		}
	}
	
	public void reset() {
		this.contador = 0;
	}
}
