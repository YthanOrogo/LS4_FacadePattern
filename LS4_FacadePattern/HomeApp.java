public class HomeApp {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();

        home.turnOnAll();
        System.out.println();
        home.turnOffAll();
    }
}
