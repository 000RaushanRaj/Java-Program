
package MapExample;

public class Account {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", accNo=" + accNo + ", bal=" + bal + '}';
    }

    public Account(String name, int accNo, double bal) {
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
    }
    private String name;
    private int accNo;
    private double bal;
    
}
