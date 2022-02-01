package model;

public class Queen extends Piece {

    public Queen(EnumCor cor, int linha, int coluna, String imagem) {
        super(cor, linha, coluna, imagem);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        return true;
    }
    
}
