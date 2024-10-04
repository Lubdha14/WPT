import java.util.Scanner;
// simple text scanner used to parse primitive types and strings using regular expressions
public class StudArrServ {
    private static Student[] sdarr;
    private static int count;
    static {
        sdarr = new Student[10];
        sdarr[0] = new Student(1,"arya", 44.5f,43f,88f);
        sdarr[1] = new Student(2,"arya", 49.1f,90f,81f);
        sdarr[2] = new Student(3,"arya", 70.9f,37f,78f);
        sdarr[3] = new Student(4,"arya", 40.5f,83f,66f);
        count=4;
    }
    public static void addStud()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the id");
        int sid = sc.nextInt();
        sc.nextLine(); // to remove \n from scanner buffer(on the same line)
        System.out.println("Enter the name");
        String nm = sc.nextLine();
        System.out.println("Enter the mrks of maths");
        int m1 = sc.nextInt();
        System.out.println("Enter the mrks of Sci");
        int m2 = sc.nextInt();
        System.out.println("Enter the mrks of Eng");
        int m3 = sc.nextInt();
        sdarr[count]=new Student(sid,nm,m1,m2,m3);
		count ++;
    }
}
