import java.util.Arrays;
 
import javax.sound.midi.Soundbank;
 
public class Juego {
    private String rio;
    private String barca;
    private String ladoIzq[];
    private String ladoDer[];
    private Boolean vikingoEstaIzq;
 
    public Juego(){
        rio             =".".repeat(30);
        barca           ="\\_V_;_?_/";
        ladoIzq         = new String[]{"V","L","C","U"};
        ladoDer         = new String[]{" "," "," "," "};
        vikingoEstaIzq  = true;
    }
    public void jugarLobito(){
        System.out.println("Juega el lobito");
        while (true) {
            getOpccionMenu();
        }
    }
 
    private short getOpccionMenu(){
        int opc =-1;
        String personaje = "";
        System.out.print( "\n 0 vikingo va solo"
                        + "\n 1 lobo"
                        + "\n 2 Caperucita"
                        + "\n 3 Uvas"
                        + "\n 4 Salir");
        do {
            try {
                System.out.print("\n [+] Ingresa su opcion: ");
                opc = App.sc.nextInt();
            } catch (Exception e) {
                App.sc.next();
            }
 
            if(opc==4){
                System.out.println("NO huyas cobarde...");
                System.exit(0);
            }
            personaje   = (vikingoEstaIzq)
                        ? ladoIzq[opc]
                        : ladoDer[opc];
            if(personaje.trim().isEmpty() && opc > 0){
                System.out.println("Opcion invalida,no hay ese personaje.");
                opc=-1;
            }
        } while (opc < 0 || opc > 4);
 
        if(vikingoEstaIzq)
            ladoIzq[opc] = "";
        else
            ladoDer[opc]= "";
 
        moverBarca(personaje);                      // 2
        vikingoEstaIzq = !vikingoEstaIzq;
 
        if(vikingoEstaIzq)
            ladoIzq[opc] = personaje;
        else
            ladoDer[opc] = personaje;
 
        return (short)opc;
    }
   
    private void moverBarca(String personaje){
        if(vikingoEstaIzq)
            for (int i = 0; i < rio.length(); i++)
                setPersonajeBarcaRio(i, personaje);
        else
            for (int i = rio.length(); i > 0; i--)
                setPersonajeBarcaRio(i, personaje);
    }
 
    private void setPersonajeBarcaRio(int posicionBarca, String personaje) {
        String  personajeIzq = Arrays.toString(ladoIzq),
                personajeDer = Arrays.toString(ladoDer);
        System.out.print( "\r"
                        + personajeIzq + " "
                        + ".".repeat(posicionBarca)
                        + barca.replace("?", personaje)
                        + ".".repeat(rio.length()-posicionBarca)
                        + personajeDer );
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }
}