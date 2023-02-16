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
public class UseData {
    public static void main(String[] args) {
        Data d=new Data();
        d.setData(10,20 );
        d.showData();
        Data temp=new Data();
        temp.inc(d);
        d.showData();
        
    }
    
}
