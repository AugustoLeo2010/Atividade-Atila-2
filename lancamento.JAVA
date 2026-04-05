public class lancamento {
public static void main(String[] args) {

IO.println("Quer começar o lançamento do foguete?: ");
IO.println("sim");
IO.println("não");
  String lancamento = IO.readln();

if (lancamento.equals("sim")) {
    IO.println("LANÇAMENTO DO FOGUETE ESTÁ PRESTES A COMEÇAR");
}else{
    IO.println("lançamento do foguete interrompido");
     return;
}

IO.println("CONTAGEM REGRESSIVA PARA O LANÇAMENTO DO FOGUETE ESTA COMEÇANDO");
IO.println("CONTAGEM REGRESSIVA COMEÇOU");

for (int i = 10; i >= 0; i--) {
    System.out.println(i);
}
IO.println("IGNIÇÃO");

}
}

