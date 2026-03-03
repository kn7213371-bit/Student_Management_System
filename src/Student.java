public class Student {

    // === Attributes ===
    private final int id;
    private final String name;
    private double grade;

    // === constructor parameter ===

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    // === methods ===
    public int getId()
    { // === output_id ===
        return id;
    }
    public void setGrade(double grade){ // تخزين درجات

        this.grade=grade;
    }
    public double getGrade(){// === بترجع قيمة دراجات ===
        return grade;
    }

    public String getName() {
        return name;
    }

    // === method of display ===
    public void displayInfo(){
        System.out.println(getId()+"\t"+getName()+"\t"+getGrade());
    }
}

