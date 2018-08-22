package ListaSimplesmenteEncadeada;

public class Lista {
    private No inicio;
    private int quantidade;
    //cria Lista
    public  Lista(){
        this.inicio = null;
        this.quantidade =0;

    }
    //verifica se lista esta vazia
    public boolean isVazia(){
        return this.inicio == null;

    }

    public void incerirNoInicio(No no){
        if (isVazia()){
            this.inicio = no;

        }else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;

    }

    public void incerirNoFim(No no){
        if (isVazia()) {
            this.inicio = no;
        }else{
            No aux =  this.inicio;
            while (aux.getProximo()!= null);
            aux = aux.getProximo();
            aux.setProximo(no);
        }
        this.quantidade++;

    }
    public void incerir(No no , int posicao){
        if (isVazia() || posicao ==1){
            this.incerirNoInicio(no);
        }else if (posicao > quantidade){
            this.incerirNoFim(no);
        }else{
            No aux = this.inicio;
            No anterior = null;

            for (int i = 1; i < posicao; i++){
                anterior = aux;
                aux = aux.getProximo();
            }
            no.setProximo(anterior.getProximo());
            anterior.setProximo(no);
        }
        this.quantidade++;

    }

    public No remover(int posicao){

        No aux = null;

        if (!isVazia()){
            aux = this.inicio;
            No anterior = null;

            if(posicao ==1){
                this.inicio = this.inicio.getProximo();
                this.quantidade--;
            }else if (posicao <= this.quantidade) {


                for (int i = 0; i < posicao; i++) {
                    anterior.setProximo(aux.getProximo());
                    aux.setProximo(null);
                }
                anterior.setProximo(aux.getProximo());
                aux.setProximo(null);
                this.quantidade--;
            }
        }
        return  aux;
    }

    //imprimir lista
    public void imprimir(){
        if (isVazia()){
            System.out.println("Lista vazia");
        }else {
            No aux = this.inicio;
            while (aux != null){
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }


}
