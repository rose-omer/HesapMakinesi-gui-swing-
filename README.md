# Mayın Tarlası Oyunu

Bu Java projesi, Mayın Tarlası oyununu basit bir kullanıcı arayüzü (GUI) ile temsil eder. Oyun, mayınların bulunduğu bir alan üzerindeki hücreleri açma ve mayınları bulma amacını taşır.

## Oyun Kuralları

- Oyun 10x10 büyüklüğünde bir alanda oynanır.
- Toplamda 10 adet mayın bulunmaktadır.
- Sol tıklama ile hücre açılır. Eğer mayına tıklanırsa, oyun kaybedilir.
- Sağ tıklama ile hücreye bayrak koyulur veya kaldırılır.
- Oyuncu tüm mayınsız hücreleri açtığında oyun kazanılır.

## Kullanılan Kütüphaneler

- `java.awt.GridLayout`: Hücreleri düzenlemek için kullanılan bir düzen yöneticisi.
- `java.awt.event.MouseEvent`: Fare olaylarını takip etmek için kullanılan bir sınıf.
- `javax.swing.JFrame`: Oyun penceresini temsil eden bir Swing sınıfı.
- `javax.swing.ImageIcon`: Resim dosyalarını yüklemek ve göstermek için kullanılan Swing sınıfı.
- `javax.swing.JOptionPane`: İkaz mesajları göstermek için kullanılan Swing sınıfı.

## Nasıl Oynanır

1. Projeyi bilgisayarınıza klonlayın veya ZIP olarak indirin.
2. Java IDE'si (Eclipse, IntelliJ IDEA vb.) kullanarak projeyi açın.
3. `MayinTarlasi` sınıfını çalıştırarak oyunu başlatın.
4. Oyun penceresi açıldığında, sol tık ile hücre açabilir, sağ tık ile bayrak koyabilirsiniz.

## Ekran Görüntüsü

![Mayın Tarlası Oyunu](screenshots/mayin_tarlasi.png)
![image](https://github.com/rose-omer/MayinTarlasi-gui-swing/assets/117285777/74af7c9a-7bf9-425e-91e8-fc577f792a66)
![image](https://github.com/rose-omer/MayinTarlasi-gui-swing/assets/117285777/d7b1ee7a-90d8-4b8f-ae39-6d12e3ecafa4)
