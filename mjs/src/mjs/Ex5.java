package mjs;
import ex.Book;
public class Ex5 {
	public static void main(String[] args) {
		Book book = new Book();
		book.setBookInfo("스프링5", "스프링에 관한 내용");
		book.bookInfoPrint();
		book.setBookInfo("스프링5", "스프링에 관한 내용","최범균");
		book.bookInfoPrint();
		book.setBookInfo("스프링5", "스프링에 관한 내용","최범균","IT서적");
		book.bookInfoPrint();
		book.setBookInfo("스프링5", "스프링에 관한 내용","최범균","IT서적",26500);
		book.bookInfoPrint();
		
	
	}

}
