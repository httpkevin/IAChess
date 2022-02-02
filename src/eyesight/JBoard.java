package eyesight;

import javax.swing.JPanel;
import model.Board;

public class JBoard extends JPanel {

    private Board tabuleiro;

    public JBoard(Board tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
}
