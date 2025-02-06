package A_Master_OOP;

import java.util.Scanner;

class Mobile{
    String band;
    int price;
//    একটি Static Variable হল এমন একটি ভেরিয়েবল যা নির্দিষ্ট কোনো অবজেক্টের জন্য আলাদা থাকে না,
//    বরং পুরো ক্লাসের জন্য শেয়ার করা হয়। অর্থাৎ,
//    এটি একবার মেমোরিতে লোড হয় এবং সব অবজেক্ট এই একই ভেরিয়েবলের মান শেয়ার করে।
//    Static Variable-এর বৈশিষ্ট্য:
//✅ একটি ক্লাসের সব অবজেক্টের জন্য একই মান থাকে
//✅ একবার মেমোরিতে লোড হলে, প্রোগ্রাম শেষ হওয়া পর্যন্ত টিকে থাকে
//✅ অবজেক্ট ছাড়াও ক্লাসের নাম দিয়েও এক্সেস করা যায়
    static String name;

    public void work(){
        System.out.println("name -> " + name +" band ->" + band + " price ->" +price);
    }

//    static method
//    you can't access not static variable in static method.
//    but you can.
    public static void show(Mobile obj){
        System.out.println(name + obj.band + obj.price);
    }
}

public class static_variable_method {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.band="iphone";
        m.price=789999;
        Mobile.name="smartphone";
        m.work();
        Scanner sc =new Scanner(System.in);
//        System.out.println("your number is" );
        String name =sc.toString();
        System.out.println("enter your name");

//        static method m =obj name
        Mobile.show(m);

    }
}
