public class Product {

    private int price;
    private int weight;
    private String color;

    public Product(int price,int weight,String color){
        this.price = price;
        this.weight = weight;
        this.color = color;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
