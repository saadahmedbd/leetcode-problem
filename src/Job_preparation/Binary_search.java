package Job_preparation;

//0(logN) space 0(1)
public class Binary_search {
    public static void main(String[] args) {
//        int nums[]= {2,3,4,5,6,8,33};
//        System.out.println(binarySearch(nums, target));
//        int nums [] ={3,4,5,6,7,12,23,45};
//      int numss []= {3,4,5,6,7,12,23,45};
//        int target =11;
//        System.out.println(cellingNumber(numss, target));
//        System.out.println(foorNumber(nums, target));

        char[] ch ={'a','b','c','d','e','f'};
        char CHtarget ='f';
        System.out.println(target(ch, CHtarget));

//        int nums[]={4,5,5,5,5,7,8,8,9,9};
//        int target =5;
//        System.out.println(searchRange(nums,target));

        int numsss[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int targeet =10;
        System.out.println(infiniteNUmber(numsss, targeet));
        int [] num ={4,5,6,7,8,1,2,3};
        System.out.println(maintainArray(num));

//        int nums []={3,4,5,0,1, 2};
//        System.out.println(rotateArray(nums));

        int nums[]={3,4,5,0,1,2};
        int target =4;
        System.out.println(findTargetRotateArray(nums, target));


    }
    public static int binarySearch(int [] nums, int target){
        int start =0;
        int end = nums.length-1;
        int mid =0;
        while (end>start){
            mid =start +(end - start)/2;
            if(nums[mid] <target){
                start =mid+1;
            }else if(nums[mid] > target){
                end =mid-1;
            }else{
                return  mid;
            }
        }
        return 0;
    }
//    celing of number
    public static int cellingNumber(int numss [], int target) {
        int start = 0;
        int end = numss.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (numss[mid] < target) {
                start = mid + 1;
            } else if (numss[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
//floor number
    public static int foorNumber(int nums[], int target){
        int start =0;
        int end = nums.length-1;
        int mid =0;
        while (end>start){
            mid =start +(end - start)/2;
            if(nums[mid] <target){
                start =mid+1;
            }else if(nums[mid] > target){
                end =mid-1;
            }else{
                return  mid;
            }
        }
        return end;

    }
//    find smallest letter geather then target
    public static char target(char [] ch , char CHtarget){
        int start =0;
        int end =ch.length-1;
        while (start<=end){
            int mid =start +(end-start)/2;
            if(ch[mid] > CHtarget){
                end =mid-1;
            }else{
                start=mid+1;;
            }

        }
        return ch[start % ch.length];
    }
//    find the last and first position of element in sorted array
    public static int[] searchRange(int nums[], int target){
        int ans []={-1,-1};

        int start =search(nums,target, true );
        int end =search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i] +" ");
        }
        return ans;

    }
    public static int search (int nums[], int target, boolean findTarget){
        int ans =-1;
        int start =0;
        int end =nums.length-1;
        while (start <= end){
            int mid =start +(end -start)/2;
            if(nums[mid] <target){
                start=mid+1;
            }else if(nums[mid] > target){
                end =mid -1;
            }else{
                ans =mid;
                if(findTarget){
                    end=mid-1;


                }else{
//
                    end =mid-1;
                }
            }
        }
        return ans;
    }
//    find position of an element in a sorted array of infite number
    public static int infiniteNUmber(int numsss [], int targeet){
        int start =0;
        int end =1;
        while (targeet > numsss[end]){
            int temp =end +1;
            end =end +(end -start+1)*2;
            start=temp;
        }
        return binary(numsss, targeet, start, end);
    }
    public static int binary (int [] numsss, int targeet, int start, int end){
        while (end>=start){
            int mid =start +(end -start)/2;
            if(numsss[mid] <targeet){
                start=mid+1;
            }else if(numsss[mid]>targeet){
                end=start-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
//    moutain array
    public static int maintainArray(int num []){
        int start =0;
        int end = num.length-1;
        while (end >start){
            int mid =start +(end -start)/2;
            if(num[mid] < num[mid+1]) {
                start = mid + 1;
            }else{
                end =mid;
            }
        }
        return start;
    }
//    rotate array find the minimum
    public static int rotateArray(int nums []){
        int start =0;
        int end =nums.length-1;
        while (end >start){
            int mid =start +(end -start)/2;
            if(nums[mid] > nums[end]){
                start =mid +1;
            }else {
                end =mid;
            }
        }
        return nums[start];
    }
//    find target in rotate array
    public static int findTargetRotateArray(int nums[], int target){
        int start =0;
        int end =nums.length-1;
        while (start <=end){
            int mid = start +(end -start)/2;
            if(nums[mid]== target) return mid;
            if(nums[mid] >= nums[start]){
                if(nums[mid] > target && target >= nums[start]){
                    end =mid-1;
                }else{
                    start=mid+1;
                }

            }else{
                if(nums[mid] < target && target <= nums[end]){
                    start =mid+1;
                }else{
                    end=mid-1;
                }

            }
        }
        return -1;
    }
}
