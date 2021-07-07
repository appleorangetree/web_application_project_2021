const express = require("express");
const app = express();
const path = require("path");
const cors = require("cors");

const cookieParser = require("cookie-parser");

// const config = require("./config/key");  

const mongoose = require("mongoose");
mongoose
    .connect("mongodb://localhost:27017/movie", {
        useNewUrlParser: true,
        useUnifiedTopology: true,
        useCreateIndex: true,
        useFindAndModify: false,
    })
    .then(() => console.log("MongoDB Connected..."))
    .catch((err) => console.log(err));

app.use(cors());
app.use(express.urlencoded({ extended: false }))
app.use(express.json())
app.use(cookieParser());

app.use("/api/rest/:resource", require("./routes"));

const port = 5000;

app.listen(port, '127.0.0.1', () => {
    console.log(`Server Listening on ${port}`);
});
