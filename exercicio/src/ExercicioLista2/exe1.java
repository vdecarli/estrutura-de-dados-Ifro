package ExercicioLista2;

import java.util.ArrayList;
import java.util.List;

public class exe1 {
    private No inicio;
    private int comprimento;

    public exe1() {
        this.inicio = null;
        this.comprimento = 0;
    }

    private exe1(No inicio, int comprimento){
        this.inicio = inicio;
        this.comprimento = comprimento;
    }

    public boolean isVazia() {
        return this.inicio == null;
    }

    public void inserirNoInicio(No num) {
        if (isVazia()) {
            this.inicio = num;
        } else {
            num.setProximo(this.inicio);
            this.inicio = num;
        }

        this.comprimento++;
    }

    public void inserirNoFim(No num) {
        if (isVazia()) {
            this.inicio = num;
        } else {
            No aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }

            aux.setProximo(num);
        }
        this.comprimento++;
    }

    public void inserir(No num, int i) {
        if (i == 0 || isVazia()) {
            inserirNoInicio(num);
        } else if (i > comprimento) {
            inserirNoFim(num);
        } else {
            No aux = this.inicio;
            No anterior = null;
            for (int i = 0; i < i; i++) {
                anterior = aux;
                aux = aux.getProximo();
            }
            num.setProximo(anterior.getProximo());
            anterior.setProximo(num);
            this.comprimento++;
        }
    }

    public No remover(int i) {
        No aux = null;

        if (!isVazia() || !(i > this.comprimento || i < 0)) {
            aux = this.inicio;
            No anterior = null;

            if (i == 0) {
                No deletado = aux;
                this.inicio = aux.getProximo();
            } else {
                int i = 0;
                do {
                    anterior = aux;
                    aux = aux.getProximo();
                    i++;
                } while (i < i);

                anterior.setProximo(aux.getProximo());
                aux.setProximo(null);
            }
            this.comprimento--;
        }

        return aux;
    }

    public boolean removerPrimeiros(int quantidade) {

        if (!isVazia() || !(quantidade > this.comprimento || quantidade < 0)) {
            for (int i = 0; i < quantidade; i++) {
                this.remover(i);
            }
            return true;
        }

        return false;
    }

    public int contarNumPares() {
        int NParesComprimento = 0;
        No aux = this.inicio;

        while (aux != null) {
            if (aux.getValor() % 2 == 0) {
                NParesComprimento++;
            }
            aux = aux.getProximo();
        }
        return NParesComprimento;
    }

    public double calcularMedia() {
        int montante = 0;
        No aux = this.inicio;

        while (aux != null) {
            montante += aux.getValor();
            aux = aux.getProximo();
        }

        return montante / (this.comprimento - 1);
    }

    public exe1 listarItensPares() {
        exe1 listaPares = new exe1();
        No aux = this.inicio;

        while (aux != null) {
            if (aux.getValor() % 2 == 0) {
                listaPares.inserirNoFim(new No(aux.getValor()));
            }
            aux = aux.getProximo();
        }
        return listaPares;
    }

    public exe1 inserirDuploValorEncadeado(No n1, No n2, exe1 lista) {
        lista.inserirNoFim(n1);
        lista.inserirNoFim(n2);

        return lista;
    }

    public boolean obterMaiorDaLista(No valor) {
        if (this.isVazia()) {
            return false;
        } else {
            No aux = this.inicio;
            int maiorValor = 0;
            int posicao = 0;

            while (aux != null) {
                if (aux.getValor() > maiorValor) {
                    maiorValor = aux.getValor();
                }
                posicao++;
                aux = aux.getProximo();
            }

            valor.setValor(maiorValor);
            return true;
        }
    }

    public boolean trocarElementos(int n1, int n2) {
        No nun1 = this.obterUm(n1);
        int valor1 = num1.getValor();
        No num2 = this.obterUm(n2);
        int valor2 = num2.getValor();

        if (isVazia() || (n1 > this.comprimento || n1 < 0)|| (n2 > this.comprimento || n2 < 0)) {
            return false;
        } else {
            No aux = this.inicio;
            int i = 0;

            while (aux != null) {
                if (i == n1) {
                    num1 = aux;
                }
                if(i == n2){
                    num2 = aux;
                }
                aux = aux.getProximo();
                i++;
            }

            no1.setValue(valor1);
            no2.setValor(valor2);

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
