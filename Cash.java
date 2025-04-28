public class Cash {
    static int Cash = 0;
    public static void getCash(int amount) {
        Cash += amount;

    }
    public static int showCash() {
        return Cash;
    }
}
