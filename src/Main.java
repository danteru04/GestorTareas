import DB.Usuarios_table;


class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Realizar conexion a base de datos y crea si no existe la tabla usuarios
        Usuarios_table conexion = new Usuarios_table();
    }
}
