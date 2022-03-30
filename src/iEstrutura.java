public interface iEstrutura {
    void insere(int elemento);
    void insere(EstruturaFila fila, int elemento);
    int remove();
    boolean vazio();
    int tamanho();
    boolean cheio();
    void imprimirEstrutura(EstruturaFila fila);
    int primeiraPosição();
    int ultimaPosição();
}
