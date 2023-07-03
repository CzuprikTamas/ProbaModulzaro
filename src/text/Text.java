package text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Text {

    public List<String> messages = new ArrayList<>();

    public List<String> modifyListMethod(List<String> messages) {
        for (String karakter : messages) {
            if (karakter.length() > 25) {
                karakter = karakter.substring(0, 20) + "...";
            }
            messages.add(karakter);
        }
        return this.messages;
    }


        public static void main(String[] args) {
            List<String> messages = new ArrayList<>(Arrays.asList(
                    "Ez egy rövid szöveg.",
                    "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                    "Ez is egy rövid szöveg.",
                    "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
            ));
        }
    }


