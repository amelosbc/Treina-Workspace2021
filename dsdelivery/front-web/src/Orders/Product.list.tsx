import ProductCard from "./ProductCard";
import {default as ProductStruct} from "./types";
import React from "react";

type Props = {
    products: ProductStruct[];
}

function ProductsList({ products }: Props) {
    return (
        <div className="orders-list-container">
            <div className="orders-list-items">
                {products.map(product => (
                <ProductCard
                key={product.id}
                products={product}
                />))}
            </div>
        </div>
    )
}

export default ProductsList;