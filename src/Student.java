public class Student extends Person {

    private String program;
    private int year;
    private double fee;


    public Student(String name, String address, String program) {
        super(name, address);
        this.program = program;
    }

    public Student(String name, String address, String program, int year, double fee) {
        // TODO Auto-generated constructor
        super(name, address);
        this.program = program;
    }

    public String getProgram(String program) {
        //TODO
        return program;
    }

    public void setProgram(String program) {
        //TODO
        this.program = program;
    }

    public int getYear(int year) {
        //TODO
        return year;
    }

    public void setYear(int year) {
        //TODO
        this.year = year;
    }

    public double getFee(double fee) {
        //TODO
        return fee;
    }

    public void setFee(double fee) {
        //TODO
        this.fee = fee;
    }

    // could also use getters and setters to get the values from person class

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}