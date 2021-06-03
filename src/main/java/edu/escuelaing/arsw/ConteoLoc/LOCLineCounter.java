package edu.escuelaing.arsw.ConteoLoc;

/**
 *
 *Es la clase que lee las lineas sin importar espacios y comentarios*/

public class LOCLineCounter implements ContadorLinea{
    private int cont = 0;

    public LOCLineCounter() {
    }

    @Override
    public void count(String linea) {
        linea = linea.trim();
        if (linea.length() > 0) {
            if (!isAComment(linea)) {
                increment();
            }
        }

    }

    private boolean isAComment(String linea) {
        boolean band = false;
        if (linea.length() > 1) {
            if (linea.substring(0, 2).equals("/*")) {
                band = true;
            }
            else if(linea.substring(0,2).equals("//")){
                band = true;
            }

        } else {
            if (linea.charAt(0) != '*') {
                band = true;
            }
        }
        return band;
    }

    private void increment() {
        cont++;
    }

    @Override
    public int getCount() {
        return cont;
    }


}
