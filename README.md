# final-projesi
BomBom isimli oyunda, 10 - 10 büyüklüğünde belli bir oyun haritası üzerinde kullanıcı tarafından 0 - 9 arasında girilecek koordinatlar ile oyun devam eder. Girilen koordinatta bulunan sayının etrafındaki (sağ, sol, yukarı, aşağı ve çaprazlar olmak üzere) sayılar kontrol edilir asıl koordinattaki sayıya eş bir sayı varsa, "X"e çevrilir. Böylece bütün haritanın temizlenmesi amaçlanır. Programın bütün özellikleri aşağıdaki gibidir:
1- Txt dosyasından çekilen harita ekrana basılır ve kullanıcıdan bir koordinat girmesi istenir.
2- Oyuncu bir koordinat seçer; örneğin 4 5 gibi. 4 satır, 5 ise sütun numarasını temsil eder.
3- Seçilen koordinatın öncelikle yukarı bölgesinden başlamak üzere 4 bölgesi sırayla kontrol edilir.
( yukarı, sağ, aşağı, sol şeklinde saat yönünde kontrol yapabilirsiniz )
4- Kontroller, seçilen sayı ile aynı olup olmamasına göre yapılır. Örneğin koordinatın 4 5 olduğunu
varsayalım; 4 5 koordinatında bulunan 7 sayısının üstündeki rakam 8, sağı kontrol ettiğimizde 2
tane 7, altında 1 tane 7, solunda ise 6 rakamı var.
5- Seçilen koordinatta bulunan sayı ile aynı olan komşu hücreler, X karakteri ile değiştirilir.
6- Seçilen koordinattaki sayı ile komşu hücreler kontrol edilirken, kontrol edilen hücrenin etrafında
da araştırma yapmak gerekmektedir. ( Tıpkı candy saga oyununda olduğu gibi )
7- İşlemler tamamlandıktan sonra güncellenen harita ekrana tekrar basılır ve kullanıcıdan yeni
koordinat beklenir.
8- Kullanıcı koordinat olarak 0 0 girdiğinde oyun sonlandırılır.
