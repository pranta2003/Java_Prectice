class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class mulltiple_inheritence_which_is_not_supported extends A,B{//suppose if it were  
   
 Public Static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}  
