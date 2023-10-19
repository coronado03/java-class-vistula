public class MarsWeightCalculator {
    public static void main(String[] args) {
        float earthWeight;
        float marsWeight;
        double marsWeightDouble;
        int marsWeightInt;
        char marsWeightChar;

        earthWeight = 83.0F;
        marsWeight = earthWeight * 0.38F;

        System.out.println("Earth Weight: " + earthWeight + " kilograms");
        System.out.println(earthWeight + " kilograms on Earth is equivalent to " + marsWeight + " kilograms on Mars.");

        marsWeightDouble = (double) marsWeight;
        System.out.println("Weight in kilograms, converted to double: " + marsWeightDouble + " kilograms");

        System.out.println("Weight in kilograms (4 decimal places): " + String.format("%.04f", marsWeightDouble) + " kilograms");

        marsWeightInt = (int) marsWeightDouble;
        System.out.println("Weight in kilograms, converted to integer: " + marsWeightInt + " kilograms");

        marsWeightChar = (char) marsWeightInt;
        System.out.println("Integer kilograms, converted to character: " + marsWeightChar);

        int newCharValue = marsWeightChar + 12;
        System.out.println("Character, converted to integer after adding 12: " + newCharValue);
    }
}