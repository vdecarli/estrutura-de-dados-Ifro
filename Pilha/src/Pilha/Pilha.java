package Pilha;

public class Pilha {
    private int elementos[];
    private int topo;

    //criar

    public Pilha() {
        elementos = new int[6];
        topo = -1;
    }

    public  boolean isVazia(){
        return topo == -1;
    }
    public boolean isCheia(){
        return topo == 5;
    }
    public void empilhar(int elemento){
        if (!isCheia()){
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public  int desempilhar(){
        int elemento = elementos[topo];
        topo --;
        return  elemento;
    }
}
