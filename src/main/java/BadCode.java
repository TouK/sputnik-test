public class BadCode {

    private static void incorrectAssignmentInIfCondition() {
        boolean value = false;
        if (value = false) {
            //do Something
        } else {
            //else Do Something
        }
    }

    private static void incorrectComparingToItself() {
	int x = 3421;
        if (x <= x) {
            // whatever
        }
    }

    private static void illegalThrows() throws RuntimeException {
        System.out.println("throwing");
    }


}