package problems;

import java.util.*;

public class symplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String parts[] = path.split("/");
        
        // for (int i = 0; i < parts.length; i++) {
        // System.out.println(parts[i]);
        // }

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(part);
            }
        }
        return "/" + String.join("/", s);
    }

    public static void main(String[] args) {
        String path = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path));
    }
}
