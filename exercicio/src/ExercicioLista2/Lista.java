package ExercicioLista2;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private No inicio;
    private int comprimento;

    public Lista() {
        this.inicio = null;
        this.comprimento = 0;
    }

    private Lista(No inicio, int comprimento){
        this.inicio = inicio;
        this.comprimento = comprimento;
    }

    public boolean isVazia() {
        return this.inicio == null;
    }

    public void inserirNoInicio(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }

        this.comprimento++;
    }

    public void inserirNoFim(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            No aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }

            aux.setProximo(no);
        }
        this.comprimento++;
    }

    public void inserir(No no, int i) {
        if (i == 0 || isVazia()) {
            inserirNoInicio(no);
        } else if (i > comprimento) {
            inserirNoFim(no);
        } else {
            No aux = this.inicio;
            No anterior = null;
            for (i = 0; i < i; i++) {
                anterior = aux;
                aux = aux.getProximo();
            }
            no.setProximo(aux);
            no.setAnterior(aux.getAnterior());
            no.getAnterior().setProximo(no);
            aux.setAnterior(no);
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
                 i = 0;
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

    public Lista listarItensPares() {
        Lista listaPares = new Lista();
        No aux = this.inicio;

        while (aux != null) {
            if (aux.getValor() % 2 == 0) {
                listaPares.inserirNoFim(new No(aux.getValor()));
            }
            aux = aux.getProximo();
        }
        return listaPares;
    }

    public Lista inserirDuploValorEncadeado(No no1, No no2, Lista lista) {
        lista.inserirNoFim(no1);
        lista.inserirNoFim(no2);

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

  //  public boolean trocarElementos(int n1, int n2) {
      //  No n1 = this.obterUm(n1);
       // int valor1 = n1.getValor();
      //  No n2 = this.obterUm(n2);
      //  int valor2 = n2.getValor();

      //  if (isVazia() || (n1 > this.comprimento || n1 < 0)|| (n2 > this.comprimento || n2 < 0)) {
       //     return false;
       // } else {
        //    No aux = this.inicio;
        //    int i = 0;

          //  while (aux != null) {
         //       if (i == n1) {
            //        n1 = aux;
              //  }
              //  if(i == n2){
             //       n2 = aux;
             //   }
              //  aux = aux.getProximo();
             //   i++;
        //   }

          //  n1.setValor(valor1);
          //  n2.setValor(valor2);

          //  return true;
       // }
   // }

    public No obterUm(int index) {
        if (this.isVazia()) {
            return null;
        } else {
            No aux = this.inicio;

            for (int i = 0; i < index; i++) {
                aux = aux.getProximo();
            }

            return aux;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (this.isVazia()) {
            System.out.println("Lista Vazia!");
        } else {
            No aux = this.inicio;

            while (aux != null) {
                builder.append(aux.toString());
                aux = aux.getProximo();
            }
        }
        return builder.toString();
    }

    public String toStringInverso() {
        StringBuilder builder = new StringBuilder();

        if (this.isVazia()) {
            System.out.println("Lista Vazia!");
        } else {
            No aux = this.inicio;

            while (aux != null) {
                builder.insert(0, aux.toString());
                aux = aux.getProximo();
            }
        }
        return builder.toString();
    }

    public Lista clonarLista() {
        return new Lista(inicio, this.comprimento);
    }

    public Lista clonarListaLimpa() {
        List<Integer> valores = new ArrayList<Integer>();
        Lista lista = new Lista();
        No aux = this.inicio;

        while(aux != null){
            if(valores.indexOf(aux.getValor()) == -1){
                valores.add(aux.getValor());
                lista.inserirNoFim(new No(aux.getValor()));
            }
            aux = aux.getProximo();
        }

        return lista;
    }

    public Lista clonarListaInversa(){
        Lista lista = new Lista();
        No aux = this.inicio;

        while(aux != null){
            lista.inserirNoInicio(new No(aux.getValor()));
            aux = aux.getProximo();
        }

        return lista;
    }

    public int listarItensTotalizados() {
        No aux = this.inicio;
        int total = 0;

        while(aux != null){
            total += aux.getValor();
            aux = aux.getProximo();
        }

        return total;
    }


}
