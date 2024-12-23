package Java_Post_Advanced1.CH07_NestedInnerClass.nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고
        if(bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }

        // 정상 로직 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("책 목록 출력");
        for (int i = 0; i < bookCount; i++) { // 책이 size만큼 다 들어가지 않았을 가능성이 있으므로 bookCount까지 loop 수행
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }
    }

    // Book이 Library의 요소를 사용하지 않으면 static으로 생성한다.
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
