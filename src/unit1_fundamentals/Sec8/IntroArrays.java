package unit1_fundamentals.Sec8;

public class IntroArrays {
    public static void main(String[] args) {
        int[] b = {75, 29, 350, 8, 4192}; // Each item in the array are called elements, each element has an index.
        System.out.println(b[2]);// printing the element in index position 2, this will print 350

        //Making changes
        b[2] = 80;
        System.out.println(b[2]);



        //Printing all elements in the array
       for (int i = 0; i < 5; i++) //start at index 0 and increase by 1 with each iteration
        {
            System.out.println(b[i]);

        }
    }
}