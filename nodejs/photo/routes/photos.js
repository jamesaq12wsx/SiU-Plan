var photos = [];
var Photo = require('../models/Photo');
var path = require('path');
var fs = require('fs');
var util = require('util');
var join = path.join;

photos.push({
  name: 'Node.js Logo',
  path: 'http://cs.nccu.edu.tw/~s10117/richardtsai/img/SiU-Bike/6.jpg'
});

photos.push({
  name: 'Richard Speaking',
  path: 'http://cs.nccu.edu.tw/~s10117/richardtsai/img/SiU-Bike/2.jpg'
});

// exports.list = function(req, res) { res.render('./', {
exports.list = function(req, res) { res.render('photos', {
  title: 'Photos',
  photos: photos });
};

exports.form = function(req, res){ res.render('photos/upload', {
  title: 'Photo upload' });
};

exports.submit = function (dir) {
  return function(req, res, next) {
    var img = req.files.photo.image;
    var name = req.body.photo.name || img.name;
    var path = join(dir, img.name);

    var readStream = fs.createReadStream(img.path)
    var writeStream = fs.createWriteStream(path);
      util.pump(readStream, writeStream, function() {
        fs.unlinkSync(img.path);
    });

    Photo.create( {
      name: name,
      path: img.name
    }, function(err){
      if (err) return next(err);
      res.redirect('/');
    });

  };
};
