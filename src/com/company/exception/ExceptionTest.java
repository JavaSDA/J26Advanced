package com.company.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            accessArray(3);

            float val = divide(4, 1);

            System.out.println(val);

            System.out.println("This is after the exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is from the finally block");
        }
    }

    public static void accessArray(int index) {
        int[] nums = new int[5];

        if (index >= nums.length) {
            throw new ArrayIndexOutOfBoundsException("No such index: " + index);
        }

        int val = nums[index];

        System.out.println(val);
    }

    public static float divide(float dividend, float divisor) {
        if (divisor == 0) {
            String message = "Cannot divide " + dividend + " by 0";
            Throwable cause = new ArithmeticException("Division by zero");
            throw new CannotDivideByZeroException(message, cause);
        }

        return dividend / divisor;
    }

    // Error exceptions are special exceptions, try not to handle them instead try to
    // prevent them from occurring first place. Examples would be the StackOverflowError
    // OutOfMemoryError

    // 18:30 - 18:45
}
