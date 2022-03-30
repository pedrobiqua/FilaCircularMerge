public class BShort {
    
    public static int[] BubbleShort(int[] vet) {
        int aux = 0;
	    int i = 0;

        //System.out.println(" ");
    
        for(i = 0; i<vet.length; i++){
            for(int j = 0; j<vet.length-1; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        //System.out.println("Vetor organizado:");
        return vet;
    }
	
}
