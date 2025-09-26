public class A
 { public void foo() 
{ System.out.println("Method foo() from class A"); }
}
 public class method_forbidden { public void foo() 
{ System.out.println("Method foo() from class B"); }
} public class C extends A, B 
{ public void bar() 
{ super.A.foo(); // Call the foo() method from class A } }
