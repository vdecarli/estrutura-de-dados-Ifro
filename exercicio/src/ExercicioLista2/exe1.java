package ExercicioLista2;

import java.util.ArrayList;
import java.util.List;

public class exe1 {
    private No inicio;
    private int quantidade;
    private No soma;
    //cria Lista
    public  exe1(){
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

    public int contarNoPares() {
        int itensParesLength = 0;
        No aux = this.inicio;

        while (aux != null) {
            if (aux.getElemento() % 2 == 0) {
                itensParesLength++;
            }
            aux = aux.getProximo();
        }
        return itensParesLength;
    }

    public double calcularMedia() {
        int montante = 0;
        No aux = this.inicio;

        while (aux != null) {
            montante += aux.getValue();
            aux = aux.getProximo();
        }

        return montante / (this.length - 1);
    }

    public NumberList listarItensPares() {
        NumberList listaPares = new NumberList();
        Node aux = this.inicio;

        while (aux != null) {
            if (aux.getValue() % 2 == 0) {
                listaPares.inserirNoFim(new Node(aux.getValue()));
            }
            aux = aux.getProximo();
        }
        return listaPares;
    }

    public NumberList inserirDuploValorEncadeado(Node n1, Node n2, NumberList lista) {
        lista.inserirNoFim(n1);
        lista.inserirNoFim(n2);

        return lista;
    }

    public boolean obterMaiorDaLista(Node value) {
        if (this.isEmpty()) {
            return false;
        } else {
            Node aux = this.inicio;
            int maiorValor = 0;
            int posicao = 0;

            while (aux != null) {
                if (aux.getValue() > maiorValor) {
                    maiorValor = aux.getValue();
                }
                posicao++;
                aux = aux.getProximo();
            }

            value.setValue(maiorValor);
            return true;
        }
    }

    public boolean trocarElementos(int n1, int n2) {
        Node node1 = this.obterUm(n1);
        int valor1 = node1.getValue();
        Node node2 = this.obterUm(n2);
        int valor2 = node2.getValue();

        if (isEmpty() || (n1 > this.length || n1 < 0)|| (n2 > this.length || n2 < 0)) {
            return false;
        } else {
            Node aux = this.inicio;
            int i = 0;

            while (aux != null) {
                if (i == n1) {
                    node1 = aux;
                }
                if(i == n2){
                    node2 = aux;
                }
                aux = aux.getProximo();
                i++;
            }

            node1.setValue(valor1);
            node2.setValue(valor2);

            return true;
        }
    }

    public Node obterUm(int index) {
        if (this.isEmpty()) {
            return null;
        } else {
            Node aux = this.inicio;

            for (int i = 0; i < index; i++) {
                aux = aux.getProximo();
            }

            return aux;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.isEmpty()) {
            System.out.println("Lista Vazia!");
        } else {
            Node aux = this.inicio;

            while (aux != null) {
                builder.append(aux.toString());
                aux = aux.getProximo();
            }
        }
        return builder.toString();
    }

    public String toStringInverso() {
        StringBuilder builder = new StringBuilder();

        if (this.isEmpty()) {
            System.out.println("Lista Vazia!");
        } else {
            Node aux = this.inicio;

            while (aux != null) {
                builder.insert(0, aux.toString());
                aux = aux.getProximo();
            }
        }
        return builder.toString();
    }

    public NumberList clonarLista() {
        return new NumberList(inicio, this.length);
    }

    public NumberList clonarListaLimpa() {
        List<Integer> valores = new ArrayList<Integer>();
        NumberList lista = new NumberList();
        Node aux = this.inicio;

        while(aux != null){
            if(valores.indexOf(aux.getValue()) == -1){
                valores.add(aux.getValue());
                lista.inserirNoFim(new Node(aux.getValue()));
            }
            aux = aux.getProximo();
        }

        return lista;
    }

    public NumberList clonarListaInversa(){
        NumberList lista = new NumberList();
        Node aux = this.inicio;

        while(aux != null){
            lista.inserirNoInicio(new Node(aux.getValue()));
            aux = aux.getProximo();
        }

        return lista;
    }

    public int listarItensTotalizados() {
        Node aux = this.inicio;
        int total = 0;

        while(aux != null){
            total += aux.getValue();
            aux = aux.getProximo();
        }

        return total;
    }


}
