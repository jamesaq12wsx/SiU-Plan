var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost:27017/photo_app');

var schema = new mongoose.Schema({
  name: String,
  path: String
});

module.exports = mongoose.model('Photo', schema);
