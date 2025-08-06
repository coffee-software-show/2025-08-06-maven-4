package a;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 */
public class Main {

    public static void main(String[] args) {
        var string = StringUtils.reverse("Hello, world!");
        System.out.println(">" + string + "<");
    }
}
