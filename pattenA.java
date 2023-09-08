package DSA.patten;

public class pattenA {
    public static void main(String[] args) {

char ch='A';        
        for (int i=0;i<5;i++)
        {

            for (int j=5;j>i;j--)
            {
                System.out.print(" "+ch);

            }
            System.out.println();
            ch++;
        }
    }
}
