package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

public class P08_Function {
    public static void main(String[] args) {
        System.out.println("\nPass By Value");
        int number = 10;
        System.out.println("Before calling modifyPrimitive: " + number);
        modifyPrimitive(number);
        System.out.println("After calling modifyPrimitive: " + number);

        System.out.println("\nPass By Reference");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before calling modifyObject: " + sb);
        modifyObject(sb);
        System.out.println("After calling modifyObject: " + sb);
    }

    public static void modifyPrimitive(int number) {
        number = 20;
        System.out.println("Inside modifyPrimitive: " + number);
    }

    public static void modifyObject(StringBuilder sb) {
        sb.append(" World!");
        System.out.println("Inside modifyObject: " + sb);
    }

}
