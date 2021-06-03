package edu.escuelaing.arsw.ConteoLoc;


/**
 *
 *Es la clase que lee todas las lineas del archivo
 */
public class PHYLineCounter implements  ContadorLinea {
private int cont=0;
    @Override
    public void count(String linea){
        cont++;
    }

    @Override
    public int getCount(){
        return cont;
    }



}
