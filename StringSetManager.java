import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

enum StringCommand { ADD, REMOVE, SORT, CLEAN, QUIT, INVALID };
public class StringSetManager {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while(true) {
            final StringCommand command = getCommand(scanner);
            if(command == StringCommand.QUIT) {
                System.out.println("BYE!"); break;
            }
            switch(command) {
                case ADD: {
                    final String str = getString(scanner);
                    add(stringSet, str);
                    print(stringSet);
                    break;
                }
                case SORT: {
                    final String order = getString(scanner);
                    sort(stringSet, order);
                    print(stringSet);
                    break;
                }
                case REMOVE: {
                    final String str = getString(scanner);
                    remove(stringSet, str);
                    print(stringSet);
                    break;
                }
                case CLEAN: {
                    clean(stringSet);
                    print(stringSet);
                    break;
                }
                case INVALID: {
                    System.out.println("Invalid Command");
                    print(stringSet);
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
    private static StringCommand getCommand(Scanner scanner) {
        StringCommand command;
        try {
            String str = scanner.next();
            command = StringCommand.valueOf(str.toUpperCase());
        }
        catch(IllegalArgumentException e) {
            command = StringCommand.INVALID;
        }
        return command;
    }
    private static String getString(Scanner scanner) {
        String str = scanner.next();
        return str;
    }
    private static void add(String[] stringSet, String str) {
        for(int i = 0; i < stringSet.length; i++) {
            if(str.equals(stringSet[i])) {
                break;
            }
            else if(stringSet[i] == null) {
                stringSet[i] = str;
                break;
            }
        }
    }
    private static void sort(String[] stringSet, String order) {
        order = order.toUpperCase();
        int len = 0;
        for(int i = 0; i < stringSet.length; i++) {
            if(stringSet[i] != null)
                len++;
        }
        if("ASC".equals(order)) {
            for(int i = 0; i < len - 1; i++) {
                for(int j = 0; j < len - 1 - i; j++) {
                    if(stringSet[j].charAt(0) > stringSet[j+1].charAt(0)) {
                        String temp = stringSet[j];
                        stringSet[j] = stringSet[j+1];
                        stringSet[j+1] = temp;
                    }
                }
            }
        }
        if("DESC".equals(order)) {
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - 1 - i; j++) {
                    if (stringSet[j].charAt(0) < stringSet[j + 1].charAt(0)) {
                        String temp = stringSet[j];
                        stringSet[j] = stringSet[j + 1];
                        stringSet[j + 1] = temp;
                    }
                }
            }
        }
    }
    private static void remove(String[] stringSet, String str) {
        String[] newstringSet = new String[100];
        int j = 0;
        for(int i = 0; i < stringSet.length; i++) {
            if(!(str.equals(stringSet[i]))) {
                newstringSet[j] = stringSet[i];
                j++;
            }
        }
        System.arraycopy(newstringSet, 0, stringSet, 0, newstringSet.length);
    }
    private static void clean(String[] stringSet) {
        String[] newstringSet = new String[100];
        System.arraycopy(newstringSet, 0, stringSet, 0, newstringSet.length);
    }
    private static void print(String[] stringSet) {
        int len = 0;
        for(int i = 0; i < stringSet.length; i++) {
            if(stringSet[i] != null)
                len++;
        }
        stringSet = Arrays.copyOf(stringSet, len);
        System.out.println("Element Size: " + len + ", Values = " + Arrays.toString(stringSet));
    }
}
