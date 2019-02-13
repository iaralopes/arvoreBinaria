public class Aplicacao {

    public static void main (String [] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        arvoreBinaria.insere(4);
        arvoreBinaria.insere(2);
        arvoreBinaria.insere(3);
        arvoreBinaria.insere(1);
        arvoreBinaria.insere(6);

        System.out.println(arvoreBinaria.buscaProfundidadeEmOrdem());
        System.out.println(arvoreBinaria.buscaProfundidadePreOrdem());
        System.out.println(arvoreBinaria.buscaProfundidadePosOrdem());


    }
}
