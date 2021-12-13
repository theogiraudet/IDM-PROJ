# Objectif
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
# Comparaison des langages/librairies/APIs
|                                                   | Interface |      But      |
| ------------------------------------------------- |:---------:|:-------------:|
| [Gson](https://github.com/google/gson)            | API Java  | Json <-> Java |
| [Jackson](https://github.com/FasterXML/jackson)   | API Java  | Json <-> Java |
| [Jq](https://stedolan.github.io/jq/)              |    CLI    | Requêtes JSON |
| [Jsonpath](https://github.com/json-path/JsonPath) |    CLI    | Requêtes JSON | 

Choix : 
- Compiler les requêtes vers des requêtes **Jq**
- Utiliser **Jackson** et faire sois-même****
