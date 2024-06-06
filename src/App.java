import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static Juego juego;

    public static void main(String[] args) throws Exception {
        Jugador jugador = new Jugador();
        jugador.Login();
    }
}
