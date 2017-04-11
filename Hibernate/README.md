# Hibernate Dersleri

# Taglar

**@Table** ile oluşturacaağımız tablonun adını değiştirmektedir.

**@Column** ile oluşturacağımız tablodaki sütun adlarını değiştirir.

**@GeneratedValue** ile auto ‘id’ üretmeyi ve Veritabanımızda sequence oluşturtur.

**@SecondaryTable** ile aynı class’tan birden fazla tablo oluşturmaya yaramaktadır.


**@OneToOne nedir?**

Veritabanı tabloların arasında bire bir ilişiki olması gerekmektedir.


# **Criteria** 


// Maas 2000'den büyük olanlar

cr.add(Restrictions.gt("maaas", 2000));

//Maas 200'den küçük olanlar

cr.add(Restrictions.lt("maaas", 2000));

// zara ile başlayan kelimeler (karakter büyüklük önemsiz)

cr.add(Restrictions.like("isim", "zara%"));

// zara ile başlayan kelimeler (karakter büyüklük önemli)

cr.add(Restrictions.ilike("isim", "zara%"));

// maas 1000 ile 2000 arasında

cr.add(Restrictions.between("maas", 1000, 2000));

// maas null ise

cr.add(Restrictions.isNull("maas"));

// maas nul değilse

cr.add(Restrictions.isNotNull("maas"));

// maas boşsa

cr.add(Restrictions.isEmpty("maas"));

// maaş boş değilse

cr.add(Restrictions.isNotEmpty("maas"));

//Birden başla ve 10 kayıt getir.

Criteria cr = session.createCriteria(Employee.class);
cr.setFirstResult(1);
cr.setMaxResults(10);
List results = cr.list();


# HQL

//Bütün tabloyu çekmek

Query query = session.createQuery("from Kisiler");
List list = query.list();


//Parametere ile veri çekmek

Query query = session.createQuery("from Kisiler where id = :id ");
query.setParameter("id", "1");
List list = query.list();

//Birden fazla veri ile update

Query query = session.createQuery("update Kisi set name = :name" +
    				" where code = :code");
query.setParameter("name", "mustafa");
query.setParameter("code", "1111");
int result = query.executeUpdate();

//Delete

Query query = session.createQuery("delete Kisi where code = :code");
query.setParameter("code", "1111");
int result = query.executeUpdate();

//İnsert

String hql = "INSERT INTO kisiler(firstName, lastName, salary)"  + 
             "SELECT firstName, lastName, salary FROM eski_kisiler";
Query query = session.createQuery(hql);
int result = query.executeUpdate();
System.out.println("eklenen sonuc: " + result);


//distinct ve count

String hql = "SELECT count(distinct E.firstName) FROM kisiler E";
Query query = session.createQuery(hql);
List results = query.list();

//aralık 1-10 arasında 

String hql = "FROM kisiler";
Query query = session.createQuery(hql);
query.setFirstResult(1);
query.setMaxResults(10);
List results = query.list();
