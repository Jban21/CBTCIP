import java.util.*;
import java.io.*;
class Admin
{
    int n,ac,rc;
    void input() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many books you require at a time?");
        n=sc.nextInt();
        if(n>5)
            System.out.println("NO!,at a time atmost 5 books are allowed to be supplied,sorry");
        else
            System.out.println("okay,TAKE YOUR NEEDED BOOKS");
    }
    void reissue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Your actual return date:");
        ac=sc.nextInt();
        System.out.println("Your actual return date:"+ac+"th");
        System.out.println("Today's date you want to re-issue:");
        rc=sc.nextInt();
        System.out.println("Today's date you are reissuing:"+rc+"th");
        if(rc>ac)
            System.out.println("okay,reissued!but with fine "+(rc-ac)+" rs");
        if(rc==ac || rc<ac)
            System.out.println("Good,no fine.....Reissue done!!");
    }
    void returnn() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Your actual return date:");
        ac=sc.nextInt();
        System.out.println("Your actual return date:"+ac+"th");
        System.out.println("Today's date you are returning:");
        rc=sc.nextInt();
        System.out.println("Today's date you are returning:"+rc+"th");
        if(rc>ac)
            System.out.println("You have to give fine of rs "+(rc-ac));
        if(rc==ac || rc<ac)
            System.out.println("Good,no fine");
    }
}
class Student extends Admin
{
    int choice;
    void op(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Total 3 options available!");
    System.out.println("1.ISSUE");
    System.out.println("2.REISSUE");
    System.out.println("3.RETURN");
    System.out.println("4.EXIT");
    System.out.println("Enter '1' for issuing new book purpose, Enter '2' for reissue the book, Enter '3' for return the particular book, Enter '4' to exit");
    System.out.println("Enter your choice");
    choice=sc.nextInt();
    while(choice!=4){
    switch(choice)
    {
        case 1:
            super.input();
            break;
        case 2:
            super.reissue();
            break;
        case 3:
            super.returnn();
            break;
        case 4:
            return;
        default:
            System.out.println("WRONG INPUT! please select options within 1-4");
            break;
    }
    System.out.println("Enter your choice:");
    choice=sc.nextInt();
	}
    }
}
class Lib1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        String name;
        int lib_cardno,cn;
        System.out.println("Enter your name:");
        name=br.readLine();
        System.out.println("Enter your library card no:");
        lib_cardno=sc.nextInt();
        System.out.println("FROM ADMIN END:OKAY!SO NOW WE ARE GOING TO VALIDATE YOUR INFORMATION");
        System.out.println("FROM ALREADY NOTED INFORMATION/REGISTRATION COPY WE HAVE ACCESSED:.........SEARCHING!!!");
        cn=sc.nextInt();
        System.out.println("your actual library card no is:"+cn);
        if(cn==lib_cardno){
            System.out.println("VERIFIED");
            s.op();
        }
        else
            System.out.println("NOT VERIFIED,SORRY!WE ARE UNABLE TO PROVIDE ANY SERVICE");
    }
}