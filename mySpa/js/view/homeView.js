function render(onClick) {
    const container = document.querySelector('#container');
    const button = document.querySelector('#button');
    const div = document.createElement('div');

    div.className = `text-center`;

    div.appendChild(button);

    container.innerHTML = ''; 
    button.innerText = `Generate Quote`;

    button.addEventListener('click', async e => {
        e.preventDefault();

        const quote = await onClick(); 
        const elem = document.createElement('div');
        elem.className = `text-center`;

        elem.innerHTML = `<h1>${quote} - Kanye West</h1>`; 

        if (container.childElementCount > 1) {
            container.removeChild(container.lastChild);
        }

        container.appendChild(elem);
    });

    container.appendChild(div);
}

export default { render };
