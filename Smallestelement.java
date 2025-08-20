package arrays;

public class Smallestelement {


    public static  int smallest(int array[]){
        int small= Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<small)
            small=array[i];
        }
        System.out.println(small);

        return small;
    }
    public static void main(String[] args) {
        int array[]={ 1,2,3,4,5};
        smallest(array);
    }
}
