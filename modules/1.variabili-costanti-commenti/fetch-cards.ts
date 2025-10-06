/// <reference lib="es2015" />

// TypeScript version of the JS Fetch API card example
// Puoi testare questo file in un ambiente TypeScript/Node.js con DOM (es. ts-node + jsdom) oppure in un progetto frontend

interface Geo {
  lat: string;
  lng: string;
}

interface Address {
  street: string;
  suite: string;
  city: string;
  zipcode: string;
  geo: Geo;
}

interface Company {
  name: string;
  catchPhrase: string;
  bs: string;
}

interface User {
  id: number;
  name: string;
  username: string;
  email: string;
  address: Address;
  phone: string;
  website: string;
  company: Company;
}

let allData: User[] = [];
const perPage = 3;
let currentPage = 1;

async function fetchAPI(): Promise<User[]> {
  const url = "https://mocki.io/v1/e6344450-99a3-4bbf-b717-c8d89feb6bc8";
  const response = await fetch(url);
  const resp = await response.json();
  return resp as User[];
}

function createCard(person: User, idx: number): string {
  return `
    <div class="col-12 col-md-6 col-lg-4 mb-4">
      <div class="card rounded-4 shadow bg-secondary text-light h-100 border-0 card-clickable" style="cursor:pointer;" data-idx="${idx}">
        <div class="card-body">
          <h5 class="card-title">${person.name} <span class="text-info">(${person.username})</span></h5>
          <h6 class="card-subtitle mb-2 text-warning">${person.email}</h6>
          <p class="card-text mb-1"><b>Indirizzo:</b> ${person.address.street}, ${person.address.suite}, ${person.address.city} (${person.address.zipcode})</p>
          <p class="card-text mb-1"><b>Geo:</b> lat: ${person.address.geo.lat}, lng: ${person.address.geo.lng}</p>
          <p class="card-text mb-1"><b>Telefono:</b> ${person.phone}</p>
          <p class="card-text mb-1"><b>Website:</b> <a href="http://${person.website}" class="link-light" target="_blank">${person.website}</a></p>
          <p class="card-text mb-1"><b>Azienda:</b> ${person.company.name}</p>
          <p class="card-text mb-1"><b>CatchPhrase:</b> ${person.company.catchPhrase}</p>
          <p class="card-text mb-1"><b>BS:</b> ${person.company.bs}</p>
        </div>
      </div>
    </div>
  `;
}

function renderCards(page: number): void {
  const container = document.getElementById('cards-container');
  if (!container) return;
  const start = (page - 1) * perPage;
  const end = start + perPage;
  const pageData = allData.slice(start, end);
  container.innerHTML = pageData.map((p, i) => createCard(p, start + i)).join('');
  document.querySelectorAll('.card-clickable').forEach(card => {
    card.addEventListener('click', function (this: HTMLElement) {
      const idx = parseInt(this.getAttribute('data-idx') || '0');
      showSingleCardView(allData[idx]);
    });
  });
}

function renderPaginator(): void {
  const paginator = document.getElementById('paginator');
  if (!paginator) return;
  const totalPages = Math.ceil(allData.length / perPage);
  let html = '';
  for (let i = 1; i <= totalPages; i++) {
    html += `<li class="page-item${i === currentPage ? ' active' : ''}"><button class="page-link border-0 rounded-circle${i === currentPage ? ' bg-primary text-white' : ' bg-dark text-light'}" style="width:2.5rem;height:2.5rem;line-height:2.5rem;padding:0;" onclick="goToPage(${i})">${i}</button></li>`;
  }
  paginator.innerHTML = html;
}

// @ts-ignore
window.goToPage = function (page: number) {
  currentPage = page;
  renderCards(page);
  renderPaginator();
  window.scrollTo({ top: 0, behavior: 'smooth' });
};

function showSingleCardView(person: User): void {
  const container = document.querySelector('.container') as HTMLElement;
  if (container) container.style.display = 'none';
  const main = document.createElement('div');
  main.id = 'single-card-view';
  main.className = 'd-flex flex-column align-items-center justify-content-center min-vh-100';
  main.innerHTML = `
    <div class="card rounded-4 shadow bg-secondary text-light border-0" style="max-width: 600px; width: 100%;">
      <div class="card-body">
        <h5 class="card-title mb-3">${person.name} <span class="text-info">(${person.username})</span></h5>
        <pre style="background:#23272e; color:#d6deeb; border-radius:1rem; padding:1em; font-size:1rem; white-space:pre-wrap;">${JSON.stringify(person, null, 2)}</pre>
        <button class="btn btn-primary mt-3 w-100" id="backBtn">Torna indietro</button>
      </div>
    </div>
  `;
  document.body.appendChild(main);
  document.getElementById('backBtn')?.addEventListener('click', () => {
    main.remove();
    if (container) container.style.display = '';
  });
}

fetchAPI().then(data => {
  allData = data;
  renderCards(currentPage);
  renderPaginator();
});

// Aggiungi uno stile globale per l'hover
const style = document.createElement('style');
style.innerHTML = `
.page-link.rounded-circle:hover {
  border-radius: 50% !important;
}
`;
document.head.appendChild(style);
