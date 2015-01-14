<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <title>Random Quiche</title>
    <g:javascript library="jquery-2.1.3" />
</head>

<body>
    <ul id="menu">
        <li>
            <!-- Ajax hyperlink-->
            <g:remoteLink action="ajaxRandom" update="quote">
                Next Quote
            </g:remoteLink>
        </li>
        <li>
            <!-- Standard hyperlink -->
            <g:link action="index">
                Admin
            </g:link>
        </li>

    </ul>

    <div id="quote">
        <q>${quote.content}</q>
        <p>${quote.author}</p>
    </div>
</body>

</html>
