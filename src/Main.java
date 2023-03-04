import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User();


        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println(
                """
                        1 - Notebook İşlemleri
                        2 - Cep Telefonu İşlemleri
                        3 - Marka Listele
                        0 - Çıkış Yap""");
        boolean isOut = false;

        while (!isOut){
            System.out.print("Tercihiniz : ");
            int select = scanner.nextInt();
            switch (select){
                case 0:
                    System.out.println("Güle Güle!!!");
                    isOut = true;
                    break;
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Notebook Listesi");
                    System.out.println("-------------------------");
                    user.noteBookList();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Cep Telefonu Listesi");
                    System.out.println("-------------------------");
                    user.mobileList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Markalarımız");
                    user.markList();
                    System.out.println();
                    break;
                default:
                    System.out.println("Geçerli Bir İşlem Seçiniz!!!");
                    break;


            }
        }




    }
}
