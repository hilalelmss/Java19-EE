
## Java Server Faces

Java Server Faces bir çatıdır. Kullanıcı arayüzü sağlar. Tag yapmak istediğimiz işlemleri basitçe yapabilmekteyiz. JAva dilini html diline bağlar. JSF’de farklı provider sağlayıcı vardır primefaces, richfaces gibi bu sayede arayüz oluşturmak çok kolaydır.

Java Server Faces‘in geneli eventler üzerinden yürümektedir. Her hangi bir aksiyon durumunda eventlere tepki verebilmektedir. En büyük artısı ajax’a kolayca hizmet sunar. Çok katmanlı mimariler için JSF bizim view katmanı ayrıştırmak konusunda çok avantaj sağlar.

![jsf yaşam döngüsü](http://docs.oracle.com/javaee/5/tutorial/doc/figures/jsfIntro-lifecycle.gif)


Bu yaşam döngüsü, bir istek (request) ile başlar ve ilk olarak Restore View kısmına girer..

1- Restore View : Kullanıcı, sayfada bir butonu tıkladığı, bir linki tıkladığı ya da herhangi bir durumu tetiklediği aşama Restore View aşamasıdır.. DaHa sonra Buradan Apply Request’ e gider.

2- Apply Request : Tarayıcıdaki (browser- internet explorer, chrome, mozilla vb) bilgiler toplanır ve bileşenler(component) içerisine aktarılır.

3- Process Validations : Toplanan Değerlerin kontrol edilmesi gerekmektedir. Örneğin bir etiket içerisine boş bırakılamaz(requiret=true) yazıldıysa, öncelikle burası kontrol edilir. Daha sonra kontrol kuralları yani validator’lar ve en sonda çeviriciler(converter) kontrol edilir. Çeviricilere örnek vermemiz gerekirse, tarih ve zamanı uygun formata dönüştüren çeviriciler…

4- Update Model Values : Eğer kontrol esnasında yani Process Validations bölümünde bir aksilik olmazsa yani, ilgili verilerin doğru olduğu tespit edilirse, bu veriler Bean sınıfına aktarılır ve orada ilgili değişkenlere atanır..

5- Invoke Application : Bean sınıfımızda çağrılması gereken metodlar çağırılı, örneğin action, actionListener ve listener metodları…

6- Render Response : Bütün işlemler bittikten sonra, sayfanın yeni hali tarayıcıya yani browsera gönderilir ve kullanıcı sayfanın yeni halini görür…