public class EstruturaFila implements iEstrutura {
    private int[] dado;
    public int primeiro = 0, ultimo = - 1, max, tamanho = 0;

    public int[] getDado() {
        return dado;
    }

    public void setDado(int[] dado) {
        this.dado = dado;
    }
    
    public EstruturaFila(int tamanho) {
        this.tamanho = tamanho;
        this.ultimo = -1;
        dado = new int[this.tamanho];
        max = tamanho;
        this.tamanho = 0;

    }

    public EstruturaFila(EstruturaFila fila) {
        this.tamanho = fila.tamanho;
        this.ultimo = -1;
        dado = new int[fila.tamanho];
        max = fila.tamanho;
        this.tamanho = 0;
    }

    @Override
    public void insere(int elemento) {
        if(tamanho < max) {
            if(ultimo == max-1) { ultimo = 0;}
            else {ultimo = ultimo +1;}
            dado[ultimo] = elemento;
            tamanho = tamanho +1;
        }else {System.out.println("Fila cheia.");}
    }

    @Override
    public void insere(EstruturaFila fila, int elemento) {
        if(tamanho < max) {
            if(ultimo == max-1) { ultimo = 0;}
            else {ultimo = ultimo +1;}
            dado[ultimo] = elemento;
            tamanho = tamanho +1;
        }else {System.out.println("Fila cheia.");}
    }

    @Override
    public int remove() {
        if(tamanho != 0) {
            int valor_primeiro = dado[primeiro];
            if(primeiro == max-1) { primeiro = 0;}
            else {primeiro = primeiro +1;}
            tamanho--;
            return valor_primeiro;
        }else {
            System.out.println("Fila vazia");
            return -1;
        }
    }

    @Override
    public boolean cheio() {
        return primeiro == dado.length - 1;
    }

    @Override
    public boolean vazio() {
        return tamanho == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void imprimirEstrutura(EstruturaFila fila) {
        if (fila.vazio()) {
            System.out.println(" ");
        }else{
            for (int i = primeiro; i < ultimo + 1; i++) {
                System.out.print(dado[i]+" ");
                if (i == ultimo) {
                    System.out.println(" . . .");
                }
            }
        }
    }

    @Override
    public int primeiraPosição() {
        return dado[primeiro];
    }

    @Override
    public int ultimaPosição() {
        if (vazio()) {
            System.out.println("Está vazia");
            return -1;
        }else{
            return dado[ultimo];
        }
    }
}
