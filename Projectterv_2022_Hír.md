#  Hír  Projektterv  2022 

## 1. Összefoglaló 

 A hírportál lényege, hogy értesüljünk a számunkra fontos és meghatározó eseményekről annak történési helyétől függetlenül. Ez lehető leggyorsabban történjen meg minél részletesebben és objektívebben. Ehhez kell egy felület ahol ezeket az ellenőrzött híreket gyorsan és egyszerűen meg lehet találni téma, idő vagy elhelyezkedés szerint rendszerezve. Mindez egy igényes és egyszerűen használható, mindenki számára elérhető felületen. 


## 2. Verziók

| Verzió | Szerző                | Dátum        | Státusz         | Megjegyzés                                                    |
|--------|--------------------------|--------------|-----------------|---------------------------------------------------------------|
|  0.1   |  Gál Eszter           |  2022-10-04  |  Tervezet       |  Dokumentáció                                               |
|  0.2 |  Bakhit Patrik   |  2021-10-18  |  Előterjesztés       |  Use case diagram                                             |
|  0.3 |  Fábián Csongor            |  2021-10-18  |  Előterjesztés       |  Class diagram                                             |
|  0.4 |  Fekete Marcell            |  2021-10-18  |  Előterjesztés       |  Sequence diagram                                             |
|  0.5 |  Gál Eszter             |  2021-10-18  |  Előterjesztés       |  EK diagram                                                   |
|  0.6 |  Szelekovszky Balázs              |  2021-10-18  |  Előterjesztés       |  Package diagram                                              |
|  0.7 |  Polyák Máté           |  2021-10-18  |  Előterjesztés       |  Képernyőtervek                                               |
|  1.0 |  Marton Pál           |  2021-10-25  |  Elfogadott       |  1. mérföldkő                                               |





## 3. A projekt bemutatása

 Ez a projektterv a Hír projektet mutatja be, mely 2022-09-20-től 2022-11-27-ig tart. A projekt célja, hogy megfelelő felületet biztosítson az online hírközlésre. Mindezért egy egyszerűen használható, átlátható és hatékonyan működő webalkalmazás fog felelni. A projekten hét fejlesztő fog dolgozni, az elvégzett feladatokat pedig négy alkalommal fogjuk prezentálni a megrendelőnek. 


### 3.1. Rendszerspecifikáció

 A rendszernek képesnek kell lennie hírek kilistázására, időrendben való felsorolására, ezenkívül a hírek különböző kategóriákba rendezésére. Minden funkció a megfelelő felhasználói jogosultság mellett használható, annak függvényében írható, olvasható vagy nem megtekinthető az adat.
 


### 3.2. Funkcionális követelmények

 - Jogosultsági szintek
     - Admin (Olvas, Módosít, Töröl)
     - Szerző (Olvas, Hozzáad)
     - Felhasználó (Olvas, Kommentel)     
     - Olvasó (Olvas)
 
 - Felhasználók kezelése
     - Regisztráció
     - Belépés
     - Kilépés
     - Adatok módosítása
     - Felhasználó törlés
 
 - Hírek kezelése 
     - Hozzáadás
     - Törlés
     - Keresés
     - Módosítás
     
 - Kommentek kezelése
     - Hozzáadás
     - Törlés
     - Módosítás

 - Témánkénti csoportosítás
     - Tech
     - Sport
     - Kultúra
     - Belföld
     - Külföld
 

### 3.3. Nem funkcionális követelmények

 -  A kliens oldal platform- és böngészőfüggetlen legyen 
 -  Szenzitív adatokat biztonságosan tároljuk 
 -  Igényes megjelenés 
 -  Felhasználók számára optimális sebesség 


## 4. Költség- és erőforrás-szükségletek


Az erőforrásigények összesen kb.  8  személynap/fő.

A rendelkezésünkre áll összesen  7 * 70 = 490  pont.

## 5. Szervezeti felépítés és felelősségmegosztás
A projekt megrendelője  Dr. Pflanzner Tamás . A hír projektet a projektcsapat fogja végrehajtani, amely jelenleg hét fejlesztőből áll. A csapatban másod- és harmadéves egyetemisták találhatók, akiknek az eddigi kurzusokról van webfejlesztési tapasztalata.


### 5.1 Projektcsapat
A projekt a következő emberekből áll:

