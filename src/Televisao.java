public class Televisao {

	public final String fabricante;
	public final String modelo;
	public final int tamanho;
	public final String resolucao;
	private int canal;
	private int volume;
	private boolean ligado;

	public Televisao(String fabricante, String modelo, int tamanho, String resolucao) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.canal = 0;
        this.volume = 50;
        this.ligado = false;
    
    }

	public boolean ligado() {
		return this.ligado;
	}

	public void ligar() {
        this.ligado = true;
	}

	public void subirCanal() {
        if(this.canal == 69 || this.canal == 0) this.canal = 2;
        else this.canal += 1;
	}

	public void descerCanal() {
        if(this.canal == 2 || this.canal == 0) this.canal = 69;
        else this.canal -= 1;
	}

	public void mudarCanal(int canal) {
        if(canal > 69);
        else if(canal < 2);
        else this.canal = canal;

	}

	public void aumentarVolume() {
        if(volume == 100);
        else volume += 1;
	}

	public void diminuirVolume() {
        if(volume == 0);
        else volume -= 1;
	}

	public void desligar() {
        this.ligado = false;
	}

	public int canal() {
		return this.canal;
	}

	public int volume() {
		return this.volume;
	}

}