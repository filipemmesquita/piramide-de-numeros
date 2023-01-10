import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pirâmide de Números!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para o começo: ");
        int initial = sc.nextInt();
        System.out.println("Insira um numero para o final: ");
        int end = sc.nextInt();
        for(int i=initial;i<=end;i++){
            String result = "";

            for(int x=0;x<i;x++){
                result = result+i;
            }
            System.out.println(result);
        }
    }
}
