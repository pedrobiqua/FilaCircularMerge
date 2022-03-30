public class Merge {

    public static EstruturaFila gerarMerge(EstruturaFila a, EstruturaFila b) {
        EstruturaFila FilaMerge = new EstruturaFila(a.getDado().length + b.getDado().length);
        //System.out.println(a.vazio() && b.vazio()); usado para debug
        while(!(a.vazio() && b.vazio())){
            
            int v1 = a.primeiraPosição();
            int v2 = b.primeiraPosição();
            int valor;
            // if(Fila.vazia(a) &&)
            if(v1 > v2){
                
                if(b.vazio()){
                    valor = a.remove();
                    FilaMerge.insere(valor);
                    continue;
                }
                if(v2 != 0){
                    valor = b.remove();
                    FilaMerge.insere(valor);
                    continue;
                }else{
                    valor = a.remove();
                    FilaMerge.insere(valor);
                    continue;
                }
                
            }
            if(v2 > v1){
                if(a.vazio()){
                    valor = b.remove();
                    FilaMerge.insere(valor);
                    continue;
                }
                if(!(v1 == 0)){
                    valor = a.remove();
                    FilaMerge.insere(valor);
                    continue;
                }else{
                    valor = b.remove();
                    FilaMerge.insere(valor);
                    continue;
                }
            }
            if(v1 == v2){//problema
                valor = a.remove();
                b.remove();
                FilaMerge.insere(valor);
            }
            
        }
        FilaMerge.imprimirEstrutura(FilaMerge);
        return FilaMerge; 
    }
}
