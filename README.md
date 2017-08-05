# SocialCoding
This Repository contains impressions and advices from the course Social Coding at the TH Koeln.

Das Repository enthält meine Eindrücke aus dem WPF Social Coding SS17 an der TH Köln.
Im folgenden werden die einzelnen Termine chronologisch abgehandelt.

## 0 Kickoff
Vorneweg ist zu sagen, dass ieser Termin, wie einige der folgenden auch, unvollständig ist. Das liegt daran, dass zu exakt dieser Zeit,
wichtige Feedback-Termine vom Modul EIS, welches als Pflichtmodul mit 10 Credit Points natürlich Vorrang hatte, abgehalten wurden.

### Begrüßung durch Dirk
Da ich zu Anfang noch fehlte, müssen die Erzählungen der anderen herhalten. Dirk stellte sich vor, erzählte seinen Werdegang
und seine aktuellen Tätigkeiten.

### Vorstellungsrunde
Auch hier war ich noch nicht da, sodass ich die anderen Kommilitonen nur bedingt kannte. Im Nachhinein fällt mir auf,
dass ich nie nachgefragt habe und mir alle Infos, die ich über Dirk und die Anderen habe, nur aus dem Kontext späterer
Gespräche erschließen konnte.

**In Zukunft sollte ich Wert darauf legen, Kommilitonen und andere Kollegen möglichst kennenzulernen.**

### Themen
Nachdem ich endlich eintraf, durfte ich mich noch kurz vorstellen. Ich erzählte das Übliche und gab auch an, dass Social Coding nur als
Plan B diente, sollte ich den anderen WPFs keinen Platz kriegen. Aber das für Drik keinn Problem.

Die Themen waren dem WPF-Namen entsprechend. Github, Usergroups, TDD. Generell vieles, was man als Entwickler im Beruf gehört haben sollte
und am besten regelmäßig verwendet. Generell ahnt man das Motto des WPFs: über den Tellerrand schauen.

## 1 Github
Wie bereits erwähnt, kam ich auch hier zu spät wegen EIS.

### Git
Git ist ein **D**istributed **V**ersion **C**ontrol **S**ystem. Anstatt git von Grund auf zu erklären, werde ich nur über
das sprechen, was noch nicht in WBA gelehrt wurde.

Neu waren einige Befehle wie '-git reset' oder '-git stash'. Generell wurde uns deutlich gemacht, zu wieviel man mit git in der Lage ist. Die Benutzung in WBA beschränkte sich noch auf git als shared Workspace und Leistungsnachweiß (durch Commit History).

### Github
Bei Github war es das gleiche Schema. In WBA blieben wir nur auf der Oberfläche. Issues, Pull Request und Projects waren uns völlig
fremd, ebenso wie das Sperren des Masterbranches.

**Ich sollte den Masterbranch beim nächsten Gruppenprojekt sperren um alle Teilnehmer zu "zwingen" auch wirklich Kapselung und
Versionierung zu nutzen.**

Da ich erst zu diesem Zeitpunkt kam, konnte ich erst ab hier die Übungen mitmachen. Es ging darum selber einmal ein Repo zu forken und
einen Pull Request zu stellen. Im Plenum haben wir dann die einzelnen Pull Requests abgearbeitet um zu zeigen welche Möglichenkeiten
man bei der Bearbeitung hat.

### Markdown
Markdown ist eine Auszeichnungssprache, die im Gegensatz zu HTML die Lesbarkeit kaum beeinträchtigt. So kann man zwar mit dem richtigen
Interpreter einen formatierten Text anzeigen lassen, jedoch ist der Text auch ohne Interpreter, zum Beispiel in Wordpad, noch sehr
gut lesbar. Da Markdown auf komplizierte Auszeichnungen verzichtet, ist es auch ein Stück weit eingeschränkter als HTML.

## 2 Contributing
Leider konnte ich diesen Termin durch EIS garnicht erst wahrnehmen. Dadurch habe ich nur bedingt mitbekommen was gesagt wurde, aber
ich weiß was die Aufgabe war.

