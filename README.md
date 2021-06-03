# CONTEO-LOC

## Arquitectura de software 2021-i /02 de Junio del 2021

 Este es un programa que tiene como proposito contar las lineas de codigo de un archivo
 en especifico , existen dos tipos de conte el primero es "phy"  el cual cuenta las lineas 
 fisicas del archivo y el segundo es "loc" se cuentan todas las lineas con la excepcion de
 las lineas que sean comentarios y espacios.

##Prerrequisistos 

Se deben tener instaaldos los siguientes programas
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11


## Diagrama de clase

![Imagen](https://github.com/camilaFetecua/CONTEO-LOC/blob/master/imagenes/imagendiagramarsw.PNG)


## Descripción del diagrama de clases

El diagrama de clases consta de cuatro clases y una interfaz. La clase APP es la clase 
principal y guarda el conteo final , la interface ContadorLinea es la encargada de contar 
las lineas de codigo de dos formas diferentes por medio de dos clases que implementan
esta interfaz , estas son las clases LOCLineCounter y PHYLineCounter. 


## Pruebas 

![Imagen](https://github.com/camilaFetecua/CONTEO-LOC/blob/master/imagenes/pruebasarsw.PNG)

Autor
+ **Maria Camila Fetecua Garcia** LOCS/Hora 160/12 = 13 LOCS/Hora
