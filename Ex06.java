import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
int a;
int b;
      
Scanner leia = new Scanner(System.in);
      
System.out.println("Informe o primeiro número:");
a = leia.nextInt();
      
System.out.println("Informe o segundo número:");
b = leia.nextInt();
      
int maior = a;
int menor = b;
      
if (b > maior) {
          
maior = b;
menor = a; }
      
int aleatorio = (int)(Math.random() * (maior - menor + 1)) + menor;
    
if (aleatorio % 2 == 0) {
          
System.out.println("O número sorteado foi: " + aleatorio + "\n" + "Par.");
}
      
else {
          
System.out.println("O número sorteado foi: " + aleatorio + "\n" + "Ímpar.");
}
      
leia.close();

}
    
}
