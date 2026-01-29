package StaticWrapper;

public class ClassWrapper {
    static void main() {
        int number1 = 20;
        Integer number2 = Integer.valueOf(30); // Integer number2 = 3;

        // Ejemplos con integer
        int textNumber = Integer.parseInt("123"); // numero = 123
        System.out.println("El valor de textNumber es: " + textNumber);

        Integer wrapper = Integer.valueOf("123"); // wrapper = 123 (como Integer)
        System.out.println("El valor de wrapper es: " + wrapper);

        String text = Integer.toString(123); // texto = "123"
        System.out.println("El valor de text es: " + text);

        int result = Integer.compare(10, 20); // result = -1 (10 < 20)
        System.out.println("El resultado es: " + result);

        int max = Integer.max(10, 20); // max = 20
        System.out.println("El valor de max es: " + max);

        int min = Integer.min(10, 20); // max = 10
        System.out.println("El valor de max es: " + min);

        // Ejemplos con Byte
        byte number = Byte.parseByte("127"); // numero = 127
        System.out.println("El valor de number2 es:" + number);

        Byte wrapper2 = Byte.valueOf("127"); // wrapper = 127 (como Byte)
        System.out.println("El valor de wrapper2 es: " + wrapper2);

        String text3 = Byte.toString((byte) 127); // texto = "127"
        System.out.println("El valor de text3 es: " + text3);

        // Ejemplos de Short
        short number3 = Short.parseShort("32000"); // numero = 32000
        System.out.println("El valor de number3 es:" + number3);

        Short wrapper3 = Short.valueOf("32000"); // wrapper = 32000 (como Short)
        System.out.println("El valor de wrapper3 es: " + wrapper3);

        String text4 = Short.toString((short) 127); // texto = "127"
        System.out.println("El valor de text4 es: " + text4);

        // Ejemplos de Long
        long number4 = Long.parseLong("123456789"); // numero = 32000
        System.out.println("El valor de number4 es:" + number4);

        Long wrapper4 = Long.valueOf("123456789"); // wrapper = 32000 (como Short)
        System.out.println("El valor de wrapper4 es: " + wrapper4);

        String text5 = Long.toString(123456789L); // texto = "123456789"
        System.out.println("El valor de text5 es: " + text5);

        // Ejemplos Double
        double number5 = Double.parseDouble("3.14"); // numero = 3.14
        System.out.println("El valor de number es " + number5);

        Double wrapper5 = Double.valueOf("3.14"); // wrapper = 3.14 (como Double)
        System.out.println("El valor de wrapper es: " + wrapper5);

        int result1 = Double.compare(3.14, 2.71); // resultado = 1 (3.14 > 2.71)
        System.out.println("El resultado es: " + result1);

        String text6 = Double.toString(3.24); // texto = 3.24
        System.out.println("El valor de text es: " + text6);

        // Ejemplos Float
        float number6 = Float.parseFloat("3.14"); // numero = 3.14
        System.out.println("El valor de number es " + number6);

        Float wrapper6 = Float.valueOf("3.14"); // wrapper = 3.14 (como Double)
        System.out.println("El valor de wrapper es: " + wrapper6);

        String text7 = Float.toString(3.24f); // texto = 3.24
        System.out.println("El valor de text es: " + text7);

        // Ejemplos Character
        boolean isLetter = Character.isLetter('A'); // esLetra = true
        boolean isDigit = Character.isDigit('5'); // esDigito = true
        boolean isWhiteSpace = Character.isWhitespace(' '); // esEspacio = true
        char upperText = Character.toUpperCase('a'); // mayuscula = 'A'
        char lowerText = Character.toLowerCase('A'); // minuscula = 'a'

        System.out.println("Es letra: " + isLetter);
        System.out.println("Es digito: " + isDigit);
        System.out.println("Es espacio: " + isWhiteSpace);
        System.out.println("Mayuscula: " + upperText);
        System.out.println("Minuscula: " + lowerText);

        // Ejemplos Boolean
        boolean value = Boolean.parseBoolean("true"); // valor = true
        System.out.println("El valor de value es " + value);

        Boolean wrapper7 = Boolean.valueOf("true"); // wrapper = true (como Boolean)
        System.out.println("El valor de wrapper es: " + wrapper7);

        String text8 = Boolean.toString(true); // texto = "true"
        System.out.println("El valor de text es: " + text8);

        boolean result2 = Boolean.logicalAnd(true, false); // resultado = false
        System.out.println("El resultado es: " + result2);

        boolean result3 = Boolean.logicalOr(true, false); // resultado = true
        System.out.println("El resultado es: " + result3);
    }
}
