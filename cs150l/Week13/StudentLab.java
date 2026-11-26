public class StudentLab {
    public static class Student {
        String name;
        int score;

        public Student(String studentName, int studentScore) {
                name = studentName;
                score = studentScore;
        }
        // Part 5: Give the Class a Method
        public void printInfo() {
            System.out.println(name + ": " + score);
        }

        // Part 7
        public void addBonus(int points) {
            score = score + points;
        }

        // Part 8
        public boolean isPassing() {
            if (score >= 70) {
                return true;
            } else {
                return false;
            }
        }
    }

    /*
    public static void main(String[] args) {
        // Part 2
        Student firstStudent = new Student();

        firstStudent.name = "Alex";
        firstStudent.score = 85;

        System.out.println(firstStudent.name);
        System.out.println(firstStudent.score);
        //Part 2 Checkpoint
        //I predict it will output Alex on the first line and 85 in the second,
        //because the object is just a fancy bunch of pointers references.

        // Part 3
        Student secondStudent = new Student();

        secondStudent.name = "Sam";
        secondStudent.score = 72;

        System.out.println(secondStudent.name);
        System.out.println(secondStudent.score);

        firstStudent.score = 90;

        System.out.println("First: " + firstStudent.score);
        System.out.println("Second: " + secondStudent.score);

        // Part 3: Create Two Separate Objects
        //    1.) What is the score of firstStudent now?
        //        90
        //    2.) Waht  is the score of SecondStudent?
        //        72
        //    3.) Did changing the first student's score change the second student's score?
        //        No not at all since these are different objects with pointers referencing different scores in memory.
        }*/

    // added for Part 4
    public static void main(String[] args) {
        Student firstStudent = new Student("Alex", 85);
        Student secondStudent = new Student("Sam", 72);
        Student thirdStudent = new Student("Hadrian", 100);// added my own name for part 4

        /*
        System.out.println(firstStudent.name + ": "
                + firstStudent.score);
        System.out.println(secondStudent.name + ": "
                + secondStudent.score);
        System.out.println(thirdStudent.name + ": " + thirdStudent.score); // added my own name for part 4
        */
        // Added for part 5
        firstStudent.printInfo();
        secondStudent.printInfo();
        thirdStudent.printInfo();

        // Added for part 6
        firstStudent.addBonus(5);
        System.out.println("After bonus:");
        firstStudent.printInfo(); // will be 90
        secondStudent.printInfo(); // will be 72

    }

}

/*
1. What is the difference between a class and an object?

Answer: class is blueprint, object instance


2. What does the Student constructor do?

Answer: initializes new Student instance variables


3. Why can two Student objects have different scores?

Answer: cach object stores separate data


4. What did you observe in the debugger?

Answer:different memory pointer values and values
*/
