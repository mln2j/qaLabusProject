# QA Labus Project - Automatizirani testovi

Ovaj projekt sadrži okvir za automatsko testiranje programske podrške, temeljen na korištenju **Selenium WebDrivera** i **TestNG** za provodjenje testova na web aplikacijama. Projekt je razvijen uz korištenje Java jezika.


## Sadržaj

- [Opis](#opis)
- [Korišteni alati](#korišteni-alati)
- [Struktura projekta](#struktura-projekta)
- [Instalacija](#instalacija)
- [Pokretanje testova](#pokretanje-testova)
- [Specifičnosti](#specifičnosti)

## Opis

Projekt se temelji na automatskom testiranju web aplikacija koristeći **Selenium WebDriver** za interakciju s web stranicama i **TestNG** za organizaciju i izvještavanje o rezultatima testova. Testiranje je provedeno na web stranici [Njuškalo](https://www.njuskalo.hr/) i uključuje testiranje funkcionalnosti kao što su odabir kategorija, podkategorija i filtara na web stranici.

## Korišteni alati

1. **Selenium WebDriver**: Alat za automatsku interakciju s web stranicama, korišten za testiranje web aplikacija u preglednicima.
2. **TestNG**: Okvir za testiranje u Javi koji omogućava organizaciju i izvještavanje o testovima.
3. **Maven**: Alat za automatizaciju gradnje i upravljanje ovisnostima, korišten za konfiguraciju projekta.
4. **WebDriverManager**: Automatski upravlja verzijama WebDriver-a za različite preglednike.
5. **EdgeDriver**: WebDriver specifičan za Microsoft Edge preglednik.

## Struktura projekta


```markdown
qaLabusProject/
│  
├── src/  
│   ├── main/  
│   │   └── java/  
│   │       └── org.example/NjuskaloTest.java    # Bazna klasa za testove  
│   └── test/  
│       └── java/  
│           ├── NjuskaloCategoryTest.java  
│           ├── NjuskaloLocationFilterTest.java  
│           ├── NjuskaloLoginTest.java  
│           ├── NjuskaloSearchTest.java  
│           └── NjuskaloSubCategoryTest.java  
│   └── resources/  
│       └── testng.xml               # TestNG konfiguracija  
├── .gitignore                       # Postavke za Git  
└── pom.xml                           # Maven konfiguracija
```


## Instalacija

Za instalaciju ovog projekta potrebno je sljedeće:

1. **Preuzmite i instalirajte Javu 22**: Osigurajte da imate JDK 22 instaliran na svom računalu.

2. **Instalirajte Maven**: Ako nemate instaliran Maven, preuzmite ga sa [ovog linka](https://maven.apache.org/download.cgi) i slijedite upute za instalaciju.

3. **Preuzmite projekt sa GitHub-a**:
    ```bash
    git clone https://github.com/mln2j/qaLabusProject.git
    ```
4. **Instalirajte ovisnosti pomoću Maven-a:**  
    ```bash
   mvn install
    ```

5. **Preuzmite i instalirajte Microsoft Edge** (ako već nije instaliran) te preuzmite odgovarajući `msedgedriver.exe` za vaš Edge preglednik. Postavite putanju do EdgeDriver-a unutar koda ili EdgeDriver postavite na putanji `./drivers/msedgedriver.exe`.


## Pokretanje testova

Nakon instalacije, možete pokrenuti testove putem Maven-a.
1. Pokrenite testove koristeći Maven:  
    ```bash
   mvn test
    ```
2. Rezultate testova možete vidjeti u **target/surefire-reports** direktoriju.


## Specifičnosti

- **EdgeDriver** se koristi kao WebDriver za testiranje aplikacije na Microsoft Edge pregledniku. Provjerite da imate odgovarajuću verziju msedgedriver.exe na svom računalu.
- **Wait** naredbe: Umjesto korištenja Thread.sleep(), koristi se WebDriverWait za čekanje da se elementi učitaju, čime se osigurava stabilnost i preciznost testova.
- **.gitignore**
- **README.md**