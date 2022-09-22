public class SesliHarfler {

    public static void main(String[] args) {

        char harf = 'ü';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın Sesli Harf");
                return;


        }

        switch (harf) {
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce Sesli Harf");

                break;

            default:
                System.out.println("Geçersiz Harf.");

                return;

        }
    }
}
