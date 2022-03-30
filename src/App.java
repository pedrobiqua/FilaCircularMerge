import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TDE-1 FILA, HELLO WORLD");
        System.out.println("---------------------------");
        //INPUT DE DADOS FILA A
        System.out.println("Fila A...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos numeros irá ter na fila A: ");
        int numA = scanner.nextInt();
        EstruturaFila filaA = new EstruturaFila(numA);
        System.out.println("---------------------------");

        //INPUT DE DADOS FILA B
        System.out.println("Fila B...");

        System.out.println("Digite quantos numeros irá ter na fila B: ");
        int numB = scanner.nextInt();
        EstruturaFila filaB = new EstruturaFila(numB);

        Scanner scanForA = new Scanner(System.in);

        System.out.println("---------------------------");

        //Inserindo dados
        System.out.println("Numeros A");
        for (int i = 0; i < numA; i++) {
            System.out.println("Numero " + (i+1) +":");
            int numIns = scanForA.nextInt();
            filaA.insere(numIns);
            
        }

        //Organizando o input
        int[] vetA = BShort.BubbleShort(filaA.getDado());
        filaA.setDado(vetA);
        //filaA.imprimirEstrutura(filaA); debug


        Scanner scanForB = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Números B:");
        for (int i = 0; i < numB; i++) {
            System.out.println("Numero " + (i+1) +":");
            int numIns = scanForB.nextInt();
            filaB.insere(numIns);
        }

        //Organizando o input
        int[] vetB = BShort.BubbleShort(filaB.getDado());
        filaB.setDado(vetB);

        //Desenvolver o scan para o usuario fazer a fila.
/*
        filaA.insere(5);
        filaA.insere(7); usado para debug
        filaA.insere(9);
        filaA.imprimirEstrutura(filaA);

        System.out.println("-----------------");

        filaB.insere(6);
        filaB.insere(8);
        filaB.imprimirEstrutura(filaB);
*/
        //Efetuando merge
        System.out.println("---------------------------");
        //Output de dados da fila C.
        System.out.print("Fila C: ");
        //Merge da filas a e b
        Merge.gerarMerge(filaA, filaB); //A nova lista está nessa classe.


        //Fechando os scan.
        scanForA.close();
        scanForB.close();
        scanner.close();


    }
}
