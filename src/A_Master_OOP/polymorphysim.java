package A_Master_OOP;
class  num{
//    method overloading
//    same method name but different parameter or diffrent return type
    public int sum1 (int n1, int n2){
        int result =n1 + n2;
        return  result;
    }
    public int sum1 (int n1, int n2, int n3){
        int result2 =n1 +n2+n3;
        return result2;
    }
    public double sum1 (int n1 , int n2, int n3, int n4){
        double sum =n1 * n2 + n3/ n4 + n1;
        return sum;
    }

    public void sum (){
        System.out.println("in a sum");
    }
//    method overriding
    public int divide (int n1 , int n2){
        int ans =n1 + n2;
        return ans;
    }

}
class divide2 extends sum{
    public int divide(int n1, int n2){
        int ans =n1/n2 +5;
        return ans;
    }
}

class  num2 extends  num{
    public  int sum1 (int n1, int n2){
        int ans =n1 / n2;
        return ans;
    }
}
class  num3 extends  num {
    public  int sum1 (int n1, int n2){
        int ans =n1 * n2;
        return ans;
    }
}
//polymorphism means many behaviors
//two type of polymorphism exist in world that is method overloading and method overriding
//method overloading is → compile time and method overloading runtime polymorphism

public class polymorphysim {
    public static void main(String[] args) {
        num obj =new num();

        System.out.println( obj.sum1(12,2,3));
        System.out.println(obj.sum1(12,2));
        System.out.println(obj.sum1(23,45,23,45));

        divide2 obj3 =new divide2();
        System.out.println(obj3.divide(2,3));

//        dynamic method dispatch
//        it's only work when it's inheritance
        obj =new num2();
        System.out.println(obj.sum1(48,12));

        obj=new num3();
        System.out.println(obj.sum1(23,34));

    }
}
