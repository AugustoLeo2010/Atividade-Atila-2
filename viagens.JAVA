public class viagens {
public static void main(String[] args) {

    float Km = Float.parseFloat(IO.readln("Qual distancia você deseja percorrer em Km: "));
    float passagem;

    if (Km <= 200) {
        passagem = Km * 0.5f;
    } else {
        passagem = Km * 0.45f;
    }

    IO.println("O valor da passagem ficou em: " + passagem);
    IO.println("Tenha uma boa viagem! ");

}
}
