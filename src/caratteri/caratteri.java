package caratteri;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ospite
 */
public class caratteri {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase:");
        String frase = scanner.nextLine();
        int numeroCaratteri =frase.length();
        System.out.println("La frase contiene "+numeroCaratteri+" caratteri");
        scanner.close();
    }
    
}
