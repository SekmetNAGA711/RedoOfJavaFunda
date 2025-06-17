package unit1_fundamentals.Sec8;

public class AdaptiveIteration {
    public static void main(String[] args) {//using length is a great way to be adaptive. No matter how many elements are in the array, we will print it
        int[] nums = {8, 88, 80, 8, 26};

        for( int i = 0; i < nums.length; i++) {//note i< nums.length is saying as long as the index is less than the amount of numbers in the array.,
            // starting with index 0 and so on, the last index would be index 4, so it will only go to index 4.
            System.out.println(nums[i]);
        }


        for(int i = nums.length -1; i >=0; i--) {  //This code will print it backwards, we have to take -1 from length because of the positioning of indexes, meaning we are starting at the last index,
            // sometimes we may not know what the last index is, so we write it i = nums.length - 1 (the -1 because indexes are always 1 less than actual count)
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

