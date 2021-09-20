import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        University UTM = new University("UTM",new ArrayList<Student>(){
            {
                add(new Student("Ilie Todirascu",10));
                add(new Student("Marin Popov",5.5f));
                add(new Student("Maxim Ciorba",6.2f));
                add(new Student("Alexei Popescu",7.4f));
                add(new Student("Madalina Denisovici",9.5f));
                add(new Student("Maria Spataru",6.8f));
                add(new Student("Gheorghe Meniuc",5.1f));
            }
        });
        University Stat = new University("USM",new ArrayList<Student>(){
            {
                add(new Student("Vladislav Glodescu",6f));
                add(new Student("Denis Smirnoff",4.8f));
                add(new Student("Leonid Dienescu",7.2f));
                add(new Student("Ion Gandrabura",6.3f));
                add(new Student("Octavian Mitu",10f));
                add(new Student("Stefan Boicu",8.8f));
                add(new Student("Cleopatra Stratan",6.3f));
            }
        });
        University ULIM = new University("ULIM",new ArrayList<Student>(){
            {
                add(new Student("Alexandru Iatagan",4.2f));
                add(new Student("Iulia Jantuan",7.4f));
                add(new Student("Cristina Bordei",10));
            }
        });
        University[] array = new University[]{UTM,Stat,ULIM};
        System.out.println(getAverageFromUniversities(array));
        Monitor LOC = new Monitor("Black",1920,1200);
        System.out.println(LOC.getResolution());
        LOC.setHeight(2000);
        LOC.setWidth(3000);
        System.out.println(LOC.getResolution());
        LOC.setResolution("5000x8000");
        System.out.println(LOC.getHeight());
        System.out.println(LOC.getWidth());
    }
    public static float getAverageFromUniversities(University[] array ){
        float sum = 0;
        for(University university: array){
            sum += university.getAverage();
        }
        return sum/array.length;
    }
}
