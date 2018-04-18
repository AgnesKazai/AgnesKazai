//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

public class Functions_PrintArguments {
    public static void main(String[] args) {

        printer("first");
        printer("first", "second");
        printer("first", "second", "third", "fourh");
    }
    public static void printer(String... parameters) {
        for (String parameter : parameters) {
            System.out.print(parameter + " ");
        }
    }
}
