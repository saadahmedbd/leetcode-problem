package new_binary_search_on_ans;

public class allocate_number_of_book {
    public static void main(String[] args) {
        int books [] ={25, 46, 28, 49, 24};
        int student =4;
        System.out.println(allocate_book(books, student));
        System.out.println(binaryApproach(books, student));
    }
//    native approach tc 0(n) sc 0(1), linear search
    public static int allocate_book(int books[], int student){
        if( student > books.length) return -1;
        int low =findMax(books);
        int high =sumOfArray(books);
        for(int pages=low;pages<=high;pages++){
            if(calculateBook(books,pages) == student){
                return pages;
            }
        }
        return low;
    }
    public static int calculateBook(int books[], int pages){
        int students =1;
        int totalPage =0;
        for(int i=0;i<books.length;i++){
            if(totalPage + books[i] <= pages){
                totalPage+= books[i];
            }else{
                students ++;
                totalPage = books[i];
            }
        }
        return students;
    }
    public static int findMax(int [] books){
        int max =0;
        for(int i=0;i<books.length;i++){
            max =Math.max(max, books[i]);
        }
        return max;
    }
    public static int sumOfArray(int books []){
        int sum =0;
        for(int i=0;i<books.length;i++){
            sum += books[i];
        }
        return sum;
    }
//    binary search approach
    public static int binaryApproach (int [] books, int student){
        int low=findMax(books);
        int high =sumOfArray(books);
        while (low <= high){
            int mid =(low+high)/2;
            int students =calculateBook(books, mid);
            if(students > student){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
