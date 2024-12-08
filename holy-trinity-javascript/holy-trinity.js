const users = require("./users.js");

console.log(users);

const oddIdUsers = users.filter(user => user.id % 2 !== 0);
console.log(oddIdUsers)

const result = oddIdUsers.reduce((acc, user, index) => {
    acc[index] = user;
    return acc;
  }, {});

console.log(result);

