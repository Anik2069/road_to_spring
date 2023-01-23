import java.sql.*;
class FirstJDBC{
    public static void main(String args[]){
        try{
            //load dricer
            Class.forName("com.mysql.jdbc.Driver");
            //creat connection
            String url =  "jdbc:mysql://localhost:3306/update_info";
            Connection con = DriverManager.getConnection(url,"root","");

            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }else{
                 System.out.println("Connection is Created bro");
            }

          

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}