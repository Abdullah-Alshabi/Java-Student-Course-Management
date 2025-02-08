public class House {
    private String address;
    private String city;
    private boolean isFinished;

    public House() {
        this("Not Available", "Not Available", false);
    }

    public House(String address, String city, boolean isFinished) {
        this.address = address;
        this.city = city;
        this.isFinished = isFinished;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public String toString() {
        return "Address: " + address + ", City: " + city + ", Finished: " + isFinished;
    }
}
