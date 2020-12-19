package spel;

public class Player {
	@SuppressWarnings("unused")
	private int ID;
	private String name;
	private boolean beurt;
	private int dobbelWaarden;
	
	public Player(int ID, String name, boolean beurt, int dobbelWaarden) {
		this.ID = ID;
		this.name = name;
		this.beurt = beurt;
		this.dobbelWaarden = dobbelWaarden;
	}
	
	public String getName() {
		return this.name;
	}
	//set obj itemname
	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}
	public boolean getBeurt() {
		return this.beurt;
	}
	//set obj itemname
	public void setBeurt(boolean beurt) {
		this.beurt = beurt;
	}
	public int dobbelWaarden() {
		return this.dobbelWaarden;
	}
	//set obj itemname
	public void setDobbelWaarden(int dobbelWaarden1) {
		this.dobbelWaarden = dobbelWaarden1;
	}
}
