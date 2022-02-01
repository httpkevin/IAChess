package model;

public abstract class Piece {

    private EnumCor cor; // Cor da peça 
    private int linha, coluna; // linhas e colunas  
    private String imagem; // Imagens das peças
    private boolean morte = false; // Quando a peça for eliminado
    private boolean selecionado = false; // Selecionar o objeto (peça) 


    public Piece(EnumCor cor, int linha, int coluna, String imagem) {
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
        this.imagem = imagem;
    }
    

    // Validação do movimento da peça
    public abstract boolean validaMovimento(int linhaDestino, int colunaDestino);

    // Getters e setters (não esquecer de implementar)
    public int getLinha() {
        return this.linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return this.coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}