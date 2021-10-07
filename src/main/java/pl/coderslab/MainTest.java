package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

public class MainTest {
    public static void main(String[] args) {

        String s = StringUtils.deleteWhitespace(" d d d d d d   d d");
        System.out.println(s);
        System.out.println(ConsoleColors.GREEN_BOLD + " green bold ");
        System.out.println(ConsoleColors.RED + " red ");

    }
}
