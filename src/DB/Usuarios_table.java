package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Usuarios_table {
    String database;
    String user;
    String password;
    Connection connection;
    Statement statement;

    public Usuarios_table(){
        this.database  = "gestortareas";
        this.user  = "dante";
        this.password  = "2733920";
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/" + this.database +
                            "?user=" + this.user +
                            "&password=" + this.password
            );
            System.out.println("Conexión establecida con éxito");
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate("CREATE TABLE IF NOT EXISTS usuarios (" +
                    "id_usuario INT PRIMARY KEY AUTO_INCREMENT," +
                    "nombre VARCHAR (255) ," +
                    "ap_paterno VARCHAR (50)," +
                    "ap_materno VARCHAR (50)," +
                    "email VARCHAR (255)," +
                    "password VARCHAR (255)) ENGINE=INNODB;");

            System.out.println(rowsAffected + " filas han sido cambiadas");
        }
        catch (SQLException e){
            System.out.println("La conexión de la Base de Datos "+ this.database + " ha fallado");
            System.out.println(e);
            System.exit(0);
        }
    }

    public Usuarios_table(String user, String password){
        this.database  = "gestortareas";
        this.user  = user;
        this.password  = password;
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/" + this.database +
                            "?user=" + this.user +
                            "&password=" + this.password
            );
            System.out.println("Conexión establecida con éxito");
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate("CREATE TABLE IF NOT EXISTS usuarios (" +
                    "id_usuario INT PRIMARY KEY AUTO_INCREMENT," +
                    "nombre VARCHAR (255) ," +
                    "ap_paterno VARCHAR (50)," +
                    "ap_materno VARCHAR (50)," +
                    "email VARCHAR (255)," +
                    "password VARCHAR (255)) ENGINE=INNODB;");

            System.out.println(rowsAffected + " filas han sido cambiadas");
        }
        catch (SQLException e){
            System.out.println("La conexión de la Base de Datos "+ this.database + " ha fallado");
            System.out.println(e);
            System.exit(0);
        }
    }

    public void agregarUsuario(String name, String ap_paterno, String ap_materno, String email, String password){
        try{
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate("INSERT INTO usuarios (nombre," +
                    "ap_paterno, ap_materno, email, password) VALUES (" +
                    name+", "+ ap_paterno+", "+ap_materno+","+email+", "+password+");");
            System.out.println(rowsAffected + " filas han sido cambiadas");
        }
        catch(SQLException e){
            System.out.println("La conexión de la Base de Datos "+ this.database + " ha fallado");
            System.out.println(e);
            System.exit(0);
        }
    }



}