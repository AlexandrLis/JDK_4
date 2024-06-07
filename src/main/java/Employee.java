public class Employee {

    private int workNumber;
    private int phoneNumber;
    private String name;
    private int workAge;

    public Employee(int workNumber, int phoneNumber, String name, int workAge) {
        this.workNumber = workNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.workAge = workAge;
    }

    public int getWorkNumber() {
        return workNumber;
    }

    public int getWorkAge() {
        return workAge;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "workNumber=" + workNumber + ", phoneNumber=" + phoneNumber + ", name='" + name + '\'' + ", workAge=" + workAge;
    }
}
