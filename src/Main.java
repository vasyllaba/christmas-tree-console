import main.java.com.service.TreeBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        buildTree(10);
    }

    public static void buildTree(int size) {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            for (int e = 0; e < i * 2 - 1; e++) {
                System.out.print( ANSI_YELLOW + "*" + ANSI_RESET);
            }
            System.out.println();
        }
    }

    private static void printRow(int size, int rowNumber){
        for (int i = 0; i < size; i++) {
            printSymbol( i,'*');
        }
    }

    private static void printSymbol(int amount, char symbol) {
        System.out.print(symbol);
    }
}