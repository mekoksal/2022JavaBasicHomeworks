public class Main {
    public static void main(String[] args) {

        String ogrenci1="Murat";
        String ogrenci2="Mustafa";
        String ogrenci3="Ahmet";
        String ogrenci4="Aziz";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------");

        String[] ogrenciler = new String[5];

        ogrenciler[0]="Murat";
        ogrenciler[1]="Mustafa";
        ogrenciler[2]="Ahmet";
        ogrenciler[3]="Aziz";
        ogrenciler[4]="İrem";

        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}