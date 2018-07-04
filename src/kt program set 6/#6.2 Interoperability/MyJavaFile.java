
//Calling a Java function from the Kotlin File and Vice Versa


public class MyJavaFile {

    public static void main(String[] args){

        int sum = MyKotlinFileKt.add(3,4);
        System.out.println("sum = " + sum);
    }
    public static int getArea(int l, int b){

        return l*b;
    }
}