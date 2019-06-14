/**
 * 
 */


function validateForm() {


	var x = document.forms["form1"]["e_id"].value;
	var y = document.forms["form1"]["e_fname"].value;
	var z = document.forms["form1"]["e_lname"].value;
	var zz = document.forms["form1"]["e_sal"].value;
	if (x == "") {
		alert(" employeeID required");
		return false;
	}
	if (y == "") {
		alert("FirstName field can not be blank");
		return false;
	}
	if (z == "") {
		alert("lastName required");

		return false;
	}
	if (zz == "") {
		alert("Salary required");

		return false;
	}

}