|                                                                                                                   | Név             | E-mail cím (stud-os)       |
|-------------------------------------------------------------------------------------------------------------------|-----------------|----------------------------|
| Megrendelő                        |  Dr. Pflanzner Tamás  |  tamas.pflanzner@inf.u-szeged.hu   |
| Felelősségek:  Projekt menedzser  |  Marton Pál           |  h161409@stud.u-szeged.hu   |
| Felelősségek:  Adatbázis          |  Fábián Csongor       |  h045002@stud.u-szeged.hu  |
| Felelősségek:  Diagram            |  Fekete Marcell       |  h044727@stud.u-szeged.hu  |
| Felelősségek:  Frontend           |  Gál Eszter           |  h983042@stud.u-szeged.hu  |
| Felelősségek:  Design             |  Polyák Máté          |  h162948@stud.u-szeged.hu  |
| Felelősségek:  Backend            |  Bakhit Patrik        |  h844097@stud.u-szeged.hu  |
| Felelősségek:  Tesztelés          |  Szelekovszky Balázs  |  h164457@stud.u-szeged.hu  |



## 6. A munka feltételei

### 6.1. Munkakörnyezet
A projekt a következő munkaállomásokat fogja használni a munka során:

Munkaállomások: 7 db informatikai eszköz: 

Acer Aspire a515-52g laptop (CPU: i5-8265u, RAM: 16 GB, GPU: NVIDIA MX150), 
Acer Aspire a515-51g laptop (CPU: i5-8265u, RAM: 12 GB, GPU: NVIDIA MX150), 
Lenovo S340 laptop (CPU:Ryzen 5 3500U, RAM: 8 GB, GPU: RADEON VEGA 8), 
PC (CPU:Ryzen 5 3600, RAM:16GB, GPU: NVIDIA RTX3060Ti), 
Asus Tuf fx-505-ge laptop (CPU: i7-8750H, RAM: 16GB, GPU: NVIDIA GTX 1050TI), 
Asus Tuf fx-505-ge laptop (CPU: Core i5 , RAM: 8GB, GPU: NVIDIA GTX 3050TI) 



A projekt a következő technológiákat/szoftvereket fogja használni a munka során:


    DigitalOcean felhőszolgáltatás
    MySQL adatbázisszerver
    Spring Boot (backend)
    Maven szoftverprojekt menedzselő szoftver
    IntelliJ IDEA -java
    Git verziókövető (GitLab)
    Draw.io -diagram készítő
    Figma



### 6.2. Rizikómenedzsment

| Kockázat                                    | Leírás                                                                                                                                                                                     | Valószínűség | Hatás  |
|---------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------|--------|
|  Betegség                                   |  Súlyosságtól függően hátráltatja vagy bizonyos esetekben teljes mértékben korlátozza a munkavégzőt, így az egész projektre kihatással van. Megoldás: a feladatok átcsoportosítása         |  nagy        |  erős  |
|  Kommunikációs fennakadás a csapattagokkal  |  A csapattagok között nem elégséges az információ áramlás, nem pontosan, esetleg késve vagy nem egyértelműen tájékoztatjuk egymást. Megoldás: még gyakoribb megbeszélések és ellenőrzések  |  kis         |  erős  |
|  Tag kiesése  |  Valamilyen okból kifolyólag kiesik egy vagy több tag a projektből. Megoldás: feladatainak szétosztása a maradék tag között.  |  kis         |  erős  |
|  Covid  |  Amennyiben visszatérnek a karanténos korlátozások és otthonról kell folytatnunk a munkát. Ez az opció növeli a betegség előfordulásának a valószínűségét. Megoldás: Online kommunikáció, feladatok megfelelő időbeosztása.  |  kis         |  gyenge  |
|  Fűtés hiány  |  Kollégiumok bezárása a fenntarthatóság hiánya miatt.  |  közepes         |  gyenge  |


## 7. Jelentések

### 7.1. Munka menedzsment
A munkát Marton Pál koordinálja. Fő feladata, hogy folyamatosan egyeztessen a csapattagokkal az előrehaladásról és a fellépő problémákról, esetlegesen a megoldásban is segítséget nyújthat a projekt csúszásának elkerülése végett. További feladata a heti szinten tartandó csoport gyűlések időpontjának és helyszínének szervezése, erről messengeren tájékoztatja a projekt csapatot. 

