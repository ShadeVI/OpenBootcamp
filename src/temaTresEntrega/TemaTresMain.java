package temaTresEntrega;

public class TemaTresMain {
    public static void main(String[] args){
        String[] nombres = {"Marco", "Juan", "Francisco", "Roberto", "Carlos", "Lucia"};
        String resultado = "";
        for (String nombre: nombres) {
            resultado = resultado.concat(nombre + " ");
        }
        System.out.print(resultado);
    }
}
