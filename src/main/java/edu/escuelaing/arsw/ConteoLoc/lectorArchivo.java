package edu.escuelaing.arsw.ConteoLoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 *Es la clase encargada de comunicar la interfaz para realizar el conteo
 */



public class lectorArchivo {

    public void lectorArchivo(String ruta, ContadorLinea lineC)throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Path archivo = Paths.get(ruta);
        try (BufferedReader lectorA = Files.newBufferedReader(archivo, charset)) {
            String linea;
            while ((linea = lectorA.readLine()) != null) {
                lineC.count(linea);
            }
            System.out.println("La cantidad de lineas q es: " + lineC.getCount());
        } catch (IOException e) {
            throw new IOException("El archivo no exite", e);
        }
    }
}

