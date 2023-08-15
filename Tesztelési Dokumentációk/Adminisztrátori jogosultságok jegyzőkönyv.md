# Adminisztrátori jogosultságok jegyzőkönyv

Az alábbi tesztdokumentum a Hír projekthez tartozó 9.4.2. Hírek kezelése funkcióihoz készült. Felelőse: Marton Pál 


## 1. Teszteljárások (TP)
	
### 1.1. Adminisztrátori jogosultság funkciók
- Azonosító: TP-05
- Tesztesetek: 
- Leírás: A Adminisztrátor jogosultságainak tesztelése
	0. Lépés: Lépjünk be egy admin felhasználóval.
	1. Lépés: A jobb szélén a kijelentkezés gomb mellet lévő gombal, nyissuk meg az admin felület!
	3. Lépés: Kiválasszuk a listából hogy milyen műveletett akarunk végre hajtani(`felhasználó törlés` és `felhasználói jogosultság szerkesztés`)
	4. Lépés: A törlésnél lent megjelenő felhasználóknál, a `Delete` gombal kitöröljük a felhasználót!
	5. Lépés: A jogosultság szerkesztésnél a legördülő menuben kiválasszuk az adott felhasználó új jogosultságát!


## 2. Teszesetek (TC)

### 2.1 Adminisztrátori jogosultságok tesztelése

#### 2.1.1 TC-51
- TP: TP-5
- Leírás: A Adminisztrátor jogosultságainak tesztelése(Törlés).
- Bemenet: `id` = a törlendő felhasználó id-je.
- Művelet: A `Delete` gomb megnyomása, elküldi a kiválasztott felhasználó `id`-át!
- Elvárt kimenet: A kiválasztott felhasználó törlődik.

#### 2.1.2 TC-52
- TP: TP-5
- Leírás: A Adminisztrátor jogosultságainak tesztelése(Szerkesztés).
- Bemenet: `id` = A felhasználó id-je!
		   `intdRole` = A felhasználó új role-ja!
-Művelete: A legördülő menuben kiválasszuk az adott felhasználó új jogosultságát, majd a gombal mentsük a változtattást!
-Elvárt kimenet: A felhasználó adatai jogosultsága megváltozik!


## 3. Tesztriportok (TR)

### 3.1. Adminisztrátori jogosultságok tesztriportjai

#### 3.1.1. TR-51 (TC-05)
- TP: TP-51
    1. Lépés: Kinyissuk az admin felületet!
    2. Lépés: Rá kattintunk a `Felhasználó törlése` gombra
    3. Lépés: Megnézzük a lent megjelenített felhasználókat!
    4. Lépés: Rá kattintunk a `Delete` gombra a 'Margit' nevű felhasználónál!

#### 3.2.1. TR-52 (TC-05)
- TP: TP-52
	1. Lépés: Kinyissuk az admin felületet!
    2. Lépés: Rá kattintunk a `Felhasználó jogosultságok módosítása` gombra
	3. Lépés: Megnézzük a lent megjelenített felhasználókat!
	4. Lépés: A 'Faruzan' nevű felhasználó melleti legördülő menüben kiválasztom az szerkesztői jogot majd, a gombra kattintva mentem azt!
