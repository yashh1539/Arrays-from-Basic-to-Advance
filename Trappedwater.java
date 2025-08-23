package arrays;

public class Trappedwater {
    public static void totalwatertrapped(int height[],int width){

        int n = height.length;
        //1. first find the left maximum height of the column
        int leftmax[]= new int[n];
       //for 0th element the of leftmaximum is equal to the height of itself

         leftmax[0]=height[0];
        for (int i = 1; i <n ; i++) {
            leftmax[i]=Math.max(height[i], leftmax[i-1]);

        }
        //1. next find the right maximum height of the column
        int rightmax[]=new int[n];

        // as we go towards right to left in search of right maximium column then
        rightmax[n-1]=height[n-1];

        for (int i = n-2; i >=0; i--) {
            rightmax[i]=Math.max(height[i],rightmax[i+1] );

        }
//      now it's time to initailze the water level and water trapped

        int watertrapped=0;
        for (int i = 0; i <n ; i++) {
          int   waterlevel= Math.min(rightmax[i],leftmax[i]);
            watertrapped+=waterlevel-height[i]*width;


        }
        System.out.println("maximum water trapped is :"+watertrapped+"units");






    }

    public static void main(String[] args) {
        int width=1;
        int height[]={4,2,0,6,3,2,5};
        totalwatertrapped(height,width);

    }
}
