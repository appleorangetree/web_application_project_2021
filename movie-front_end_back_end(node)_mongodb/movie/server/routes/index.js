const express = require("express");
const router = express.Router({ mergeParams: true }); //合并参数



router.post("/get_top_new_movies", (req, res) => {
    const modelName = req.params.resource;
    const Model = require(`../models/${modelName}`);

    // get new top 5 movies
    Model.find({}).sort({ releaseDate: -1 }).limit(5).then(data => {
        res.status(200).json({ Success: true, data: data });
    }).catch(err => {
        res.status(200).json({ Success: false, err });
    })
});

// recommendations
router.post("/get_recommendations", (req, res) => {

    const modelName = req.params.resource;
    const Model = require(`../models/${modelName}`);

    // get  top 5  rating movies
    Model.find({}).populate("movieId")
        .aggregate([
            { $group: { _id: "$movieId", avg_rating: { $avg: "$rating" } } },
            { $linit: 5 }
        ]).then(data => {
            res.status(200).json({ Success: true, data: data });
        }).catch(err => {
            res.status(200).json({ Success: false, err });
        })
});

module.exports = router;
