package ExemploAula;
import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args){
        //cria um objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //cria um objeto do tipo Account
        Account myAccount = new Account();
        //Account myAccount2 = new Account("Maria");
        Account myAccount2 = new Account();

        System.out.printf("Initial name is: %s\n\n", myAccount.getName());

        System.out.println("Please enter the name: ");
        String theName = input.nextLine();//le uma linha de texto
        myAccount.SetName(theName);//insere theName em myAccount

        System.out.println();

        System.out.println("Please enter the second name: ");
        String theName2 = input.nextLine();
        myAccount2.SetName(theName2);
        
        System.out.println();


        System.out.printf("Name in object myAccount is: %s\n\n", myAccount.getName());
        System.out.printf("Name in object myAccount2 is: %s\n\n", myAccount2.getName());

        input.close();
    }
}
