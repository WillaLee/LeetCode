package Queue;

import java.util.LinkedList;

public class NumberOfStudentsUnableToEatLunch1700 {
  public int countStudents(int[] students, int[] sandwiches) {
    LinkedList<Integer> studentsQueue = new LinkedList<>();
    int currentSandwich = 0;
    //put students in a queue
    for (int student : students) {
      if (student == sandwiches[currentSandwich]) {
        currentSandwich++;
      } else {
        studentsQueue.add(student);
      }
    }
    while (!studentsQueue.isEmpty()) {
      int sandwichesLeft = sandwiches.length - currentSandwich;
      for (int i = studentsQueue.size(); i > 0; i--) {
        int student = studentsQueue.poll();
        if (student == sandwiches[currentSandwich]) {
          currentSandwich++;
        } else {
          studentsQueue.add(student);
        }
      }
      if (sandwichesLeft == sandwiches.length - currentSandwich) {
        return studentsQueue.size();
      }
    }
    return 0;
  }
}
