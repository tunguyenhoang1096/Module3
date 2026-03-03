package ex2;

public class main {
    public static void main(String[] args) {
        // Tạo đối tượng book mới
        Book book1 = new Book();

        // khởi tạo gt của đối tượng book1 thông qua setter
        book1.setTitle("Java");
        book1.setAuthor("Rikkei");
        book1.setPrice(50);

        // hiển thị book1 thông qua getter
        System.out.println("Tên sách: "+book1.getTitle());
        System.out.println("Tác giả: "+book1.getAuthor());
        System.out.println("Giá: "+book1.getPrice());

        // Thay đổi giá
        book1.setPrice(100);
        System.out.println("Giá mới sau khi thay đổi: "+book1.getPrice());
        book1.setPrice(-20);
    }
}
