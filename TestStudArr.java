
import java.util.Scanner;
class TestStudArr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch=0;
        do { 
            System.out.println("1. Add New Student\n 2.Delete by ID\n 3.Search by ID\n 4.Search by Name\n 5. Display All\n 6.Exit\n Choice:- ");
            ch = sc.nextInt();
            switch(ch)
            {
            case 1:
                StudArrServ.addStud();
                break;
            case 2:
                System.out.println("Enter id to delete");
                int id = sc.nextInt();
            case 3:
                System.out.println("Enter ID by search");
                id = sc.nextInt();
            
            case 4:
                System.out.println("Enter ID by search");
                id = sc.nextInt();
            
            case 5:
                System.out.println("Enter ID by search");
                id = sc.nextInt();
            case 6:
                System.out.println("Thankyou!!");
                sc.close();
            
            }   
        } while (ch!=6);

    }
}
