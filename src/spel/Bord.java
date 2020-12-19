package spel;

public class Bord {
	private int aantalZetten;
	
	public Bord(int aantalZetten){
		this.aantalZetten = aantalZetten;
	}
	
	public void aatalZetten(int aantal) {
		this.aantalZetten = aantal;
	}
	public int aatalZetten() {
		return this.aantalZetten;
	}

}
