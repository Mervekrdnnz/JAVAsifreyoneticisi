# 🔐 Java Şifre Yöneticisi (Password Manager)

Bu proje, **Java** dili kullanılarak geliştirilmiş, **AES-256 şifreleme algoritması** ile güvenli veri saklama sağlayan **terminal tabanlı bir şifre yöneticisi** uygulamasıdır.

Amaç; kullanıcıların şifrelerini güvenli bir şekilde oluşturmasını, saklamasını ve yönetmesini sağlamaktır.

---

## 🚀 Özellikler

- 🔒 **AES-256 ile Güçlü Şifreleme**
- 🧠 **Rastgele ve Güçlü Şifre Üretimi**
- 💾 **Dosya Tabanlı Güvenli Veri Saklama**
- 🖥️ **Terminal (CLI) Üzerinden Kullanım**
- 🗂️ **Modüler ve OOP uyumlu yapı**

---

## 🛠️ Kullanılan Teknolojiler

- **Java**
- **AES-256 Encryption**
- **Object Oriented Programming (OOP)**
- **File I/O**
- **CLI (Command Line Interface)**

---

## 📁 Proje Yapısı

```text
JAVAsifreyoneticisi/
│
├── Main.java                  → Uygulama giriş noktası
├── EncryptionService.java     → AES-256 şifreleme/çözme işlemleri
├── FileManager.java           → Dosya okuma & yazma işlemleri
├── PasswordEntry.java         → Şifre veri modeli
├── PasswordGenerator.java    → Güçlü şifre üretici
│
├── kasa.txt
├── database.safe
├── kasa_verisi.safe           → Şifrelenmiş veri dosyaları
⚙️ Nasıl Çalışır?
Kullanıcı uygulamayı terminal üzerinden çalıştırır

Şifre ekleme / görüntüleme işlemleri yapılır

Tüm veriler AES-256 ile şifrelenerek dosyaya kaydedilir

Yetkisiz erişimlere karşı veriler okunamaz durumda saklanır

▶️ Çalıştırma
javac Main.java
java Main
Java 8 veya üzeri önerilir.

🎯 Proje Amacı
Bu proje;

Java OOP mantığını uygulamak

Kriptografi ve veri güvenliği kavramlarını öğrenmek

Dosya yönetimi ve modüler yazılım geliştirmek

GitHub portföyü için güçlü bir örnek oluşturmak

amacıyla geliştirilmiştir.
