//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float number = 19.87f;
        int integerNumber = (int) number;
        float floatingNumber = number - (float) integerNumber;
        System.out.println("El número " + number + " está compuesto por la parte entera --> " + integerNumber + " y por la parte decimal --> " + floatingNumber);
    }
}