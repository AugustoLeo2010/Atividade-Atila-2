public class validar_str {
 public static void main(String[] args) {

 IO.println("Digite uma String: ");
String texto = IO.readln();

if (texto.trim().isEmpty()) {
    IO.println("Dado invalido");
} else {
    IO.println("Voce digitou: " + texto);

}

 }

}
