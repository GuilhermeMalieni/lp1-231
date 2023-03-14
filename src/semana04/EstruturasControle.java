package semana04;

import java.io.StreamCorruptedException;

public class EstruturasControle {
public static void main(String[] args) {
    //if

    final int MAIORIDADE = 18;
    var idade = 17;


    if(idade >= MAIORIDADE) {
            System.out.println("Maior de idade");
        }

        var ligado = true; 
        if (ligado) {
            System.out.println("Está ligado");
        }else{
            System.out.println("Está desligado");

        }

        // switch
        // char, byte, short
        // literal string 
        // Num
        int n = 3; 

        switch (n) {
                case 1 :
                 System.out.println("Num1");
                 break;

                case 2 :
                 System.out.println("Num2");
                 break;

                case 3 :
                 System.out.println("Num3");
                break;

                default:
                 System.out.println("Não indentificado");
                 break;
        
        }

        // loops
        // for, foreach , while , do while

        int contador = 0; 
        while (contador < 3 ) {
            System.out.println("While ligadooo");
            contador++;
        }

        contador = 0;
        do{
            System.out.println("Do while Ligado!");
            contador++; 
        }while (contador < 3);
        // 1=0; 0 < 3
        // 1=1; 1 < 3
        // 1=2; 2 < 3
        // 1=3; 3 < 3
        for (int i = 0; 1 < 3; i++){
                System.out.println("For ligado!");
        }
       // String nome = "João";    
        // array
        //armazena mais de um elemento
        //acesso via index - numero inteiro 
        // tamanho fixo no momento da criação
        // nomes =[______,______,_____]
        //           1     2      3

        String[] nomes = new String[3];    
        nomes [0] = "Maria";
        nomes [2] = "Marta";
        nomes [3] = "Marcia";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        for ( int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[1]);
        }
    
        //foreach 
        for ( String nome :  i = 0; i < nomes.length; i++nomes) {
            System.out.println(nome);
        }


        int[] numeros = {1,3,5,0};
        for (int numeros : numeros){
            System.out.println(numero);
        }
        int[] numeros = new int[4];
        numeros[0]= 1;










}