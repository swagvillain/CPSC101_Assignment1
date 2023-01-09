//This program will take an int and convert it to string

public class Converter {

    public static void main(String[] args) {
        System.out.println(ones(5));//test line
    }

    private static String numberToString(int n){
        String result;
        if(n%100>20 && n%100>9)//needs work. need to determine how the output will be assembled. This should run iteratively
            result = teens(n%100);
    }

    //handles 10-19
    private static String teens(int n){
        switch(n){
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }

    }

    private static String tens(int n){
        switch(n){
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
    }

    private static String ones(int n){
        switch(n){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
    }
}
