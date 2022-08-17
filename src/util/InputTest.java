package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
//        System.out.println(test.getInt());
//        System.out.println(test.getHex());
//        test.getString();
//        test.yesNo();
//        test.getInt(1,10);
//        test.getDouble(0,1);

//        test.getHex("10");
        System.out.println(test.getHex("10"));
        System.out.println(test.getBinary("10"));

        test.getInt();
    }


}
