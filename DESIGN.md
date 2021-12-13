# Design
## Objectif
Json -> Json
```json
{
    "foo": "bar",
    "foobar": {
        "test": 1,
        "boo": [1, 2, 3, 4]
    }
}
```
**Obtention :**
Requête pour obtenir `"bar"`

Requête pour obtenir `{ "text": 1, "boo": [1, 2, 3, 4] }`

**Filtrage :**
Requête pour obtenir `[1, 3]` (les nombres impaires du tableau "boo")
## Comparaison des langages/librairies/APIs
|                                                   | Interface |      But      |
| ------------------------------------------------- |:---------:|:-------------:|
| [Gson](https://github.com/google/gson)            | API Java  | Json <-> Java |
| [Jackson](https://github.com/FasterXML/jackson)   | API Java  | Json <-> Java |
| [Jq](https://stedolan.github.io/jq/)              |    CLI    | Requêtes JSON |
| [Jsonpath](https://github.com/json-path/JsonPath) |    CLI    | Requêtes JSON | 

Choix : 
- Compiler les requêtes vers des requêtes **Jq**
- Utiliser **Jackson** et faire sois-même
## Métamodèle
![Métamodèle](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/metamodele.png?raw=true)
[Format .ecore](https://github.com/theogiraudet/IDM-PROJ/blob/main/fr.istic.idm.spreadsheet.model/model/spreadsheet.ecore)
### Exemples
![Exemple 1](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-1.png?raw=true)
![Exemple 2](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-2.png?raw=true)
![Exemple 3](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-3.png?raw=true)
![Exemple 4](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-4.png?raw=true)
![Exemple 5](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-5.png?raw=true)
![Exemple 6](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-6.png?raw=true)
![Exemple 7](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-7.png?raw=true)
![Exemple 8](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-8.png?raw=true)
![Exemple 9](https://github.com/theogiraudet/IDM-PROJ/blob/main/img/example-9.png?raw=true)
