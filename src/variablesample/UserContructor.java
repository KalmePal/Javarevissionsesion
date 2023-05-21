package variablesample;

public class UserContructor {
	
	
	int num;
	int num1;
	 UserContructor (){
		 num =45;
		 num1=67;
	 }
     
	 
	 
	 public void tt() {
		 System.out.println(num+num1);
		 
		 num =90;
		 num =45;
		 System.out.println(num-num1);
	 }
	 
	 
	 public static void main(String[]args) {
		 
		 UserContructor b=new  UserContructor();
		 b.tt();
		 UserContructor1 t=new UserContructor1();
		 t.k();
	 }
}
