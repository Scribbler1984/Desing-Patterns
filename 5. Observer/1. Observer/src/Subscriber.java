public class Subscriber {

    public Subscriber(String name){
        this.name = name;
    }

    private String name;
    private Channel channel = new Channel();

    public void update(){
        System.out.println("A Video was uploaded " + name);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
