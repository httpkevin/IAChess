package model;

public class Pawn extends Piece {

    private boolean primeiroMovimento = true;

    public Pawn(EnumCor cor, int linha, int coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }
    
    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        return true;
    }

}