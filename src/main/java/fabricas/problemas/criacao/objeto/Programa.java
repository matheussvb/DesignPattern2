package fabricas.problemas.criacao.objeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {
    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM TABELA");


    }
}
