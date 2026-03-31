public class maior_menor {
    public static void main(String[] args) {

       int a,b, c;
       int maior,menor;
       
        float N1 = Float.parseFloat(IO.readln("Digite o primeiro numero: "));
        float N2 = Float.parseFloat(IO.readln("Digite o segundo numero: "));
        float N3 = Float.parseFloat(IO.readln("Digite o terceiro numero: "));
        float Soma = (N1 + N2 + N3);
        float Media = (N1 + N2 + N3) / 3;

        menor = a;
        maior = a;

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

       IO.println("Menor número: " + menor);
        IO.println("Maior número: " + maior);
        IO.println("O valor da soma é:" + Soma );
        IO.println("A Media será de:" + Media);

    }
}
    
