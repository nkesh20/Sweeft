public class Stairs {
    public static int countVariants(int stairsCount) {
        if(stairsCount < 0) {
            return 0;
        } else if(stairsCount == 0) {
            return 1;
        }


        return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);

    }

    public static void main(String[] args) {
        int test1 = countVariants(2);
        int test2 = countVariants(5);
        int test3 = countVariants(7);
        int test4 = countVariants(3);
        int test5 = countVariants(0);
        int test6 = countVariants(1);
        System.out.println(test1 + " " + test2 + " " + test3 + " " + test4 + " " + test5 + " " + test6);
    }
}
