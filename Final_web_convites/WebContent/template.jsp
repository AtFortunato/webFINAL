<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:p="http://primefaces.org/ui">
	
	<h:head>
		<title>
			<ui:insert name="title">
				Home
			</ui:insert>
		</title>
	<link href="estilo.css" rel="stylesheet" type="text/css" />
	</h:head>
	
	<h:body>
		<div id="principal">
			<div id="voto">
				<ui:insert name="evento"> 
					evento
				</ui:insert>
			</div>
		</div>
	</h:body>
</html>