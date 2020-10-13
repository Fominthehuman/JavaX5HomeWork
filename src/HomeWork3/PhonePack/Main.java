package HomeWork3.PhonePack;

public class Main {

    public static void main(String[] args) {

        Phone nokia = new Phone();
        nokia.model = "3310";
        nokia.number = "+3-310-555-55-55";
        nokia.weight = "3 kg";

        Phone sony = new Phone();
        sony.model = "XPeria";
        sony.number = "+7-666-555-55-55";
        sony.weight = "0.1 kg";

        Phone moto = new Phone();
        moto.model = "D500";
        moto.number = "+8-500-555-55-55";
        moto.weight = "0.13 kg";

        System.out.println(nokia.model + ", " + nokia.number + ", " + nokia.weight);
        Phone.receiveCall("Вася");
        System.out.println(Phone.getNumber(moto.number) + "\n");

        System.out.println(sony.model + ", " + sony.number + ", " + sony.weight);
        Phone.receiveCall("Ваня");
        System.out.println(Phone.getNumber(nokia.number) + "\n");

        System.out.println(moto.model + ", " + moto.number + ", " + moto.weight);
        Phone.receiveCall("Петя");
        System.out.println(Phone.getNumber(sony.number) + "\n");

        Phone.receiveCall("Жора", "+7-985-564-66-66");

        Phone.sendMessage(moto.number, nokia.number, sony.number);
    }

}
