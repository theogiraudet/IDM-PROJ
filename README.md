# README
ABABOU Sarah, COCHET Julien, GIRAUDET Théo, PIOCHE Guillaume
## Présentation
Notre projet du nom de "Swag" est un DSL pouvant se compiler vers du JsonPath ou du Jq. Il est pensé pour pouvoir sélectionner des sous-arbres dans un arbre Json, c'est un équivant à XPath pour XML.
## Notation
Les expressions en Swag spécifie un chemin vers un élément d'une structure JSON. Voici un exemple :
> foo.bar[0].expression

Compilé en JsonPath, cela donne :
> $['foo']['bar'][0]['expression']

Compilé en Jq, cela donne :
> 

Tous les éléments de syntaxe Swag sont décrits ci-dessous :
| Expression            | Description                                                                   |
| --------------------- | ----------------------------------------------------------------------------- |
| ```chemin```          | Sélectionne l'objet indiqué par le *chemin*                                   |
| ```.champ```          | Sélectionne le *champ* spécifique d'un objet parent                           |
| ```[n]```             | Sélectionne l'élément *n* d'un tableau                                        |
| ```[*]```             | Sélectionne tous les éléments d'un tableau                                    |
| ```[..n]```           | Sélectionne les éléments d'un tableau du début à l'index *n*                  |
| ```[n..]```           | Sélectionne les éléments d'un tableau de l'index *n* à la fin                 |
| ```[n..m]```          | Sélectionne les éléments d'un tableau de l'index *n* à l'index *m*            |
| ```[chemin?]```       | Vérifie l'existance de chemin                                                 |
| ```[chemin=valeur]``` | Vérifie la correspondance entre la valeur du *chemin* et la *valeur* indiquée |
## Exécution
Pour executer le programme, il faut se rendre dans **fr.istic.idm.grammar** et lancer Main.xtend situé dans **/src/fr/istic/idm/generator/**
Le Main prend 2 arguments :
1. Le fichier contenant l'expression Swag à convertir. Exemple : ```foo.swag```.
2. Le compilateur choisit, ```jq``` ou ```jsonpath```. Cet argument est facultatif et Jq sera choisit par défaut.

Le résultat généré est situé dans **fr.istic.idm.grammar** et se nomme ```result.jq``` ou ```result.jp``` en fonction de votre compilateur.
