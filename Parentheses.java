//Derin Soysal Period 4
//11/10/25
//This program will check a string given to the program consisting of parentheses, square brackets,
//and curly brackets to determine if it is a valid string
public class Parentheses{
//This is the main method where the methods will be called to find the validity of the string
    public static void main(String[] args){
        checker("{()}");
    }

    //  Pre-condition: String must only consist of parentheses, square brackets, and curly brackets
    //  Post-condition: It will output text saying if the string is valid or not
    public static void checker(String s){
        int i = 0;
        String copy = s;
        String temp = "";
        while(copy.length() > 0){
            while(i<copy.length()){

                //find first closing simbol
                if(copy.substring(i, i+1).equals(")") || copy.substring(i, i+1).equals("}") || copy.substring(i, i+1).equals("]")){
                    //temp is supposed to equal the last open bracket
                    temp = copy.substring(i-1, i);
                    //found closing symbol at i
                    //do they match?
                    if((temp.equals("(") && copy.substring(i, i+1).equals(")")) 
                    || (temp.equals("{") && copy.substring(i, i+1).equals("}"))
                    ||(temp.equals("[") && copy.substring(i, i+1).equals("]"))){
                        //change copy to equal everything except what's at index i-1 and i and set i back to 0
                        copy = copy.substring(0, i) + copy.substring(i+2, copy.length());
                    }
                }
                i++;
            }
        }
    if(copy.length() == 0){
        System.out.println("String is valid");
    } else{
       System.out.println("String is not valid"); 
    }



    }
}
