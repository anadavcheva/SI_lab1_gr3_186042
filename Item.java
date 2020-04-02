public class Item {
    public static void main(String[] args) {

    }
}


class Item2 {
    int id;
    String name;
    double price;

    //TODO add variable.
    char percent;

    //TODO constructor

    public Item2(int id, String name, double price, char percent) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.percent = percent;
    }


    //TODO setters and getters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getPercent() {
        return percent;
    }

    public void setPercent(char percent) {
        this.percent = percent;
    }

    double taxReturn () {
        if (percent == 'А') this.price = this.price*0.15;
        if (percent == 'Б') this.price = this.price*0.18;

        return this.price*0.15;
    }
}
