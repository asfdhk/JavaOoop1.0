public class Phone {
    private String number;
    private Network network;

    public Phone(String number) {
        super();
        this.number = number;
    }

    public Phone() {
        super();
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void register(Network network) {
        network.allPhone(this);
        this.network = network;

    }

    public void call(String numb) {

        for (Phone phone : network.getPhonesList()) {
            if (phone != null && phone.number.equals(numb)) {
                phone.incoming(number);
                return;
            }
        }
        System.out.println("\nДзвінок не виконано " + numb + " телефон не зареєстрований в сіті");
    }

    public void incoming(String num) {
        System.out.print("\n Виконується дзвінок н аномер " + this.number + " з номера: " + num);
    }

    @Override
    public String toString() {
        return " Номер " + number;
    }
}
