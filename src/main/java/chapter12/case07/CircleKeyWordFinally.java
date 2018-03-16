package chapter12.case07;

/**
 * 在try里面使用return break continue 都不会阻碍finally的运行
 */
public class CircleKeyWordFinally {

    public static void testReturn() {
        try {
            System.out.println("in testReturn try block");
            return;
        } finally {
            System.out.println("in testReturn finally block");
        }
    }

    public static void testBreak() {
        int i = 0;

        while (true) {
            try {
                System.out.println("in testBreak try block in times:" + i);
                if (i == 3)
                    break;
                i++;
            } finally {
                System.out.println("in testBreak finally block times:" + (i - 1));
            }

        }
    }

    public static void testContinue() {
        int i = 0;

        while (i < 3) {
            try {
                System.out.println("in testBreak try block in times:" + i);
                i++;
                continue;
            } finally {
                System.out.println("in testBreak finally block times:" + (i - 1));
            }

        }
    }

    public static void main(String[] args) {
        testReturn();
        testBreak();
        testContinue();
    }
}
