const mongoose = require("mongoose");

const schema = mongoose.Schema({
    rating: {
        type: Number,
    },
    commentTitle: {
        type: String,
    },
    commentContent: {
        type: String,
    },
    userId: {
        type: String,
    },
    movieId:{
        type:mongoose.Schema.Types.ObjectId,
        ref:"Movie"
    }
});
const Rating = mongoose.model("Rating", schema);
module.exports = Rating;
