import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //java uygulamamızın bir veritabanına bağlanmasını sağlamak için
        //uygulamamıza bir jdbc implemente ederiz.
        //Jdbc bir kütüphanedir (sql kodlarını çalıştırmak için)
        //hangi veri tabanı türüyle çalışılacksa ona ait driver kurulur.


    }

    public static void deleteData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        //javadan sql sorgusu çalıştırmak için
        PreparedStatement statement = null;         //sql cümleciği
        ResultSet resultSet;                //sonuçlar topluluğu (dönen datalar)

        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu.");

            String sql = "delete from employees where emp_no = ?"; //kullanıcı girecek.parametrre okunuyor olmalı
            statement = connection.prepareStatement(sql);
            statement.setString(1, "10004");


            int result = statement.executeUpdate(); //etkilenen kayıt sayısı döner.
            System.out.println("Kayıt silindi.");
            System.out.println("sonuc : " + result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                if (connection != null) {
                    statement.close();
                    connection.close(); // Artık try içinde olduğu için derleyici hata vermez
                    System.out.println("Bağlantı kapatıldı.");
                }
            } catch (SQLException e) {
                System.out.println("Kapatma esnasında hata: " + e.getMessage());
            }
        }
    }

    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        //javadan sql sorgusu çalıştırmak için
        PreparedStatement statement = null;         //sql cümleciği
        ResultSet resultSet;                //sonuçlar topluluğu (dönen datalar)

        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu.");

            String sql = "update employees set first_name = ? where emp_no =?"; //kullanıcı girecek.parametrre okunuyor olmalı
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Muhammet");
            statement.setString(2, "10003");

            int result = statement.executeUpdate(); //etkilenen kayıt sayısı döner.
            System.out.println("Kayıt güncellendi.");
            System.out.println("sonuc : " + result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                if (connection != null) {
                    statement.close();
                    connection.close(); // Artık try içinde olduğu için derleyici hata vermez
                    System.out.println("Bağlantı kapatıldı.");
                }
            } catch (SQLException e) {
                System.out.println("Kapatma esnasında hata: " + e.getMessage());
            }
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        //javadan sql sorgusu çalıştırmak için
        PreparedStatement statement = null;         //sql cümleciği
        ResultSet resultSet;                //sonuçlar topluluğu (dönen datalar)
        try {
            connection = helper.getConnection();

            System.out.println("Bağlantı oluştu.");

            String sql = "insert into employees(emp_no,birth_date,first_name,last_name,gender,hire_date) values  (?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            //statementi hazırladık, ? = kullanıcı tarafından verilecek

            statement.setString(1, "2");
            statement.setString(2, "2010-06-07");
            statement.setString(3, "Dilşah");
            statement.setString(4, "Yalçınkaya");
            statement.setString(5, "F");
            statement.setString(6, "2026-08-31");


            int result = statement.executeUpdate(); //etkilenen kayıt sayısı döner.
            System.out.println("Kayıt eklendi.");
            System.out.println("sonuc : " + result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                if (connection != null) {
                    statement.close();
                    connection.close(); // Artık try içinde olduğu için derleyici hata vermez
                    System.out.println("Bağlantı kapatıldı.");
                }
            } catch (SQLException e) {
                System.out.println("Kapatma esnasında hata: " + e.getMessage());
            }
        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        //javadan sql sorgusu çalıştırmak için
        Statement statement = null;         //sql cümleciği
        ResultSet resultSet;                //sonuçlar topluluğu (dönen datalar)
        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select emp_no,birth_date,first_name,last_name from employees");

            ArrayList<Employee> employees = new ArrayList<Employee>();
            while (resultSet.next()) {            //tek tek iterate et
                //System.out.println(resultSet.getString("first_name"));  //resultSetteki firstName'leri yazdırma
                employees.add(new Employee(
                        resultSet.getString("emp_no"),
                        resultSet.getString("birth_date"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")));
            }

            System.out.println(employees.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                if (connection != null) {
                    connection.close(); // Artık try içinde olduğu için derleyici hata vermez
                    System.out.println("Bağlantı kapatıldı.");
                }
            } catch (SQLException e) {
                System.out.println("Kapatma esnasında hata: " + e.getMessage());
            }
        }
    }
}
