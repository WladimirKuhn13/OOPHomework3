import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamStudentGroup implements Iterable<StudentGroup> {

    String name;

    public List<StudentGroup> streamStudentGroup = new ArrayList<>();

    public StreamStudentGroup(String name) {
        this.name = name;
    }

    public void addGroup(StudentGroup studentGroup) {
        streamStudentGroup.add(studentGroup);

    }

    public int getSizeStream() {
        return streamStudentGroup.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {

        return new StreamStudentGroupIterator(this);
    }

    @Override
    public String toString() {
        String size = String.valueOf(streamStudentGroup.size());
        return "Имя потока: " + name + ", групп в потоке: " + size;
    }


    
}
