import dotenv from 'dotenv'
import express from "express";
import productRouter from "./router/productRouter.js";
import { connectDB } from "./config/dbConfig.js";
import cors from 'cors'



dotenv.config()
const app = express();
const PORT = process.env.PORT ;
console.log(PORT);

app.use(cors())

app.use(express.json());
app.use("/api/products", productRouter);

connectDB(process.env.MONGO_URI!)
  .then(() => {
    console.log("Connected to MongoDB");

    app.listen(PORT, () => {
      console.log(`Server is running on port ${PORT}`);
    });
  })
  .catch((error: Error) => {
    console.error("Error connnecting to MongoDB:", error);
    process.exit(1);
  });
