package eyesight;

import javax.swing.JPanel;;

public class JCell extends JPanel {

    private JPiece jpeca;
    
    private int linha, coluna;

    public JCell(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    
}
