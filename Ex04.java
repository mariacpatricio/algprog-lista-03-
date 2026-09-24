import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
int operacao;
int raio;
double resultado1;
double resultado2;
double resultado3;
        
Scanner leia = new Scanner(System.in);
        
System.out.println("Escolha a operação: 1, 2 ou 3.");
operacao = leia.nextInt();
        
while (operacao >=4) {
            
System.out.println("Operação inválida, digite um número válido.");
operacao = leia.nextInt();  }
            
System.out.println("Digite o raio:");
raio = leia.nextInt();
            
if (operacao == 1) {
resultado1 = 2 * 3.141592 * raio;
System.out.println("O perímetro é: " + resultado1); }
               
else if  (operacao == 2) {
                   
resultado2 = 3.141592 * (raio*raio);
System.out.println("A área é: " + resultado2);
}
               
else if (operacao == 3) {
                   
resultado3 = (4.0 / 3) * 3.141592 * (raio*raio*raio);
System.out.println("O volume é: " + resultado3);
}
            
leia.close();

    }
    
}
