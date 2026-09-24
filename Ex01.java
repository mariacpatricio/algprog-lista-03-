import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
double a;
double b;
ouble c;
        
Scanner leia = new Scanner(System.in);

System.out.println("Digite o primeiro número:");
a = leia.nextDouble();

System.out.println("Digite o segundo número:");
b = leia.nextDouble();

System.out.println("Digite o terceiro número:");
c = leia.nextDouble();

double maior = a;
double menor = a;

if (b > maior) {
maior = b; }

if (c > maior) {
maior = c; }

System.out.println("O maior número é: " + maior);

if (b<menor) {
menor = b; }

if (c<menor) {
menor = c;  }
                         
System.out.println("O menor número é: " + menor);

double media = (a+b+c) / 3;
System.out.println("A média entre os números é: " + media);
leia.close();

    }
    
}
