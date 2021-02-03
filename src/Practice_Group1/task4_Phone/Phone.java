package Practice_Group1.task4_Phone;

public class Phone {
    private long number;
    private Network network = null;

    public Phone() {
        super();
    }

    public Phone(long number) {
        super();
        this.number = number;
    }

    public void registerPhone(Network network) {
        this.network = network;
        network.registerNumber(number);
    }

    public String call(long number) {
        return network.searchAndCall(number);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }


}