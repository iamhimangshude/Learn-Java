import java.util.Comparator;

public class Employee {

    private String name;
    private int id;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int id, String name, int yearStarted) {
        this.id = id;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

        String sortType;

        public EmployeeComparator() {
            this.sortType = "name";
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if (sortType.equalsIgnoreCase("yearStarted")) {
                return o1.yearStarted - o2.yearStarted;
            } else if (sortType.equalsIgnoreCase("id")) {
                return o1.id - o2.id;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(id, name, yearStarted);
    }
}
