import java.util.Comparator;

public class StreamComparator implements Comparator<StreamStudentGroup> {

    @Override
    public int compare(StreamStudentGroup o1, StreamStudentGroup o2) {
        return o1.getSizeStream() - o2.getSizeStream();
    }
    
}
