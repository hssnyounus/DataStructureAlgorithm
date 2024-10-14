public class Main {

  public static void main(String[] args) {

    int a = 50;
    int c = 50;
    byte as = 123;
    System.out.println(as);
    String day = "Sunday";
    if (c == a) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    switch (day) {
      case "monday":
        System.out.println("today is monday");
        break;
      case "Sunday":
        System.out.println("today is Sunday");
        break;
      default:
        System.out.println("today is tuesday");
    }
    for (int i = 0; i <= 6; i++) {
      System.out.print(i + " " + "loop");
    }
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    int term = 1;
    int term2 = 1;
    for (int i = 1; i <= term; i++) {
      for (int j = term; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    while (term <=12){
//      System.out.print(term);
      term++;
    }

    do {
      System.out.println(term2);
      term2++;
    }while(term2 <=12);

  }
}