package MarcosUTN.repository;

import MarcosUTN.entities.Humano;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {

        // JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_HOST = "//localhost/";
        static final String DB_NAME = "TP1LABV";
        static final String DB_USER = "root";
        static final String DB_PASS = "";
        static Statement st;
        private static java.sql.Connection connection;

        public static void connect() throws SQLException {
            try {
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection("jdbc:mysql:"+ DB_HOST + DB_NAME, DB_USER, DB_PASS);
                st = connection.createStatement();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static void insertResult(Humano winner){
            try {
                String query = " INSERT INTO winners (nombre, edad, peso) VALUES ( \" "+ winner.getNombre() + " \" ,"+winner.getEdad() + ","+winner.getPeso() + ")";
                st.executeUpdate(query);
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}

