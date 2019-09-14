# Introduzione

-----
Ciao! Benvenuto sul sito non ufficiale dedicato all'API (reale) nascosta di GTT (Gruppo Torinese Trasporti) utilizzata nella propria applicazione per dispositivi mobili.

Su internet, facendo una semplice ricerca, si trovano delle API NON ufficiali che utilizzano l'HTML parsing per ricavare i dati dal sito frontend di GTT.

L'HTML parsing, solitamente, è la tecnica di estrazione di informazioni a cui ricorrere quando non sono disponibili alternative, siccome anche dopo una piccola modifica grafica al sito, nella maggior parte dei casi, bisogna ricorrere alla correzione del persorso al dato da estrarre.

Convinto che l'app di GTT non utilizzasse la suddetta tecnica per ricavare i dati, ho deciso di [analizzarla](https://gtt.gabboxl.ga/gtt_reverse) scoprendo l'utilizzo di una REST API nascosta al pubblico utilizzabile via un "token" generato dall'app.

---

Durante la creazione di questo sito, ho deciso di analizzare altre app degli orari GTT sul Play store: alcune come [questa](https://play.google.com/store/apps/details?id=it.paologodino.bustorino), ricorrono all'HTML parsing di un widget utilizzato sul sito web di 5T.

 Attirò invece la mia attenzione [questa app](https://play.google.com/store/apps/details?id=com.belandsoft.orariGTT), sviluppata da Andrea Bellito: la API utilizzata è letteralmente la stessa, ma su un persorso diverso.
 L'unica differenza sostanziale, è che eroga i dati anche senza autenticazione!

Tuttavia appena avrò ottimizzato al meglio il codice di generazione del token, lascerò la repository del progetto *read-only* in favore della REST API senza autenticazione.

# Documentazione

Il sito si divide in diverse sezioni: (*puoi accederci cliccandoci sopra*)

* [Reverse Engineering dell'app GTT](https://gtt.gabboxl.ga/gtt_reverse)

* <a href="https://gtt.gabboxl.ga/API" name="api_endpoints">Documentazione dell'API e degli endpoint scoperti dall'analisi dell'app GTT</a> (<b>sono gli stessi disponibili per la versione senza autenticazione</b>)

* [Documentazione](https://github.com/Gabboxl/gtt-api-keygen/blob/master/README.md) del programma [gtt-api-keygen](https://github.com/Gabboxl/gtt-api-keygen): software principale che permette la creazione di "token" per accedere all'API di GTT.


---

P.S. se hai consigli su un'organizzazione migliore delle informazioni, puoi creare un "issue" su Github oppure creare una PR (miraccomando branch gh-pages)!
