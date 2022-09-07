public class Aspirant extends Student {
    String scienceWork;

    @Override
    void getSholarship() {
        if (averageMark == 5){
            System.out.println("Сумма = 20.000 руб.");
        }
        else
        {
            System.out.println("Сумма = 18.000 руб.");
        }
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;


    }

}
