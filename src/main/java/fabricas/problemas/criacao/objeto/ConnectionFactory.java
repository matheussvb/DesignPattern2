package fabricas.problemas.criacao.objeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            if(System.getenv("tipoBanco").equals("mysql")){
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root",
                        "senha");
            } else {
                Connection connection = DriverManager.getConnection("jdbc:postgres://localhost/banco", "root",
                        "senha");
            }

            return connection;
        } catch (SQLException throwables) {
            throw new RuntimeException();
        }
    }
}