### 7.2. Csoportgyűlések

A projekt  1-2  hetente ülésezik, hogy megvitassák az azt megelőző hét problémáit, illetve hogy megbeszéljék a következő hét feladatait. A megbeszélésről minden esetben memó készül.

1. megbeszélés:
 -  Időpont: 2022.09.21. 
 -  Hely: SZTE Irinyi épület - Szeged, Tisza Lajos krt. 103 
 -  Résztvevők: Bakhit Patrik, Szelekovszky Balázs, Fábián Csongor, Gál Eszter, Fekete Marcell, Marton Pál, Polyák Máté 
 -  Érintett témák: Ismerkedés, projekt téma kiválasztása 

2. megbeszélés:
 -  Időpont: 2022.10.04. 
 -  Hely: Discord 
 -  Résztvevők: Bakhit Patrik, Szelekovszky Balázs, Fábián Csongor, Gál Eszter, Fekete Marcell, Marton Pál, Polyák Máté 
 -  Érintett témák: Gantt Diagram, projektterv elkészítése 

3. megbeszélés:
 -  Időpont: 2022.10.10. 
 -  Hely: Discord 
 -  Résztvevők: Bakhit Patrik, Szelekovszky Balázs, Fábián Csongor, Gál Eszter, Fekete Marcell, Marton Pál, Polyák Máté 
 -  Érintett témák: új csoportvezető választás, dokumentáció + gantt diagram tovább szerkesztése
  
 
4. megbeszélés:
 -  Időpont: 2022.10.17. 
 -  Hely: Discord 
 -  Résztvevők: Bakhit Patrik, Szelekovszky Balázs, Fábián Csongor, Gál Eszter, Fekete Marcell, Marton Pál, Polyák Máté 
 -  Érintett témák: Diagramok átbeszélése, feladatok szétosztása
 
5. megbeszélés:
 -  Időpont: 2022.10.24. 
 -  Hely: Discord 
 -  Résztvevők: Bakhit Patrik, Szelekovszky Balázs, Fábián Csongor, Gál Eszter, Fekete Marcell, Marton Pál, Polyák Máté 
 -  Érintett témák: elkészült diagramok áttekintése, szerkesztése, ötletelés a harmadik mérföldkőhöz, második mérföldkő véglegesítése

6. megbeszélés:
 -  Időpont: 2022.11.08. 
 -  Hely: Discord 
 -  Résztvevők: Bakhit Patrik, Szelekovszky Balázs, Fábián Csongor, Gál Eszter, Fekete Marcell, Marton Pál, Polyák Máté 
 -  Érintett témák: harmadik mérföldkő megbeszélése, elkészült feladatok áttekintése
  
### 7.3. Minőségbiztosítás

Az elkészült terveket a terveken nem dolgozó csapattársak átnézik, hogy megfelel-e a specifikációnak és az egyes diagramtípusok összhangban vannak-e egymással. A meglévő rendszerünk helyes működését a prototípusok bemutatása előtt a tesztelési dokumentumban leírtak végrehajtása alapján ellenőrizzük és összevetjük a specifikációval, hogy az elvárt eredményt kapjuk-e. További tesztelési lehetőségek: unit tesztek írása az egyes modulokhoz vagy a kód közös átnézése (code review) egy, a vizsgált modul programozásában nem résztvevő csapattaggal. Szoftverünk minőségét a végső leadás előtt javítani kell a rendszerünkre lefuttatott kódelemzés során kapott metrikaértékek és szabálysértések figyelembevételével.
Az alábbi lehetőségek vannak a szoftver megfelelő minőségének biztosítására:
- Specifikáció és tervek átnézése (kötelező)
- Teszttervek végrehajtása (kötelező)
- Unit tesztek írása (választható)
- Kód átnézése (választható)

### 7.4. Átadás, eredmények elfogadása

A projekt eredményeit    Dr. Pflanzner Tamás  fogja elfogadni. A projektterven változásokat csak írásos kérés esetén a gyakorlatvezető engedélyével lehet tenni. A projekt eredményesnek bizonyul, ha specifikáció helyes és határidőn belül készül el. Az esetleges késések pontlevonást eredményeznek.
Az elfogadás feltételeire és beadás formájára vonatkozó részletes leírás a következő honlapon olvasható: https://okt.sed.hu/rf1/

