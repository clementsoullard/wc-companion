<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html lang="en" ng-app="myApp" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html lang="en" ng-app="myApp" class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html lang="en" ng-app="myApp" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en" ng-app="myApp" class="no-js"> <!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Infosys Workcouncil</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="app.css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">

</head>
<body style="padding-top: 70px; background-color: #DDDAE8;">
     <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#topFixedNavbar1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
          <a class="navbar-brand" href=".">Infosys Workcouncil</a></div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="topFixedNavbar1">
          <ul class="nav navbar-nav">
            <li class="active">
            <a href="#!/participation">Register<span class="sr-only">(current)</span></a></li>
       		<sec:authorize access="isAuthenticated()"><li><a href="manager.html">Management Interface</a></li>
       		  </sec:authorize>
             </ul>
               <ul class="nav navbar-nav navbar-right">
		   	<sec:authorize access="isAnonymous()">
		   <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
		   </sec:authorize>
		   	<sec:authorize access="isAuthenticated()">
		   <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
		   	</sec:authorize>
    </ul>
        </div>
        <!-- /.navbar-collapse -->
      </div>
      <!-- /.container-fluid -->
    </nav>


<div  ng-view></div>



  <!-- In production use:
  <script src="//ajax.googleapis.com/ajax/libs/angularjs/x.x.x/angular.min.js"></script>
  -->
  <script src="js/fusioncharts.js"></script>
  <script src="bower_components/angular/angular.js"></script>
  <script src="bower_components/angular-route/angular-route.js"></script>
  <script src="js/angular-fusioncharts.min.js"></script>
  
  <script src="app.js"></script>
  <script src="participation/participation.js"></script>
  <script src="view2/view2.js"></script>
  <script src="components/version/version.js"></script>
  <script src="components/version/version-directive.js"></script>
  <script src="components/version/interpolate-filter.js"></script>
  <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
  <script src="js/bootstrap.js" type="text/javascript"></script>

</body>
</html>
