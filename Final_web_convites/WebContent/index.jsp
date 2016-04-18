<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:p="http://primefaces.org/ui"
	template="inicioTemplate.xhtml">
	
<ui:define name="evento">
	<p:panelGrid columns="1">
		<h:form>		
		<p:commandButton value="Cadastrar" action="${ConvidadoBean.telaCadastro()}" ajax="false"></p:commandButton>
		<p:commandButton value="Listar" action="${ConvidadoBean.telaListar()}" ajax="false"></p:commandButton>
		</h:form>
		
	</p:panelGrid>
</ui:define>
</ui:composition>