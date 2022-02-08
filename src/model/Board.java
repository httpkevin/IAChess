package model;

// Regras e jogabilidade dentro do Tabuleiro/Jogo
public class Board {
    
    private Piece[][] pecas;
    private Piece pecasSelecionado = null;
    private EnumCor vez = EnumCor.White;
    
    // Constante que define o tempo do jogo
    public static final int TEMPO_JOGADA = 10000;

    // Definição do espaçamento do tabuleiro com construtor
    public Board() {
        this.pecas = new Piece[8][8]; 
    }

    // Retorna o local da peça dentro do tabuleiro
    public Piece getPiece(int linha, int coluna) {
        return this.pecas[linha][coluna];
    }

    public void adicionaPeca(Piece peca) {
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setBoard(this);
    }

    public void selecionaPeca(Piece peca) {
        
        // no caso da peça estar já selecionadoo, ele desmarca
        if (peca.isSelecionada()) { 
            peca.setSelecionado(false);
            this.pecasSelecionado = null;
        
        // no caso da peça nã estar selecionado, ele marca a peça
        } else { 
            peca.setSelecionado(true);
            this.pecasSelecionado = peca;
        }
    }

    public void movePeca(Piece peca, int novaLinha, int novaColuna) {

    }

    public void inverteVez() {
        if (this.vez.equals(EnumCor.White)) {
            this.vez = EnumCor.Black;
        
        } else {
            this.vez = EnumCor.White;
        }
    }
}

