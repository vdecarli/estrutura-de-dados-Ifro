package ListaDuplamenteEncadeada;

public class No {
    private String nome;
    private float salario;
    private No anterior;
    private No proximo;

    public No(String nome, float salario){
        this.nome =nome;
        this.salario=salario;
        anterior=null;
        proximo=null;
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
