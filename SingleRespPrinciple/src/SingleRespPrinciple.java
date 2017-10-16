
public class SingleRespPrinciple {
	class Text {
	    String text;
	    String author;
	    int length;

	    String getText() { return text; }
	    void setText(String s) {text=""+s; }
	    String getAuthor() { return author; }
	    void setAuthor(String s) {author=""+ s;}
	    int getLength() { return length; }
	    void setLength(int k) { length=k; }

	    /*methods that change the text*/
	    void allLettersToUpperCase() { }
	    void findSubTextAndDelete(String s) { }
	}

	class Printer {
	    Text text;

	    Printer(Text t) {
	       this.text = t;
	    }

	    void printText() {  }
	}

}
