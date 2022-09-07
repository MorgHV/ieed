


public class  Main  {
    public static void main(String[] args){
        Student student1 = new Student("Erik","Khan","PKS-320",5);
        Student aspirant = new Aspirant("Erik2","Khan2","PKS-320",4.5);
        Student[]vse= {student1,aspirant};
        for(int i=0;i < vse.length;i++){
            vse[i].getSholarship();
        }
    }
}
