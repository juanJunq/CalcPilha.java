import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pilha = new Stack();
        Scanner input = new Scanner(System.in);
        char op = 's';
        do{
            System.out.println("Inserir: ");
            int i = input.nextInt();
            pilha.push(i);
            System.out.println("Continuar(s/n): ");
            op = input.next().charAt(0);
        }while(op != 'n');
        char math;
        do{
            System.out.println("Operador(+,-,* ou /): ");
            math = input.next().charAt(0);
            if(math == '+'){
                int a = pilha.pop();
                int b = pilha.pop();
                int resultado = a + b;
                pilha.push(resultado);
            }
            if(math == '-'){
                int a = pilha.pop();
                int b = pilha.pop();
                int resultado = a - b;
                pilha.push(resultado);                
            }
            if(math == '*'){
                int a = pilha.pop();
                int b = pilha.pop();
                int resultado = a * b;
                pilha.push(resultado);                
            }
            //Se divisao nao exata, retorna os valores acima da virgula
            if(math == '/'){
                int a = pilha.pop();
                int b = pilha.pop();
                int resultado = a / b;
                pilha.push(resultado);                
            }            
            System.out.println(pilha);
        //while evita exception EmptyStack
        }while(pilha.size() > 1);
    }
}
