package midterm1;

import java.util.Random;

public class GradeBook {
    int[][] grades;

    public GradeBook(int numberOfStudents, int numberOfHWs) {
        grades = new int[numberOfStudents][numberOfHWs];
        Random rand = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfHWs; j++) {
                grades[i][j] = 50 + rand.nextInt(51);
            }
        }
    }

    public GradesIterator gradeIterator()
    {
        return new GradesIterator()
        {
            // if there is next element return true
            public boolean hasNext()
            {
                if(row == (grades.length - 1))
                {
                    return (column < grades[0].length);
                }
                return (row < grades.length);
            }

            // get next element
            public int next()
            {
                while (row < grades.length) {
                    if(column < grades[0].length)
                    {
                        return grades[row][column++];
                    }
                    else
                        {
                        row++;
                        column = 0;
                    }
                }
                return 0;
            }

            // two instance variables for array indices
            private int row = 0;
            private int column = 0;
        };
    }

    public static void main(String[] args) {
        GradeBook gbook = new GradeBook(3, 2);
        GradesIterator iterator = gbook.gradeIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
