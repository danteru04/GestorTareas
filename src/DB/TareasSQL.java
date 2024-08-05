package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TareasSQL {
    String database;
    String user;
    String password;
    Connection connection;
    Statement statement;

    public TareasSQL(){
        this.database = "gestortareas";
        this.user = "dante";
        this.database = "2733920";
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/" + this.database +
                            "?user=" + this.user +
                            "&password=" + this.password
            );
            System.out.println("Conexión establecida con éxito");
            Statement statement = connection.createStatement();
            int rowsaffected = statement.executeUpdate("CREATE TABLE IF NOT EXISTS tareas (" +
                    "id_tarea INT PRIMARY KEY AUTO_INCREMENT," +
                    "nombre VARCHAR (255) NOT NULL," +
                    "descripcion VARCHAR (50)," +
                    "fecha_creacion VARCHAR (50) NOT NULL," +
                    "email VARCHAR (255)," +
                    "password VARCHAR (255)) ENGINE=INNODB;");

            System.out.println(rowsaffected + " filas han sido cambiadas");
        }
        catch (SQLException e){
            System.out.println("La conexión de la Base de Datos "+ this.database + " ha fallado");
            System.out.println(e);
            System.exit(0);
        }
    }
}
