package temasSieteOchoNueveEntrega;

public class Reverse {
    public static void main(String[] args){
        System.out.print(Reverse.reverse("hola mundo"));
    }

    public static String reverse(String texto){
        String result = "";
        for(int i=texto.length() - 1; i >= 0; i--){
            result += texto.charAt(i);
        }
        return result;
    }
}
