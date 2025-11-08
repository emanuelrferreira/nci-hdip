document.getElementById("contactForm").addEventListener("submit", function(event){event.preventDefault()});

let name=document.getElementById("name").value.trim();
let email=document.getElementById("email").value.trim();;

if (name === "" || email === "") {
    alert("Please fill in all fields.");
    return
}

if (!email.includes("@") || !email.includes("."))