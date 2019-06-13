/**
 * 
 */

function validateForm() {


	var x = document.forms["form1"]["year"].value;
	var y = document.forms["form1"]["season"].value;
	var z = document.forms["form1"]["title"].value;
	if (y == "UNKNOWN") {
		alert("league season required");
		return false;
	}
	if (x == "") {
		alert("year field can not be blank");
		return false;
	}
	if (z == "") {
		alert("league title required");

		return false;
	}

}

function onCancel() {
	location.href = "index.html";
}