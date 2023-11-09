# Estrategias en TDD

1. Por dónde empezamos (Kata **Password validator**)
    * **BDD como concepto**: Probar el comportamiento, no la implementación. Probar interfaces/apis en vez de clases o métodos.
      > What behavior will we need to produce the revised report? Put another way, what set of tests, when passed, will demonstrate the presence of code we are confident will compute the report correctly?
        <br>Test-Driven Development By Example, Kent Beck. Página 4.
    * **Given, When, Then**: Estructurando los tests basándonos en el comportamiento. Definimos el escenario de la prueba.
    * **Assertion First**: Ya que hacemos el test primero, la primera parte del test a implementar debería ser la aserción.
    * ¿Qué test crearemos primero? Es necesario analizar las dependencias entre requerimientos para detectar casos base.
2. Triangulando tests (Kata **Email list validator**)
    * **ZOMBies**
    * Z – Zero
    * O – One
    * M – Many (or More complex)
    * B – Boundary Behaviors (límites en el valor de los parámetros)
    * I – Interface definition (validar tipos en los parámetros)
    * E – Exercise Exceptional behavior (validar los casos de uso extremos de la lógica de negocio)
    * S – Simple Scenarios, Simple Solutions (aplica a todo lo anterior)
3. Cuándo refactorizar
    * Refactorizamos cuando detectamos un **"Code Smell"**.  
    * Si no tenemos clara la dirección a tomar en la refactorización **podemos esperar**.
    * Hacer **pequeños cambios** cuando no lo tengamos claro, siempre se puede revertir.
    * No permitir que tengamos detectados **más de tres** "Code Smells" a la vez.
    * **Extra**: Kata Gilded Rose -> https://github.com/emilybache/GildedRose-Refactoring-Kata

> La solución a las katas la encontraréis en la rama solved. 