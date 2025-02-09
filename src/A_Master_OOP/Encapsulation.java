package A_Master_OOP;
class Encap{
   private int n1; //instance variable
   private int n2;
//   constructor is a special method it has the same name as class name, and it has no return type
    Encap(){ //default constructor
        System.out.println("this is not parameterize constructor");

    }
    Encap(int n1, int n2){ //parameterize constructor
        int result =n1 +n2;
        System.out.println("parameterize constructor sum :" + result);
    }
    public int getN1(){
        return n1;
    }
    public void setN1(int n1){
        this.n1=n1;  //'this' keyword represent the current object
    }
    public int getN2(){
        return n2;
    }
    public void setN2(int n2){
        this.n2=n2;
    }
    public void multipy(int n1, int n2){
        int ans =n1 * n2;
        System.out.println(ans);;
    }




}

public class Encapsulation {
    public static void main(String[] args) {
        Encap obj1 =new Encap(); //call non parameterize construct obj
//        every time we create the obj it will call the constructor
        Encap obj =new Encap(12, 12); //call parameterize constructor obj
        obj.setN1(12);
        obj.setN2(13);
        System.out.println(obj.getN1() + obj.getN2());
//        anonymous obj;
        new Encap().multipy(12, 23);
        new Encap(12, 34).multipy(12, 12);


    }
}
