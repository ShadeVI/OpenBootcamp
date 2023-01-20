# EJERCICIOS ENTREGADO PARA EL CURSO EN OPENBOOTCAMP DE JAVA

## TEMA UNO

#### Enunciado del ejercicio

Para este primer ejercicio tendréis que realizar lo siguiente:

- Crea un proyecto de Java desde 0
- Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
- Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

_Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String._

Enlace de la solución: [Entrega ejercicio tema uno](https://github.com/ShadeVI/OpenBootcamp/blob/main/src/temaUnoEntrega/TemaUnoMain.java)

---

## TEMA DOS

#### Enunciado del ejercicio

Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

Enlace de la solución: [Entrega ejercicio tema dos](https://github.com/ShadeVI/OpenBootcamp/blob/main/src/temaDosEntrega/TemaDosMain.java)

---

## TEMA TRES

#### Enunciado del ejercicio

En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

    String[] nombres = {"", "", "", ""}

Enlace de la solución: [Entrega ejercicio tema tres](https://github.com/ShadeVI/OpenBootcamp/blob/main/src/temaTresEntrega/TemaTresMain.java)

---

## TEMA CUATRO

#### Enunciado del ejercicio

En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

Enlace de la solución: [Entrega ejercicio tema cuatro](https://github.com/ShadeVI/OpenBootcamp/blob/main/src/temaCuatroEntrega/TemaCuatroMain.java)

---

## TEMA CINCO

#### Enunciado del ejercicio

Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo: 

    CocheCRUD cocheCrud = new CocheCRUDImpl()

Enlace de la solución: [Entrega ejercicio tema cinco](https://github.com/ShadeVI/OpenBootcamp/blob/main/src/temaCincoEntrega/TemaCincoMain.java)

---

## TEMAS siete, ocho, nueve

#### Enunciado del ejercicio

Dada la función:

    public static String reverse(String texto) { }
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

Enlace de la solución: [Entrega ejercicio temas Siete, Ocho, Nueve](https://github.com/ShadeVI/OpenBootcamp/blob/main/src/temasSieteOchoNueveEntrega/TemaSieteOchoNueveMain.java)
