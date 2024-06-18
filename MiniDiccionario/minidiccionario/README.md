## Mini-diccionario

Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.

## Funcionamiento

Este programa escrito en Java utiliza un Hashmap (diccionario) para crear un traductor de Español a inglés.

Utiliza el put del hashmap para crear y guardar informacion en el propio hashmap con la palabra española como key, y la 
correspondiente traduccion como el value.

Así, cuando hacemos un diccionario.containsKey y encuentra la palabra en español (Key) retornará la traduccion (value)
con un diccionario.get