package Set.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class Exercise2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee2("jack",18,new MyDate(1998,4,18)));
        set.add(new Employee2("jack",18,new MyDate(1999,4,18)));
        System.out.println("set="+set);
    }
}
class Employee2{
    private String name;
    private int sal;
    private  MyDate myDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    public Employee2(String name, int sal, MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", myDate=" + myDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(myDate, employee2.myDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, myDate);
    }
}
class MyDate{
    private int years;
    private int month;
    private int date;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public MyDate(int years, int month, int date) {
        this.years = years;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return  years +"/"+
                month +"/"
                + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return years == myDate.years && month == myDate.month && date == myDate.date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(years, month, date);
    }
}