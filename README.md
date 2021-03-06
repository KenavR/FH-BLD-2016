# Big and Linked Data Assignments

# Data	Engineering
## Assignment	1: Big	Data in	Ihrem	Umfeld
### 1.1
_Schauen Sie sich in Ihrem Umfeld um. FH Technikum oder Ihr Job. Nennen Sie mindestens ein
Beispiel für Daten, die schemalos (unstrukturiert) sind und mindestens ein Bespiel für Daten, die
strukturiert (schematisch) sind._

**Unstrukturierte Daten**
* Logfiles
* Chat Messages

**Strukturierte Daten**
* Persönliche Daten (Name, Alter, Adresse, ...)

### 1.2
_Nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die gestreamt verarbeitet werden, nennen Sie ein
Beispiel für Daten in Ihrem Umfeld, die über Batchverarbeitung verarbeitet werden._

**Gestreamte Daten**
* Infrastruktur Überwachung (Logging)
* Diverse Realtime events welche am Front end ausgelöst werden 

**Batchverarbeitete Daten**
* SQL und System Backups werden Dateiweise kopiert und auf ein Band geschrieben

## Assignment	2: Big	Data in	Ihrem	Umfeld
_Entscheiden Sie sich für eine Data Engineering Plattform. Apache Flink oder Apache Spark.
Installieren Sie die auf Ihrem Arbeitsgerät._
### Erklären Sie ihre Entscheidung
Ich habe mich für Apache Spark entschieden, da mir dieses Produkt in div. Podcasts und Blogpost mehrmals untergekommen ist, wohingegen ich von Flink bisher recht wenig gehört habe. Nach meiner Recherche nehme ich zwar an dass dies fast ausschließlich dem Alter der beiden Technologien geschuldet ist, aber es scheint als wäre Spark auch noch in den nächsten paar Jahren das weiter verbreitete Produkt.
### Schicken Sie einen Screenshot der installierten Umgebung mit
![console](https://raw.githubusercontent.com/KenavR/FH-BLD-2016/master/console.png)
![spark](https://raw.githubusercontent.com/KenavR/FH-BLD-2016/master/spark.png)
### Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen würden (z.B: IDE)
Als Fan der IntelliJ Produkte wurde IDEA 15 für Java inkl. Maven verwendet.

## Assignment	3: Big	Data in	Ihrem	Umfeld
_Schreiben Sie ein simples Program mit dem Framework (z.B. Helloworld) und laden Sie es hoch._
### Ausführbares Programm
https://github.com/KenavR/FH-BLD-2016/tree/master/spark-example

![ide](https://raw.githubusercontent.com/KenavR/FH-BLD-2016/master/ide.png)

# Data	Science
## Assignment	1: Technologien
### 1.1
_Sie haben in der LVA zwei Frameworks kennengelernt (R und Python). Nennen Sie zwei weitere
Technologien, um Daten zu analysieren (müssen nicht open source sein)_

* [Torch](http://torch.ch/)
> Torch is a scientific computing framework with wide support for machine learning algorithms that puts GPUs first. It is easy to use > and efficient, thanks to an easy and fast scripting language, LuaJIT, and an underlying C/CUDA implementation.

* [Julia](http://julialang.org/)
> Julia is a high-level, high-performance dynamic programming language for technical computing, with syntax that is familiar to users > of other technical computing environments.

Quelle: [Quora -What are the alternatives to R?](https://www.quora.com/What-are-the-alternatives-to-R) 
### 1.2
_Sie bekommen den Auftrag, mit einer Data Science Technologie zu arbeiten. Nennen Sie eine
Technologie, die ihnen auf dem ersten Blick am besten für Sie erscheint und begründen Sie das!_

Ignoriert man die Anforderungen und das bereits vorhandene Wissen im Team, würde ich mit Python beginnen. Zum einen habe ich bereits etwas Erfahrung mit dieser Sprache und zum anderen ist es eine gute Grundlage um schnelle Ergebnisse zu erzielen und dem Management vorzulegen. Steigt die fachliche oder personelle Komplexität des Projekts würde ich zu einer strictly typed (Java) oder funktionellen (Scala) Technologie tendieren.

## Assignment	2: Technologien
_Entscheiden Sie sich für eine Data Science Plattform. R oder Python
Installieren Sie die auf Ihrem Arbeitsgerät._

**Begründen Sie ihre Entscheidung (Warum ziehen Sie persönlich aus ihrer Ausgangssituation die eine Technologie der anderen vor).**

Da ich vor einiger Zeit einen MOOC Kurs absolviert habe welche in Python unterrichtet wurde, habe ich auch hier Python verwendet. Auch wenn ich nicht mehr viel davon weiß, habe ich Python als sehr schnell zu erlernende und effiziente Sprache in Erinnerung.

**Schicken Sie einen Screenshot der installierten Umgebung mit**
![python](https://raw.githubusercontent.com/KenavR/FH-BLD-2016/master/python.png)
![py_vscode](https://raw.githubusercontent.com/KenavR/FH-BLD-2016/master/py_vscode.png)

**Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen (z.B. IDE)**

Für komplexe Projekte würde ich wohl IntelliJ's Python IDE - PyCharm verwenden, aber bei simplen Skripts bevorzuge ich einen lightweight Texteditor wie Visual Studio Code, Atom oder Sublime mit den für alle vorhandenen Python Plugin.

## Assignment	3: Big	Science
_Der Cheatsheet auf http://scikit-learn.org/stable/tutorial/machine_learning_map/ ist eine einfache
Anleitung, wie man den richtigen Algorithmus zum richtigen Data Science Problem findet.
Schauen Sie in Google nach und lernen Sie classificatiom, regression, clusting und dimensional
reduction unterscheiden.
Nennen Sie ein Beispiel aus ihrem Umfeld, wo Sie mit dem Algorithmus zu tun haben. Das kann ein
Beispiel sein, wie: Wenn Sie bei Amazon einkaufen. Wenn Sie von einem Marketinginstitut angerufen
werden, etc._

### Classification
Classification ist ein wichtiger Teil des Maschine Learning bei dem Daten aufgrund zuvor gelernter Kriterien aus einem Testsample in Kategorien/Klassen eingeteilt werden. Je größer das Sample oder je länger das System im Betrieb ist, desto besser ist die automatische Kategorisierung. Beispiel: Kategorisierungsalgorithmen (Spam, Werbung, Sovcial Media,...) bei div. E-Mail Providern.

### Regression
Regression wird verwendet um Beziehungen zwischen abhängigen und unabhängigen Variablen zu modellieren. Die wohl wahrscheinlich bedeutensten Algorithmen sind Ordinary Least Squares Regression (OLSR), Linear, Stepwise und Logistic Regression. Beispiel: Wahlanalysen basierend auf Geschlecht, Kaufkraft, Ausbildung.

### Clustering
Beschreibt das sinnvolle Zusammenfassen von Daten die eine große Ähnlichkeit miteinander haben. Es ist ein wichtiger Bestandteil des Datenminings zur späteren Analyse. (Nicht Hypothesen testen) Als Beispiel kann hier gezielte Werbung und Marketing genannt werden. Je nach Gruppe sieht der User unterschiedliche Werbung im Browser.

### Dimensional Reduction
Die Dimensional Reduction beschreibt einen Prozess welcher ein Datenset reduziert in dem für die Analyse "irrelevante" Dimensionen entfernt bzw. nicht weiter berücksichtigt werden. Damit sind auch darauffolgende Classification oder Regression leichter und schneller möglich. Zum Beispiel ist für die Klassifizierung von E-Mails die Zieladresse oder der Timestamp nicht relevant.
