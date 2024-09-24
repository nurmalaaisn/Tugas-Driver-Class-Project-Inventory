public class CD extends product {
    String artist;
    int numSong;
    String label;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
        super(); // mengakses constructir superclass
        artist = "";
        numSong = 0;
        label = "";
    }

    public CD(int number, String name, int quantity, double price, String artist, int numSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }

    public void print() {
        super.print();
        System.out.println("Artist : " +artist);
        System.out.println("Total song : " +numSong);
        System.out.println("Label : " +label);
    }
}
