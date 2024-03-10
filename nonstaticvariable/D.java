class D {
    int i;
    static int j;
    public static void main(String[] args) {
        D d1 = new D();
        D d2 = new D();
        d1.i=10;
        d2.i=20;
        d1.j=30;
        d2.j=40;
        System.out.println(d1.i);
        System.out.println(d2.i);
        System.out.println(d1.j);
        System.out.println(d2.j);
    }
}
