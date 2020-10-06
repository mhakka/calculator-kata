# String Calculator kata

Pour ce test pratique, vous devez réaliser les étapes dans l’ordre indiqué et à la fin de chaque étape, enregistrer votre code dans un répertoire spécifique à l’étape. Votre code source doit être validé par des tests.

Vous pouvez réaliser autant d’étape que possible.

Assurez-vous de tester seulement des entrées valides sauf mention contraire de l’étape.

A vous de jouer !

## Etape 1
Créer une calculatrice simple avec une méthode ayant pour signature :
int ajouter(String numbers)

Cette méthode peut prendre jusqu’à 2 nombres, séparé par une virgule, et retournera leur somme.
Par exemple : « », « 1 » ou « 1,2 » en entrée
Pour une chaine vide, le résultat sera 0.
Pour la chaine « 1 », le résultat sera 1.
Pour la chaine « 1,2 », le résultat sera 3.
Astuces :
-	Démarrer avec le cas de test le plus simple d’une chaine vide puis passer au cas avec 1 puis 2 nombres
-	Se rappeler de résoudre les cas aussi simplement que possible afin de vous forcer à écrire des tests auquels vous n’auriez pas pensé
-	Se rappeler de refactoriser votre code dès que chaque test passe




## Etape 2
Modifier la méthode « ajouter » afin de gérer un nombre inconnu de nombres dans la chaine



## Etape 3
Modifier la méthode « ajouter » afin de gérer un retour chariot entre chaque nombre à la place de la virgule
- l’entrée suivante est valide : « 1\n2,3 »
- l’entrée suivante n’est pas valide : « 1,\n »





## Etape 4
Supporter différents séparateurs

### Etape 4.1 
Pour changer le séparateur, le début de la chaine contiendra une ligne séparée qui ressemble à celle-ci :  
« //[separateur]\n[nombres…] » 
Par exemple « //;\n1;2 » devrait retourner 3 avec le séparateur ‘;’
### Etape 4.2
La première ligne est optionnelle. Tous les scénarios existants doivent être supportés



## Etape 5
Appeler la méthode avec un nombre négatif doit émettre une exception « les nombres négatifs ne sont pas autorisés » et le nombre négatif qui a été passé.  
S’il y a plusieurs nombres négatifs, le message de l’exception doit tous les afficher



## Etape 6
Les nombres plus grand que 1000 doivent être ignorés, donc ajouter 2 + 1001 = 2




## Etape 7
Les séparateurs peuvent être de n’importe quel taille avec le format suivant : « //[separateur]\n ».  
Par exemple : « //[***]\n1***2***3 » doit retourner 6



## Etape 8
Autoriser les séparateurs multiples comme suit : « //[separateur1][separateur2] ».  
Par exemple : « //[*][%]\n1*2%3 » doit retourner 6




## Etape 9
Assurez-vous de pouvoir prendre en compte les multiples séparateur avec une longueur supérieur à 1 caractère.

