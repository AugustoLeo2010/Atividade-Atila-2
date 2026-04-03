public class dois_logins {
public static void main(String[] args) {

IO.println("Digite o Login:");
String login = IO.readln();

IO.println("Digite a senha:");
String senha = IO.readln();

if (login.equals("Atila") && senha.equals("12345")) {
    IO.println("Bem vindo de volta Atila");
}else if (login.equals("olivi") && senha.equals("54321")) {
    IO.println("Bem vindo de volta Olivi");
} else {
    IO.println("Login ou senha incorretos");
}

}
}
