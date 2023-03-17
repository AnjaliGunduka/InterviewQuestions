package Strings;

public class FibanocciExample { 
	 public static void main(String args[]){    
		 int n=10;
		 int a=0;
		 int b=0;
		 int c=1;
		 for(int i=1;i<=n;i++)
		 {
			 a=b;
			 b=c;
			 c=a+b;
			 System.out.println("fibonacci elements"+a);
		 }
		 
		 
		 
		 
	 }
//		 static int n1=0,n2=1,n3=0;    
//		 static void printFibonacci(int count){    
//		    if(count>0){    
//		         n3 = n1 + n2;    
//		         n1 = n2;    
//		         n2 = n3;    
//		         System.out.print(" "+n3);   
//		         printFibonacci(count-1);    
//		     }    
//		 }    
//		 public static void main(String args[]){    
//		  int count=10;    
//		  System.out.print(n1+" "+n2);//printing 0 and 1    
//		  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
//		 }  
}
