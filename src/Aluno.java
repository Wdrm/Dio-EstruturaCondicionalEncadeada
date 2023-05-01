import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Informe Nota do Aluno:\n");
        nota = sc.nextDouble();
        if (nota>= 7){
            System.out.println("Aprovado!");
        } else if (nota >=5 && nota<7){
            System.out.printf("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
        }
        }

