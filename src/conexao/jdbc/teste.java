package conexao.jdbc;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author luis.dasilva
 */
public class teste {
    public static void main(String[] args) {
        try {
            SingleConnection.getConnection();
            JOptionPane.showMessageDialog(null,"conexao realizada com sucesso");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ocorreu" + erro);
        }
    }
}
