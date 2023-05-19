package conexao.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;



public class SingleConnection {
	   //private static String url = "jdbc:mysql://localhost:3306/bdvendas";
	   //private static String password = "mysql";
	   //private static String user = "root";
	    private static Connection connection = null;
	    
	    public SingleConnection(){
	        conectar();
	    }
	    
	 
	    private static void conectar(){
	        try {
	            if(connection == null){
	                Class.forName("com.mysql.jdbc.Driver");
	                //connection = DriverManager.getConnection(url, user, password);
	                connection = DriverManager.getConnection("jdbc:mysql://localhost/bdvendas", "usuariocurso","123");
	                connection.setAutoCommit(false);
	            }
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    } 
	    public static Connection getConnection(){
	        return connection;
	    }
	    
	    
	    //https://www.youtube.com/watch?v=rHGkb70uA-w
	    /* public Connection getConnection(){
	        try{
	            return DriverMenager.getConnection("jdbc:mysql://localhost/bdvendas", "usuariocurso","123");
	        }  catch (Exception erro) {
	            throw new RuntimeException(erro);
	        }
	    }
	    */
	   
	}