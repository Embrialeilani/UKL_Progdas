public class Mudah3 {
    public static void main(String[] args) {
        //Perulangan
        for (int i = 50; i >= 1; i--) {
            System.out.println(i + ".");

            //Percabangan
            if (i == 1){ //Untuk Mengecek 
                System.out.println("Saya Menang");
            }else if (i % 3 == 0) {
                System.out.println("Saya Angkatan 33");
            }else if (i % 2 == 0) {
                System.out.println("Saya Anak Moklet");    
            }else {
                System.out.println("Saya Anak Wikusama");
            }
                            
        }         
     }            
}




