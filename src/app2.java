import javax.swing.JOptionPane;

public class app2 {
    public static void main(String[] args) throws Exception {

        String saudeDaFruta = "podre";

        if (saudeDaFruta == "amarelo") {
            JOptionPane.showMessageDialog(null, "a fruta está amarelada");
        } else if (saudeDaFruta == "verde") {
            JOptionPane.showMessageDialog(null, "está fruta está boa");
        } else {
            JOptionPane.showMessageDialog(null, "está fruta não presta");

        }
    }
}
