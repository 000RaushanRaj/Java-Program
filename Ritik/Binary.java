
package Ritik;


public class Binary {
    private int l;
    private int m;
    public int sorting(int brr[],int s)
    {
            l=brr[0];
            m=brr[brr.length-1];
            while(l<=m)
        {
            int k=(l+m)/2;
            if(brr[k]==s)
            {
                return k;
            }
             if(brr[k]>s)
            {
                m=k-1;
            }
             else
                l=k+1;
        }
            return 0;
    }
    
}
