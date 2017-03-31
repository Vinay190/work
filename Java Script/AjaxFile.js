var form = new FormData();
form.append("name", "Nicholas");// create a form with a couple of values
var form = new FormData();
form.append("name", "Nicholas");
form.append("photo", control.files[0]);

// send via XHR - look ma, no headers being set!
var xhr = new XMLHttpRequest();
xhr.onload = function() {
    console.log("Upload complete.");
};
xhr.open("post", "/entrypoint", true);
xhr.send(form);