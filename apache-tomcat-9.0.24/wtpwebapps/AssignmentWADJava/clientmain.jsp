<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
.topnav {
    background-color: #004085;
    overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #dee2e6;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

/* Right-aligned section inside the top navigation */
.topnav-right {
  float: right;
}

</style>
</head>
<body >
<div class="topnav">
  <a  href="clientcontent1.jsp">Tab 1</a>
  <a  href="clientcontent2.jsp">Tab 2</a>
  <a  href="clientcontent3.jsp">Tab 3</a>
  <a  href="clientcontent4.jsp">Tab 4</a>
  <div class="topnav-right">
    <div style="float:left "><h3 style="color:#ffc107 float:left">Welcome ${name}</h3></div>
    
			<div style="float:right"><form class="form-signin"id="loginform"action="LogOut" method="post">
			<input type="hidden" name="action" value="logout">
			    <input class="btn btn-sm btn-primary btn-block text-uppercase" type="submit" value="Log out" /></form>
			</div></div>
			
  </div>


<br>

<%
    session=request.getSession(false);
    if(session.getAttribute("userInfo")==null)
    {
        response.sendRedirect("login.jsp");
    }

%> 

<div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-lg-3 mt-4">
                <div class="card">
                    <img class="card-img-top" src="https://picsum.photos/200/150/?random">
                    <div class="card-block">
                        <h5 class="text-bold"><a href="clientcontent1.jsp">Client Content 1</a></h5>
                    </div>
                </div>
            </div>
             <div class="col-sm-6 col-md-4 col-lg-3 mt-4">
                <div class="card">
                    <img class="card-img-top" src="https://picsum.photos/200/150/?random">
                    <div class="card-block">
                        <h5 class="text-bold"><a href="clientcontent2.jsp">Client Content 2</a></h5>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 col-lg-3 mt-4">
                <div class="card">
                    <img class="card-img-top" src="https://picsum.photos/200/150/?random">
                    <div class="card-block">
                        <h5 class="text-bold"><a href="clientcontent3.jsp">Client Content 3</a></h5>
                    </div>
                </div>
            </div>
 		<div class="col-sm-6 col-md-4 col-lg-3 mt-4">
                <div class="card">
                    <img class="card-img-top" src="https://picsum.photos/200/150/?random">
                    <div class="card-block">
                        <h5 class="text-bold"><a href="clientcontent4.jsp">Client Content 4</a></h5>
                    </div>
                </div>
            </div>
        </div>
       

</div>




</body>
</html>