import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ScorpionOrange on 2016/06/21.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String aName, double aSalary, int year, int month, int day){
        name = aName;
        salary = aSalary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        salary = salary * (1 + byPercent / 100);
    }
}
