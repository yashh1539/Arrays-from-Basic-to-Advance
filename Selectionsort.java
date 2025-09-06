package arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int arr[]={9,5,6,2,1,3,4};
        selectionsort(arr);
        display(arr);
    }

    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length-1 ; i++) {
            int minposition=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minposition]>arr[j]){
                    minposition=j;
                }

                int temp= arr[minposition];
                arr[minposition]=arr[i];
                arr[i]=temp;

            }


        }
    }
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
