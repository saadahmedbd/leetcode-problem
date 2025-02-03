package new_string_easy;

import java.util.SortedMap;
import java.util.StringJoiner;

public class string_concept {
    public static void main(String[] args) {
        String s1="hello";
        s1 =s1 +" world"; //create a new string object hello world
        System.out.println(s1);
//        length
        System.out.println(s1.length());
//        concat
        String s2 ="saad";
        String result =s1.concat(" " + s2);
        System.out.println(result);
//        accessing character
        String lan ="java";
        char ch =lan.charAt(3);
        System.out.println(lan.charAt(2) + " " + ch);
//        substring extraction
        String  name ="hi i love java";
        String subs=name.substring(3); //i love java
        String endSubs=name.substring(10, 14); //java
        System.out.println(subs);
        System.out.println(endSubs);
//        string comparison
        String name1 ="saad";
        String name2 ="ahmed";
        String name3 ="Saad";
        System.out.println(name1.compareTo(name3)); //negative value
        System.out.println(name1.equals(name3)); //false
        System.out.println(name1.equalsIgnoreCase(name3)); //true

        //searching in string
        String word ="Incidental";
//        String s= String.valueOf(word.contains("in"));
        System.out.println(word.contains("in"));//false case sensitive
        System.out.println(word.contains("In")); //true
        System.out.println(word.indexOf("den")); //4
        System.out.println(word.indexOf("d",3)); //4
        System.out.println(word.lastIndexOf("a")); //8
        System.out.println(word.lastIndexOf(8)); //-1

//        replacing char
        String sentence ="java is fun";
        System.out.println(sentence.replace("a", "@")); //j@v@ is fun
        System.out.println(sentence.replace("fun" ,"awesome")); // java is awesome

        //converting upper and lowecase
        String  str="java";
        String strr="FUN";
        System.out.println(strr.toLowerCase());
        System.out.println(str.toUpperCase());

//        spilt string
        String langu="java,python,javaScripts";
        String [] ans =langu.split(","); //remove "," symbol
        for(String lang :ans){
            System.out.println(lang);
        }
//        trimming
        String trimm ="  hello java ";
        System.out.println(trimm.trim()); // remove first and end space

//        string builder
        StringBuilder sb =new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb); //hello world
        sb.deleteCharAt(6); //helllowrld //remove o
        System.out.println(sb);
        sb.delete(0, 5); //delete hello
        System.out.println(sb);
        sb.insert(1,"o");
        System.out.println(sb);
        sb.reverse();

        System.out.println(sb);
//        string buffer
        StringBuffer sb2 =new StringBuffer("word");
        System.out.println(sb2);

//        String pool concept
//When a string is created using literals (String str = "Hello";), it is stored in the String Pool inside the heap
//        If another string with the same value is created, it reuses the same object instead of creating a new one.
        String ss= "saad";
        String sss ="saad";
        System.out.println(ss==sss); //true

       //new String("Hello") forces Java to create a new object in heap memory.
        String ssss=new String("saad");
        System.out.println(ss == ssss); //false

//        String Interning
        //intern() method ensures that the string is added to the String Pool if it’s not already present.
        String name4 =new String("david");
        String name5 =name4.intern();
        System.out.println(name4 ==name5); //false
        System.out.println(name5 == "david"); //true

//        //converting data type to string
        int num =78;
        String st =String.valueOf(num);
        System.out.println(st);
//        convert string to another data type
        String string="89";
        int num2 =Integer.parseInt(string);
        System.out.println(num2);
        double num3 =Double.parseDouble(string);
        System.out.println(num3);
        String bool ="true";
        boolean bol =Boolean.getBoolean(bool);
        System.out.println(bol);

        //formatting string
        String str5 ="saad";
        int num4=7;
        String formatting =str5.formatted("hi my name is %s and my age is %d",str5, num4);
        System.out.println(formatting);

        //String Joiner (Java 8+)
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Java").add("Python").add("C++");
        System.out.println(joiner); // [Java, Python, C++]




    }
}
//theory
//java string are immutable means once you create string you can't be changed
//Any modification create a new string object.

//import concept of string length
//java string buffer and string builder provide mutable string operation.
//string buffer slow and thread safe
//string builder fast and thread not safe