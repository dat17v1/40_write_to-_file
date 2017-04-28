public class Person
{
    private String name; 
    private String lastName;
    private int age;
    private String cpr;

    public Person(String name, String lastName, int age, String cpr)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cpr = cpr;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getCpr(){
        return cpr;
    }

    public String toString()
    {
        return name + " " + lastName + " " + age + " " + cpr;
    }


}
