const Item = require('./Item');
class File extends Item {
  constructor(name) {
    super(name);
  }
  setName(name) {
    this.name = "file:" + name;
  }
}

module.exports = File;