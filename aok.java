import java.util.Scanner;

public class aok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        String biner, binerKeHeksadesimal, heksadesimalKeBiner, heksadesimalKeDesimal, heksadesimal;
        int desimal, desimalDariBiner, desimalDariHeksadesimal, desimalKeHeksadesimal, desimalDariHeksadesimalKeDesimal, desimalDariBinerKeHeksadesimal; 

        do {
            System.out.println("Pilih konversi yang ingin dilakukan:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    biner = scanner.nextLine();
                    desimalDariBiner = Integer.parseInt(biner, 2);
                    System.out.println("Hasil konversi ke desimal: " + desimalDariBiner);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimal = scanner.nextInt();
                    scanner.nextLine(); 
                    String binerDariDesimal = Integer.toBinaryString(desimal);
                    System.out.println("Hasil konversi ke biner: " + binerDariDesimal);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    binerKeHeksadesimal = scanner.nextLine();
                    desimalDariBinerKeHeksadesimal = Integer.parseInt(binerKeHeksadesimal, 2);
                    heksadesimal = Integer.toHexString(desimalDariBinerKeHeksadesimal);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    heksadesimalKeBiner = scanner.nextLine();
                    desimalDariHeksadesimal = Integer.parseInt(heksadesimalKeBiner, 16);
                    String binerDariHeksadesimal = Integer.toBinaryString(desimalDariHeksadesimal);
                    System.out.println("Hasil konversi ke biner: " + binerDariHeksadesimal);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimalKeHeksadesimal = scanner.nextInt();
                    scanner.nextLine(); 
                    heksadesimal = Integer.toHexString(desimalKeHeksadesimal);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    heksadesimalKeDesimal = scanner.nextLine();
                    desimalDariHeksadesimalKeDesimal = Integer.parseInt(heksadesimalKeDesimal, 16);
                    System.out.println("Hasil konversi ke desimal: " + desimalDariHeksadesimalKeDesimal);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program konversi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}