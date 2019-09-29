/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

import com.itextpdf.text.DocumentException;//se encarga
//de capturar los posibles errores..

import com.itextpdf.text.Paragraph;//hace referencia a
//un parrafo,

import com.itextpdf.text.pdf.PdfWriter; //contiene el
//codigo necesario para crear un archivo PDF

import com.itextpdf.text.pdf.PdfPTable; //contiene el
import java.util.Date;
//codigo necesario para tabular un archivo PDF

/**
 *
 * @author Ericka
 */
public class procedimientos {
    
           public int AgregarPedido(int idPharmacy, int IdOrder,String OrderDate,int IdClient,int idStatus,
                   int idOrderType,String detail){
            Connection entrada= null;
            
            String SSQL = "INSERT INTO client_order (idPharmacy, IdOrder, OrderDate, IdClient, idStatus,"
                    + " idOrderType, detail) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            int resultado = 0;
            
            try {
    
                entrada= conexion.establecerConexion();

                PreparedStatement psql = entrada.prepareStatement(SSQL);
                psql.setInt(1,idPharmacy);
                psql.setInt(2,IdOrder);
                psql.setString(3,OrderDate);
                psql.setInt(4,IdClient);
                psql.setInt(5,idStatus);
                psql.setInt(6,idOrderType);
                psql.setString(7,detail);              

                resultado = psql.executeUpdate();

                psql.close();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n"
                                             + e, "Error en la operación", JOptionPane.ERROR_MESSAGE);

            }finally{

                try {

                    if(entrada!=null){

                        entrada.close();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                             + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
                }
            }
            return resultado;
    }
}
