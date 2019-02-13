public class ArvoreBinaria {
    private NoArvoreBinaria raiz;
    public static int quantidadeNos;

    ArvoreBinaria() {
        this.setRaiz(null);
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria getRaiz() {
        return this.raiz;
    }

    public void insere(int valor) {
        if(this.getRaiz() == null) {
            this.raiz = new NoArvoreBinaria(valor);
            quantidadeNos++;
        } else {
            insere(this.getRaiz(), valor);
        }
    }

    private void insere(NoArvoreBinaria no, int valor) {
        if(no.getValor() == valor) {
            throw new IllegalArgumentException("O valor já foi inserido anteriormente");
        } else {
            if(valor < no.getValor()) {
                if(no.getFilhoEsquerda() == null) {
                    NoArvoreBinaria novo = new NoArvoreBinaria(valor);
                    no.setFilhoEsquerda(novo);
                } else {
                    insere(no.getFilhoEsquerda(), valor);
                }
            } else {
                if(no.getFilhoDireita() == null) {
                    NoArvoreBinaria novo = new NoArvoreBinaria(valor);
                    no.setFilhoDireita(novo);
                } else {
                    insere(no.getFilhoDireita(), valor);
                }

            }
        }
    }

    public boolean buscaValor(int valor) {
        return buscaValor(valor, raiz);
    }

    private boolean buscaValor(int valor, NoArvoreBinaria no) {
        boolean possuiValor = false;

        if(no == null) {
            possuiValor = false;
        } else if (valor == no.getValor()) {
            possuiValor = true;
        } else if (valor < no.getValor()) {
            possuiValor = buscaValor(valor, no.getFilhoEsquerda());
        } else {
            possuiValor = buscaValor(valor, no.getFilhoDireita());
        }

        return possuiValor;
    }

    /*
    BFS - busca em largura
    DFS - busca em profundidade (em ordem, pre ordem, pos ordem)
    Todas as abordagens possuem complexidade O(n), já que visitam todos os nós exatamente uma vez
    https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/
     */

    public String buscaProfundidadeEmOrdem() {
        return buscaProfundidadeEmOrdem(raiz);
    }

    private String buscaProfundidadeEmOrdem(NoArvoreBinaria no) {
        String profundidadeEmOrdem = "";

        if(no == null) {
            profundidadeEmOrdem = profundidadeEmOrdem + "";
        } else {
            profundidadeEmOrdem = profundidadeEmOrdem + this.buscaProfundidadeEmOrdem(no.getFilhoEsquerda());
            profundidadeEmOrdem = profundidadeEmOrdem + no.getValor() + " ";
            profundidadeEmOrdem = profundidadeEmOrdem + this.buscaProfundidadeEmOrdem(no.getFilhoDireita());
        }

        return profundidadeEmOrdem;
    }

    public String buscaProfundidadePreOrdem() {
        return buscaProfundidadePreOrdem(raiz);
    }

    private String buscaProfundidadePreOrdem(NoArvoreBinaria no) {
        String profundidadePreOrdem = "";

        if(no == null) {
            profundidadePreOrdem = profundidadePreOrdem + "";
        } else {
            profundidadePreOrdem = profundidadePreOrdem + no.getValor() + " ";
            profundidadePreOrdem = profundidadePreOrdem + this.buscaProfundidadePreOrdem(no.getFilhoEsquerda());
            profundidadePreOrdem = profundidadePreOrdem + this.buscaProfundidadePreOrdem(no.getFilhoDireita());
        }

        return profundidadePreOrdem;
    }

    public String buscaProfundidadePosOrdem() {
        return buscaProfundidadePosOrdem(raiz);
    }

    private String buscaProfundidadePosOrdem(NoArvoreBinaria no) {
        String profundidadePosOrdem = "";

        if(no == null) {
            profundidadePosOrdem = profundidadePosOrdem + "";
        } else {
            profundidadePosOrdem = profundidadePosOrdem + this.buscaProfundidadePosOrdem(no.getFilhoEsquerda());
            profundidadePosOrdem = profundidadePosOrdem + this.buscaProfundidadePosOrdem(no.getFilhoDireita());
            profundidadePosOrdem = profundidadePosOrdem + no.getValor() + " ";
        }

        return profundidadePosOrdem;
    }
}
