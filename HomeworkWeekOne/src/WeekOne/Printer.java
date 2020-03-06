package WeekOne;

public class Printer {

	static void printPDFDocumnet(String a) { // Main'de �a��rabilmek i�in methodu static tan�mlad�k

		PDFDocument pdf = new PDFDocument(a);

		System.out.println(pdf.body);
	}

	static void printWordDocument(String b) { // Main'de �a��rabilmek i�in methodu static tan�mlad�k

		WordDocument wrd = new WordDocument(b);
		System.out.println(wrd.body);
	}

	public static void main(String[] args) {

		String a = "aslanparcasi";
		String b = "kaplanparcasi";
		printPDFDocumnet(a);
		printWordDocument(b);

	}

}
