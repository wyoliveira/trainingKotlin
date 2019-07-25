package codes;

import java.sql.*;

public class ConexaoOracle {

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(DataBaseConstants.CONNECTION.DRIVER);

            conn = DriverManager.getConnection(DataBaseConstants.CONNECTION.URL,
                    DataBaseConstants.CONNECTION.USERDB,
                    DataBaseConstants.CONNECTION.PASSDB);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {

        String query = "SELECT sysdate FROM DUAL";

        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                System.out.println(resultSet.getString("sysdate"));
                System.out.println("Table name: "+resultSetMetaData.getTableName(1));
                System.out.println("Column name: "+resultSetMetaData.getColumnName(1));
                System.out.println("Column type: "+resultSetMetaData.getColumnTypeName(1));
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
