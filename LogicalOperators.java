class LogicalOperators {
    public static void main(String args[]) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // & - logical AND operator
        // | - logical OR operator
        // ! - logical NOT operator

        // What are short circuit operators?
        // -> Short circuit operators are used to optimize performance.
        // Short circuit evaluation means the right hand operand is only
        // evaluated if the left hand operand is insufficient to determine
        // the final outcome of the entire expression.

        // ---

        // Short circuit AND
        // boolean result = (x > y) & (a > b);
        // boolean result = (x > y) && (a > b);

        // Short circuit OR
        // boolean result = (x > y) | (a > b);
        boolean result = (x > y) || (a > b);
        System.out.println(!result);
    }
}
