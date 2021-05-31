package javaControl.statements.IfLoopBranch;

public class ContStatement5 {
	
	int x = 5;
	
	/*
		public void method1() {
			
		      while( x <= 20 ) {
		         System.out.println(x );
		         x++;
		         
		      }
		}
		*/
	
		public void method2 () {
			//int x = 10;
		    do {
		      System.out.print("value of x : " + x);
		      x++;
		      System.out.print("\n");
		    } while (x < 13);
		  }
		
		public void method3() {
			for(int a = 0; a < 10; a++) {
				if(a == 5){
					break;
				}
				System.out.println("The Value of a: " + a);
			}
		}
		
		public void method4() {
			for(int a = 0; a < 10; a++) {
				if(a == 5){
					continue;
				}
				System.out.println("The Value of a: " + a);
			}
		}
		
}
