public class Main {
    public static void main(String[] args) {
        NamePrintService namePrintService = new NamePrintService();

        Oval ovalShape= new Oval();
        Circle circleShape= new Circle();
        Square squareShape= new Square();
        Triangle triangleShape= new Triangle();
        Diamond diamondShape= new Diamond();

        namePrintService.printName(ovalShape);
        namePrintService.printName(circleShape);
        namePrintService.printName(squareShape);
        namePrintService.printName(triangleShape);
        namePrintService.printName(diamondShape);

    }
}