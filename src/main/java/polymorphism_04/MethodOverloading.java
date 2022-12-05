package polymorphism_04;

public class MethodOverloading {
    public int sum(int x, int y){
        return (x+y);


    }
    public int sum( int x, int y, int z){
        return (x+y+z);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.sum(4,8));
        System.out.println(obj.sum(4,8,9));





    }

}
