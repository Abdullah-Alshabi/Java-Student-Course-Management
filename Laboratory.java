public class Laboratory extends Room {
    public Laboratory() {
        setCapacity();
        setNumberOfComputers();
    }

    private void setNumberOfComputers() {
        numberOfComputers = 30;
    }

    private void setCapacity() {
        capacity = 30;
    }
}
