 public class multa {
  void main () {

     float velocidade = Float.parseFloat(IO.readln("Digite a velocidade do veiculo em Km: "));
     float velocidade_maxima = 80;
     float multa = (velocidade - velocidade_maxima) * 50;
     float excedeu = (velocidade - velocidade_maxima);

     IO.println("limite: " + velocidade_maxima);
     IO.println("O excedente foi de: " + excedeu);
     IO.println("O valor da multa foi de: " + multa);
 }

}
