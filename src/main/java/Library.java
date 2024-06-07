import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Employee> list = new ArrayList<>();

    public void addEmployee(int workNumber, int phoneNumber, String name, int workAge){
        list.add(new Employee(workNumber, phoneNumber, name, workAge));
    }

    public void findToWorkNumber(int findNumber){
        int count = 0;
        for (Employee employee : list) {
            if(findNumber == employee.getWorkNumber()){
                System.out.println("Сотрудник с табельным номером: " + findNumber);
                System.out.println(employee);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Сотрудник с таким табельным номером не найден");
        }
    }

    public void findToName(String findName){
        int count = 0;
        for (Employee employee : list) {
            if(findName.equals(employee.getName())){
                System.out.println("Телефон сотрудника по имени: " + findName);
                System.out.println(employee);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Сотрудник с таким именем не найден");
        }
    }
    public void findToWorkAge(int findAgeWork){
        int count = 0;
        for (Employee employee : list) {
            if(findAgeWork == employee.getWorkAge()){
                System.out.println("Сотрудник со стажем: " + findAgeWork);
                System.out.println(employee);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Сотрудник с таким стажем не найден");
        }
    }

}
