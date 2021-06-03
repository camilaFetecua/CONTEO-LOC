package edu.escuelaing.arsw;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import edu.escuelaing.arsw.ConteoLoc.ContadorLinea;
import edu.escuelaing.arsw.ConteoLoc.LOCLineCounter;
import edu.escuelaing.arsw.ConteoLoc.PHYLineCounter;
import edu.escuelaing.arsw.ConteoLoc.lectorArchivo;
import org.junit.Test;

import java.io.IOException;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void CargadeArchivo() {
        try {
            String[] args = {"phy", "Categoria.java"};
            App.main(args);
            assertTrue(true);
        } catch (IOException e) {
            assertTrue(false);
        }
    }

    @Test
    public void MalaCargarArchivo() {
        try {
            String[] args = {"phy", "src\\main\\java\\edu\\eci\\cvds\\samples\\entitiesa\\categoria.java"};
            App.main(args);
            assertTrue(false);
        } catch (IOException e) {
            assertTrue(true);
        }
    }

    @Test
    public void deberiaContarPHY() {

        lectorArchivo lector = new lectorArchivo();
        ContadorLinea lc = new PHYLineCounter();
        try {
            lector.lectorArchivo("Categoria.java", lc);
            assertEquals(78, lc.getCount());

        } catch (IOException ex) {
            fail();
        }
    }

    @Test
    public void deberiaContarLOC() {

        lectorArchivo lector = new lectorArchivo();
        ContadorLinea lc = new LOCLineCounter();
        try {
            lector.lectorArchivo("Categoria.java", lc);
            assertEquals(46, lc.getCount());

        } catch (IOException ex) {
            fail();
        }
    }


}
