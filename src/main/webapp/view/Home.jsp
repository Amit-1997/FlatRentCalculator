<!DOCTYPE html>
<html>
<head>
<title>Page Title</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
<div>
<nav class="navbar navbar-light" style="background-color: #F0F8FF;">
  <div class="container-fluid">
    <a class="navbar-brand"> <h3 >Rent Calculator</h3> Home is where love is !!</a>

    <button class="btn"><i class="fa fa-home"></i> <a href="/home" >Home </a></button>
    </div>

  </div>


  <div>
  <form class="row " style="background-color: #95B9C7;
                                   padding: 10px;" action="/calculate">
        <div class="col-md-3">
          <label for="RoomI" class="form-label"><u>RoomI</u></label>
        </div>
        <div class="col-md-3">
          <label for="RoomII" class="form-label"><u>RoomII</u></label>
        </div>

        <div class="col-md-5">

        </div>

 <!-- taking inputs of total bill -->

         <div class="col-md-3">
                  <label for="totalBillRoom1" class="form-label">Total Bill Room1</label>
                  <input type="number"
                   class="form-control"
                    id="totalBillRoom1"
                    name="totalBillRoom1">
                </div>
                 <div class="col-md-3">
                   <label for="totalBillRoom2" class="form-label">Total Bill Room2</label>
                   <input type="number"
                   class="form-control"
                   id="totalBillRoom2"
                   name="totalBillRoom2">
                  </div>
                   <div class="col-md-5">

                          </div>

 <!-- taking inputs of Number of person -->

        <div class="col-md-3">
         <label for="noOfPersonRoom1" class="form-label">Number Of Person Room1</label>
         <input type="number"
         class="form-control"
         id="noOfPersonRoom1"
         name="noOfPersonRoom1">
         </div>
         <div class="col-md-3">
         <label for="noOfPersonRoom2" class="form-label">Number of person Room2</label>
         <input type="number"
         class="form-control"
         id="noOfPersonRoom2"
         name="noOfPersonRoom2">
         </div>
          <div class="col-md-5">


          <%
               Integer room1=(Integer)request.getAttribute("room1");
               Integer room2=(Integer)request.getAttribute("room2");


          %>



                   <p>Each person of Room1 has to pay amount of  <b><%= room1 %> </b></p>


                  <p>Each person of Room2 has to pay amount of <b><%= room2 %></b> </p>


                 </div>

<!-- taking inputs for penality -->

<div class="col-md-3">
         <label for="penalityRoom1" class="form-label">Penality Room1</label>
         <input type="number"
         class="form-control"
         id="penalityRoom1"
         name="penalityRoom1">
         </div>
         <div class="col-md-3">
         <label for="penalityRoom2" class="form-label">Penality Room2</label>
         <input type="number"
         class="form-control"
         id="penalityRoom2"
         name="penalityRoom2">
         </div>
          <div class="col-md-5">

                          </div>






<div class="col-md-6" style=" margin-top: 100px;text-align:center;">
<button type="submit" class="btn btn-primary btn-lg">Calculate</button>
</div>
      </form>



  </div>
</nav>
</body>
</html>