### Mein Contribute
Da ich bei Termin nicht da war, hatte ich nur ein sehr loses Verhältnis zur Aufgabe, wenig Lust darauf und dank EIS eine gute
Ausrede. Am Ende des Semesters würde mir noch ausreichend Zeit bleiben irgendwo mitzuhelfen. Ich lag weit daneben.
In der letzten Woche vor der Abgabe angekommen, viel es mir zunehmend schwer, etwas zu finden an dem ich "einfach so" halfen konnte.
Mir war auch langsam klar wie die Aufgabe wohl eigentlich gestellt war, nämlich über das Semester hinweg bei etwas mitarbeiten und dann
etwas comitten und nicht mal eben schnell das Wiki anpassen. Leider war es dann schon zu spät. Ich guckte mir die Contribution von
einem Kommilitonen an, der eine Wikiseite anlegte und kam auf eine Idee. Die Wikiseiten waren komplett ohne Erklärung. Als Analogie
könnte die Wikipediaseite des Brandenburger Tors, auf der nur ein entsprechendes Bild und eine Anfahrtsbeschreibung stehen, dienen.
Ich entschloss mich also diese Wikiseite mit etwas Kontext und Erklärung zu füllen.

War ich damit zufrieden? - Nein.
War die Aufgabe damit erfüllt? - Nicht wirklich.

Doch ich konnte ruhigen Gewissens weiter machen, in der Gewissheit, schon einmal Jemadem 3 Zeilen Wiki verfasst zu haben.

### Fazit
Das Contributing ist garnicht so einfach. Es erfordert meist viel Arbeit und Hingabe, sich in fremde Projekte einzuarbeiten, zumal es
gewisse Workflows und Regeln zu beachten gibt. Man sollte aber keine Angst vor Fehlern haben. Durch Peer Review kommen eigene Fehler
nicht in den Code.

Ich kann auch zunehmend verstehen, wieso potentielle Arbeitgeber auch auf den Github Account schauen. Denn neben den Arebitsproben
wirkt das Contributen für mich fast wie das Ehrenamtliche Arbeiten in Sozialen Studienfächern.

## 3 Deployment
Beim insgesamt vierten Termin sollten wir einen nginx Server aufsetzen. Dafür hatte Dirk schon passende Server bei Digital Ocean aufgesetzt, auf denen wir noch nginx zum laufen kriegen sollten. Das Lernziel war dabei nicht in erster Linie, wie man einen nginx Server aufsetzt, sondern wie man sich in neue Themen einarbeitet und, dass man die jeweiligen Dokumentationen und Resourcen lesen, verstehen und anwenden kann.

### Ablauf
Nachdem wir uns einen Server ausgesucht haben, haben wir uns via ssh mit dem Server verbunden. Als erstes wurde ein neuer User mit Rootrechten angelegt. Danach galt es die unsichere Authentifizierung über Credentials mit der sichereren Authentifizierung via keystore einzurichten. In Windows verlief es so:

1. Über den Java Key Generator ein neues Schlüsselpaar anlegen und benennen.

2. Public Key auf den Server ziehen.

3. Key Authentifizierung aktivieren.

4. Authentifizierung testen.

5. Bei Erfolg die default Authentifizierung abstellen.

Sobald der Server eingerichtet war, ging es darum, den nginx Server aufzusetzen, Ports einzustellen und Serverblocks aufzusetzen.
Ich selber habe nur strikt nach Dokumentation gearbeitet und bin aus dem Kopf auch nicht mehr in der Lage, die einzelnen Schritte auszuführen. Das zeigt jedoch auch, dass das Lernziel erfüllt worden ist.

