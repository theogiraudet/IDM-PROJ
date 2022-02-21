# README
ABABOU Sarah, COCHET Julien, GIRAUDET Théo, PIOCHE Guillaume
## Présentation
Notre projet du nom de "Swag" est un DSL pouvant se compiler vers du JsonPath ou du Jq. Il est pensé pour pouvoir récupérer un ensemble de sous-arbres dans un arbre JSON, c'est un équivant à XPath pour XML.
## Notation
Tout élément sémantique du langage Swag agit comme un filtre sur l'arbre JSON en entrée, voici un exemple de filtre :
> foo.bar[0].expression

Compilé en JsonPath, cela donne :
> $['foo']['bar'][0]['expression']

Compilé en Jq, cela donne :
> .["foo"] | .["bar"] | .[0] | .["expression"]

L'expression retourne la valeur du nœud "expression" se trouvant dans le premier élément du tableau foo/bar.

Nous distingueront les filtres "chemin", permettant de se déplacer au sein de l'arbre de façon à n'en sélectionner qu'un sous-arbre et les filtres de type "conditionnel", pris en paramètre par certains filtres chemin, agissant sur les tableaux JSON et permettant de ne sélectionner que les éléments d'un tableau répondant à un certain prédicat.
| Filtre "chemin"             | Description                                                                          |
| --------------------------- | ------------------------------------------------------------------------------------ |
| ```.```                     | Sélectionne la racine de l'arbre et donc la totalité de celui-ci                     |
| ```foo```                   | Sélectionne la valeur du nœud indiqué par le *foo*                                   |
| ```foo.bar```               | Sélectionne la valeur du nœud *bar*, fils du nœud *foo*                              |
| ```foo[<conditionnel>]```   | Sélectionne les éléments du tableau *foo* répondant à la condition spécifiée         |


| Filtre "conditionnel"                | Description                                                                                              |
| ------------------------------------ | -------------------------------------------------------------------------------------------------------- |
| ```laissé vide``` ou ```*```         | Sélectionne tous les éléments du tableau                                                                 |
| ```n```                              | Sélectionne l'élément à l'index *n* du tableau, gère les nombres négatifs (partant de la fin du tableau) |
| ```n..```                            | Sélectionne le sous tableau allant de l'index *n* jusqu'à la fin du tableau                              |
| ```..n```                            | Sélectionne le sous tableau allant de l'index 0 à l'index *n*                                            |
| ```n..m```                           | Sélectionne les éléments du tableau de l'index *n* à l'index *m*                                         |
| ```chemin?```                        | Sélectionne les éléments du tableau ayant pour enfant le chemin passé                                    |
| ```chemin=valeur```                  | Sélectionne les éléments dont le chemin à une valeur spécifique                                          |
| ```<conditionnel>, <conditionnel>``` | Sélectionne les éléments répondant à la première conditionnelle puis à la seconde                        |

## Exécution
Pour executer le programme, il faut se rendre dans **fr.istic.idm.grammar** et lancer Main.xtend situé dans **/src/fr/istic/idm/generator/**.
Le Main prend 2 arguments :
1. Le fichier contenant l'expression Swag à convertir. Exemple : ```foo.swag```.
2. Le compilateur choisit, ```jq``` ou ```jsonpath```. Cet argument est facultatif et Jq sera choisit par défaut.

Le résultat généré est situé dans **fr.istic.idm.grammar** et se nomme ```result.jq``` ou ```result.jp``` en fonction du compilateur choisi compilateur.
Il est également possible d'exécuter **fr.istic.idm.grammar** comme "Eclipse application" pour tester le parsing directement au sein d'Eclipse.
