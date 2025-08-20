package arrays;

public class Binaryserarch {
    public static void main(String[] args) {
        int array[]= {2,4,6,8,10,12,14,16};
        int key= 12;
        System.out.println("Your element at :"+Bsearch(array,key));
    }
    public static int Bsearch(int array[],int key){
        int start=0;
        int end= array.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if (array[mid]==key){
                return mid;
            }
            if (array[mid]<key){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }
}