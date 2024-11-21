package unit1_fundamentals.sec4;

public class VariableManipulationandtypes {

    public static void main(String[] args) {
        int x = 4;
        int y = 8;
        x = x + y + x;
        System.out.println(x);

        double I = 8.8 + 8.8;
        System.out.println(I);

        boleanandchar();


    }


    public static void boleanandchar() {
        boolean c = false;
        char t = 'z';// char is based on unicode, example - the number the 65 is capital A, 66 is B, etc till 90 which is z
// char can hold symbols, numbers and other languages.
        char e = 169; //This will give me the copywrite symbol
        char z = '\u005A';
        String A = "Christmas Holiday";//Strings are reference data types

        System.out.println(c);
        System.out.println(t);
        System.out.println(e);
        System.out.println(z);
        System.out.println(A);
        System.out.println("Abso" + "lutely"); // this is called string concatenation


    }


}
