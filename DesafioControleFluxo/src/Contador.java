import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro: ");
        int parametro1 = sc.nextInt();
        System.out.print("Digite o segundo parametro: ");
        int parametro2 = sc.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        sc.close();
    }
    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}
class ParametrosInvalidosException extends Exception{

}
