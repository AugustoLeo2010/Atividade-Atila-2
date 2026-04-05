public class desc_combustiveis {
public static void main(String[] args) {

   IO.println("Você deseja qual combustivel: ");
   IO.println("alcool");
   IO.println("gasolina");
   String combustivel = IO.readln();


   if (combustivel.equals("alcool")) {
       float litros_alcool = Float.parseFloat
               (IO.readln("Quantos litros de alcool você deseja: "));
       float preço = 2.89f;
       float desconto;

       if (litros_alcool <= 20) {
           desconto = 0.03f;
       } else {
           desconto = 0.05f;
       }
       float total = litros_alcool * preço;
       float totalComDesconto = total - (total * desconto);
       IO.println("O total a pagar é:" + totalComDesconto);

   }else if
   (combustivel.equals("gasolina")) {

       float litros_gasolina = Float.parseFloat
               (IO.readln("Quantos litros de gasolina você deseja: "));
          float preço = 4.95f;
          float desconto;

          if (litros_gasolina <= 20) {
              desconto = 0.04f;
          } else {
              desconto = 0.06f;
          }
            float total = litros_gasolina * preço;
            float totalComDesconto =  total - (total * desconto);
            IO.println("O total de gasolina a ser pago é: " + totalComDesconto);

}

}
}
