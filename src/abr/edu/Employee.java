package abr.edu;


public class Employee {
    private  String name;
    private  int age;
    private  String title;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public boolean isEngineer() {return "Инженер".equals(this.title);}

    public Employee(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public Object name() {
        return name;
    }
}
