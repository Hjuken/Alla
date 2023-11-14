package practiseObjectConstuctorVariables;

public class Friends {
//Fields also instance variables
    //Vi bestämmer vilken DATATYPE vår variabel tillhör, String, int, boolean osv
    private String name;
    private String residens;
    private int age;


//constructor
public Friends (String name, String residens, int age){
    this.name = name;
    this.residens = residens;
    this.age = age;
}
    // Method to display information
    public void friendInformation(){
        System.out.println("Min vän heter " + name +". Hon bor i " + residens
                + ". Hon är " + age );

    }

}
