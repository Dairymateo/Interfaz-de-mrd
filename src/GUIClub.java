import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIClub extends JFrame {
    private JTextField NuevoSocioAfiliar;
    private JTextField NUevaCedulaAfiliar;
    private JButton ButonRegistrar;
    private JTextField EliminarNombre;
    private JTextField EliminarCedula;
    private JButton eliminarButton;
    private JTextField CedulaAumentarFondos;
    private JTextField AumentarFondos;
    private JButton agregarButton;
    private JTextField NombreAutorizado;
    private JTextField CedulaAutorizado;
    private JButton autorizarButton;
    private JTextField NombreConsumo;
    private JTextField CedulaConsumo;
    private JTextField ConceptoConsumo;
    private JTextField ValorConsumo;
    private JTextField TotalConsumo;
    private JButton registrarConsumoButton;
    private JButton mostrarConsumosTotalesButton;
    private JTextField CedulaPagar;
    private JTextField IndicePagar;
    private JButton pagarButton;
     

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GUIClub();
                frame.setSize(1910, 1080);
                frame.setVisible(true);
            }
        });
    }

    public GUIClub() {
        ButonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        autorizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        registrarConsumoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mostrarConsumosTotalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        pagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
