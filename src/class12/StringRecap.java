package class12;

public class StringRecap {
    public static void main(String[] args) {
        String str="Java is Great";
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" many times");
    }
}