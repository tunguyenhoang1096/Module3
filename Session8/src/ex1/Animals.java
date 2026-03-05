package ex1;

public class Animals {
    // khai báo thuộc tính
    private String name;
    private int age;

    // Constructor
    public Animals(){

    }

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    //

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Tên không được để trống");
            this.name = "Unknow";
        }else
            this.name = name;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Tuổi không được âm!");
            this.age = 0;
        }else
            this.age = age;
    }

    // Phương thức hiển thị thông tin chung
    public void displayInfo(){
        System.out.println("Tên: "+name+",\tTuổi: "+age);
    }

    // Phương thức âm thanh chung
    public String sound(){
        return "Some generic sound";
    }
}
