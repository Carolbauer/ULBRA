const menuToggle = document.getElementById('menu-toggle');
const menu = document.querySelector('#menu ul');

menuToggle.addEventListener('click', () => {
  menu.classList.toggle('disable');
});

function navigate(page){
  const sections = document.querySelectorAll('main > section');

  sections.forEach(section => {
    section.classList.add('disable');
  })

  document.getElementById(page).classList.remove('disable')
}

function submitForm(){
  const contact = {
    name: document.getElementById("inputName").value,
    email: document.getElementById("inputEmail").value,
    phone: document.getElementById("inputPhone").value,
    message: document.getElementById("inputMessage").value
  };

  getContact(contact)
}

function getContact(contact){
  const table = `
    <table> 
      <thead> 
        <tr>
          <th>Nome</th>
          <th>Email</th>
          <th>Telefone</th>
        </tr>
      </thead>
      <tbody> 
        <tr>
          <td>${contact.name}</td>
          <td>${contact.email}</td>
          <td>${contact.phone}</td>
        </tr>
      </tbody>
    </table>
  `

  document.getElementById("tableContact").innerHTML = table;
}
