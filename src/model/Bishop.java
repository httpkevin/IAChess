package model;

public class Bishop extends Piece {

    public Bishop(EnumCor cor, int linha, int coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }
    
    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        return true;
    }
}

//https://www.youtube.com/watch?v=LAWCPYHeR6Q 50min