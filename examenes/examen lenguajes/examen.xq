'Ejercicio 1
Usando XPath y/o XQuery y usando la base de datos generada por books.xml que se adjunta junto al documento devuelve el título en formato texto de aquellos libros que no su género (genre) no sea Computers y el precio sea inferior a 5. A continuación, devuelve en número entero cuántos son estos libros. Se recomienda XPath a secas y son dos consultas distintas aunque se muestren seguidas.
',
for $b in doc("books.xml")/catalog/book[price<5][genre=("Romance", "Horror")]
return $b/title/text(),
let $numero := count(/catalog/book[price<5][genre=("Romance", "Horror")])
return $numero,

'Ejercicio 2
Usando XQuery y usando la base de datos generada por beatles.xml que se adjunta al documento devuelve el siguiente HTML que contiene una frase auto rellenada por el bucle. En esta frase se indica cuál es el nombre del beatle y su web.
',
<html>
<head>
  <titulo>Ejercicio2</titulo>
</head>
  <body>
  <span></span>
    {
      for $b in doc("beatles.xml")/beatles/beatle
      return 
          <span>El beatle {$b/name/firstname} {$b/name/lastname} tiene una web llamada {data($b/@link)}
          </span>
      
    }
  </body>
</html>,
'Ejercicio 3
Usando XQuery y usando la base de datos generado por records.xml que se adjunta al documento devuelve el siguiente resultado que se corresponde con el resultado de buscar todos los países, ordenarlos alfabéticamente y agruparlos (group by), contar cuántas veces se repite cada país y buscar todos los nombres que han hecho compras de acciones en ese país. Para ello deberéis anidar dos for, uno para los países y otro para los nombres.
',
for $b in doc("records.xml")/records/record/country
group by $b
return $b


