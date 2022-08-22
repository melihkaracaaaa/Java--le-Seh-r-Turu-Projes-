import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuru {
    public static void islemleri_bastır(){
        System.out.println("...İslemleri Goruntule...");
        System.out.println("1 -- bir sonraki sehre git..");
        System.out.println("2 -- bir onceki sehre git..");
        System.out.println("3 -- Uygulamadan Cikk...");
    }
    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String> iterator= sehirler.listIterator();

        int islem;
        islemleri_bastır();
        Scanner scanner=new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("herhangi bir islem bulunmuyor..");
        }
        boolean cikis= false;
        boolean ileri= true;
        while(!cikis){
            System.out.println("bir islem secinizz..");
            islem=scanner.nextInt();
            switch (islem){
                case 0:
                    islemleri_bastır();
                    break;
                case 1 :
                    if (!ileri) {
                        if (iterator.hasNext()) {

                            iterator.next();


                        }
                        ileri=true;
                    }
                    if ( iterator.hasNext()){
                        System.out.println("sehre gidiliyor..  "+  iterator.next());
                    }
                    else {
                        System.out.println("Gidilcek sehir kalmadi...");
                        ileri=true;
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious() ) {
                            iterator.previous();
                        }

                        ileri=false;

                    }
                    
                    
                    if (iterator.hasPrevious()){
                        System.out.println("sehre gidiliyorr..   "+ iterator.previous());

                    }
                    else {
                        System.out.println("sehir turu yeni baslıyorr..");
                    }
                    break;

                case 3: 
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                    
                default:
                    System.out.println("...Hatalı İşlem Girişi...");
                    break;
         }
        
   }
}
    public static void main(String [] args) {

        LinkedList<String> sehirler= new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);

    }
}