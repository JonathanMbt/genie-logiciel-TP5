# RemindME

TP Intégration des compétences dans le cadre du cours de Génie Logiciel (Polytech Angers, M. Delanoue).

### Compiler le projet:
Se placer dans le répertoire src, puis: 
```bash
javac myPackage/Main.java -d ../bin
```

### Lancer le projet:
Se placer dans le répertoire bin: 
```bash
java myPackage/Main
```


### Compiler les tests unitaires:
Se placer dans le répertoire src, puis: 
```bash
javac -cp "<path_to_junit>;<path_to_harmcrest>;<path_to_bin>;" <path_to_test_files> -d <outDir>
```

### Lancer les tests:
Se placer dans le répertoire bin: 
```bash
java -cp "<path_to_junit>;<path_to_harmcrest>;<path_to_bin>;" tests/MyTestSuite1Runner
```

### Créer une archive JAR:
Avoir au préalable compilé les fichiers sources.

Se placer dans le répertoire bin.

Créer un fichier manifest.txt dans le dossier myPackage.

Créer l'archive, depuis le répertoire bin: 
```bash
jar cfm banque.jar myPackage/manifest.txt myPackage/*.class
```

### Lancer le projet (depuis l'archive jar):
Se placer dans le répertoire bin, puis: 
```bash
java -jar banque.jar
```

© Jonathan Mabit - Niels Petersen 2021
