public class Main {

    public static void main(String[] args) {
	// write your code here
        Buku buku1 = new Buku("Harry Potter", "J.K.Rowling", 300000.0);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000.0);

        System.out.println("Judul : "+ buku1.getJudul()+ ", Pengarang : "+ buku1.getPengarang()+ ", Harga : "+ buku1.getHarga());
        System.out.println("Judul : "+buku2.getJudul()+", Pengarang : "+ buku2.getPengarang()+", Harga : "+ buku2.getHarga());
    }
}
