# IDM TP1 Material
ABABOU Sarah, COCHET Julien, GIRAUDET Théo, PIOCHE Guillaume
## Exemple pour ce json :
```json
{
    "foo": "bar",
    "bar": {
        "animal": "cow",
        "product": "milk"
    },
    "variable": [{
            "type": "double",
            "value": 2.31
        },
        {
            "value": 4
        },
        {
            "type": "int",
            "value": 9
        },
        {
            "type": "double",
            "value": 2.51
        }
    ],
    "foobar": [
        2,
        3,
        4,
        98
    ]
}
```
l'expression du JsonPath:
```
$.bar.animal
```

l'expression de JQ:
```
.bar.animal
```
retourne tous deux :
```
"cow"
```
