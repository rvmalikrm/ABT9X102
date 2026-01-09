package Nov.ex_22112024_Map_Collection_Framework;
public class Lab4Nov_Arrays
{
    public static void main(String[] args)
    {
        int[] number = new int[10];
        for(int i=0;i<=number.length-1;i++)
        {
            number[i++]=12;
            number[i++]=23;
            number[i++]=34;
            number[i++]=45;
            number[i++]=56;
            number[i++]=67;
            number[i++]=76;
            number[i++]=556;
            number[i++]=674;
            number[i++]=7832;
        }
        for(int j=0;j<=number.length-1;j++)
        {
            System.out.println(j+1+ " elements " + number[j]);
        }
    }
}
