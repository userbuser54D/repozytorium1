//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz nazwę swojej klasy");
    String name = scanner.nextLine();
    System.out.println("Podaj poziom klasy (np. 2, bo 2BT)");
    int level = scanner.nextInt();
    System.out.println("Witaj " + name + ". Za " + (5 - level) + "lata będę pisał maturę !");
    System.out.println("Co chcesz robić po zakończeniu szkoły?");
    Scanner scanner2 = new Scanner(System.in);
    String odpowiedz = scanner2.nextLine();
    System.out.println("Oto co chcesz robić: " + odpowiedz);
}









