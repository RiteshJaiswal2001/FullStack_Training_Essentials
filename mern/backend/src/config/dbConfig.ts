import mongoose from "mongoose";
import process from "node:process";

export const connectDB = async (mongoURI: string): Promise<void> => {
  try {
    await mongoose.connect(mongoURI);
    console.log("Mongo DB connected.");
  } catch (error) {
    console.error("Error connecting to DB", error);
    process.exit(1);
  }
};
