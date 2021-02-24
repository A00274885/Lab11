public class Person
{
    String num1;
    String townName;
    String num2;
    String num3;
    String county;
    String num4;

    Person(String num1, String townName, String num2,String num3,String county,String num4)
    {
        this.num1 = num1;
        this.townName=townName;
        this.num2=num2;
        this.num3=num3;
        this.county=county;
        this.num4=num4;
    }

    public String getCounty() {
        return county;
    }

    public String getNum1() {
        return num1;
    }

    public String getTownName() {
        return townName;
    }

    public String getNum3() {
        return num3;
    }

    public String getNum2() {
        return num2;
    }

    public String getNum4() {
        return num4;
    }
}
