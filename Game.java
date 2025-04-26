import java.util.Scanner;
class Game{
	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	 Race race = new Race(7);
	System.out.println("Enter horsenames");
	 Horse horse = new Horse('h',myObj.nextLine(),0.5);
	 Horse horse1 = new Horse('e',myObj.nextLine(),0.5);
	 Horse horse2 = new Horse('f',myObj.nextLine(),0.5);
	 race.addHorse(horse,1);
	 race.addHorse(horse2,2);
	 race.addHorse(horse1,3);
	 race.startRace();
	}
}