import java.util.Scanner;
public class Sy2024bit021 {

static void patternPrinting_1(int size) {
    for(int i=0; i<size-1; i++){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        for(int k=size-1; k>i; k--){
            System.out.print(" ");
        }
        for(int n=size-2; n>i; n--){
            System.out.print(" ");
        }
        for(int l=0; l<=i; l++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int m=0; m<(2*size)-1; m++){
        System.out.print("*");
    }
}

    static void patternPrinting_2(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<size; k++){
                System.out.print("*");
            }
            System.out.println();
        }
}

static void patternPrinting_3(int size) {
    for (int i = 1; i <= size; i++) {
        for (int s = 1; s <= size - i; s++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("+   ");
        }

        System.out.println();
    }
    for (int i = size - 1; i >= 1; i--) {
        for (int s = 1; s <= size - i; s++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("+   ");
        }
        System.out.println();
    }
}

    static void patternPrinting_4(int size){
        int a = 1;
        for(int i=0; i<size; i++){
            for(int j=0; j<i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
 static void patternPrinting_5(int size){
    int num;
    for (int i = 1; i <= size; i++) {
        for (int s = 1; s <= size - i; s++) {
            System.out.print("  ");
        }
        num = i;
        for (int j = 1; j <= i; j++) {
            System.out.print(num + "   ");
            num++;
        }
        System.out.println();
    }
    for (int i = size - 1; i >= 1; i--) {
        for (int s = 1; s <= size - i; s++) {
            System.out.print("  ");
        }
        num = i;
        for (int j = 1; j <= i; j++) {
            System.out.print(num + "   ");
            num++;
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int size = sc.nextInt();

        patternPrinting_1(size);
        System.out.println("\n");

        patternPrinting_2(size);
        System.out.println("\n");

        patternPrinting_3(size);
        System.out.println("\n");

        patternPrinting_4(size);
        System.out.println("\n");

        patternPrinting_5(size);
        System.out.println("\n");


    }
}