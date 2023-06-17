<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des établissements</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6C5x9pDpOsBqMvqRyd4g5qlXwBk7"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Liste des établissements</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Code</th>
            <th>Nom</th>
            <th>Adresse</th>
            <th>Téléphone</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="etablissement" items="${etablissements}">
            <tr>
                <td>${etablissement.code}</td>
                <td>${etablissement.nom}</td>
                <td>${etablissement.adresse}</td>
                <td>${etablissement.telephone}</td>
                <td>
                    <form action="supprimerEtablissement" method="POST"
                          onsubmit="return confirm('Êtes-vous sûr de vouloir supprimer cet établissement ?')">
                        <input type="hidden" name="id" value="${etablissement.id}">
                        <button type="submit" class="btn btn-danger">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                 class="bi bi-trash" viewBox="0 0 16 16">
                                <path
                                    d="M10.168 3.464a.5.5 0 0 1 .325.648l-.793 2.774a.5.5 0 0 0 .377.648l3.5.9a.5.5 0 0 1 .358.61l-1.36 6.256a.5.5 0 0 1-.492.38H4.7a.5.5 0 0 1-.491-.38L2.85 8.344a.5.5 0 0 1 .358-.61l3.5-.9a.5.5 0 0 0 .377-.648l-.793-2.774a.5.5 0 0 1 .325-.648L8 1.18zm1.184 1.172L11.497 6H4.503l-.855-1.364L3.816 4h8.368l-.8.636zM3.126 7l-.65 6h8.948l-.65-6H3.126zm1.5-4h4v1h-4V3zm5 0h4v1h-4V3z"/>
                            </svg>
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav>
        <ul class="pagination">
            <c:set var="pageSize" value="10" /> 
            <c:set var="pageCount" value="${(etablissements.size() + pageSize - 1) / pageSize}" /> 
            <c:forEach var="pageNumber" begin="1" end="${pageCount}">
                <li class="page-item">
                    <a class="page-link" href="?page=${pageNumber}">${pageNumber}</a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7jGqA7e5wjAHvjwe/xH2O4386bewr7cP3q6KGXp4U6vqOiX6"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0pGA6pB/xSpGDi1/XVnIQ5rjt8n0fL1C5ryBrLjST/Gpvn49Z/HnGJo+XJu"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUc8yBibw0+k4QhL7Wz1jzoDZIhRg6v1PT4PDaH5j6"
        crossorigin="anonymous"></script>

<script>
    $(document).ready(function () {
        $("form").on("submit", function () {
            return confirm("Êtes-vous sûr de vouloir supprimer cet établissement ?");
        });
    });
</script>
</body>
</html>