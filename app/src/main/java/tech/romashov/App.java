/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tech.romashov;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    @Test
    public void itWorks() throws Exception {
        assertThat(1, equalTo(2));
    }
}
