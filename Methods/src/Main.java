//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Computer {

    public void playMusic() {
        System.out.println("Playing Music.");
    }

    public String getMePen(int cost) {
        if (cost >= 10)
            return "Pen";
        return "Nothing";

        // return stops the execution
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);
    }
}