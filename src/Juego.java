import java.util.Arrays;

public class Juego {
    private String rio;
    private String barca;
    private String ladoIzq[];
    private String ladoDer[];
    private Boolean vikingoEstaIzq;

    public Juego(){
        rio            =".".repeat(30);
        barca          ="\\_V_;_?_/";
        ladoIzq        =new String[]{"V","L","C","U"};
        ladoDer        =new String []{" "," "," "," "};
        vikingoEstaIzq = true;
    }
    public short getOptionMenu(){
        int opc=-1;
        System.out.print(       "\n 0. Vikingo regresa solo"
                                + "\n 1. Lobo"
                                + "\n 2. Caperucita"
                                + "\n 3. Uvas");

        do {
            try {
                System.out.print(" \n [+] Ïngresa una opcion: ");
                opc = App.sc.nextInt();
                
            } catch (Exception e) {
                App.sc.next();
            }
            if (opc==4) {
                System.out.println("No huyas cobarde...");
                System.exit(0);
                
            }
        } while (opc<0 || opc>4);
        System.out.println("Ingresaste: " + opc);
        setPersonajeBarcaRio();
        return (short)opc;
    }
    private void setPersonajeBarcaRio(){
        String  personajeIzq = Arrays.toString(ladoIzq),
                personajeDer = Arrays.toString(ladoDer);
        System.out.println( personajeIzq 
                            + barca
                            + rio
                            + personajeDer);
    }
}
