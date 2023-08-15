# Tesztjegyzőkönyv-Felhasználói adatbázis

Az alábbi tesztdokumentum a Hír projekthez tartozó 9.4.7 Felhasználói adatbázis ellnőrzése funkcióihoz készült. Felelőse: Fekete Marcell 


## 1. Teszteljárások (TP)

### 1.1. Regisztráció tesztelése
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: regisztráció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a regisztráció felületére
    1. lépés: Az `INPUT1` szövegbeviteli mezőbe írjuk be a felhasználónevet
    2. lépés: Az `INPUT2` szövegbeviteli mezőbe írjuk be az e-mail címet
    3. lépés: Az `INPUT2` szövegbeviteli mezőbe írjuk be a jelszót
    4. lépés: Az `INPUT2` szövegbeviteli mezőbe írjuk be a jelszót még egyszer
    5. lépés: Nyomjuk meg az `Regisztráció` gombot 
    6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Tájékoztatást kapunk a sikeres regisztációról. Az adatbázisba bekerült az új felhasználó.

### 1.2. Bejelentkezés tesztelése
- Azonosító: TP-02
- Tesztesetek: TC-03, TC-04
- Leírás: bejelentkezés tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és lépjünk a bejelentkezés felületére
    1. lépés: Az `INPUT1` szövegbeviteli mezőbe írjuk be a felhasználónevet
    2. lépés: Az `INPUT2` szövegbeviteli mezőbe írjuk be a jelszót
    3. lépés: Nyomjuk meg az `Bejelentkezés` gombot 
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A belépés sikeres. Megjelenik a kijelentkezés gomb, megkapjuk a jogosultságunknak megfelelő funkciókat.


## 2. Teszesetek (TC)

### 2.1. Regisztráció tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: Regisztráció tesztelése 
- Bemenet: `INPUT1` = "teszt" ; `INPUT2` = "teszt@teszt.com" ; `INPUT3` = "teszt" ; `INPUT4` = "teszt"
- Művelet: nyomjuk meg az `Regisztráció` gombot 
- Elvárt kimenet: Az alkalmazás tájékoztat a sikeres regisztrációról. Az adatbázisban rögzült az új felhasználó.

#### 2.1.2. TC-02
- TP: TP-01
- Leírás: Regisztráció tesztelése 
- Bemenet: `INPUT1` = "fhnev" ; `INPUT2` = "email@fmail.com" ; `INPUT3` = "jelszo" ; `INPUT4` = "jelszo2"
- Művelet: nyomjuk meg az `Regisztráció` gombot 
- Elvárt kimenet: A regisztráció sikertelen, nem rögzül az adatbázisban a hibás adat.


### 3.1. Bejelentkezés tesztesetei

#### 3.1.1. TC-03
- TP: TP-02
- Leírás: Bejelentkezés tesztelése 
- Bemenet: `INPUT1` = "teszt" ; `INPUT2` = "teszt"
- Művelet: nyomjuk meg az `Bejelentkezés` gombot 
- Elvárt kimenet: A bejelentkezés sikeres, a kijelentkezés gomb megjelent.

#### 3.1.2. TC-04
- TP: TP-02
- Leírás: Bejelentkezés tesztelése 
- Bemenet: `INPUT1` = "nincsilyenfhnev" ; `INPUT2` = "jelszo"
- Művelet: nyomjuk meg az `Bejelentkezés` gombot 
- Elvárt kimenet: A bejelentkezés sikertelen.

#### 3.1.3. TC-04
- TP: TP-02
- Leírás: Bejelentkezés tesztelése 
- Bemenet: `INPUT1` = "teszt" ; `INPUT2` = "rosszjelszo"
- Művelet: nyomjuk meg az `Bejelentkezés` gombot 
- Elvárt kimenet: A bejelentkezés sikertelen.


## 3. Tesztriportok (TR)

### 3.1. Regisztráció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: "teszt"-t beírtam.
    2. lépés: "teszt@teszt.com"-t beírtam .
    3. lépés: "teszt"-t beírtam.
    4. lépés: "teszt"-t beírtam.
    5. lépés: Megnyomtam a regisztráció gombot.
    6. lépés: A regisztráció sikerességéről üzenetet kaptam, az adatbázisban rögzült az adat.
    
#### 3.1.2. TR-02 (TC-02)
- TP: TP-01
    1. lépés: "fhnev"-t beírtam.
    2. lépés: "email@fmail.com"-t beírtam .
    3. lépés: "jelszo"-t beírtam.
    4. lépés: "jelszo2"-t beírtam.
    5. lépés: Megnyomtam a regisztráció gombot.
    6. lépés: A regisztráció sikertelen, az adatbázisban nem történt változás.

### 3.2. Bejelentkezés tesztriportjai

#### 3.2.1. TR-03 (TC-03)
- TP: TP-02
    1. lépés: "teszt"-t beírtam.
    2. lépés: "teszt"-t beírtam .
    3. lépés: Megnyomtam a bejelentkezés gombot.
    4. lépés: A bejelentkezés megtörtént, megjelent a kijelentkezés gomb.

#### 3.2.2. TR-04 (TC-04)
- TP: TP-02
    1. lépés: "nincsilyenfhnev"-t beírtam.
    2. lépés: "jelszo"-t beírtam .
    3. lépés: Megnyomtam a bejelentkezés gombot.
    4. lépés: A bejelentkezés sikertelen volt.

#### 3.2.3. TR-05 (TC-05)
- TP: TP-02
    1. lépés: "teszt"-t beírtam.
    2. lépés: "rosszjelszo"-t beírtam .
    3. lépés: Megnyomtam a bejelentkezés gombot.
    4. lépés: A bejelentkezés sikertelen volt.

    