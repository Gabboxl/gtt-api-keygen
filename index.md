# Introduzione

Ciao! Benvenuto sul sito non ufficiale dedicato all'API (reale) nascosta di GTT (Gruppo Torinese Trasporti) utilizzata nella propria applicazione per dispositivi mobili.

Su internet, facendo una semplice ricerca, si trovano delle API non ufficiali che utilizzano l'HTML parsing per ricavare i vari dati dal sito frontend di GTT.

L'HTML parsing solitamente è la tecnica di estrazione di informazioni a cui ricorrere quando non sono disponibili alternative, siccome anche dopo una piccola modifica grafica al sito potrebbe essere necessaria la modifica del percorso che punta al dato da estrarre.

Convinto che l'app di GTT non utilizzasse la suddetta tecnica per ricavare i dati, ho deciso di [analizzarla](https://gtt.gabboxl.ga/gtt_reverse) scoprendo l'utilizzo di una REST API nascosta al pubblico utilizzabile soltanto via un "token" generato dall'app.

<br>

---

<br>

Durante la creazione di questo sito, ho deciso di analizzare altre app degli orari GTT **non ufficiali** sul Play Store: alcune come [questa](https://play.google.com/store/apps/details?id=it.paologodino.bustorino), ricorrono all'HTML parsing di un widget utilizzato sul sito web di 5T.

Attirò invece la mia attenzione [questa app](https://play.google.com/store/apps/details?id=com.belandsoft.orariGTT), sviluppata da Andrea Bellitto: la API utilizzata è letteralmente la stessa, ma su un persorso diverso.
L'unica differenza sostanziale, è che eroga i dati anche senza autenticazione!



Perciò in favore della nuova REST API senza "autenticazione", l'utilità del progetto [gtt-api-keygen](https://github.com/Gabboxl/gtt-api-keygen) diventa pari a zero. (Non si spiega perchè l'applicazione ufficiale di GTT non utilizzi questa versione della API - si sarebbero risparmiate linee di codice inutili!)

Per il momento ho deciso di continuare a documentare i vari nodi della API su questo sito visto l'assenza di una documentazione ufficiale dettagliata.
Per quanto riguarda il keygen, se dovesse tornare utile sarò qui per contribuire al suo sviluppo!

<br>

# Documentazione

Il sito si divide in diverse sezioni: (*puoi accederci cliccandoci sopra*)

* [Reverse Engineering dell'app GTT](https://gtt.gabboxl.ga/gtt_reverse)

* <a href="https://gtt.gabboxl.ga/API" name="api_endpoints">Documentazione dell'API e degli endpoint scoperti dall'analisi dell'app GTT</a> (<b>sono gli stessi disponibili per la versione senza autenticazione</b>)

* [Documentazione](https://github.com/Gabboxl/gtt-api-keygen/blob/master/README.md) del programma [gtt-api-keygen](https://github.com/Gabboxl/gtt-api-keygen): software principale che permette la creazione di "token" per accedere all'API di GTT con autenticazione.


---

P.S. se hai consigli su un'organizzazione migliore delle informazioni, puoi creare un "issue" su Github oppure una PR (miraccomando branch gh-pages)! (Questo sito web verrà presto spostato in una repository dedicata.)
