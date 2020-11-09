<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<html lang="en">
<head>
    
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="allManagers.css">
    <link rel="stylesheet" href="34.css">
    <link rel="stylesheet" href="popup2.css">
    <link rel="stylesheet" href="sideNavBar.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    
    <title>Document</title>
</head>
<body onresize="whenResizing()">
    <!-- //////////////////////////////////////// -->
   <!-- update manager -->
    <div id="pop3" class="popup3">
        <div class="popup23">
            <div class="top1">
                <i><img style="height: 20px; width: 20px; margin-right: 10px;" onclick="hide3()" src="cross.png" alt=""></i>
                <b style="margin: 0px auto 0px auto;">Update EMP001</b> 
            </div>

            <div class="bar">
                <div> <b>Contact Num </b>  <input  type="text" value="0710157140" ></div>
                <div> <b>Salary </b>  <input type="text" value="1000000" ></div>
            </div>

            <div class="button3">
                <button onclick="hide3()" class="btn-success34">Save</button>
            </div>
        </div>
   </div>
    <!-- ////////////////////////////////////////// -->
     <!-- remove manager -->
    <div id="pop1" class="popup1">
        <div class="popup21">
            <div class="top1">
                <i><img style="height: 20px; width: 20px; margin-right: 10px;" onclick="hide2()" src="cross.png" alt=""></i>
                <b style="margin: 0px auto 0px auto;">Remove Manager</b> 
            </div>
            <div class="pwd"> <b> Enter password </b>  <input  type="password" ></div>

            <div class="button1">
                <button onclick="hide2()" class="danger34">Remove</button>
            </div>
        </div>
   </div>

    <!-- ////////////////////////////////////////////// meka thama oya view button eka click krhma ena popup eka -->
    <div id="pop" class="popup">
        <div class="popup2">
            <div class="top1">
                
                <i><img style="height: 20px; width: 20px; margin-right: 10px;" onclick="hide()" src="cross.png" alt=""></i>
                <b style="margin-right: 38%;">EMP001</b> 
            </div>

            <div class="bar">
                <div> <b>Employee Id </b>  <input  type="text" value="Shehan Sandeepa" disabled></div>
                <div> <b>Name </b>  <input type="text" value="emp001" disabled></div>
                <div> <b>Contact Num </b>  <input type="text" value="emp001" disabled></div>
                <div> <b>Salary </b>  <input type="text" value="emp001" disabled></div>
                <div> <b>NIC &nbsp;</b>  <input type="text" value="emp001" disabled></div>   
            </div>
            <br>

            <div class="tableDiv34">
                <table class="table34">
                    <tr>
                        <th>Control functions</th>
                    </tr>
                    <tr>
                       <td>Add service provider</td> 
                    </tr>
                    <tr>
                        <td>Remove service provider</td>
                    </tr>
                </table>
            </div>
            
           

            <div class="button">
                <button onclick="show2()" class="danger34">Remove</button>
                <button onclick="show3()" class="btn-danger34">Update</button>
                <button onclick="hide()" class="btn-success34">Control access</button>
                

            </div>
        </div>
   </div>
 <!-- ////////////////////////////////////////////////////////// -->

 <!-- side nav bar -->
<div id="mySidenav" class="sidenav">
    <div class="closeIcon"><a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a></div>
   <a href="#">View Salon Schedule</a>
    <a href="#">Service Management</a>
    <a href="#">Employee Management</a>
    <a href="#">Stock Management</a>
    <a href="#">Reports</a>
  </div>

<!-- ////////////////////////////// -->
 <div id="main">

    <div class="back">
        <div id="navIcon" onclick="openNav()" class="navIcon"  ><img  src="three.png" alt="Ooops" ></div>
        
    </div>

    <div class="topBar">
       <b>Managers</b> 
    </div>
    <div class="mainDiv">
        <div class="tableDiv34">
            <table class="table34">
                <tr>
                    <th>Employee ID</th>
                    <th>Name</th>
                    <th>Contact Num</th>
                    <th>NIC</th>
                    <th>View</th>
                </tr>
                <tbody id="tbl"></tbody>
                <tr>
                    <td>skjdf</td>
                    <td>slkdf</td>
                    <td>lsdkf</td>
                    <td>skdlfj</td>
                    <td>
                    	<button title='view employee details' class = 'btn34' onclick = 'show()'><i class='fa fa-eye'></i></button>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>

	<%
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salon","root","");
	
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from managers ");
		
		
	 %>
	 
	 <%
	 	while(rs.next())
	 	{
	 		out.println(rs.getString("name"));
	 	}
	 
	 %>
	 
	 <% 
	 rs.next();
	 st.close();
	 	con.close();
	 %>
	 


    

    
<script src="allManagers.js"></script>
<script src="sideNavBar.js"></script>
</body>
</html>