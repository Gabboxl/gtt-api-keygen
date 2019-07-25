# Introduzione

-----
Ciao! Benvenuto sul sito non ufficiale dedicato all'API (reale) nascosta di GTT (Gruppo Torinese Trasporti) utilizzata nella propria applicazione per dispositivi mobili.

Su internet, facendo una semplice ricerca, si trovano delle API NON ufficiali che utilizzano l'HTML parsing per ricavare i dati dal sito frontend di GTT.

L'HTML parsing solitamente è la tecnica di estrazione di informazioni da utilizzare quando non sono disponibili alternative, siccome anche dopo una piccola modifica grafica al sito, nella maggior parte dei casi, c'è bisogno di modificare la path (percorso) al dato da estrarre.

Convinto che l'app di GTT non utilizzasse l'HTML parsing per ricavare i dati, ho deciso di [analizzarla](https://gtt.gabboxl.ga/gtt_reverse) scoprendo l'utilizzo di una REST API nascosta al pubblico.

---

Durante la creazione di questo sito, ho deciso di analizzare il traffico dati di altre app degli orari GTT sul Play store: alcune come [questa](https://play.google.com/store/apps/details?id=it.paologodino.bustorino), ricorrono all'HTML parsing di un widget utilizzato sul sito web di 5T.

 Attirò la mia attenzione [la API](https://gtt.gabboxl.ga/API) che utilizza [questa app](https://play.google.com/store/apps/details?id=com.belandsoft.orariGTT) sviluppata da Andrea Bellito: è completamente uguale (però su un percorso diverso) a quella usata dall'app GTT ma non c'è bisogno del TOKEN per avere accesso ai dati!

Tuttavia appena avrò ottimizzato al meglio il codice di generazione del token, lascerò la repository del progetto *read-only* in favore della nuova REST API.

# Documentazione

Il sito si divide in diverse sezioni: (*puoi accederci cliccandoci sopra*)

* [Reverse Engineering dell'app GTT](https://gtt.gabboxl.ga/gtt_reverse)

* <a href="https://gtt.gabboxl.ga/API" name="api_endpoints">Documentazione dell'API e degli endpoint scoperti dall'analisi dell'app GTT</a> (<b>sono gli stessi disponibili per la versione senza TOKEN</b>)

* [Documentazione](https://github.com/Gabboxl/gtt-api-keygen/blob/master/README.md) del programma [gtt-api-keygen](https://github.com/Gabboxl/gtt-api-keygen): software principale che permette la creazione di "token" per accedere all'API di GTT


---

P.S. se hai consigli su un'organizzazione migliore delle informazioni, puoi creare un "issue" su Github oppure creare una PR (miraccomando branch gh-pages)!
