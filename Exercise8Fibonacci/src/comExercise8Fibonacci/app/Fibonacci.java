package comExercise8Fibonacci.app;
import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		
	int cont1=0;
	int cont2=1;
	long fibonacci=1;
	int bound=0;
	
	Scanner input = new Scanner(System.in);
	do
	{
	System.out.println("¿Cuantos fibonaccis deseas calcular?");
	bound = input.nextInt();
	if(bound<=0)
		{
		System.out.println("Debes introducir un numero entero y positivo");
		}
		
	}while(bound<0);
	
	for(int i=0;i<bound; i++)
	{
		System.out.print(fibonacci+" ");
		fibonacci = cont1+cont2;
		cont1=cont2;
				cont2=(int) fibonacci;
	}
	}
}