package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmContenedor extends javax.swing.JFrame {

    public FrmContenedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        /*Por: Diego Vásquez
        Utilización de Libreria FlatLaF para Interfaz Gráfica de Usuario*/
        
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch(UnsupportedLookAndFeelException ex){
            JOptionPane.showMessageDialog(null, "Error Interfaz Gráfica", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new FrmContenedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}