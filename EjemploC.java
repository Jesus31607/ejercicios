import java.util.Scanner;
public class EjemploC{
public static void main(String args[]){
	int zanahoria[]=new int[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++){
        System.out.println("Ingresa numeros enteros");
	zanahoria[i]=sc.nextInt();
        }
	for(int j=0;j<5;j++){
	System.out.println(zanahoria[j]); 
}
}
}