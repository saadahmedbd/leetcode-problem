package new_binary_search_on_ans;

public class capacity_to_ship_pacages_within_D_days {
    public static void main(String[] args) {
        int weights [] ={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(capacity_to_ship_pacages(weights, days));
    }
    public static int capacity_to_ship_pacages(int weights [], int days){

        int start = Integer.MIN_VALUE, end = 0;
        for (int i = 0; i < weights.length; i++) {
            end += weights[i];
            start = Math.max(start, weights[i]);
        }
        while (start <= end){
            int mid =start+(end-start)/2;
            int sum=0;
            int day=1; //day start in 1
            for(int i=0;i<weights.length;i++){
                 if(sum + weights[i] > mid){ // if sum + weight is bigger than mid(capacity) then increase the day and the sum will be weight[i
                    day +=1;
                    sum=weights[i];

                }else{ // or count the sum
                    sum += weights[i];
                }
            }

            if(day <= days){
                end =mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
