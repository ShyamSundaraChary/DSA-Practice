public class mathAvg {
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 88},
            {70, 72, 68},
            {95, 65, 80},
            {0, 45, 60},
            {60, 0, 75}
        };
        System.out.println("Average marks of entire class in Math: " + avgMathMarks(marks));
        System.out.println("Students scoring above 70 in Math: " + countMathAbove70(marks));
        System.out.println("Index of student with highest marks in Math: " + indexOfTopMathStudent(marks));
        System.out.println("the number of student who got 0 in atleast one subject: " + countZeroMarks(marks));

        
    }
    public static double avgMathMarks(int[][] marks) {
        int sum = 0;
        for (int[] student : marks) {
            sum += student[0];
        }
        return  sum / marks.length;
    }
    public static int countMathAbove70(int[][] marks) {
        int count = 0;
        for (int[] student : marks) {
            if (student[0] > 70) {
                count++;
            }
        }
        return count;
    }
    public static int indexOfTopMathStudent(int[][] marks) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i][0] > max) {
                max = marks[i][0];
                index = i;
            }
        }
        return index;
    }
    public static int countZeroMarks(int[][] marks) {
        int count = 0;
        for (int[] student : marks) {
            if (student[0] == 0 || student[1] == 0 || student[2] == 0) {
                count++;
            }
        }
        return count;
    }
}