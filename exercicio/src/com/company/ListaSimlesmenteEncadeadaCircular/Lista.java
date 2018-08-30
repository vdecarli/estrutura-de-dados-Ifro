package com.company.ListaSimlesmenteEncadeadaCircular;

public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;
    }


    public boolean isVazia(){
        return inicio ==null;
    }
    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = no;
            no.setProximo(inicio);

        }else{
            no.setProximo(inicio);
            No aux = inicio;
            do {
                aux = aux.getProximo();
            } while (aux.getProximo() != inicio);
                aux.setProximo(no);
                inicio =no;
            }

        }


    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            do {
                System.out.println(aux.getElemento());
                aux =aux.getProximo();
            }while (aux!= inicio);
        } else {
            System.out.println("Lista esta Vazia");
        }
    }
    public void inserirNoFim(No no){
        if (isVazia()){
            inicio = no;
            no.setProximo(inicio);
        }else {
            No aux = inicio;
            do {
                aux = aux.getProximo();
            }while (aux.getProximo() !=inicio);
            aux.setProximo(no);
            no.setProximo(inicio);
        }

    }
}
