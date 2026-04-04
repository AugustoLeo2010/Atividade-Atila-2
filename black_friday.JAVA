public class black_friday {
public static void main(String[] args) {

IO.println("DESCONTOS DA BLACK FRIDAY");
IO.println("codigo" + "-forma de pagamento" + "-desconto(%)");
IO.println("1" + "-A vista" + "-10&");
IO.println("2" + "-Debito" + "-5%");
IO.println("3" + "-Credito" + "-3%");
IO.println("4" + "-PIX" + "-7.5%");

int valor_compra = Integer.parseInt(IO.readln("Digite o valor total da compra:"));
char codigo = IO.readln("Digite a forma de pagamento: (1-4)").charAt(0);

if (codigo == '1') {
    double desconto = valor_compra * 0.10;
    double valor_final = valor_compra - desconto;
    IO.println("O valor final a ser pago é:" + valor_final);
}else if (codigo == '2') {
    double desconto = valor_compra * 0.05;
    double valor_final = valor_compra - desconto;
    IO.println("O valor final a ser pago é:" + valor_final);
}else if (codigo == '3') {
    double desconto = valor_compra * 0.03;
    double valor_final = valor_compra - desconto;
    IO.println("O valor final a ser pago é:" + valor_final);
}else if (codigo == '4') {
    double desconto = valor_compra * 0.75;
    double valor_final = valor_compra - desconto;
    IO.println("O valor final a ser pago é:" + valor_final);
}else{
    IO.println("Codigo de pagamento incorreto, selecione um codigo de 1 a 4");
}

}

}

