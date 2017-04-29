var Folder = require('./Folder');
var File = require('./File');

var _createFolder = function(name){
	return new Folder(name);
}

var _createFile = function(name){
	return new File(name);
}

module.exports = {
	createFolder: _createFolder,
	createFile : _createFile
}