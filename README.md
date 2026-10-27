# Implementación de Listas en Java

## Estudiante
- **Nombre:** Luis Fernando Campuzano Hernández
- **Grupo:** GTID244
- **Fecha:** 26/10/2026

## Descripción
Este repositorio contiene ejercicios de programación resueltos mediante listas enlazadas propias, implementadas en Java.

## Ejercicios
- **Ejercicio 2:** Cuenta letras al vector.
- **Ejercicio 4:** Inserción en Lista Enlazada.
- **Ejercicio 6:** Cajas de dulces.
- **Ejercicio 8:** Derdenio y sus Estructuras de Datos.

## Estructura del ejercicio 2
- `Main.java`: recibe la cadena y muestra las frecuencias de las letras.
- `Nodo.java`: representa cada nodo de la lista.
- `ListaSimple.java`: implementa la lista enlazada simple.

## Tipo de lista utilizada
En el ejercicio 2 se utiliza una lista enlazada simple propia, mediante las clases `Nodo` y `ListaSimple`. No se utilizan `LinkedList`, `ArrayList` ni `Vector` como estructura principal.

## Cómo compilar y ejecutar
Desde la carpeta del ejercicio 2, ejecutar:

cmd
javac Main.java Nodo.java ListaSimple.java
java Main


Después, escribir una cadena de letras minúsculas y presionar Enter.

## Pruebas del ejercicio 2

### 1. Caso normal
Se utiliza la palabra `parangaricutirimicuaro` para comprobar el conteo de las letras.

![Prueba normal](imagenes/01_prueba_normal.png)

### 2. Caso límite
Se utiliza una sola letra `a` para comprobar el funcionamiento con una entrada pequeña.

![Prueba límite](imagenes/02_prueba_limite.png)

### 3. Caso grande
Se utiliza una cadena de 100 letras `a` para comprobar el conteo con una entrada más larga.

![Prueba grande](imagenes/03_prueba_grande.png)

### 4. Resultado de omegaUp
Se muestra el resultado obtenido al enviar la solución a omegaUp.

![Veredicto de omegaUp](imagenes/04_veredicto_omegaup.png)

## Conclusiones
Al realizar este ejercicio practiqué la implementación de una lista enlazada simple y el recorrido de sus nodos para contar las apariciones de las letras. Comprobé el funcionamiento de la solución mediante omegaUp y realicé pruebas con diferentes entradas.
