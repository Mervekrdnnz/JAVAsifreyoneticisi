import java.util.*;

public class Main {
    private static ArrayList<PasswordEntry> database = new ArrayList<>();
    
    // ANSI Renk Paleti (Profesyonel Terminal Görünümü)
    public static final String R = "\u001B[31m";   // Kritik Hata / Zayıf
    public static final String G = "\u001B[32m";   // Başarılı / Güçlü
    public static final String Y = "\u001B[33m";   // Uyarı / Öneri
    public static final String B = "\u001B[34m";   // Bilgi / İşlem
    public static final String M = "\u001B[35m";   // Başlık Moru
    public static final String C = "\u001B[36m";   // Turkuaz Çerçeve
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        database = FileManager.oku();
        Scanner sc = new Scanner(System.in);

        // --- DEVASA GÖRSEL BAŞLIK ---
        System.out.println(M + "  _________        🔏  _________      ____________________ " + RESET);
        System.out.println(M + " /   _____/_____ _/  |_\\_   ___ \\    /  _____/\\______   \\ " + RESET);
        System.out.println(M + " \\_____  \\\\__  \\\\   __\\/    \\  \\/   /   __  \\  |       _/ " + RESET);
        System.out.println(M + " /        \\/ __ \\|  |  \\     \\____  \\  |__\\  \\ |    |   \\ " + RESET);
        System.out.println(M + "/_______  (____  /__|   \\______  /   \\_____  / |____|_  / " + RESET);
        System.out.println(M + "        \\/     \\/              \\/          \\/         \\/  " + RESET);
        System.out.println(C + "   [ SİBER GÜVENLİK YÖNETİMİ & AES-256 ŞİFRELEME ÜSSÜ ]" + RESET);
        System.out.println(C + "==========================================================" + RESET);

        while (true) {
            System.out.println("\n" + B + "💠 [ ANA KONTROL PANELİ ] 💠" + RESET);
            System.out.println(C + "┌────────────────────────────────────────────────────────┐" + RESET);
            System.out.println("  [1] ➕ Yeni Zırhlı Kayıt    |  [4] 🎲 Akıllı Şifre Fabrikası");
            System.out.println("  [2] 🔍 Platform Analizi     |  [5] 🔥 Veritabanını İmha Et");
            System.out.println("  [3] 🔓 Kasayı Çöz           |  [6] 🚪 Güvenli Terminal Çıkışı");
            System.out.println(C + "└────────────────────────────────────────────────────────┘" + RESET);
            System.out.print(Y + "Sistem Komutu Bekleniyor > " + RESET);

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    kayitEkle(sc);
                    break;
                case "2":
                    ara(sc);
                    break;
                case "3":
                    listele();
                    break;
                case "4":
                    onerici(sc);
                    break;
                case "5":
                    imha(sc);
                    break;
                case "6":
                    System.out.println(G + "✔ Oturum kapatıldı. Veriler şifrelendi." + RESET);
                    return;
                default:
                    System.out.println(R + "❌ Geçersiz komut! Lütfen 1-6 arası bir sayı girin." + RESET);
            }
        }
    }

    private static void kayitEkle(Scanner sc) {
        System.out.println(B + "\n--- YENİ GÜVENLİK KAYDI ---" + RESET);
        System.out.print("Platform (Örn: Binance, Gmail): "); String p = sc.nextLine();
        System.out.print("Kimlik/E-posta: "); String u = sc.nextLine();
        System.out.print("Şifre: "); String s = sc.nextLine();
        
        analizEt(s); // Şifreyi analiz et ve öneri ver

        try {
            database.add(new PasswordEntry(p, u, EncryptionService.encrypt(s)));
            FileManager.kaydet(database);
            System.out.println(G + "✅ Veri başarıyla AES-256 katmanıyla zırhlandı!" + RESET);
        } catch (Exception e) {
            System.out.println(R + "🚨 KRİTİK HATA: Şifreleme motoru başarısız!" + RESET);
        }
    }

    private static void analizEt(String s) {
        System.out.println(B + "\n📊 ŞİFRE GÜVENLİK ANALİZİ:" + RESET);
        int score = 0;
        if (s.length() >= 12) score += 2;
        if (s.matches(".*[A-Z].*")) score++;
        if (s.matches(".*[0-9].*")) score++;
        if (s.matches(".*[!@#$%^&*].*")) score++;

        System.out.print("GÜVENLİK PUANI: ");
        if (score <= 2) {
            System.out.println(R + " [★☆☆☆☆] ZAYIF" + RESET);
            System.out.println(Y + "💡 TAVSİYE: Şifreniz çok basit! Bir hacker bunu 5 saniyede kırabilir." + RESET);
            System.out.println(Y + "👉 ÖNERİ: İçine en az bir adet '!', '?' veya '#' ekleyin." + RESET);
        } else if (score <= 4) {
            System.out.println(Y + " [★★★☆☆] ORTA" + RESET);
            System.out.println(Y + "👉 ÖNERİ: Uzunluğu 12 karaktere çıkararak 'Brute-Force' saldırılarını imkansızlaştırın." + RESET);
        } else {
            System.out.println(G + " [★★★★★] MÜKEMMEL (KIRILAMAZ)" + RESET);
            System.out.println(G + "✨ TEBRİKLER: Bu şifre askeri düzeyde koruma sağlar." + RESET);
        }
    }

    private static void onerici(Scanner sc) {
        System.out.println(B + "\n--- 🎲 AKILLI ŞİFRE FABRİKASI ---" + RESET);
        System.out.print("Kaç karakterlik bir kale inşa edelim? (Öneri: 16): ");
        int len = Integer.parseInt(sc.nextLine());
        String pass = PasswordGenerator.generate(len);
        System.out.println(G + "✔ ÜRETİLEN GÜVENLİ ANAHTAR: " + RESET + pass);
        System.out.println(C + "🛡️ NOT: Bu şifre hiçbir sözlükte bulunmaz ve tahmin edilemez." + RESET);
    }

    private static void ara(Scanner sc) {
        System.out.print(B + "\n🔍 Aranacak Platform: " + RESET);
        String q = sc.nextLine().toLowerCase();
        boolean found = false;
        for(PasswordEntry e : database) {
            if(e.getPlatform().toLowerCase().contains(q)) {
                System.out.println(Y + ">> BULUNDU: " + RESET + e.getPlatform() + " (" + e.getUsername() + ")");
                found = true;
            }
        }
        if(!found) System.out.println(R + "❌ Eşleşen bir kayıt bulunamadı." + RESET);
    }

    private static void listele() {
        System.out.println(M + "\n--- 🔓 KASA İÇERİĞİ ÇÖZÜLÜYOR ---" + RESET);
        if(database.isEmpty()) System.out.println(Y + "Kasa şu an boş." + RESET);
        for (PasswordEntry e : database) {
            try {
                String plain = EncryptionService.decrypt(e.getPassword());
                System.out.printf(C + "[%-12s]" + RESET + " 👤 %-15s | 🔑 %-15s\n", e.getPlatform(), e.getUsername(), G + plain + RESET);
            } catch (Exception ex) { }
        }
    }

    private static void imha(Scanner sc) {
        System.out.print(R + "\n🔥 KRİTİK UYARI: Tüm şifreler kalıcı olarak silinecek! Onaylıyor musunuz? (evet): " + RESET);
        if (sc.nextLine().equalsIgnoreCase("evet")) {
            database.clear();
            FileManager.save(database);
            System.out.println(G + "✔ Veritabanı başarıyla sıfırlandı." + RESET);
        }
    }
}