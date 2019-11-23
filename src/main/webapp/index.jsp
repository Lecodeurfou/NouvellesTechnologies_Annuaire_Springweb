<html>
<body>
<h2>Hello World!</h2>
<!-- premier ne marche pas car il pointe directement sur le fichier.jsp -->
<p><a href ="vues/pagePays.jsp"> lien direct vers la page lien pays</a></p>
<!-- le second lui va se refairé au dispatcher et au controlleur pour délivrer la page jsp -->
<p><a href ="pagePays"> lien controller</a> </p>
<p><a href ="pageRegion"> page Region</a> </p>
<p><a href ="pageLangues"> page Langue</a> </p>
</body>
</html>
