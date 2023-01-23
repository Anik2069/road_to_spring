import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class CRUDJDBC {
    public static void main(String args[]) {
        try {
            // load dricer
            Class.forName("com.mysql.jdbc.Driver");
            // creat connection
            String url = "jdbc:mysql://localhost:3306/update_info";
            Connection con = DriverManager.getConnection(url, "root", "");

            if (con.isClosed()) {
                System.out.println("Connection is Closed");
            } else {
                System.out.println("Connection is Created bro");
            }

            // create a table

            // String q = "Create table mytable (tid int(20) primary key auto_increment,
            // t_name varchar(250) null)";
            // Statement stmt = con.createStatement();
            // stmt.executeUpdate(q);
            // System.out.println("Table is Created bro");

            // insert into Data
            // String q = "insert into mytable (t_name) values(?)";
            // PreparedStatement pstmt = con.prepareStatement(q);
            // pstmt.setString(1, "Nik");
            // pstmt.executeUpdate();
            // System.out.println("Data is inserted bro");

            // User Input Data

            // String q = "insert into mytable (t_name) values(?)";
            // PreparedStatement pstmt = con.prepareStatement(q);

            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // System.out.println("Nam kiya hae: ");

            // String name = br.readLine();

            // pstmt.setString(1, name);
            // pstmt.executeUpdate();
            // System.out.println("Data is inserted bro");

            // Get Data from DB

            String q = "select * from mytable";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);

                System.out.println(id+" Name "+ name);
            }
            System.out.println("Table is Created bro");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}