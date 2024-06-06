import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamStudentGroupIterator implements Iterator<StudentGroup> {

    private StreamStudentGroup streamStudentGroup;
    int index = 0;

    public StreamStudentGroupIterator(StreamStudentGroup streamStudentGroup) {
        this.streamStudentGroup = streamStudentGroup;
    }

    private List<StudentGroup> getGroups() {
        List<StudentGroup> groups = new ArrayList<>();
        for (int i = 0; i < streamStudentGroup.getSizeStream(); i++) {
            groups.add(streamStudentGroup.streamStudentGroup.get(i));
        }
        return groups;
    }


    @Override
    public boolean hasNext() {
        return index < getGroups().size();
    }

    @Override
    public StudentGroup next() {
        List<StudentGroup> groups = new ArrayList<>(getGroups());
        return groups.get(index++);
    }
}

    
