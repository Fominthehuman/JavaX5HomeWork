package HomeWork3.PhonePack;

public class Phone {

    protected String number;
    protected String model;
    protected String weight;

    public Phone() {

    }

    public static void receiveCall(String calling_name) {
        System.out.println("Звонит " + calling_name);
    }

    public static void receiveCall(String calling_name, String calling_number) {
        System.out.println("Звонит " + calling_name + " " + calling_number);
    }

    public static String getNumber(String calling_number) {
        return calling_number;
    }

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

        Phone phone = new Phone(number, model);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }


    public static void sendMessage(String... numbers) {
        System.out.println("Телефоны для отправки: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }

}


