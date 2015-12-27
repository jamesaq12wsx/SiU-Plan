Parse.initialize("08gGZw3FX4riPv4OyH0YYWQkwNOt5tBAJzWyEpzY", "XcMpuhysAsSHPCLuRdexS0rZzRmTVq1e2iJdXTtz");
  
var currentUser = null;
var historyMessageBox = document.getElementById("historyMessageBox");

$(document).ready(function() {
  // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
    
  // document.getElementById("loginButton").onclick = login;
  // document.getElementById("signUpButton").onclick = signUp;
  // document.getElementById("sendButton").onclick = submitMessageToParse;
  // checkSession();
});

function saveMessageFromUser(name, message) {

  // your code here

}

function getHistoryMessage() {

  // your code here

}



function login() {
  var name = document.getElementById("userName").value
  var password = document.getElementById("password").value


  // your code here

}

function signUp() {
  var name = document.getElementById("userName").value
  var password = document.getElementById("password").value

  // your code here

}

function logout() {
  Parse.User.logOut();
  didLogout();
}

//  pre-work below
/**
 *  save message to Parse and display on history message list
 **/
function submitMessageToParse() {
  var messageBox = document.getElementById("messageBox");
  var name = currentUser.getUsername()
  saveMessageFromUser(name, messageBox.value);
  messageBox.value = '';
}

/**
 * check user is logged in already or not
 **/
function checkSession() {
  currentUser = Parse.User.current()
  if (currentUser) {
    didLogin();
  }
}


function didLogin() {
  document.getElementById("helloText").innerHTML = "Hello, " + currentUser.getUsername();
  document.getElementById("PageInfo").style.display = "";
  document.getElementById("login-form").style.display = "none";
  document.getElementById("loginButton").innerHTML = "Logout";
  document.getElementById("loginButton").onclick = logout;
  var ls = document.getElementsByClassName("login-form");
  console.log(ls.length)
  for (var i = 0; i < ls.length; i++) {
    ls[i].style.display = "none";
  }
  getHistoryMessage();
}

function didLogout() {
  clearTable();
  document.getElementById("login-form").style.display = "";
  document.getElementById("PageInfo").style.display = "none";
  document.getElementById("loginButton").innerHTML = "Login";
  document.getElementById("loginButton").onclick = login;
  var ls = document.getElementsByClassName("login-form");
  console.log(ls.length)
  for (var i = 0; i < ls.length; i++) {
    ls[i].style.display = "";
  }
}
/**
 *  handle the error message here
 *  add this function to all error function
 **/
function handleParseError(err) {
  switch (err.code) {
    case Parse.Error.INVALID_SESSION_TOKEN:
      console.log("invalid session token");
      Parse.User.logOut();
      break;
  }
}
/**
 *  create message box 
 **/
function createMessageBox(username, content) {
  console.log("afea");
  var messageBox = document.createElement("div");
  messageBox.style.borderColor = "grey"
  messageBox.style.fontSize = "18px";
  var name = document.createElement("h3");
  name.style.color = "black";
  name.style.fontSize = "16px";
  name.style.fontWeight = "bold";
  name.style.textAlign = "left";
  name.innerHTML = "<span class=\'glyphicon glyphicon-user\'></span>" + username;
  messageBox.appendChild(name);
  var contentArea = document.createElement("p");
  contentArea.innerHTML = content;
  contentArea.style.textAlign = "left";
  contentArea.style.fontSize = "18px"
  contentArea.className = "well";
  contentArea.style.minHeight = "80px"
  messageBox.appendChild(contentArea);
  historyMessageBox.insertBefore(messageBox, historyMessageBox.childNodes[0]);
}

function clearTable() {
  while (historyMessageBox.hasChildNodes()) {
    historyMessageBox.removeChild(historyMessageBox.lastChild);
  }
}

$('.modal-trigger').leanModal({
    dismissible: true, // Modal can be dismissed by clicking outside of the modal
    opacity: .5, // Opacity of modal background
    in_duration: 300, // Transition in duration
    out_duration: 200, // Transition out duration
    // ready: function() { alert('Ready'); }, // Callback for Modal open
    // complete: function() { alert('Closed'); } // Callback for Modal close
  }
);