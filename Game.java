class Game{
	public static void main(String[] args) {
	 Race race = new Race(10);
	 Horse horse = new Horse('h',"gregory",1.0);
	 Horse horse1 = new Horse('e',"gregorys",1.0);
	 Horse horse2 = new Horse('f',"gregoryss",1.0);
	 race.addHorse(horse,1);
	 race.addHorse(horse2,2);
	 race.addHorse(horse1,3);
	 race.startRace();
	}
}