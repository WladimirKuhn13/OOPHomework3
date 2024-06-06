import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class StreamService {

    private List<StreamStudentGroup> allStreams = new ArrayList<>();

    public void addStreamStudentGroup (StreamStudentGroup streamStudentGroup) {
        allStreams.add(streamStudentGroup);
    }

    public void showSortedStreams() {

        System.out.println("Выберите вариант сортировки\n'+' - по возрастанию числа групп в потоке\n'-' - по убыванию числа групп в потоке");
        Scanner scanner = new Scanner(System.in);
        char marker = scanner.nextLine().charAt(0);

        if (marker == '+' || marker == '-') {
            streamSorting(allStreams, marker);
        }
        else {
            System.out.println("Ошибка: Вы ввели неверный символ!");
        }

    }

    private void streamSorting(List<StreamStudentGroup> allStreams, char marker) {
        
        if (marker == '+') {
            Collections.sort(allStreams, new StreamComparator());
            System.out.println(allStreams);
        }
        else {
            Collections.sort(allStreams, new StreamComparator().reversed());
            System.out.println(allStreams);
        }

    }


    
}
