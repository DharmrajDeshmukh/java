import java.util.*;
public class Cross {
    void Display(int size){
        if(size%2==0){
            System.out.println("The entered value "+size+" is not odd");
            }
        else{
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(i==j || i==size-j-1){
                        System.out.print("X");
                    }
                    
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                
            }
        }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = sc.nextInt();
        new Cross().Display(size);
    }
}
