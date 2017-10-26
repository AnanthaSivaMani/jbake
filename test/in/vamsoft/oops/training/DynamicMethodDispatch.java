package in.vamsoft.oops.training;

class A {

    public void m1() {
        System.out.println("A.m1()");
    }

    public void m2() {
        System.out.println("A.m2()");

    }
}

class B extends A {

    public void m1() {
        super.m1();
        System.out.println("B.m1()");
    }

}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        A obj = new B();
        obj.m1();
        obj.m2();

    }

}
