public class grandezas {
  public static void main(String[] args) {
 
 IO.println("CALCULO DE GRANDEZAS ELETRICAS");
 IO.println("Qual opção voce deseja: ");
 IO.println("1.tensão");
 IO.println("2.resistencia");
 IO.println("3.corrente");
 IO.println("4.Sair do programa");
 String opcao = IO.readln();

 if (opcao.equals("1")) {
     IO.println("Voce escolheu a opção tensão");
 } else if (opcao.equals("2")) {
     IO.println("Voce escolheu a opção resistencia");
 } else if (opcao.equals("3")) {
     IO.println("Voce escolheu a opção corrente");
 } else if (opcao.equals("4")) {
     IO.println("Voce saiu do programa");
    System.exit(0);
}

 float U = Float.parseFloat(IO.readln("Digite o valor de U: "));
float R = Float.parseFloat(IO.readln("Digite o valor de R: "));
float I = Float.parseFloat(IO.readln("Digite o valor de I: "));

float tensao = R * I;
float resistencia = U / I;
float corrente = U / R;

if (opcao.equals("1")) {
    IO.println("A tensão e de: " + tensao);
}else if (opcao.equals("2")) {
    IO.println("A resistencia e de: " + resistencia);
}else if (opcao.equals("3")) {
    IO.println("A corrente e de: " + corrente);
}


}
}
