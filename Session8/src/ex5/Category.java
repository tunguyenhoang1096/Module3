package ex5;

public class Category {
    private int ID;
    private String name;
    private String desc;

    //COnstructor k tham số
    public Category(){

    }

    //Constructor full tham số
    public Category(int ID, String name, String desc) {
        this.ID = ID;
        this.name = name;
        this.desc = desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
