package task1;

public class LazyClass {

    private String greeting;

    public LazyClass(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getFormattedGreeting() {
        return "Formatted Greeting: " + greeting;
    }

    public int calculateStringLength() {
        return greeting.length();
    }
}
