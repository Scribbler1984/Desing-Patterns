public class Youtube {

    public static void main(String[] args) {
        Channel asmongold = new Channel();

        Subscriber s1 = new Subscriber("Egon");
        Subscriber s2 = new Subscriber("Anna");
        Subscriber s3 = new Subscriber("Henrik");
        Subscriber s4 = new Subscriber("Georg");

        asmongold.subscribe(s1);
        asmongold.subscribe(s2);
        asmongold.subscribe(s3);
        asmongold.subscribe(s4);

        asmongold.unsubscribe(s1);

        s1.subscribeChannel(asmongold);
        s2.subscribeChannel(asmongold);
        s3.subscribeChannel(asmongold);
        s4.subscribeChannel(asmongold);

        asmongold.upload("Learn Programming");
    }

}