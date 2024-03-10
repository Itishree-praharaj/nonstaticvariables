class B {
    int i;
    double d;
}
class C{
    public static void main(String[] args) {
        B b1 = new B(); //we have to create object for the class in which the required variable is present
        b1.i=10;
        b1.d=34.667;
        System.out.println(b1.i);
        System.out.println(b1.d);
    }
}
