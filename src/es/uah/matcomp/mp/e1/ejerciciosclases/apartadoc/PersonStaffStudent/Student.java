package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.PersonStaffStudent;

public class Student extends Person {
    private String program;
    private int year;
    private double free;

    public Student(String name, String address, String program, int year, double free){
        super(name, address);
        this.program = program;
        this.year = year;
        this.free = free;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFree(){
        return free;
    }

    public void setFree(double free){
        this.free = free;
    }

    @Override
    public String toString(){
        return "Student[" + super.toString() + ", program=" + program + ", yaer=" + year + ", free=" + free + "]";
    }

}
