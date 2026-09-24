import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

double a;
double b;
String operacao;
      
Scanner leia = new Scanner(System.in);
      
System.out.println("Digite o primeiro número:");
a = leia.nextDouble();
      
System.out.println("Digite o segundo número: ");
b = leia.nextDouble();
      
leia.nextLine();
      
System.out.println("Digite a operação desejada: +, - , *, / ou ^");
operacao = leia.nextLine();
      
if (operacao.equals("+")) {
          
double soma = a + b; 
System.out.println(a + "+" + b + "=" + soma); }
      
else if (operacao.equals("-")) {
          
double sub = a - b;  
System.out.println(a + "-" + b + "=" + sub); }
      
else if (operacao.equals("*")) {
              
double mult = a * b;   
System.out.println(a + "*" + b + "=" + mult); }
              
else if (operacao.equals("/")) {
                  
double div = a / b; 
System.out.println(a + "/" + b + "=" + div); }
                  
else if (operacao.equals("^")) {
                      
double pot = Math.pow(a, b);
System.out.println(a + "^" + b + "=" + pot); }
                      
else {
System.out.println("Símbolo inválido."); }
                          
                          
leia.close(); 
      
    }
}
