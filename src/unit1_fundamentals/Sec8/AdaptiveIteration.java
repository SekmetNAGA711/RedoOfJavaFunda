package unit1_fundamentals.Sec8;

public class AdaptiveIteration {
    public static void main(String[] args) {//using length is a great way to be adaptive. No matter how many elements are in the array, we will print it
        int[] c = {71, 35, 350, 8, 4192};

        for( int i = 0; i<c.length; i++) {
            System.out.println(c[i]);
        }


        for(int i = c.length -1; i >=0; i--) {  //This code will print it backwards, we have to take -1 from length because of the positioning of indexes
            System.out.println(c[i]); // sidenote -in the for loop the first item is the starting point (where do you want to start)
        }

    }

}

