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
