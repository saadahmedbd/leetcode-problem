package A_Master_OOP;

//method overloading is the same method name but different parameter or parameter type
class sum {
    int num =8; //instance variable allocated to heap memory
    int num1=9;//instance variable ,instance variable is not part of method parameter
    public int addNumber(int num1, int num2){
        int result =num1 + num2;
        System.out.println(num); //you can access instance variable in method
        System.out.println(num1); //local variable hides as an instance variable print local variable value
        return result;
    }
    public  int addNumber(int num1, int num2, int num3){
        int result =num1 +num2+num3; // this num1 num2 and num3 store in stack memory
        return result;
    }
}
public class method_overloading {

    public static void main(String[] args) {
        sum obj =new sum(); //this obj connect to heap memory
        sum obj2 =new sum();
        int ans=obj.addNumber(2, 5); //
        int ans2=obj.addNumber(2,4,5);
        obj.num=6; // change instance variable value
        System.out.println(obj2.num); // obj2,num return original instance variable
        System.out.println(obj.num); //return modified instance variable
        System.out.println(ans);
        System.out.println(ans2);

    }
}
