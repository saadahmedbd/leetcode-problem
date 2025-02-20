package OOP_practice;

import java.util.Scanner;

class User {
    private String name;
    private int age;
    private String address;
    private String accountType;
    private int bankBalance;

    User(){
        System.out.println("This is new bank account");
    }
//    User (String name, String address, String accountType, int bankBalance){
//        this.name=name;
//        this.address=address;
//        this.accountType=accountType;
//        this.bankBalance=100;
//    }
//    this is our name setter method
    public void setName(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your name : ");
        String userName =sc.nextLine();
        name =userName;
    }
//    this is our name getter method
//    public String getName(){
//        return name;
//    }
//    this is our age setter method
    public void setAge(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your age :");
        int userAGe =sc.nextInt();
        if(userAGe < 18){
            System.out.println("your age is under 18 that why you can't create our bank account");
        }else{
            age =userAGe;
        }
    }
//    this is our user account type setter method
    public void setAccountType(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your account type (Student type, fixed deposit type, current checking account type:");
        String  userAccountType =sc.nextLine();
        accountType=userAccountType;
    }
    public void setUserAddres() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your address: ");
        String userAddress = sc.nextLine();
        address = userAddress;
    }
//    user account information



    public String UserInformation() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
//    this method want user permission.what permission?
//    if user want to deposit money in his account
    public void userWant(){
        Scanner sc =new Scanner(System.in);
        System.out.println("are you want to deposit, withdraw and check amount in your account ");
        String permission =sc.nextLine();
        if(permission.equals("deposit")){
            deposite();
        }else if (permission.equals("withdraw")){
            withdraw();
        }else if (permission.equals("account check")){
            getBankBalance();
        }
    }

    public void deposite(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your amount :");
        int amount =sc.nextInt();
        bankBalance += amount;
    }
    public void withdraw (){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your withdraw amount : ");
        int amount =sc.nextInt();

        if(bankBalance >amount){
            bankBalance -= amount;
        }else{
            System.out.println("bank balance isn't suifficant");
        }
    }
    public int getBankBalance(){
        return bankBalance;
    }

}

public class Banking_system {
    public static void main(String[] args) {
        User obj =new User();
        obj.setName();
        obj.setAge();
        obj.setUserAddres();
        obj.setAccountType();
        System.out.println(obj.UserInformation());
        obj.userWant();
        obj.deposite();
        System.out.println("your total amount "+ obj.getBankBalance());
        obj.userWant();
        System.out.println("your total amount "+ obj.getBankBalance());


    }
}
