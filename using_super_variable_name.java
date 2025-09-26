class Parent {
    int num = 100;
}

class using_super_variable_name extends Parent {
    int num = 200;

    void show() {
        System.out.println(super.num); // parent variable
        System.out.println(num);       // child variable
    }
}
ob.num;
