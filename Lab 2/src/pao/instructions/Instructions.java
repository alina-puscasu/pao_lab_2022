package pao.instructions;

public class Instructions {

    public static void main(String[] args) {

        /* if - else
         *
         * The if expression must be of type boolean.
         */

        /* switch
         *
         * checks if a value supplied in the switch matches any of the cases within. If it does, it moves the execution
         * to that point and starts running them until either the end of the switch is reached or a break instruction is
         * met. In the code example below, if someValue was 1, it would have printed out "something something else", as
         * the execution would have started at case 1 (it is empty) and would continue the instructions in the next cases
         * until it reached the break in case 3. if no case is matches, the default case is executed. if there is no
         * default case and there is no case that matches, no instructions in the switch are executed.
         */


        /* for
         *
         * Has 3 sections separated by a semicolon (;) and a body. Any of the 3 sections can be left empty. Upon execution,
         * it declares and initialises any variables in the first block (if multiple values are initialised, they are
         * separated by a comma (,)), checks the boolean condition in the second block (if any) and if true, executes the
         * body. At the end of each body execution, it runs the steps in the final section.
         */


        /* while
         *
         * checks if the boolean condition in the while is true. If so, it executes the body and goes to the start,
         * reevaluating the expression and rerunning if necessary.
         */


        /* do - while
         *
         * Similar to the while, the difference being that it first runs the body and evaluates the expression at the end.
         */

    }

}