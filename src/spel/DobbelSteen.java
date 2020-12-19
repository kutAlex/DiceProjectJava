package spel;
import java.util.Random;


public class DobbelSteen {
	private int max;
    Random rand = new Random(); 

	public DobbelSteen(int max) {
		this.max = max;
	}

	
	public int Show() {
		int i = rand.nextInt(max)+1;
		if(i >= 10) {
			String l1 = "#########\n";
			String l2 = "#       #\n";
			String l3 = "#  "+ i +"   #\n";
			String l4 = "#       #\n";
			String l5 = "#########\n";
			System.out.println(l1+l2+l3+l4+l5);
		}
		else {
			String l1 = "#######\n";
			String l2 = "#     #\n";
			String l3 = "#  "+ i +"  #\n";
			String l4 = "#     #\n";
			String l5 = "#######\n";
			System.out.println(l1+l2+l3+l4+l5);
		}
		
		return i;
	}
}
