<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet">
<title>Ecotrajet</title>


<style>
body {margin:0;}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
</head>
<body>
<div class="topnav">
  <a class="active" href="#home">acceuil</a>
  <a href="#news">profil</a>
  <a href="#contact">historique</a>
  <a href="#about">deconexion</a>
</div>

<br />

<br />

<div>

<form name="_xclick" action="https://www.paypal.com/fr/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_xclick">
<input type="hidden" name="business" value="me@mybusiness.com">
<input type="hidden" name="currency_code" value="EUR">
<input type="hidden" name="item_name" value="cour_id">
<input type="hidden" name="amount" value="Prix_trajet"> pour poursuivre votre paiement cliquer sur le lien.
</br/>
</br/>
<input type="image" src="http://www.paypal.com/fr_FR/i/btn/x-click-but01.gif" border="0" name="submit" alt="Effectuez vos paiements via PayPal : une solution rapide, gratuite et sécurisée">
</form>

</div>

</body>

</html>