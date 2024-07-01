package Step01_LearnTheBasics.Prep01_ThingsToKnowInLanguage;

public class P02_DataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 3.14F;
        double doubleVar = 3.141592653589793;
        char charVar = 'A';
        boolean booleanVar = true;

        // Displaying values and sizes of primitive data types
        System.out.println("\nPrimitive Data Types:");
        System.out.println("byte: " + byteVar + " (Size: " + Byte.BYTES + " bytes)");
        System.out.println("short: " + shortVar + " (Size: " + Short.BYTES + " bytes)");
        System.out.println("int: " + intVar + " (Size: " + Integer.BYTES + " bytes)");
        System.out.println("long: " + longVar + " (Size: " + Long.BYTES + " bytes)");
        System.out.println("float: " + floatVar + " (Size: " + Float.BYTES + " bytes)");
        System.out.println("double: " + doubleVar + " (Size: " + Double.BYTES + " bytes)");
        System.out.println("char: " + charVar + " (Size: " + Character.BYTES + " bytes)");
        System.out.println("boolean: " + booleanVar + " (Size: 1 byte)"); // Typically 1 byte

        // Wrapper classes (Object types)
        Byte byteObj = byteVar;
        Short shortObj = shortVar;
        Integer intObj = intVar;
        Long longObj = longVar;
        Float floatObj = floatVar;
        Double doubleObj = doubleVar;
        Character charObj = charVar;
        Boolean booleanObj = booleanVar;

        // Displaying values of object types
        System.out.println("\nObject Types (Wrapper Classes):");
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Integer: " + intObj);
        System.out.println("Long: " + longObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + booleanObj);

        // Additional object types
        String stringVar = "Hello, World!";
        System.out.println("\nAdditional Object Types:");
        System.out.println("String: " + stringVar);
    }
}
