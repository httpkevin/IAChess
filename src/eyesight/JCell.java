package eyesight;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;;

public class JCell extends JPanel {

    private JPiece JPeca;
    
    private int linha, coluna;

    public JCell(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    
    public JCell(JPiece JPeca) {
        this.JPeca = JPeca;
        this.linha = JPeca.getPeca().getLinha();
        this.coluna = JPeca.getPeca().getColuna();
        this.add(JPeca);

        if ((JPeca.getPeca() != null) && JPeca.getPeca().isSelecionada()) {
            this.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        }
    }
}