## 4 Usergroup
Im Sinne des Social Codings wollte uns Dirk eine wichtige Komponente im Austausch mit Kollegen zeigen. Usergroups.
Dafür sind sollten wir an einem Freitag an einem solchen Treffen des [DevHouse Friday Meetup](https://www.meetup.com/DevHouseFriday-Chillout/events/238182514/) im Kölner Mediapark teilnehmen. Wer genau mitkommen würde, war noch unklar, deshalb sprach ich mit [@Fabian](https://github.com/fafuuu), schnappte mir noch einen anderen Kommilitonen und letzten Endes waren auch nur wir drei da. An dem Abend sollte es drei Vorträge geben:

1. Retro-Konsolen-Modding von Christof Harnischmacher  
2. Wirklichkeitssteuerung von [Andreas Streichardt](https://twitter.com/m0ppers)       
3. TLS, CRTs und CAs - Eine Übersicht von Philipp Hocke

### Dreamcast Modding
In seinem Vortrag erzählte Christof davon, wie er eine Sega Dreamcast Konsole so umbaute, dass sie einen HDMI Ausgang aufweist.
Er berichtete von allerlei Schwierigkeiten die ihm begegneten, verschiedene Videosignale, das Anzapfen von Signalpins, falsche Clockzeiten usw. Das war, um es schonmal vorwegzunehmen, der spannendste Vortrag. Zum einen wegen seiner technischen Tiefe, von der ich letztlich nur zwei Drittel wirklich verstanden habe, zum anderen weil Christof am besten seine Begeisterung für das Thema übermitteln konnte.

### Wirklichkeitssteuerung
Im zweiten Vortrag ging es um ein zum Amigacontroller umfunktioniertes Motorrad. Dazu wurde in das Motorrad ein Gyroskop eingebaut und die Wartungsschnittstelle abgehört. Beides lief in einem Raspberry Pi zusammen. Auch wenn die Idee spannnend war, so verlor sie für mich viel Reiz, weil der Controller durch Inputverzögerung und begrenzten Neigungswinkel nicht wirklich benutzbar war. Zusatzlich zum Controller zeigte Andreas wie er sich und das Motorrad in des Spiel programmierte und erklärte so, wie die Bitmaps des Amiga funktionierten. Das hob den Vortrag nochmal an.

### Probleme von CAs
Als Letztes zeigte Phillip, was er herausgefunden hatte als er sich mit TLS und CAs beschäftigt hatte. Nämlich, dass Zertifikate bei weitem nicht so sicher sind wie viele denken. Das Liegt damit zusammen, dass viele CAs zu lasch Zertifikate rausgeben. Als Beispiel nannte er [Let's encypt](https://letsencrypt.org/). Generell hatte dieser Vortrag eher einen Diskussionscharakter. Kollegen aus dem Publikum merkten zum Beispiel an, dass [Let's encypt](https://letsencrypt.org/) gar nicht zur Authentifizierung offizieller Websites gedacht ist, sondern einzig dazu, allen Websites Zertifikate zu ermöglichen, da diese für HTTPS gebraucht werden. Phillip stimmte dem zu, hob aber auch hervor, dass dadurch das grüne Schloss vor der URL kein Zeichen für unbedingte Sicherheit ist, wie viele Programmierer etwas lapidar ihren Domänenfremden Bekannten raten. Dabei schwang auch etwas Selbstkritik mit. Der Vortrag war zwar nicht spannendste, aber der aufschlussreichste.

## 5 Vorträge 1
Ganz egal ob im Studium, Job oder bei der Usergroup, Vorträge begegnen einem Entwickler immer wieder. Glücklich ist der, der sie beherrscht. Und da man glücklicherweise das Erarbeiten von Vorträgen und das Vortragen selber üben kann, tun wir das auch bei jeder Gelegenheit. Termin 6 galt als Vorbereitung und bei Termin 7 wurden die Präsentationen dann abgehalten.
Wir durften uns ein Thema aussuchen und hatten generell nur wenig einschränkungen

### Vorbereitung
Da ich mich privat seit einigen Wochen mit den Karrierechancen bei der Bundeswehr beschäftigt habe, wollte ich die Erkenntnisse und ersten Ansatzpunkte gerne auch mit den Anderen teilen. Wichtig war mir dabei, Nicht die Bundeswehr als solche Vorzustellen sondern was sie für uns Informatiker bedeutet. Auch einen Vergleich zwischen Streitkräften als Arbeitgeber und freier Wirtschaft habe ich versucht, was jedoch nicht so gut geklappt hat. Das lag vor allem daran, dass verlässliche Zahlen in der freien Wirtschaft nur schwer zu bekommen sind. Das Gehalt zum Beispiel wird von zu vielen Faktoren beeinflusst.
Meinem Anspruch das Ganze nicht als Rekrutierungsvortrag zu vermüllen oder zu entschieden an die Bewertung heranzugehen, wurde ich gerecht. Alles in Allem hat wohl keiner an diesem Tag seine Meinung über die Bundeswehr geändert. Doch sind alle mit weiteren Eindrücken und Hintergrundwissen aus dem Vortrag gegangen. Fazit: Nice!

Im Gespräch nach Köln konnte ich dann nochmal mit den anderen das Fazit des Vortrags konkretisieren:

** Man geht nicht als Informatiker zur Bundeswehr, weil man das Gehalt gut findet, oder gerne Krieg spielt. Sondern weil man sich mit der Bundeswehr und wofür sie zu stehen versucht identifiziert. **

## 6 Vorträge 2
An diesem Termin wurden alle Vorträge gehalten.

### F2P vs P2P
In diesem Vortrag ging es um die verschiedenen Arten von Spiele-Monetarisierung, ihre Vor- und Nachteile. Als passionierter Gamer waren natürlich kaum neue Erkenntnisse dabei, trotzdem war es schön, trotz einzelner Ungenauigkeiten, alle Informationen so gebündelt zu bekommen. Das Fazit des Vortrags lautete in etwa, dass alle Bereiche ihre schwarzen Schafe haben, die Zeiten in denen massig schlechte F2P Abzockereien auf den Markt geworfen wurden aber doch verbei sind.

### Wordpress
Beim Vortrag ging es um Wordpress und seine Vor- und Nachteile. Gut fand ich die detailierten Hinweise, wann man Wordpress benutzen sollte und wann nicht. Gerade bei so einer beeindruckenden Erfahrung mit Wordpress wie beim Redner ist das nicht selbstverständlich.

### Angular
Der Angularvortrag ähnelte in seiner Art dem Wordpressvortrag. Gezeigt wurden die Stärken Angulars und wofür es zum Einsatz kommt, nämlich Responsiveness und dynamische Seiteninhalte. Abgeschlossen wurde das dann durch Livecoding Beispiele. Die hatte zwar ein zwei Störungen, die der Redner aber sehr gut umschifft hat. Es war ein solider Vortrag und ein guter Grund Angular bei Gelegenheit mal auszuprobieren.

### Vim
Der letzte Vortrag ging über den Texteditor Vim. Obwohl jeder Informatiker ihn schon einmal benutzt hat, war ich völlig überrascht, welche featueres er eigntlich bietet. Gepaart mit dem sehr geringen RAM-Bedarf ist Vim eigentlich ein sehr spannendes Feld, welches mir dank des Vortrags erst aufgezeigt wurde. Und all das, obwohl der Redner nicht einmal den Commandmode erwähnt hat, der Vim eigentlich erst wirklich von der Konkurrenz abhebt.

### Bundeswehr
Über meinen eigenen Vortrag habe ich schon im vorigen Kapitel geschrieben. an dieser Stelle möchte ich nur nochmal die PDF verlinken.

## 7 Beruf, Patches und TDD
Der letzte Termin stand im zeichen von "zu wenig Zeit für alles". Wir hörten zwei Vorträge von Dirk und hatten Zeit auch alle anderen Fragen zu klären. Viele fragen kamen aber garnicht zusammen, da Fabian und ich wegen der bevorstehenden Klausuren die einzigen Anwesenden waren. 

### Beruf
Dirk zeigte viele Hinweise, Tipps und Regeln für den Berufseinstieg. Ihm war wichtig, uns kklar zu machen, dass auch Berufseinsteiger Rechte haben, auf die man pochen muss. Auch eine gesunde Work Life Balance ist ihm wichtig. Wir sprachen unter anderem über die Einstellungsmethoden der Unternehmen und dass viele Anforderungen an Berufseinsteiger überzogen sind und dass es viele Unternehmen gibt, die eben auch anders vorgehen. Tatsächlich nahm mir das viel von meiner Angst vor dem Berufseinstieg.

### Patches und Testing
Zuerst ging es über die Struktur von Patches u.ä. Ein wichtiger Bestandteil war das Semantic Versioning, sprich die Versionierung nach dem Schema <major>.<minor>.<patch> . Wir sprachen darüber welche Änderung zu was zählt und auch, dass Semantic Versioning nur ein loses Konzept ist und man nicht darauf verlassen sollte, und immer das Änderungslog durchlesen sollte.

Danach erzählte Dirk von Testing. Damit hatten wir im Studium nur wenig Berührungspunkte. Er erläuterte den Gründe für automatisches Testing, Unit Tests, Acceptance Tests und Test Driven Design. Er forderte, dass wir 5 Snippets oder kleine Klassen selber Test Driven Implementieren. Nach Kurzer Eingewöhnungszeit lief das sehr Rund und half viele Fehler schon sehr früh abzufangen und auszubessern.

Ich entschied mich dazu mit Java und JUnit zu programmieren, was mich jedoch auch vor etliche Probleme stellen sollte. So gibt es in Java keine nested Strings wodurch eine Aufgabe so garnicht zu lösen war. 

### Pragmatic Programer
Zum Schluss kriegten wir die Aufgabe uns 10 Tipps aus dem Buch "The Pragmatic Programer" rauszusuchen. Meine sind hier zu finden:
