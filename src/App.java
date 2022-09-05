import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean estachuvendo = true;
        boolean temGuardaChuva = false;

        if (temGuardaChuva == true && estachuvendo == true) {
            JOptionPane.showMessageDialog(null, "Estamos protegidos da chuva!");
        } else if (estachuvendo == false) {
            JOptionPane.showMessageDialog(null, "Não está chuvendo, guarde o guarda-chuva");
        } else {
            JOptionPane.showMessageDialog(null, "proteja-se da chuva");
        }

    }
}
