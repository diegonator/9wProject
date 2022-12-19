public class clerk extends employee{
    private int checkoutLane;
    private int itemsScanned;
    private int time;

    public clerk(int age, String employeeID, String employeeRole, int checkoutLane, int itemsScanned, int time) {
        super(age, employeeID, employeeRole);
        this.checkoutLane = checkoutLane;
        this.itemsScanned = itemsScanned;
        this.time = time;
    }
    public int getCheckoutLane() {
        return checkoutLane;
    }
    public void setCheckoutLane(int checkoutLane) {
        this.checkoutLane = checkoutLane;
    }
    public int getItemsScanned() {
        return itemsScanned;
    }
    public void setItemsScanned(int itemsScanned) {
        this.itemsScanned = itemsScanned;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public int itemsPerMinute(){
        return itemsScanned/time;
    }
    public String toString() {
        return "clerk [checkoutLane=" + checkoutLane + ", itemsScanned=" + itemsScanned + ", time=" + time + "]";
    }
}
