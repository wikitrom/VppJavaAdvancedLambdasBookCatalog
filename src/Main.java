import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		System.out.println();
		System.out.println("Chapter 14 (Built in Finctions) tasks follows:");
		System.out.println("==============================================");
		System.out.println();

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
		List<Book> foundBooks4 = bc
				.findBooks(aBook -> aBook.getTitle().toLowerCase().matches(".* ?men {1}.*") ? true : false);

		for (Book nextBook : foundBooks4) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());
		}

		System.out.println();
		System.out.println("Chapter 17 (Lambda Practicals) tasks follows:");
		System.out.println("=============================================");
		System.out.println();

		// search titles
		System.out.println("All titles starting with a D (using findBooksUsingStream method):");
		List<Book> foundBooks5 = bc.findBooksUsingStream(aBook -> aBook.getTitle().matches("^D.+$") ? true : false);

		for (Book nextBook : foundBooks5) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());
		}
		System.out.println();
		System.out.println("Same List using more compact code (assuming Book has a toSting() method):");
		bc.findBooksUsingStream(aBook -> aBook.getTitle().matches("^D.+$") ? true : false).forEach(System.out::println);

		System.out.println();
		System.out.println("All titles starting with a D again (using findTitles method):");
		Map<Integer, String> bookMap = bc.findTitles(aBook -> aBook.getTitle().matches("^D.+$") ? true : false);
		bookMap.forEach((k, v) -> System.out.println(v));

		System.out.println();
		System.out.println("Number of books starting with a D (using findNUmberOfBooks):");
		Integer count = bc.findNUmberOfBooks(aBook -> aBook.getTitle().matches("^D.+$") ? true : false);
		System.out.println(count);

		// search authors
		System.out.println();
		System.out.println("All titles with an Author starting with a D (using findBooksUsingStream method):");
		List<Book> foundAuthor = bc.findBooksUsingStream(aBook -> aBook.getAuthor().matches("^D.+$") ? true : false);

		for (Book nextBook : foundAuthor) {
			System.out.println(nextBook.getTitle() + " by " + nextBook.getAuthor());

		}

		System.out.println();
		System.out.println("All titles with an Author starting with a D again (using findTitles method):");
		Map<Integer, String> bookMap2 = bc.findTitles(aBook -> aBook.getAuthor().matches("^D.+$") ? true : false);
		bookMap2.forEach((k, v) -> System.out.println(v));

		System.out.println();
		System.out.println("Number of books with an author starting with a D (using findNUmberOfBooks):"); //
		Integer count2 = bc.findNUmberOfBooks(aBook -> aBook.getAuthor().startsWith("D") ? true : false);
		System.out.println(count2);

	}
}
