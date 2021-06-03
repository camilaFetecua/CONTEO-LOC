package edu.escuelaing.arsw;

import edu.escuelaing.arsw.ConteoLoc.ContadorLinea;
import edu.escuelaing.arsw.ConteoLoc.lectorArchivo;
import edu.escuelaing.arsw.ConteoLoc.LOCLineCounter;
import edu.escuelaing.arsw.ConteoLoc.PHYLineCounter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException{
        String  typeOfCount= args[0];
        String fileName = args[1];
        lectorArchivo lector = new lectorArchivo();
        ContadorLinea lc = null;
        switch (typeOfCount.toLowerCase()) {
            case "phy":
                lc = new PHYLineCounter();
                break;
            case "loc":
                lc = new LOCLineCounter();
                break;
            default:
                break;
        }

        lector.lectorArchivo(fileName,lc);

    }
}
