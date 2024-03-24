public class Main {

    public static void main(String[] args){
       Triangle triangleA = new Triangle(15, 8 ,15,8,17 );
       Triangle triangleB = new Triangle( 2, 4 , 5 ,6 ,7 );

       double triangleAArea = triangleA.findArea();
       System.out.println(triangleAArea);
        System.out.println(triangleA.sideLenOne);

       double triangleBArea =triangleB.findArea();
        System.out.println(triangleBArea);
        System.out.println(triangleB.base);
    }
}
