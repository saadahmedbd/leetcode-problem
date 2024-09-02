package String;

public class Integer_english_words {
    public final String less_than_twenty []={"", "one","two", "three", "four","five", "six", "seven", "eight", "nine"
            ,"ten", "eleven", "twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public final String tens[]={"", "ten","twenty", "thirty", "forty","fifty","sixty","seventy","eighty","ninety"};
    public final String thousand[]={"", "thousand","million","billion"};
    public static void main(String[] args) {

        int nums =124;
        System.out.println();

    }
 

    public String numberToWords(int nums){
        if(nums==0){
            return "zero";
        }
        String words="";
        int i =0;
        while(nums>0){
            if(nums % 1000 !=0 ){
                words =helper(nums%1000)+thousand[i]+" "+words;
            nums /= 1000;
            i++;
            }
        }
        return words.trim();
    }
    public String helper(int nums){
        if(nums==0){
            return "";
        }else if (nums <20){
            return less_than_twenty[nums]+" ";
        }else if(nums <100){
            return tens[nums/10]+ " "+helper(nums%10);
        }else {
            return less_than_twenty[nums/100]+"Hundred"+helper(nums%100);
        }
    }

}
