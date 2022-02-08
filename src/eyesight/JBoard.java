package eyesight;


import javax.swing.JPanel;
import model.Board;
import model.Piece;

import java.awt.GridBagLayout;


public class JBoard extends JPanel {

    private Board tabuleiro;

    public JBoard(Board tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    public void desenhaTabuleiro() {
        this.removeAll();
        this.setLayout(new GridLayout(8, 8));
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JCell JCell;
                Piece peca = this.tabuleiro.getPiece(i, j);
                
                if (peca == null) {
                    JCell = new JCell(i, j); 
                
                } else {
                    JCell = new JCell(new JPiece(peca));
                }
            }
        }
    }

    private void setLayout(GridLayout gridLayout) {
    }
}

