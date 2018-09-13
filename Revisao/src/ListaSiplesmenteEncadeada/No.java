package ListaSiplesmenteEncadeada;

public class No {
    private String nome;
    private float salario;
    private No proximo;

    public No(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
        proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
