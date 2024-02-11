import java.util.*;
import java.io.*;

class SortedStringFile{
    public static void main(String[] args) throws IOException{
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        File f =  new File("sortedwords.txt");
        f.createNewFile();
        StringTokenizer  tk = new StringTokenizer(str," ");
        int n = tk.countTokens();
        String[] wordarr = new String[n];
        int i=0;
        while(tk.hasMoreTokens()){
            wordarr[i]=tk.nextToken();
            i++;
        }
        Arrays.sort(wordarr);
        int count=0;
        FileWriter in = new FileWriter("sortedwords.txt"); 
        for (int j=0;j<n;j++){
            String wrstr = wordarr[j]+"\n";
            in.write(wrstr);
            count++;
        }
        in.close();
        System.out.println("Number of words: "+count);
    }
}
