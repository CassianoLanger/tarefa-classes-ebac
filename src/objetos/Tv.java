package objetos;

public class Tv {

	private final int polegadas = 49;
	private boolean status = false;
	private final String cor = "preta";
	private int volume = 50;
	private int canal = 1;
	
	public Tv(boolean status) {
		this.status = status;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(isStatus() == true) {
			this.volume = volume;
		}
		
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(isStatus() == true) {
			this.canal = canal;
		}		
	}
	
	
}
