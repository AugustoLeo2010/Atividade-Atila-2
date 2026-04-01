public class maior_menor {
    public static void main(String[] args) {

        float N1 = Float.parseFloat(IO.readln("Digite o primeiro numero: "));
        float N2 = Float.parseFloat(IO.readln("Digite o segundo numero: "));
        float N3 = Float.parseFloat(IO.readln("Digite o terceiro numero: "));
        float Soma = (N1 + N2 + N3);
        float Media = (N1 + N2 + N3) / 3;

        if (N1 == N2 && N1 == N3) {
            IO.println("Ambos sao iguais");
            IO.println("O valor da soma é:" + Soma );
            IO.println("A Media será de:" + Media);
        } else { 
         int maior = (int) N1;
         int menor = (int) N1;
            
        if (N2 < menor) {
            menor = (int) N2;
        }
        if (N3 < menor) {
            menor = (int) N3;
        }
         if (N2 > maior) {
            maior = (int) N2;
        }
        if (N3 > maior) {
            maior = (int) N3;
        }

       IO.println("Menor número: " + menor);
        IO.println("Maior número: " + maior);
        IO.println("O valor da soma é:" + Soma );
        IO.println("A Media será de:" + Media);

    }
}
    
