public class validar_str {
 public static void main(String[] args) {

 IO.println("Digite um numero inteiro: ");
try {

int numero = Integer.parseInt(IO.readln());
    IO.println("Voce digitou: " + numero);
} catch (Exception e) {
    IO.println("Dado invalido");

}

 }

}
