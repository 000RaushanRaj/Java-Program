/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapExample;

/**
 *
 * @author DELL
 */
public class Data {

    private int i,j;
    public void setData(int x,int y)
    {
      i=x;
      j=y;
    }
    public void inc(Data p)
    {
        p.i=p.i+5;
        p.j=p.j+5;
    }
    public void showData()
    {
        System.out.println("i="+i +",j="+j);
    }
}
