
public class Program {
    public static void main(String[] args) {
        // StudentGroup studentGroup = new StudentGroup();

        // Student van = new Student("Van", 4);
        // Student igor = new Student("Igorechick", 1);
        // Student alex = new Student("Alex", 2);
        // Student alexey = new Student("Alexey", 3);


        // studentGroup.addStudent(van);
        // studentGroup.addStudent(igor);
        // studentGroup.addStudent(alex);
        // studentGroup.addStudent(alexey);

        // // System.out.println("студенты " + studentGroup.students);
        // // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // // while (iterator.hasNext()) {
        // //     System.out.println(iterator.next());
        // // }

        // for(Student student: studentGroup) {
        //     System.out.println(student);
        // }

        // ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        // System.out.println(arrayList);

        // // public int compare(Student o1, Student o2) {
        // //     return o1.id - o2.id;
        // // }
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямбда выражение

        // // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        // System.out.println(arrayList);

        StudentGroup studentGroupA = new StudentGroup();
        StudentGroup studentGroupB = new StudentGroup();
        StudentGroup studentGroupС = new StudentGroup();
        StudentGroup studentGroupD = new StudentGroup();

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        Student ivan = new Student("Ivan", 4);
        Student mike = new Student("Mike", 1);
        Student tom = new Student("Tom", 2);
        Student jack = new Student("Jack", 3);

        Student sergey = new Student("sergey", 4);
        Student johan = new Student("johan", 1);
        Student artem = new Student("artem", 2);
        Student pavel = new Student("pavel", 3);

        Student fedor = new Student("fedor", 4);
        Student michael = new Student("Michael", 4);
        Student andrew = new Student("andrew", 4);
        Student wlad = new Student("wlad", 4);

        


        studentGroupA.addStudent(van);
        studentGroupA.addStudent(igor);
        studentGroupA.addStudent(alex);
        studentGroupA.addStudent(alexey);

        studentGroupB.addStudent(ivan);
        studentGroupB.addStudent(mike);
        studentGroupB.addStudent(tom);
        studentGroupB.addStudent(jack);

        studentGroupС.addStudent(sergey);
        studentGroupС.addStudent(johan);
        studentGroupС.addStudent(artem);
        studentGroupС.addStudent(pavel);

        studentGroupD.addStudent(fedor);
        studentGroupD.addStudent(michael);
        studentGroupD.addStudent(andrew);
        studentGroupD.addStudent(wlad);
        


        StreamStudentGroup streamA = new StreamStudentGroup("stream A");
        StreamStudentGroup streamB = new StreamStudentGroup("stream B");
        StreamStudentGroup streamC = new StreamStudentGroup("Stream C");

        streamA.addGroup(studentGroupA);
        streamA.addGroup(studentGroupB);
        streamA.addGroup(studentGroupС);

        streamB.addGroup(studentGroupA);
        streamB.addGroup(studentGroupB);

        streamC.addGroup(studentGroupA);
        streamC.addGroup(studentGroupB);
        streamC.addGroup(studentGroupС);
        streamC.addGroup(studentGroupD);

        for  (StudentGroup group : streamA) {
            System.out.println(group);
        }

        for  (StudentGroup group : streamB) {
            System.out.println(group);
        }

        for  (StudentGroup group : streamC) {
            System.out.println(group);
        }

        StreamService streamService = new StreamService();

        streamService.addStreamStudentGroup(streamA);
        streamService.addStreamStudentGroup(streamB);
        streamService.addStreamStudentGroup(streamC);

        streamService.showSortedStreams();











    }
}