public class Main {
    public static void main(String[] args) {
        Network net = new Network(10);
        Phone a = new Phone("0662272779");
        Phone b = new Phone("0662272778");
        Phone c  = new Phone("0662272777");
        a.register(net);
        b.register(net);
        c.register(net);
        a.call("0662272777");
        b.call("0662272779");
        c.call("02222222");
    }
}