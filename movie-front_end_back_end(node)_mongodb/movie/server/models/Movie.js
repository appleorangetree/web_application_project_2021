const mongoose = require("mongoose");

const schema = mongoose.Schema({
    title: {
        type: String,
    },
    releaseDate: {
        type: Date,
    },
    category: {
        type: String,
    },
    movieDirector: {
        type: String,
    },
});
const Movie = mongoose.model("Movie", schema);
module.exports = Movie;
