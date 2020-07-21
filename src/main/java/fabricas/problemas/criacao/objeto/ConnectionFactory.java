package fabricas.problemas.criacao.objeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            Connection connection;
            if(System.getenv("tipoBanco").equals("mysql")){
                connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root",
                        "senha");
            } else {
                connection = DriverManager.getConnection("jdbc:postgres://localhost/banco", "root",
                        "senha");
            }

            return connection;
        } catch (SQLException throwables) {
            throw new RuntimeException();
        }
    }
}
