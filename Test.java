public class Test {
    public static void main(String[] args){
        // An array of type Person with size 3
        Person[] people = new Person[3];
        // Enter information of Student, Employee, and Faculty
        Student student = new Student(123456789, "Paul Leister", "972 4th Street, Allentown", "610-331-7177", "pleister@gmail.com", "CSE");
        Employee employee = new Employee(334422110, "Beth Down", "234 Main Street, Philadelphia", "484-222-4433", "bdown@gmail.com", "System Administrator 30", 75000.00);
        Faculty faculty = new Faculty(222222222, "Mark Jones", "21 Orchid Street, Bethlehem", "610-333-2211", "mjones@gmail.com", "Faculty", 100000.00, "Associate Professor");
        // Storing the objects in the people array
        people[0] = student;
        people[1] = employee;
        people[2] = faculty;
        // Printing information about each person in the array before sorting
        System.out.println("Before Sorting:");
        printArray(people);
        // Sorting based on names and printing the sorted array
        sortArray(people, true);
        System.out.println("\nAfter Sorting by Name:");
        printArray(people);
        // Sorting based on ids and printing the sorted array
        sortArray(people, false);
        System.out.println("\nAfter Sorting by ID:");
        printArray(people);
    }
    public static void printArray(Person[] people){
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            System.out.println();
        }
    }
    public static void sortArray(Person[] list, boolean type){
        for(int i = 0; i <list.length; i++){
            int minIndex = i;
            for(int j = i + 1; j <list.length; j++){
                if(type){
                    // Sort by name
                    if (list[j].getName().compareTo(list[minIndex].getName()) < 0){
                        minIndex = j;
                    }
                }else{
                    // Sort by ID
                    if (list[j].getID()< list[minIndex].getID()) {
                        minIndex = j;
                    }
                }     
            }
            Person temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
}
