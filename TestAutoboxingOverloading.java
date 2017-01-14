public class TestAutoboxingOverloading{

    public static void blah(Integer x){
        System.out.println("Boxed x: "+x);
    }

    // public static void blah(int x){
    //     System.out.println("Primitive x: "+x);
    // }



    public static void blah(double x){
        System.out.println("double x: "+x);
    }

    public static void main(String [] args){
     int x =10;
     Integer y =20;
     blah(x);
     blah(y);
    }
}