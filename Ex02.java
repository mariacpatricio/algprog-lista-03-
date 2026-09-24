import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
int nota50;
int nota20;
int nota10;
int nota5;
int nota2;
int nota1;

int valorPagamento;
int valorCompra;

Scanner leia = new Scanner(System.in);
System.out.println("Digite o valor da compra:");
valorCompra = leia.nextInt();
System.out.println("Insira o pagamento:");
valorPagamento = leia.nextInt();

while (valorPagamento < valorCompra) {

System.out.println("O pagamento não é o suficiente, digite um valor válido");
valorPagamento = leia.nextInt(); }

int troco = (valorPagamento - valorCompra);

nota50 = troco / 50;
troco = troco % 50;
nota20 = troco / 20;
troco = troco % 20;
nota10 = troco / 10;
troco = troco % 10;
nota5 = troco / 5;
troco = troco % 5;
nota2 = troco / 2;
troco = troco % 2;
nota1 = troco;

System.out.println("Quantiade de notas de R$50 utilizadas: " + nota50);
System.out.println("Quantiade de notas de R$20 utilizadas: " + nota20);
System.out.println("Quantiade de notas de R$10 utilizadas: " + nota10);
System.out.println("Quantiade de notas de R$5 utilizadas: " + nota5);
System.out.println("Quantiade de notas de R$2 utilizadas: " + nota2);
System.out.println("Quantiade de notas de R$1 utilizadas: " + nota1);

leia.close();

    }
    
}
