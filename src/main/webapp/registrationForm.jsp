<%@page language="java" pageEncoding="UTF-8" contentType="text/html; ISO-8859-1" %>
<%@taglib prefix="s"  uri="/struts-tags"%>

<html>
    <head>
        <title>USER REGISTRATION FORM</title>
    </head>
    <body>
        <s:form action="registration">
            <s:textfield name="name" label="Enter Name for the user"/>
            <s:datetextfield format="DD-MM-YYYY" name="dob" label="Enter D.O.B"/>
            <s:textfield name="address" label="Enter your address"/>
            <s:submit value="Submit"/>
        </s:form>
    </body>
</html>
