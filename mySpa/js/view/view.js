function render(quote, author) {
    const container = document.querySelector('#container');
    container.innerHTML = '';  

    const div = document.createElement('div');
    div.className = 'text-center';

    const quoteElement = document.createElement('div');
    quoteElement.className = 'text-center';

    
    quoteElement.innerHTML = `
        <h1>"${quote}"</h1>
        <p>- ${author}</p>
    `;

    div.appendChild(quoteElement);
    container.appendChild(div);
}

export default { render};
