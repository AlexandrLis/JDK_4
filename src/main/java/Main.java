public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addEmployee(1255, 8999, "Пётр", 7);
        library.addEmployee(107, 8961, "Николай", 17);
        library.addEmployee(24, 8111, "Степан", 2);
        library.addEmployee(999, 8921, "Иван", 22);

        library.findToName("kk");

    }
}
