import java.util.Scanner;
interface Sports
{
	float sportwt = 6.0F;
	abstract void putwt();
}
class Student{
    int rollnumber;
    Scanner sc1 = new Scanner(System.in);
    void getNumber(){
        System.out.println("Enter rollnumber:");
        rollnumber = sc1.nextInt();
    }
    void putNumber(){
        System.out.println("\nRollno: "+rollnumber);
    }
}
class Test extends Student{ 
    float term1,term2;
    Scanner sc2 = new Scanner(System.in);
    void getMarks(){
        System.out.println("Enter term1 marks:");
        term1 = sc2.nextFloat();
        System.out.println("Enter term2 marks:");
        term2 = sc2.nextFloat();
    }
    void putMarks(){
        System.out.println("Marks obtained");
        System.out.println("Term 1= "+term1);
        System.out.println("Term 2= "+term2);
    }
}
class Results extends Test implements Sports{
    public void putwt(){
        System.out.println("Sports weightage= "+sportwt);
    }
    public static void main (String[] args){
        Results r = new Results();
        r.getNumber();
        r.getMarks();
        r.putNumber();
        r.putMarks();
        r.putwt();
        System.out.println("Total Score ="+(r.term1+r.term2+r.sportwt)); 
    }
}
