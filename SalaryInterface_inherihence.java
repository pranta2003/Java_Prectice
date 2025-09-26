 interface Salary{  
    float salary();  
    }  
    class CEO implements Salary{  
    public float salary(){return 50000;}  
    }  
    class Manager implements Salary{  
    public float salary(){return 30000;}  
    }
    
    class Employee implements Salary{  
    public float salary(){return 20000;}  
    } 

class SalaryInterface_inherihence
{ 
  public static void main(String[] args)
{  
Salary a =new CEO();  
System.out.println("Salary of CEO: "+a.salary()); 
    
Salary b =new Manager();  
System.out.println("Salary of Manager: "+b.salary()); 

Salary c =new Employee();  
System.out.println("Salary of 
Employee"+c.salary()); 
 
    }} 
*/
Output:
Salary of CEO: 50000.0
Salary of Manager: 30000.0
Salary of Employee20000.0
/*
