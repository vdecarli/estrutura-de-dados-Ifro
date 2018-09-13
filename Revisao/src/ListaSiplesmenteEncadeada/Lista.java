package ListaSiplesmenteEncadeada;

public class Lista {
    private No inicio;
    private int quantidade;

    public Lista() {
        inicio = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = no;
        }else{
            no.setProximo(inicio);
            inicio = no;
        }
        quantidade++;

    }
    public void inserirNoFim(No no){
        if (isVazia()){
            inicio=no;
        }else {
            No aux = inicio;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(no);
        }
        quantidade++;
    }
    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            while (aux != null){
                System.out.println(aux.getNome()+ ": "+ aux.getSalario());
                aux = aux.getProximo();
            }

        }else{
            System.out.println("Alista está Vazia");
        }
    }

}
