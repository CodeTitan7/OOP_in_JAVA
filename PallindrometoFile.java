import java.util.*;
import java.io.*;

class PallindrometoFile{
    static boolean isPallindrome(String word){
        String p = "";
        for(int i=word.length()-1;i>=0;i--){
            p+=word.charAt(i);
        }
        return p.equals(word);
    } 
    
    static int Sum(String n){
        int sum=0;
        for(int i=0;i<n.length();i++){
            String sn=""+n.charAt(i);
            sum+= Integer.parseInt(sn);
        }
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        String lnum;
        Scanner sc = new Scanner(System.in);
        File f = new File("Pallindrome.txt"); 
        f.createNewFile();
        FileWriter in = new FileWriter("Pallindrome.txt"); 
        System.out.println("Enter line of string :");
        lnum = sc.nextLine();
        StringTokenizer tk = new StringTokenizer(lnum," ");
        while(tk.hasMoreTokens()){
            String num = tk.nextToken();
            if (isPallindrome(num)){
                String mnum = num+"\n";
                in.write(mnum);
            }
        }
        in.close();
        FileReader mout = new FileReader("Pallindrome.txt");
        try{
        BufferedReader out = new BufferedReader(mout);
        String number;
        while((number = out.readLine()) != null){
            System.out.println("Pallindrome number: "+number+" Sum is = "+Sum(number));
        }
        out.close();
        }catch(Exception ex){System.out.println("Error occcured !");}
    } 
}
