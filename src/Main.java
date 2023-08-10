import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s1=sc.next();//hello
        String s2=sc.next();// iiilgfdfs
        HashSet<Character> freq=new HashSet<>();

        int n=s1.length();
        int m=s2.length();


        for(int i=0; i<n; i++)
        {

            freq.add(s1.charAt(i));

        }
        for(int i=0; i<m; i++) {

            if (freq.contains(s2.charAt(i))) {
                System.out.println(s2.charAt(i));
                return;
            }
        }
        System.out.println("there is no repeated character");

        }


    }
