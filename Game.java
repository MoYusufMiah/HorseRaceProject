import java.util.Scanner;
class Game{
	public static void main(String[] args) {
		String choice = "";
		String winner = "";
		Scanner scanner = new Scanner(System.in);
		Race race = new Race(10);
		while (!(choice.equals("Leon") || choice.equals("Humphrey") || choice.equals("Greg"))){
			System.out.println("pick a horse |Leon|Humphrey|Greg");
			choice = scanner.nextLine();
		}
		Horse horse = new Horse('L',"Leon",0.5);
		Horse horse1 = new Horse('H',"Humphrey",0.5);
		Horse horse2 = new Horse('G',"Greg",0.5);
		race.addHorse(horse,1);
		race.addHorse(horse2,2);
		race.addHorse(horse1,3);
		winner = race.startRace();
		System.out.println("the winner is "+winner);
		if (choice.equals(winner)){
			System.out.println("You Won!");
		}
	}
}