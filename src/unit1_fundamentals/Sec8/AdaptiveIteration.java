package unit1_fundamentals.Sec8;

public class AdaptiveIteration {
    public static void main(String[] args) {//using length is a great way to be adaptive. No matter how many elements are in the array, we will print it
        int[] nums = {4, 78, 88, 8, 17};

        for( int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        for(int i = nums.length -1; i >=0; i--) {  //This code will print it backwards, we have to take -1 from length because of the positioning of indexes
            System.out.println(nums[i]); // sidenote -in the for loop the first item is the starting point (where do you want to start)
        }

        for(int i = 0; i > nums.length; i++) {

            int count = 0; //Declaring this variable to count how many numbers are less than 80
            if(nums[i] < 80) {
                count ++;
            }
            System.out.println(count);

        }


    }

}

