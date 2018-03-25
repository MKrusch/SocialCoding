#Idee 1: dezentrales Eventnetzwerk

Smartphones kommunizieren in einem vordefinierten Gebiet mittels Peer-to-Peer Netzwerk. Daraus ergeben sich folgende Vorteile:

-   Keine Überlastung der Funkzelle bei räumlich kompakten Events
-   Verknüpfungsmöglichkeiten mit darauf aufbauenden Services

###Projektrahmen für EISSS18

Noch näher zu spezifizierende Endnutzergeräte bilden mittels eines Nahfunkstandards ein Peer-to-Peer Netwerk, welches darauf aufbauende Services erlaubt. Sollte das noch nicht den Anforderungen an Aufwand und Verteiltheit für EIS genügen so kann ein erster Service testweise implemtiert werden,bei dem die Endnutzergeräte ihre Position via Triangulation mit vorher festgelegten Funksendern eigenständig feststellen, um dann mit dieser Position einen Mehrwert zu generieren (Navigation über ein Messegeländ etc, Abstimmung mit ausgewählten anderen Nutzern)

###Wichtige Eckpunkte zum Projekt

- Ein denkbarer Funkstandard ist zum Beispiel [Wifi Direkt](https://de.wikipedia.org/wiki/Wi-Fi_Direct), welches standardmäßig über eine                               [Android-Library](https://developer.android.com/reference/android/net/wifi/p2p/package-summary.html) in allen gängigen Androidgeräten implementiert ist. \
**Risiko:** _Die Nutzungsmöglichkeiten der Library müssen genauer erfasst und auf das Projekt angwendet werden. Zum jetzigen Zeitpunkt besteht die Möglichkeit, dass die Library das Vorhaben gar nicht richtig unterstützt._
- Die Triangulation kann über die Signalstärke der Funksender passieren. Dafür bedarf es mindestens dreier Sender zu denen der Nutzer Funkkontakt haben muss. Über die Stärke der Funksignale, und damit einhergehend die Entfernung zu den eigentlichen Sendern, lässt sich dann die Position mittels Triangulation ermitteln. \
**Risiko:**  _Die Frage wie die die Funksender überhaupt initialisiert werden und die für die Triangulation benötigten Daten allen Endgeräten zur Verfügung gestellt werden muss noch geklärt werden und entscheidet über die wirtschaftliche Nutzbarkeit dieses Services._
