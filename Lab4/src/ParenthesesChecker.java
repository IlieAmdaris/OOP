import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class ParenthesesChecker {
    private String[] allExpressions;

    public void isValid(){
        try {
            allExpressions = fileReader();
        }catch (IOException e){
        }
        for (int i = 0; i < allExpressions.length; i++){
            String expression = allExpressions[i];
            Stack<Character> openBrackets = new Stack<>();
            HashMap<Character,Character> map = new HashMap<>();
            map.put(')', '(');
            map.put(']','[');
            map.put('}','{');
            for (int j = 0; j < expression.length();j++){
                char c = expression.charAt(j);
                if (map.containsKey(c)){
                    char topElement = openBrackets.empty()   ? '!' : openBrackets.pop();
                    if (topElement != map.get(c)){
                        break;
                    }
                }
                else if(map.containsValue(c)) {
                    openBrackets.push(c);
                }
            }
            System.out.println(openBrackets.empty());
        }
    }
    private String[] fileReader() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String fileName = scanner.nextLine();
        String content = Files.readString(Paths.get(fileName), StandardCharsets.US_ASCII);
        String[] splitContent = content.split("\\R");//split is an adjective here
        System.out.println(content);
        return splitContent;
    }
}
