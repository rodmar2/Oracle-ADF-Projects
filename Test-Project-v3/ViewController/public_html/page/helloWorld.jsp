<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces/rich" prefix="af"%>
<f:view>
  <af:document id="d1">
    <af:form id="f1">
      <af:pageTemplate viewId="/oracle/templates/threeColumnTemplate.jspx"
                       id="pt1">
        <f:facet name="center">
          <af:outputText value="Two" id="ot2"/>
        </f:facet>
        <f:facet name="header"/>
        <f:facet name="end">
          <af:outputText value="Three" id="ot3"/>
        </f:facet>
        <f:facet name="start">
          <af:outputText value="Hello World !" id="ot1"/>
        </f:facet>
        <f:facet name="branding"/>
        <f:facet name="copyright"/>
        <f:facet name="status"/>
      </af:pageTemplate>
    </af:form>
  </af:document>
</f:view>