public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    public static boolean czyPierwsza(int liczba){
        if(liczba<2){
            return false;
        }
        double pierwiastek = (Math.sqrt(liczba));
        for (int i = 2; i <= pierwiastek; i++) {
            if(liczba%i == 0){
                return false;
            }
        }
        return true;
    }
    public static String szyfruj(String slowo) {
        String zaszyfrowane = "";
        int pierwiastek = (int) (Math.sqrt(slowo.length()));
        if(pierwiastek*pierwiastek<slowo.length()){
            pierwiastek++;
        }
        while (slowo.length()<pierwiastek*pierwiastek){
            slowo = slowo +" ";
        }
        for (int i = 0; i < pierwiastek; i++) {
            for (int k = i; k < slowo.length(); k = k + pierwiastek) {
                zaszyfrowane = zaszyfrowane + slowo.charAt(k);
            }
        }
        zaszyfrowane = zaszyfrowane.trim();
        return zaszyfrowane;
    }


}