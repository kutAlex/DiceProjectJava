package spel;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
	
	//Standaard grei
	public static void print(String i) {
		System.out.println(i);
	}
	public static int eyes;
	public static int players;
	public static int bordN;

	//Loat alles binnenladen oet zichzelf
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		print("1 of 2 spelers?");
		players = in.nextInt();
		print("Hoeveel ogen op de dobbelsteen?");
		eyes = in.nextInt();
		print("Hoeveel bord plekken?");
		bordN = in.nextInt();
		StartGame(players, bordN);
		}
	
	//Zeurgt erveur det de dobbelstein duit dobbelen
	public static int Dobbel() {
		DobbelSteen db = new DobbelSteen(eyes);
		return db.Show();
	}
	
	//Loat ut hiele spel vanoet heej dreie, fijn grei
	public static void StartGame(int spelers, int BordG) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Bord bord = new Bord(BordG);
		if(spelers == 1) {
			print("Player 1 naam:");
			Player p1 = new Player(1, in.nextLine(), true, 0);
			while(!(p1.dobbelWaarden() >= bord.aatalZetten())) {
				try {
					p1.setDobbelWaarden(Dobbel()+ p1.dobbelWaarden());
					System.out.println("Plek op bord: " + p1.dobbelWaarden() + "/" + bord.aatalZetten());
					print("-----------------------------");
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			print(p1.getName() + " Heeft gewonnen!");
		}
		else {
			print("Player 1 naam:");
			Player p1 = new Player(1, in.nextLine(), true, 0);
			print("Player 2 naam:");
			Player p2 = new Player(2, in.nextLine(), false, 0);
			while(!(p1.dobbelWaarden() >= bord.aatalZetten()) || !(p2.dobbelWaarden() >= bord.aatalZetten())) {
				if(p1.getBeurt() == true) {
					try {
						print(p1.getName());
						p1.setDobbelWaarden(Dobbel()+ p1.dobbelWaarden());
						System.out.println("Plek op bord: " + p1.dobbelWaarden() + "/" + bord.aatalZetten());
						print("-----------------------------");
						p1.setBeurt(false);
						p2.setBeurt(true);
						if(p1.dobbelWaarden() == bord.aatalZetten()||p1.dobbelWaarden() >= bord.aatalZetten()) {
							print(p1.getName() + " Heeft gewonnen!");
							break;
						}
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					try {
						print(p2.getName());
						p2.setDobbelWaarden(Dobbel()+ p2.dobbelWaarden());
						System.out.println("Plek op bord: " + p2.dobbelWaarden() + "/" + bord.aatalZetten());
						print("-----------------------------");
						p1.setBeurt(true);
						p2.setBeurt(false);
						if(p2.dobbelWaarden() == bord.aatalZetten()||p2.dobbelWaarden() >= bord.aatalZetten()) {
							print(p2.getName() + " Heeft gewonnen!");
							break;
						}
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
