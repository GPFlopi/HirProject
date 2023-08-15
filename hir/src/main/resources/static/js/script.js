function showLoginPanel(){
    let login = document.getElementById("loginPanel")
    let register = document.getElementById("registerPanel")
    if (((login.style.display === "") || (login.style.display === "none")) && ((register.style.display === "") || (register.style.display === "none")))
        login.style.display = "block"
    else
        login.style.display = "none"
}

function hideLoginPanel(){
    let login = document.getElementById("loginPanel")
    let register = document.getElementById("registerPanel")
    if (login.style.display === "block")
        login.style.display = "none"
    if (register.style.display === "block")
        register.style.display = "none"
    console.log("ez a szar")
}

function switchPanel(p){
    if(p === "registerPanel"){
        document.getElementById("loginPanel").style.display = "none"
        document.getElementById("registerPanel").style.display = "block"
    }
    else if(p === "loginPanel"){
        document.getElementById("registerPanel").style.display = "none"
        document.getElementById("loginPanel").style.display = "block"
    }
}

function goAdminPanel(){
    window.location = ('admin')
}

function goCikk(id){
    window.location = ('news/'+id);
}