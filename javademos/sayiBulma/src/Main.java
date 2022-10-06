public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arancak = 5;
        boolean varMi = false;

        for(int sayi : sayilar){
            if(arancak==sayi){
                varMi=true;
                break;
            }
        }

        if(varMi){ //varMi ---> varMi == true ile aynı anlama gelir.
            System.out.println("Sayı vardır.");
        }else {
            System.out.println("Sayı yoktur.");
        }

    }
}