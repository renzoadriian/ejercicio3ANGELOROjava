package ejercicio3;
import java.util.Scanner;
public class Vector {
private Scanner teclado;
private int[] nums;
public void ingresar(){
	teclado=new Scanner(System.in);
	nums=new int[10];
	for(int n=0;n<10;n++){
		System.out.print("Ingrese su numero");
		nums[n]=teclado.nextInt();
	}
	//for(int n=0;n<10;n++){
	//System.out.print(nums[n]);
	//}
}
public void parimpar(){
	for(int n=0;n<10;n++){
		if(nums[n]%2==0){
			System.out.print(nums[n]+"Es Par\n");	
		}else{
			System.out.print(nums[n]+"Es Impar\n");
		}
	}
}
public static void main(String[]ar){
   Vector	parimpar1 ;
   parimpar1= new Vector();
   parimpar1.ingresar();
   parimpar1.parimpar();
	
}
}
