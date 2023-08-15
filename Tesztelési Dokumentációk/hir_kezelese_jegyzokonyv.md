# Tesztjegyzőkönyv-Hírek kezelése

Az alábbi tesztdokumentum a Hír projekthez tartozó 9.4.2. Hírek kezelése funkcióihoz készült. Felelőse: Marton Pál 


## 1. Teszteljárások (TP)

### 1.1. Hír létrehozása funkció
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02
- Leírás: hír létrehozás tesztelése
    0. lépés: Nyissuk meg az alkalmazást és jelentkezzünk be egy admin vagy szerkesztő felhasználóval és lépjünk be az admin felületre
    1: lépés: Kattintsunk a hír létrehozása gombra
    2. lépés: A `cim` mezőbe írjuk be a `CIM` szöveget
    3: lépés: A `tartalom` többsoros mezőbe írjuk be a `TARTALOM`szöveget
    4. lépés: A `kep_utvonal` mezőbe írjuk be a `KEP` szöveget
    5. lépés: Válasszuk ki a `kategoria` radio gombok közül a `KATEGORI`-t


## 2. Teszesetek (TC)

### 2.1. Hír létrehozás tesztesetei

#### 2.1.1. TC-01
- TP: TP-01
- Leírás: hír létrehozás tesztelése 
- Bemenet: `CIM` = "Vége a népszámlálásnak, ilyen formában ez volt az utolsó" ; `TARTALOM` = "November 28-án lezárult a 2022-es népszámlálás, közölte a KSH.
    A pótösszeírásban részt vevőkkel együtt, akik az elmúlt héten, a települési jegyzőt felkeresve tettek eleget adatszolgáltatási kötelezettségüknek, összesen 4,6 millió lakáskérdőív, és 9,2 millió személyi kérdőív érkezett be a népszámlálás rendszerébe – utóbbi a becsült várható népesség 96 százaléka. A még hiányzó adatokat állami adatbázisokból pótolja a KSH.
    Az idei az első népszámlálás, amikor a statisztikai hivatal ilyen kiterjedt jogosultságot kapott az adatok pontosításához: a KSH állami adatbázisokat használhat fel ahhoz, hogy összevesse a népszámlálás során megadott információkat az adminisztratív adatokkal, és szükség esetén pótolja a hiányzó adatokat." ; `KEP` = "assets/vonat.jpg"
- Művelet: `KATEGORI` = "Tech" gomb megnyomása
- Művelet: nyomjuk meg az `Hozzáadás` gombot 
- Elvárt kimenet: Sikeresen bekerült az adatbázisba a cikk


## 3. Tesztriportok (TR)

### 3.1. Hír létrehozás tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: rákattintottam a hír létrehozása gombra
    2. lépés: "Vége a népszámlálásnak, ilyen formában ez volt az utolsó"-t beírtam
    3. lépés: "November 28-án lezárult a 2022-es népszámlálás, közölte a KSH.
        A pótösszeírásban részt vevőkkel együtt, akik az elmúlt héten, a települési jegyzőt felkeresve tettek eleget adatszolgáltatási kötelezettségüknek, összesen 4,6 millió lakáskérdőív, és 9,2 millió személyi kérdőív érkezett be a népszámlálás rendszerébe – utóbbi a becsült várható népesség 96 százaléka. A még hiányzó adatokat állami adatbázisokból pótolja a KSH.
        Az idei az első népszámlálás, amikor a statisztikai hivatal ilyen kiterjedt jogosultságot kapott az adatok pontosításához: a KSH állami adatbázisokat használhat fel ahhoz, hogy összevesse a népszámlálás során megadott információkat az adminisztratív adatokkal, és szükség esetén pótolja a hiányzó adatokat."-t beírtam
    4. lépés: "assets/nep.jpg"-t beírtam
    5. lépés: Kiválasztottam a "Tech" kategóriát
    6. lépés: megnyomtam a `Hozzáadás` gombot