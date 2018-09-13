package ListaDuplamenteEncadeada;

public class Lista {
    private No inicio;
    private No fim;
    private int quantidade;

    public Lista(){
        inicio=null;
        fim=null;
        quantidade=0;
    }

    public boolean isVazia(){
        return inicio==null;
    }

    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        }else {
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio = no;
        }
        quantidade++;

    }

    public void inserirNoFim(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        }else {
            fim.setProximo(no);
            no.setAnterior(fim);
            fim = no;
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
