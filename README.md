# gtt-api-keygen
Generatore di token per accedere alla API nascosta di GTT



## Endpoint (o nodi) disponibili
Questi sono i nodi scoperti finora analizzando l'applicazione: 

*API:* http://www.5t.torino.it/proxyws

Endpoints: https://gtt.gabboxl.ga/API

 **ATTENZIONE: per il momento è impostata la generazione di token sontanto per l'endpoint** */ws2.1/rest/stops/XXX/departures* **, nel futuro verrà implementato un metodo di scelta degli endpoint.**

Per ora, se vuoi utilizzare un endpoint a tuo piacere, devi modificare il seguente blocco di codice (nella classe Main, funzione main) contenente la chiamata al metodo **m1260a** sostituendo l'unico parametro disponibile (l'endpoint) con quello desiderato. 

*esempio per l'endpoint* "**/ws2.1/rest/parks/all**":
```java
a = Main.m1260a("/ws2.1/rest/parks/all");
```

## Come si usa?
*Se non hai voglia di compilarti da solo il programma, puoi ottenere la versione .jar da qua:* https://github.com/Gabboxl/gtt-api-keygen/releases/latest

Puoi avviare il programma così: `java -jar gtt-keygen.jar XXX`,  dove XXX è il numero della fermata.

Ti verranno restituiti tre valori: apiName, TOKEN e TIMESTAMP.

Dovrai effettuare una richiesta HTTP di tipo GET al sito: http://5t.torino.it/proxyws **+ apiName** (*esempio:* `http://5t.torino.it/proxyws/ws2.1/rest/stops/XXX/departures`)
CON gli header TOKEN e TIMESTAMP con i rispettivi valori.

Dopo aver inviato la richiesta, vi verranno restituiti i dati.

**ATTENZIONE:** Dopo vari test, è emerso che il token generato è **TEMPORANEO** e vale **SOLTANTO** per la fermata/endpoint impostati al momento della generazione, pertanto se il server non restituisce dati, probabilmente sarà necessario generare un nuovo token per la relativa fermata/endpoint.


## Roadmap
La roadmap del progetto è disponibile [qui!](https://github.com/Gabboxl/gtt-api-keygen/projects/1)

-----

# Come funziona tutto ciò? Come lo hai scoperto?
Tutto quello che devi sapere è (e sarà) scritto qui: https://gtt.gabboxl.ga
