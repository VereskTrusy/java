package chapter02.ex05_Polymorphism.ex05_test;




class Employee {
    public String name;
    public String grade;

    protected Employee( String name ) {
        this.name = name;
    }
}

public class Q4 extends Employee {
    private String skillset;

    public Q4(  ) {
        super("abc");

    }

    public String getSkillset(  ) {
        return skillset;
    }

    public void setSkillset( String skillset ) {
        this.skillset = skillset;
    }


    public static void main(String[] args) {

        Q4 q4 = new Q4();
        q4.setSkillset("111");
        String aa = q4.getSkillset();
        System.out.println(aa);
    }
}
