public class DVD extends product{
    String studio;
    int length;
    int rating;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD() {
        super(); // mengakses constructir superclass
        length = 0;
        rating = 0;
        studio = "";
    }

    public DVD(int number, String name, int quantity, double price, int length, int rating, String studio) {
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    public void print() {
        super.print();
        System.out.println("Length : " +length);
        System.out.println("Rating : " +rating);
        System.out.println("Studio : " +studio);
    }
}
