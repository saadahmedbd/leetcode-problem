package A_Master_OOP;
abstract class  math{
    int num1 ;
    int num2;
    public abstract void modules();
    public abstract void multi();
    public abstract void division();
    public  int sum(){
        return num1+num2;
    }


}
// must implement abstract class
abstract class modules extends math{
    public void modules(){
        int mod =num2 % num1;
        System.out.println( "modues of num1 and num2 is ->" +mod);
    }
    public void multi(){
        int multifilcation =num1 * num2;
        System.out.println("multifilication of num1 and num2 is ->" + multifilcation);
    }
}
 class division extends modules{
    public void division(){
        int div =num1 / num2;
        System.out.println(div);
    }
    public int power(){
        return (int) Math.pow(num1, num2);
    }
}



public class abstraction {
    public static void main(String[] args) {
       math obj =new division() ;
       obj.num1=20;
       obj.num2=30;
        System.out.println(obj.sum());
        obj.multi();
        obj.modules();
    }
}
