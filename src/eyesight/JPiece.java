package eyesight;

import javax.swing.JLabel;
import model.Piece;

public class JPiece extends JLabel {
    
    private Piece peca;

    public JPiece(Piece peca) {
        this.peca = peca;
    }

    public Piece getPeca() {
        return this.peca;
    }
}
