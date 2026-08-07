import Product from "../schema/productSchema.js";
import IProduct from "../model/product.js";

// export const cretaeProduct = async (productData: IProduct): Product{
//     const product = new Product(productData)

//     return await product.save()
// }

export const getAllProducts = async (): Promise<IProduct[]> => {
  return await Product.find();
};
export const getProductById = async (id: string): Promise<IProduct | null> => {
  return await Product.findById(id);
};
