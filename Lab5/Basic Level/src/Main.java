import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Letter> letters = new ArrayList<>(){{
            add (new A()); add (new B()); add (new C()); add (new D()); add (new E()); add (new F()); add (new G()); add (new H()); add (new I()); add (new J());
        }};
        for(Letter letter : letters){
            System.out.println(letter.toString());
        }
    }
}
