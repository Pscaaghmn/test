public class Arrival {
    private int eta;

    public Arrival(int eta) {
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public int compareWith(Arrival anotherArrival){
        return eta - anotherArrival.getEta();
    }
}
