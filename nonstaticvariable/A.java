class A {
    int i;
    public static void main(String[] args) {
        A a1; //Here the variable is declared which will store the address of the nonstatic variable
        a1 = new A(); //here the object is created of the class A
        /*
         * in order to use the non-static variable we have to create the object of the class
         */
        System.out.println(a1.i);
    }
}
