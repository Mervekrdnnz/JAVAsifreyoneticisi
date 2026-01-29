# 🔐 Java Şifre Yöneticisi (Password Manager)

Bu proje, Java programlama dili kullanılarak geliştirilmiş, **kullanıcıların şifrelerini güvenli bir şekilde oluşturmasını, saklamasını ve yönetmesini** sağlayan **konsol tabanlı (CLI) bir şifre yöneticisi uygulamasıdır**.

Amaç; şifre güvenliği, dosya işlemleri ve temel kriptografi mantığını bir arada kullanarak **gerçek hayata yakın bir güvenlik uygulaması geliştirmektir**.

---

## 🎯 Projenin Amacı

- Kullanıcı şifrelerini **düz metin (plain text) olarak saklamamak**
- Güçlü şifreleme algoritmaları ile verileri korumak
- Java ile **güvenlik odaklı** bir uygulama geliştirmek
- Dosya okuma/yazma, algoritma ve kullanıcı etkileşimini birlikte kullanmak

---

## 🚀 Özellikler

- 🔐 **AES tabanlı şifreleme**
- 🔑 **Rastgele ve güçlü şifre üretimi**
- 💾 **Dosya tabanlı veri saklama**
- 🧠 **Basit ve anlaşılır CLI (Command Line Interface)**
- 📂 Şifre ekleme, listeleme ve yönetme
- 🛡️ Kullanıcı verilerinin şifreli biçimde saklanması

---

## 🛠️ Kullanılan Teknolojiler

- **Java**
- **AES Şifreleme Algoritması**
- **Dosya I/O (FileReader / FileWriter)**
- **Nesne Yönelimli Programlama (OOP)**
- **CLI (Konsol Uygulaması)**

---

## 📁 Proje Yapısı

JAVAsifreyoneticisi/
│
├── Main.java → Uygulamanın giriş noktası
├── PasswordEntry.java → Şifre veri modeli
├── EncryptionService.java → Şifreleme ve çözme işlemleri
├── PasswordGenerator.java → Güçlü şifre üretimi
├── FileManager.java → Dosya okuma ve yazma işlemleri
├── kasa.txt / database.safe → Şifreli veri dosyası


---

## ▶️ Nasıl Çalıştırılır?

1. Bilgisayarınızda **Java 8 veya üzeri** kurulu olmalıdır.
2. Projeyi klonlayın:
   ```bash
   git clone https://github.com/Mervekrdnnz/JAVAsifreyoneticisi.git
Proje klasörüne girin:

cd JAVAsifreyoneticisi
Derleyin ve çalıştırın:

javac Main.java
java Main
Program terminal üzerinden çalışır ve sizi yönlendirir.

🔒 Güvenlik Yaklaşımı
Şifreler AES algoritması ile şifrelenerek saklanır.

Dosya içinde hiçbir şifre açık metin olarak tutulmaz.

Şifre üretimi sırasında karmaşık ve tahmin edilmesi zor karakterler kullanılır.

📈 Geliştirme Fikirleri (Roadmap)
🔑 Master Password eklenmesi

🔒 Hash + Salt kullanımı

🧪 JUnit testlerinin eklenmesi

🖥️ GUI (JavaFX / Swing) arayüzü

☁️ Veritabanı entegrasyonu

