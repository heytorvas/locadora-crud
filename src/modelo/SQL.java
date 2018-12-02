package modelo;
import java.util.List;
public class SQL {

    public Pessoa login(String username, String password, List<Pessoa> pessoa) {
        final Pessoa[] usuarioLogado = new Pessoa[1];
        pessoa.forEach(login -> {
            if (login.getUsername().equalsIgnoreCase(username) && login.getPassword().equals(password)) {
                usuarioLogado[0] = login;
            }
        });
        try {
            return usuarioLogado[0];
        } catch (Exception e) {
            System.out.println("USUARIO E/OU SENHA INCORRETOS");
            return null;
        }
    }
}