public class RunGame {
    private static String horse ="";
    public static void selectedHorse(String horse1 ) {
        horse = horse1;
        GUI.horseChosen(horse);
    }
    public static String getHorse() {
        return horse;
    }
}
