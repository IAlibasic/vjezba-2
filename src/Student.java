public class Student {
    private String Name;
    private String Surname;
    private int IndexNumber;

//    public Student (String Name, String Surname, int IndexNumber){
//        this.Name = Name;
//        this.Surname = Surname;
//        this.IndexNumber = IndexNumber;
//    }

    public void  setName(String name){
        this.Name = name;
    }
    public String  getName(){
        return this.Name;
    }

    public int Sum(int br1, int br2) {
        return br1 + br2;
    }
}
