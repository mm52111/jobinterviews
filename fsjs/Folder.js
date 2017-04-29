const Item = require('./Item');
class Folder extends Item {
  constructor(name) {
    super(name);
  }
  setName(name) {
    this.name = "Folder:" + name;
  }
}

module.exports = Folder;