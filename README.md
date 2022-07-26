# Démo Spring Boot - Javascript - JPA - MySQL

![projet démo](images/datatable-fr.png)

Mini projet Gradle à importer dans Eclipse ou autre et à tester !

- Changer les informations dans le fichier *application.properties*
    - nom de la base de données
    - username
    - password
    - Refresh gradle et ça doit rouler...

Pour l'affichage de la DataTable en français, il suffit d'ajouter 3 lignes dans le loadDataTable du JS :

```javascript
$('#apprenantTable').DataTable({
    "language": {
            url: 'french/fr-FR.json'
        },
```

et de mettre le fichier *fr-FR.json* dans le sous-répertoire *french* dans *static*. 

Lien vers la documentation de la DataTable : [https://datatables.net/plug-ins/i18n/](https://datatables.net/plug-ins/i18n/)
