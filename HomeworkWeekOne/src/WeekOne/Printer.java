package WeekOne;

public class Printer {

	static void printPDFDocumnet(String a) { // Main'de çaðýrabilmek için methodu static tanýmladýk

		PDFDocument pdf = new PDFDocument(a);

		System.out.println(pdf.getbody(a));
	}

	static void printWordDocument(String b) { // Main'de çaðýrabilmek için methodu static tanýmladýk

		WordDocument wrd = new WordDocument(b);
		System.out.println(wrd.getbody(b));
	}

	public static void main(String[] args) {

		String a = "aslanparcasi";
		String b = "kaplanparcasi";
		printPDFDocumnet(a);
		printWordDocument(b);

	}

}
