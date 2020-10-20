# Excepciones en Java

## Los errores pueden ser de dos tipos: 
- Errores en tiempo de Compilacion (Sintaxis).
- Errores en tiempo de ejecucion.

## Jerarquia de Herencia

- Clase Error (Error de Hardware).
- Clase Exception (Excepciones Comprobadas mas Generica).
- -> Clase IOException (Excepciones Comprobadas).
- -> Clase RuntimeException (Excepciones No Comprobadas).

![alt view](https://github.com/GokoshiJr/algoritmos2-java/blob/master/src/excepciones/excepcion.jpg?raw=true)

## Excepcion Comprobada 
Error en el que el programador Java no tiene culpa.
Ej: No se encuentra una imagen en una carpeta.

## Excepcion No Comprobada 
Error por parte del programador Java.
Ejemplo: recorrer la posicion 5 de un array de 4 posiciones.
