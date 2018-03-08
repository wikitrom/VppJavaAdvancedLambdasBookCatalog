import java.util.List;

public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		System.out.println("title <= 10 characters");
		List<Book> foundBooks = bc.findBooks(aBook -> aBook.getTitle().length() <= 10 ? true : false);

		for (Book nextBook : foundBooks) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		System.out.println();

		System.out.println("author has 'bronte'");
		List<Book> foundBooks2 = bc
				.findBooks(aBook -> aBook.getAuthor().toLowerCase().matches(".*bronte.*") ? true : false);

		for (Book nextBook : foundBooks2) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		System.out.println();
		System.out.println("title has 'men' anywhere");
		List<Book> foundBooks3 = bc
				.findBooks(aBook -> aBook.getTitle().toLowerCase().matches(".*men.*") ? true : false);

		for (Book nextBook : foundBooks3) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		System.out.println();
		System.out.println("title has the word 'men' ");
		List<Book> foundBooks4= bc
				.findBooks(aBook -> aBook.getTitle().toLowerCase().matches(".* ?men {1}.*") ? true : false);

		for (Book nextBook : foundBooks4) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());
		}

	}
}
