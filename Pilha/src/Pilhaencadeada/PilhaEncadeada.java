package Pilhaencadeada;

import Pilhaencadeada.No;

public class PilhaEncadeada {
    private int quantidade;
    private No topo;

    public PilhaEncadeada() {
        topo = null;
        quantidade = 0;

    }
    public boolean isVazia(){
        return this.topo ==null;
    }
    public int tamanho(){
        return quantidade;
    }
    public void empilhar (No no){
        no.setProximo(topo);
        topo = no;
        quantidade++;
    }
    public No desempilhar(){
        No aux = topo;
        topo = topo.getProximo();
        aux.setProximo(null);
        quantidade--;
        return aux;
    }



}




