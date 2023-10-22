import java.util.*;
class Solution {
    public static void main(String[] args) {
        simplifyPath("/home//cat/");
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] arr = path.split("/");
        for(int i=0; i<arr.length; i++) {
            
            if(!arr[i].equals("..") && !arr[i].equals("")) {
                System.out.print(i+"->"+arr[i]);
                // stack.push("/");
                stack.push(arr[i]);
            } else {
                if(!stack.isEmpty() && arr[i].equals("..")) {
                    stack.pop();
                }
            }
        }
        System.out.println();
        String wd = "";
        while(!stack.isEmpty()) {
            String la = stack.pop();
            System.out.println(la);
            wd = "/"+la + wd;
        }
        System.out.println("wd "+wd);
        return wd;
    }
}