function toggleDarkMode() {
  const body = document.body;
  body.classList.toggle('dark-mode');
  body.classList.toggle('light-mode');
}
window.addEventListener('DOMContentLoaded', function() {
  const btn = document.createElement('button');
  btn.textContent = '🌙/☀️ Switch Mode';
  btn.style.position = 'fixed';
  btn.style.top = '20px';
  btn.style.right = '20px';
  btn.style.zIndex = 1000;
  btn.style.padding = '0.5em 1em';
  btn.style.borderRadius = '8px';
  btn.style.border = 'none';
  btn.style.background = '#333';
  btn.style.color = '#fff';
  btn.style.fontSize = '1em';
  btn.style.cursor = 'pointer';
  btn.onclick = toggleDarkMode;
  document.body.appendChild(btn);
  document.body.classList.add('light-mode');
});
setInterval(interval, 1000);
function interval() {
// evento d'intervallo
let d = new Date();
document.getElementById("interval").innerHTML =
d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
}
let interval1 = setInterval(function(){
  document.getElementById("interval1").innerHTML = "Ciao a tutti!";
  document.getElementById("interval1").style.color = "blue";
}, 1000);
setTimeout(function() {
  clearInterval(interval1);
  document.getElementById("interval1").innerHTML = "";
}, 5000);
