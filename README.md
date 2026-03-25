# Wolf Ziege Kohl Problem (Java)

## Beschreibung
Dieses Projekt implementiert das klassische Logikrätsel „Wolf, Ziege und Kohl“. Ziel ist es, alle drei sicher von einem Flussufer auf das andere zu bringen, ohne dass die Ziege vom Wolf oder der Kohl von der Ziege gefressen wird.

## Regeln
Der Bauer kann nur ein Objekt gleichzeitig transportieren.
Ohne den Bauern gilt: Wolf und Ziege zusammen führen dazu, dass die Ziege gefressen wird. Ziege und Kohl zusammen führen dazu, dass der Kohl gefressen wird.

## Funktionsweise
Jede Figur wird durch eine Variable dargestellt.
0 steht für das linke Ufer, 1 für das rechte Ufer.
Nach jedem Schritt wird der Zustand ausgegeben und geprüft, ob eine Regel verletzt wurde. In diesem Fall wird das Programm abgebrochen.

## Ablauf
Ziege nach rechts.
Bauer zurück.
Kohl nach rechts.
Ziege zurück.
Wolf nach rechts.
Bauer zurück.
Ziege nach rechts.

## Ausführen
javac WolfGoatCabbage.java
java com.mycompany.wolfgoatcabbage.WolfGoatCabbage

## Voraussetzungen
Java JDK 8 oder höher
