class Person {
    constructor(name) {
        this.name = name;
        this.id = null;
    }
}

const service = (function () {
    let name = "Service";
    let users = [];
    let idCounter = 1;

    return {
        getName: function () {
            console.log(name);
        },
        add: function (person) {
            person.id = idCounter++;
            users.push(person);
            console.log(`${person.name} (ID: ${person.id}) was added successfully to the list.`);
        },
        remove: function (id) {
            const index = users.findIndex(user => user.id === id);
            if (index === -1) {
                console.log(`No user found with id ${id}.`);
                return;
            }
            users.splice(index, 1);
            console.log(`User with id ${id} was removed successfully from the list.`);
        },
        destroy: function () {
            users = [];
            console.log("The list is now empty.");
        },
        update: function (id, newPerson) {
            const user = users.find(user => user.id === id);
            if (!user) {
                console.log(`No user found with id ${id}.`);
                return;
            }
            user.name = newPerson.name; 
            console.log(`The selected object was updated successfully to ${newPerson.name}.`);
        },
        get: function (id) {
            const user = users.find(user => user.id === id);
            if (!user) {
                console.log(`No user found with id ${id}.`);
                return;
            }
            console.log(`ID: ${user.id}, Name: ${user.name}`);
            return user;
        },
        list: function () {
            if (users.length === 0) {
                console.log("The list is empty.");
                return;
            }
            console.log("Users:");
            users.forEach(user => console.log(`ID: ${user.id}, Name: ${user.name}`));
        }
    };
})();

const p1 = new Person("Tiago");
const p2 = new Person("Jose");
const p3 = new Person("Afonso");
const p4 = new Person("Diogo");
const p5 = new Person("Fabio");

service.getName();
service.add(p1);
service.add(p2);
service.add(p3);
service.add(p4);
service.list();
service.update(1, p5);
service.list();
service.remove(3);
service.list();
service.get(2);
service.list();
service.destroy();
service.list();
