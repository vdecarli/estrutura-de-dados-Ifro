package ExercicioLista2;

public class No {
    private int valor;
    private No anterior;
    private No proximo;

    public No() {

    }

    public No(int valor) {
        this.setValor(valor);
        this.setProximo(null);
        this.setAnterior(null);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
