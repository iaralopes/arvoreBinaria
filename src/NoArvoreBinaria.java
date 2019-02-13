public class NoArvoreBinaria {
    private int valor;
    private NoArvoreBinaria filhoDireita;
    private NoArvoreBinaria filhoEsquerda;
    private NoArvoreBinaria pai;

    NoArvoreBinaria() {
        ArvoreBinaria.quantidadeNos++;
    }

    NoArvoreBinaria(int valor) {
        this.setValor(valor);
        ArvoreBinaria.quantidadeNos++;
    }

    NoArvoreBinaria(int valor, NoArvoreBinaria filhoDireita, NoArvoreBinaria filhoEsquerda, NoArvoreBinaria pai) {
        this.setValor(valor);
        this.setFilhoDireita(filhoDireita);
        this.setFilhoEsquerda(filhoEsquerda);
        this.setPai(pai);
        ArvoreBinaria.quantidadeNos++;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoArvoreBinaria getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(NoArvoreBinaria filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public NoArvoreBinaria getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(NoArvoreBinaria filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public NoArvoreBinaria getPai() {
        return pai;
    }

    public void setPai(NoArvoreBinaria pai) {
        this.pai = pai;
    }
}
