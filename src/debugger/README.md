# Debugging in netbeans

## Control del proceso
    
- Step Over (F8): Ejecuta la línea actual y luego pasa a la línea siguiente. 
Si alguna línea contiene una llamada a un método o constructor, 
ejecuta todo el método o constructor sin entrar en ellos.

- Step Over Expression (MAYUS + F8): le permite continuar con cada llamada de método 
en una expresión y ver los parámetros de entrada, 
así como los valores de salida resultantes de cada llamada de método (...) 
Si no hay más llamadas de método, Step Over Expression se comporta como el Step Over mando.

- Step Into (F7): Ejecuta una línea de código. 
Si la instrucción es una llamada a un método, salta al método
y continúa la ejecución por la primera línea del método.        

- Step Out (Ctrl + F7): Ejecuta una línea de código. Si la línea de código actual se encuentra dentro de un método,
se ejecutarán todas las instrucciones que queden del método
y se vuelve a la instrucción desde la que se llamó al método.

- Run to Cursor (F4): Se ejecuta el programa hasta la instrucción donde se encuentra el cursor.

- Continue (F5): La ejecución del programa continúa hasta el siguiente breakpoint. 
Si no existe un breakpoint se ejecuta hasta el final.

- Finish Debugger Session (Mayúsculas + F5): Termina la depuración del programa.

## Resources

- *[Debugger](https://puntocomnoesunlenguaje.blogspot.com/2014/11/netbeans-debugger-java.html#:~:text=Step%20Over%20(F8)%20Ejecuta%20una,dentro%20del%20c%C3%B3digo%20del%20m%C3%A9todo.&text=Si%20la%20instrucci%C3%B3n%20es%20una%20llamada%20a%20un%20m%C3%A9todo%2C%20salta,la%20primera%20l%C3%ADnea%20del%20m%C3%A9todo.).*