import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
double a;
double b;
double c;
double delta;
        
Scanner leia = new Scanner(System.in);
        
System.out.println("Digite o valor de A:");
a = leia.nextDouble();
System.out.println("Digite o valor de B:");
b = leia.nextDouble();
System.out.println("Digite o valor de C:");
c = leia.nextDouble();
        
if (a == 0 && b == 0 && c != 0) {
            
System.out.println("Coeficientes informados incorretamente.");
}
        
else if (a == 0 && b != 0) {
System.out.println("Essa é uma equação de primeiro grau.");
double raiz = -c / b;
System.out.println("O valor da raiz é: " + raiz);
}
        
else {
        
delta = (b * b) - 4 * a * c;
        
if (delta < 0) {
            
System.out.println("Esta equação não possui raízes reais.");
}
        
else if (delta == 0) {
            
System.out.println("Esta equação possui duas raízes reais iguais.");
double x1 = (-b + Math.sqrt(delta)) / (2 * a);
double x2 = (-b - Math.sqrt(delta)) / (2 * a);
System.out.println("O valor da raiz de x1 é: " + x1);
System.out.println("O valor da raiz de x2 é: " + x2);
} 
            
else if (delta > 0) {
                
System.out.println("Esta equação possui duas raízes reais diferentes.");
double x1 = (-b + Math.sqrt(delta)) / (2 * a);
double x2 = (-b - Math.sqrt(delta)) / (2 * a);
System.out.println("O valor da raiz de x1 é: " + x1);
System.out.println("O valor da raiz de x2 é: " + x2);
        
}
}
leia.close();
      

    }
    
}
