<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Reservations</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="/vol/">Gestion des vols</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/vol/">Accueil
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle active" href="#"
					id="navbarDropdown" role="button" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Réservations </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="/vol/ajouterReservation">Ajouter
							une réservation</a> <a class="dropdown-item"
							href="/vol/reservations">Recherche</a>
					</div></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Recherche" aria-label="Recherche">
				<button class="btn btn-primary my-2 my-sm-0" type="submit">Recherche</button>
			</form>
		</div>
	</nav>
	<div class="col-md-6 offset-md-3 p-5">
		<form method="post" modelAttribute="reservation" action="/vol/saveReservation">
			<div class="form-group">
				<label>Code réservation</label> <input name="codeRes" type="number"
					class="form-control" placeholder="Code réservation" />
			</div>
			<div class="form-group">
				<label>Etat réservation</label> <input name="etat" type="text"
					class="form-control" placeholder="Etat réservation" />
			</div>
			<div class="form-group">
				<label>Client</label>
		        <select name="client.idClient" class="form-control">
		    		 <c:forEach var="c" items="${clients}">
					<option value="${c.idClient}">${c.nom} ${c.prenom} - CIN : ${c.cin}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Vol</label>
		        <select name="vol.idVol" class="form-control">
		    		 <c:forEach var="v" items="${vols}">
					<option value="${v.idVol}">Code vol : ${v.codeVol} - Date départ: ${v.dateDepart}</option>
					</c:forEach>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Enregistrer</button>
			<button type="reset" class="btn btn-danger">Annuler</button>
		</form>
	</div>
</body>
</html>