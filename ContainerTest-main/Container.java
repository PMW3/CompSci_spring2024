public class Container {
    public int containerAmount;

    public Container() {
        // this.amount = amount;
    }

    public int contains() {
        return this.containerAmount;
    }

    public void addAmount(int amount) {
        if ((amount > 100) || (amount < 0)) {
            this.containerAmount = this.containerAmount;
        } else {
            this.containerAmount += amount;
        }
    }

    public void remove(int amount) {
        if ((amount < 0) || (amount > this.containerAmount)) {
            this.containerAmount = containerAmount;
        } else {
            this.containerAmount -= amount;
        }
    }

    public void move(int amount, Container container) {
        if((container.containerAmount + amount>100)) {
            containerAmount= containerAmount;
        } else {
            container.addAmount(amount);
            this.remove(amount);
        }

    }

    public String toString() {
        return this.containerAmount + "/100";
    }
}
