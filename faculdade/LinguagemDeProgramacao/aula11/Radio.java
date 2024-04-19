package aula11;

public class Radio {
	public boolean ligado;
	public int volume;
	
	public Radio() { //Construtor
		this.ligado = false; //Esses são os valores iniciais para ligado e volume
		this.volume = 50;
	}
	
	public void ligar() {
		this.ligado = true;
		System.out.println("O rádio foi ligado");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("O rádio foi desligado");
	}
	
	public void aumentarVolume() {
		if (ligado) {
			if (volume < 100) {
				volume += 10;
				if(volume > 100) {
					volume = 100;//limite máximo
				}
				System.out.println("Volume aumentado para " + volume + "%");
			}
			else {
				System.out.println("O volume já está no máximo");
			}
		}
		else {
			System.out.println("O rádio está desligado. Ligue o rádio para ajustar o volume");
		}
	}
	
	public void diminuirVolume() {
		if (ligado) {
			if (volume > 0) {
				volume -= 10;
				if (volume < 0) {
					volume = 0;
				}
				System.out.println("Volume diminuido para " + volume + "%");
			}
			else {
				System.out.println("O volume já está no mínimo");
			}
		}
		else {
			System.out.println("O rádio está desligado. Ligue o rádio para ajustar o volume");
		}
	}
}
