package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    public String db = "BD_Matricula_Asistencia";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "";

    public Connection Connectar() {

        Connection link = null;
        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

        return link;
    }

}


