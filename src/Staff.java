public class Staff extends Person {
    private String school;
    private double pay;


    public Staff(String name, String address, String school) {
        super(name, address);
        this.school = school;
    }

    public Staff(String name, String address, String school, double pay) {
        // TODO Auto-generated constructor stub
        super(name, address);
        this.school = school;

    }

    private String getSchool(String school) {
        //TODO
        return school;
    }

    private void setSchool(String school) {
        //TODO
        this.school = school;
    }

    private double getPay(double pay) {
        //TODO
        return pay;
    }

    private void setPay(double pay) {
        //TODO
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}