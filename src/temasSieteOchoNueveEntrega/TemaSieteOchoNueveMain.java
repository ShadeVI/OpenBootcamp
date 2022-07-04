package temasSieteOchoNueveEntrega;

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args){

        // Dada la función:
        //
        // public static String reverse(String texto) { }
        //
        // Escribe el código que devuelva una cadena al revés.
        // Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        System.out.println(Reverse.reverse("hola mundo"));

        // 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] array1 = new String[] {"Primero", "Segundo", "Tercero", "Cuarto", "Quinto"};

        for (String elemento : array1
             ) {
            System.out.println(elemento);
        }
        // 2.Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
        // el valor de cada elemento en ambas dimensiones.
        int[][] enterosBidimensionales = new int[][]{
                                                        {4, 22312, 325, 346},
                                                        {756, 1234, 76, 12},
                                                        {12343, 34, 123, 45}
                                                    };

        for(int i=0; i < enterosBidimensionales.length; i++){
            for(int j=0; j < enterosBidimensionales[i].length; j++){
                System.out.println("["+i+","+j+"] = " + enterosBidimensionales[i][j]);
            }
        }

        // 3.Crea un "Vector" del tipo de dato que prefieras,
        // y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Double> vecDouble = new Vector<Double>();
        vecDouble.add(23.342);
        vecDouble.add(6565.234);
        vecDouble.add(94.239);
        vecDouble.add(454.213);
        vecDouble.add(132.543);
        vecDouble.remove(1);
        vecDouble.remove(1);
        for (double elDouble: vecDouble
             ) {
            System.out.println(elDouble);
        }

        // 4. Indica cuál es el problema de utilizar
        // un Vector con la capacidad por defecto si tuviésemos
        // 1000 elementos para ser añadidos al mismo.
        // Respuesta: Cada vez que se llegaría al limite, por defecto se doblará la capacidad.

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrList = new ArrayList<>(4);
        arrList.add("Platano");
        arrList.add("Manzana");
        arrList.add("Melocoton");
        arrList.add("Papaya");
        LinkedList<String> linkList = new LinkedList<>(arrList);
        System.out.println("arrayList loop:");
        for (String elString: arrList
             ) {
            System.out.println(elString);
        }
        System.out.println("LinkedList loop:");
        for (String elString: linkList
             ) {
            System.out.println(elString);
        }

        // 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre
        // y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> arrInt = new ArrayList<>(10);

        for (int i = 1; i <= 10 ; i++) {
            arrInt.add(i);
        }
        int size = arrInt.size();
        for (int i = 0; i < size; i++) {
            if(arrInt.get(i) % 2 == 0) {
                arrInt.remove(i);
                i--;
                size = arrInt.size();
                System.out.println(arrInt.get(i));
            }
        }

        // 7. Crea una función DividePorCero.
        // Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".

        try{
            DividePorCero(5,0);
        } catch (Exception e){
            System.out.println(e.getMessage() + " ( " + e.getCause() + " )");
        }
    }

    public static String reverse(String texto){
        String result = "";
        for(int i=texto.length() - 1; i >= 0; i--){
            result += texto.charAt(i);
        }
        return result;
    }

    public static void DividePorCero(int a, int b) throws Exception {

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            throw new Exception("Esto no puede hacerse", e);
        } finally {
            System.out.println("Demo de codigo");
        }
    }
}
