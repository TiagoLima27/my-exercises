function getData(url) {
    fetch(url)
        .then((response) => response.json())
        .then(data => { populateTable(data) })
        .catch((error) => console.error(error))
}
getData("http://localhost:8080/javabank5/api/customer")
function populateTable(customers) {
    const tableBody = document.getElementById('customerTable');

    tableBody.innerHTML = '';

    customers.forEach((customer) => {
        console.log(customer);
        const row = document.createElement('tr');

        const firstNameCell = document.createElement('td');
        const lastNameCell = document.createElement('td');
        const emailCell = document.createElement('td');
        const phoneCell = document.createElement('td');
        const editCell = document.createElement('td');
        const deleteCell = document.createElement('td');

        firstNameCell.textContent = customer.firstName || 'N/A';
        lastNameCell.textContent = customer.lastName || 'N/A';
        emailCell.textContent = customer.email || 'N/A';
        phoneCell.textContent = customer.phone || 'N/A';


        const editButton = document.createElement('button');
        editButton.textContent = 'Edit';
        editButton.className = "btn btn-warning";
        editButton.id = `edit-btn-${customer.id}`
        editButton.addEventListener('click', (event) => {
            const cid = event.target.id.split("-")[2];
            fetchCustomer(cid);
        });


        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.className = "btn btn-danger";
        deleteButton.id = `delete-btn-${customer.id}`;
        deleteButton.addEventListener('click', (event) => {
            const cid = event.target.id.split("-")[2];
            deleteCustomer(cid);
        });



        editCell.appendChild(editButton);
        deleteCell.appendChild(deleteButton);


        row.appendChild(firstNameCell);
        row.appendChild(lastNameCell);
        row.appendChild(emailCell);
        row.appendChild(phoneCell);
        row.appendChild(editCell);
        row.appendChild(deleteCell);


        tableBody.appendChild(row);
    });



    async function deleteCustomer(id) {
        try {
            const response = await fetch(`http://localhost:8080/javabank5/api/customer/${id}`, {
                method: 'DELETE',
            });

            if (response.status === 204) {
                console.log(`Customer with ID ${id} deleted successfully.`);
                getData("http://localhost:8080/javabank5/api/customer");
            } else {
                console.error("Deletion failed: An unknown error occurred.");
            }
        } catch (error) {
            console.error("Error deleting customer:", error);
        }
    }

    function fetchCustomer(id) {
        fetch(`http://localhost:8080/javabank5/api/customer/${id}`)
            .then((response) => response.json())
            .then((customer) => {

                document.getElementById("firstName").value = customer.firstName || '';
                document.getElementById("lastName").value = customer.lastName || '';
                document.getElementById("email").value = customer.email || '';
                document.getElementById("phoneNumber").value = customer.phone || '';


                const updateButton = document.getElementById("updateButton");
                updateButton.disabled = false;
                updateButton.onclick = () => updateCustomer(id);
            })
            .catch((error) => console.error(`Error fetching customer with ID ${id}:`, error));
    }

    async function updateCustomer(id) {
        const customer = {
            firstName: document.getElementById("firstName").value,
            lastName: document.getElementById("lastName").value,
            email: document.getElementById("email").value,
            phone: document.getElementById("phoneNumber").value,
        };
        const updateButton = document.getElementById("updateButton");
        updateButton.disabled = false;
        updateButton.onclick = () => updateCustomer(id);

        try {
            const response = await fetch(`http://localhost:8080/javabank5/api/customer/${id}`, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(customer),
            });

            if (response.status === 200) {
                console.log(`Customer with ID ${id} updated successfully.`);
                getData("http://localhost:8080/javabank5/api/customer");
            } else {
                console.error("Update failed: An unknown error occurred.");
            }
        } catch (error) {
            console.error("Error updating customer:", error);
        }
    }

    document.getElementById("resetButton").addEventListener('click', () => {
        document.getElementById("customerForm").reset();
        document.getElementById("updateButton").disabled = true;
    });

    const addButton = document.getElementById("addButton");
    addButton.disabled = false;
    addButton.onclick = () => addCustomer();

    async function addCustomer() {
        const customer = {
            firstName: document.getElementById("firstName").value,
            lastName: document.getElementById("lastName").value,
            email: document.getElementById("email").value,
            phone: document.getElementById("phoneNumber").value,
        };

        try {
            const response = await fetch(`http://localhost:8080/javabank5/api/customer`, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(customer),
            });

            if (response.status === 201) {
                console.log(`Customer was added successfully.`);
                getData("http://localhost:8080/javabank5/api/customer");
            } else {
                console.error("Update failed: An unknown error occurred.");
            }
        } catch (error) {
            console.error("Error adding customer:", error);
        }
    }
}