### 7.5. Státuszjelentés

Minden leadásnál a projektmenedzser jelentést tesz a projekt haladásáról, és ha szükséges változásokat indítványoz a projektterven. Ezen kívül a megrendelő felszólítására a menedzser 3 munkanapon belül köteles leadni a jelentést. A gyakorlatvezetővel folytatott csapatmegbeszéléseken a megadott sablon alapján emlékeztetőt készít a csapat, amit a következő megbeszélésen áttekintenek és felmérik az eredményeket és teendőket. Továbbá gazdálkodnak az erőforrásokkal és szükség esetén a megrendelővel egyeztetnek a projektterv módosításáról.

## 8. A munka tartalma

### 8.1. Tervezett szoftverfolyamat modell és architektúra

 A szoftver fejlesztése során az agilis fejlesztési modellt alkalmazzuk. A fejlesztés során nagy hangsúlyt fektetünk a folyamatos kommunikcióra. A fejlesztés során a szoftver specifikációi rugalmasan vátozhatnak, és ezzel a módszertannal tudunk a leggyorsabban alkalmazkodni az új elvárásokhoz. 

### 8.2. Átadandók és határidők
A főbb átadandók és határidők a projekt időtartama alatt a következők:


| Szállítandó |                 Neve                                          |   Határideje  |
|:-----------:|:-------------------------------------------------------------:|:-------------:|
|      D1     |                    Projektterv és útmutató                    |  2022-10-11   |
|      D2    |                UML, adatbázis és képernyőtervek               |  2022-10-24   |
|    P1+D3    |              Prototípus, tesztelési dokumentáció              |  2022-11-13   |
|    P2+D4    |      Végleges program, frissített tesztelési dokumentáció     |  2022-11-27   |


## 9. Feladatlista

A következőkben a tervezett feladatok részletes összefoglalása található.


### 9.1. Projektterv (1. mérföldkő)

Részfeladatai a következők:

#### 9.1.1.  Projektterv kitöltése 

Felelős: Gál Eszter

Tartam:  1 nap

Erőforrásigény:  1 személynap

### 9.2. UML és adatbázis tervek (2. mérföldkő)

Részfeladatai a következők:

#### 9.2.1.  Use Case diagram 

Felelős: Fábián Csongor

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.2.2.  Class diagram 

Felelős: Bakhit Patrik

Tartam:  1

Erőforrásigény:  1 személynap


#### 9.2.3.  Sequence diagram 

Felelős: Fekete Marcell

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.2.4.  Egyed-kapcsolat diagram adatbázishoz 

Felelős: Gál Eszter

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.2.5.  Package diagram 

Felelős: Szelekovszky Balázs

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.2.6.  Képernyőtervek 

Felelős: Polyák Máté

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.2.7. Felhőszolgáltatás konfigurálása

Felelős: Marton Pál

Tartam:  2 nap

Erőforrásigény:  2 személynap


### 9.3. Prototípus I. (3. mérföldkő)

Részfeladatai a következők:

#### 9.3.1 Adatbázis létrehozása

Felelős: Marton Pál

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.2 Navbar GUI

Felelős: Polyák Máté

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.3. Bejelentkezés GUI

Felelős: Fekete Marcell

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.4. Bejelentkezés ellenőrzése, felhasználó továbbléptetése

Felelős: Fekete Marcell

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.5. Regisztráció GUI

Felelős: Fábián Csongor

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.6. Regisztráció ellenőrzése, feltöltés adatbázisba

Felelős: Fábián Csongor

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.7. Hír felület létrehozása

Felelős: Gál Eszter

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.8. Profilszerkesztés GUI

Felelős: Gál Eszter

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.9. Profilszerkesztés ellenőrzése, adatok módosítása

Felelős: Bakhit Patrik

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.10. Admin GUI

Felelős: Polyák Máté

Tartam:  2 nap

Erőforrásigény:  2 személynap/fő


#### 9.3.11. Admin jogosultság: Felhasználó törlése

Felelős: Szelekovszky Balázs

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.12. Admin jogosultság: Felhasználó jogosultságának módosítása

Felelős: Bakhit Patrik

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.13. Admin jogosultság: Hírek hozzáadása

Felelős: Fekete Marcell

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.14. Admin jogosultság: Hír szerkesztése

