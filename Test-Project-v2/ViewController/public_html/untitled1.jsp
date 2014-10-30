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
          <af:table var="row" rowBandingInterval="0" id="t1">
            <af:column sortable="false" headerText="col1" id="c2">
              <af:outputText value="#{row.col1}" id="ot4"/>
            </af:column>
            <af:column sortable="false" headerText="col2" id="c4">
              <af:outputText value="#{row.col2}" id="ot1"/>
            </af:column>
            <af:column sortable="false" headerText="col3" id="c3">
              <af:outputText value="#{row.col3}" id="ot5"/>
            </af:column>
            <af:column sortable="false" headerText="col4" id="c5">
              <af:outputText value="#{row.col4}" id="ot2"/>
            </af:column>
            <af:column sortable="false" headerText="col5" id="c1">
              <af:outputText value="#{row.col5}" id="ot3"/>
            </af:column>
          </af:table>
        </f:facet>
        <f:facet name="header"/>
        <f:facet name="end"/>
        <f:facet name="start"/>
        <f:facet name="branding"/>
        <f:facet name="copyright"/>
        <f:facet name="status"/>
      </af:pageTemplate>
    </af:form>
  </af:document>
</f:view>