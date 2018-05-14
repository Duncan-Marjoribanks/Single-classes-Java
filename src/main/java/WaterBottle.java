public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }


    public int volume() {
        return this.volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public int empty() {
        return this.volume - this.volume;
    }

    public int refill() {
        return this.volume + 100;
    }
}