Felelős: Fábián Csongor

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.15. Admin jogosultság: Hír törlése

Felelős: Marton Pál

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.16. Kezdőlap létrehozása

Felelős: Polyák Máté

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.17. Hozzászólás GUI

Felelős: Szelekovszky Balázs

Tartam:  2 nap

Erőforrásigény:  2 személynap


#### 9.3.18. Hozzászólás ellenőrzése, feltöltés adatbázisba

Felelős: Bakhit Patrik

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.19. Saját hozzászólás törlése

Felelős: Marton Pál

Tartam:  1 nap

Erőforrásigény:  1 személynap


#### 9.3.20. Admin jogosultság: Hozzászólás törlése

Felelős: Bakhit Patrik

Tartam:  1 nap

Erőforrásigény:  1 személynap

#### 9.3.21. Tesztelési dokumentum (TP, TC)

Felelős: Marton Pál

Tartam:  1 nap

Erőforrásigény:  1 személynap


### 9.4. Prototípus II. (4. mérföldkő)

Részfeladatai a következők:

#### 9.4.1. Felhasználói munkamenet tesztelése 

Felelős:  Gál Eszter 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 


#### 9.4.2. Hírek kezelésének tesztelése

Felelős:  Marton Pál 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 


#### 9.4.3. Olvasói felület tesztelése

Felelős:  Polyák Máté 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 


#### 9.4.4. Hír írására szolgáló űrlap tesztelése

Felelős:  Szelekovszky Balázs 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 


#### 9.4.5. Adminisztrátori jogosultságok tesztelése

Felelős:  Bakhit Patrik 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 


#### 9.4.6. Keresés tesztelése

Felelős:  Fábián Csongor 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 


#### 9.4.7. Felhasználói adatbázis ellenőrzése

Felelős:  Fekete Marcell 

Tartam:   1 nap 

Erőforrásigény:   1 személynap 

## 10. Részletes időbeosztás


![Alt text](diagramok/gantt.png?raw=true "Gantt-diagram")



## 11. Projekt költségvetés


### 11.1. Részletes erőforrásigény (személynap)


|                     Név                    | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:---------:|
|                      Bakhit Patrik         |            1           |              1             |            5           |             1            |     8    |
|                      Gál Eszter            |            1           |              1             |            4           |             1            |     7    |
|                      Fábián Csongor        |            1           |              1             |            5           |             1            |     8    |
|                      Marton Pál            |            2           |              2             |            5           |             1            |     9    |
|                      Fekete Marcell        |            1           |              1             |            5           |             1            |     8    |
|                      Polyák Máté           |            1           |              1             |            4           |             1            |     7    |
|                      Szelekovszky Balázs   |            1           |              1             |            4           |             1            |     7    |

### 11.2. Részletes feladatszámok

|                     Név                    | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:---------:|
|                      Bakhit Patrik         |            1           |              1             |            4           |             1            |     7    |
|                      Gál Eszter            |            1           |              1             |            2           |             1            |     5    |
|                      Fábián Csongor        |            1           |              1             |            3           |             1            |     6    |
|                      Marton Pál            |            2           |              1             |            4           |             1            |     7    |
|                      Fekete Marcell        |            1           |              1             |            3           |             1            |     6    |
|                      Polyák Máté           |            1           |              1             |            3           |             1            |     6    |
|                      Szelekovszky Balázs   |            1           |              1             |            2           |             1            |     5    |

### 11.3. Részletes költségvetés

|                     Név                       | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:---------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:---------:|
|        Maximálisan választható pontszám %-ban |         10% (7)        |            30% (21)        |          50% (35)       |          30% (21)        | 100% (70) |
|                      Bakhit Patrik         |            7           |              15             |            33           |             15            |     70    |
|                      Gál Eszter            |            7           |              15             |            33           |             15            |     70    |
|                      Fábián Csongor        |            7           |              15             |            33           |             15            |     70    |
|                      Marton Pál            |            7           |              15             |            30           |             15            |     70    |
|                      Fekete Marcell        |            7           |              15             |            33           |             15            |     70    |
|                      Polyák Máté           |            7           |              15             |            33           |             15            |     70    |
|                      Szelekovszky Balázs   |            7           |              15             |            33           |             15            |     70    |
Szeged,  2022-10-04 .
