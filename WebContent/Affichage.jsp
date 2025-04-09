<%@page import="java.util.ArrayList"%>
<%@page import="test.Personne"%>
<html>
<head>
    <title>Liste des Personnes</title>
</head>
<body>
    <h2>Liste des Personnes Ajoutées</h2>

    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Âge</th>
        </tr>
        <%
            ArrayList<Personne> listePersonnes = (ArrayList<Personne>) session.getAttribute("listePersonnes");
            if (listePersonnes != null && !listePersonnes.isEmpty()) {
                for (Personne p : listePersonnes) {
        %>
        <tr>
            <td><%= p.getNom() %></td>
            <td><%= p.getPrenom() %></td>
            <td><%= p.getSex() %></td>
            <td><%= p.getCpost() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="3">Aucune personne enregistrée.</td>
        </tr>
        <% } %>
    </table>
    <br>
    <a href="SaisiePersonne.html">Ajouter une autre personne</a>
</body>
</html>
